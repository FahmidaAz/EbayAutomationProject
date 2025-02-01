package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
   @FindBy(xpath="//span[2][contains(text(),'Shoes')]")
   public WebElement txtShoes;
   
   @FindBy(xpath="//span[2][contains(text(),'Shirts')]")
   public WebElement txtShirts;
   
   @FindBy(xpath="//span[2][contains(text(),'Pants')]")
   public WebElement txtPants;
}
