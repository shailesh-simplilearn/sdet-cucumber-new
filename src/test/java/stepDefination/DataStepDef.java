package stepDefination;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;

public class DataStepDef {
	
	@When("^I am on page$")
	public void i_am_on_page() throws Throwable {
	}

	@Then("^This page should display$")
	public void this_page_should_display(DataTable pageData) throws Throwable {
		
		/* List<List<String>> dataList = pageData.asLists(String.class); */
		
		List<Map<String, String>> dataList = pageData.asMaps(String.class,String.class);
		System.out.println(dataList.size());
		for (Map<String, String> map : dataList) {
			System.out.println(map.get("page")+" - "+map.get("author")+" - "+map.get("ISBN"));
		}
	}

}
