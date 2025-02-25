package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	 EbaySearchResultLocators EbaySearchResultLocatorsObj;
	 
	public EbaySearchResultActions(){
		
    EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
    PageFactory.initElements(SetupDrivers.driver,EbaySearchResultLocatorsObj );
	}
	public void verifyShoesItems(){
		//option 1
		Assert.assertTrue( EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		//option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		//option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
	public void verifyShirtsItems(){
		EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
	}
	public void verifyPantsItems(){
		EbaySearchResultLocatorsObj.txtPants.isDisplayed();
	}
	public void filterBrand(String brand){
		if(brand.equals("adidas")){
		EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		}else if(brand.equals("Nike")){
		EbaySearchResultLocatorsObj.cbxBrandNike.click();;
		}else if(brand.equals("Unbranded")){
		EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		}else{
			System.out.println("Brand not found");
		}
	}
	public void verifyBrandItems(String brand){
		if(brand.equals("Nike")){
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		}else if(brand.equals("adidas")){
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
		}else if(brand.equals("Unbranded")){
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
		}else{
			System.out.println("Brand not found");
		}
	}
}
