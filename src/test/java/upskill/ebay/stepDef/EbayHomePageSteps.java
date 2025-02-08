package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomePageSteps {

	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions ();
	
@Given("^Open Ebay Homepage$")
public void open_Ebay_Homepage() throws Throwable {
    
}

@When("^Search for shoes$")
public void search_for_shoes() throws Throwable {
	EbayHomepageActionsObj.searchShoes();
}
@When("^Search for shirts$")
public void search_for_shirts() throws Throwable {
   EbayHomepageActionsObj.searchShirts();
}
@When("^Search for pants$")
public void search_for_pants() throws Throwable {
	EbayHomepageActionsObj.searchPants();
}
@Given("^Search for \"([^\"]*)\"$")
public void search_for(String items) throws Throwable {
	EbayHomepageActionsObj.searchItems(items);
}

}

