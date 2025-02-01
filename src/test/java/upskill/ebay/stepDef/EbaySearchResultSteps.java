package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShoesItems();
	}
	@Then("^Item list should have only shirts related products$")
	public void item_list_should_have_only_shirts_related_products() throws Throwable {
	    EbaySearchResultActionsObj.verifyShirtsItems();
	}
	@Then("^Item list should have only pants related products$")
	public void item_list_should_have_only_pants_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyPantsItems();
	}


}
