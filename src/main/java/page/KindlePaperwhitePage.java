package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class KindlePaperwhitePage extends ProductPage
{

  @FindBy(xpath = "//*[@id='quantity']")
  private WebElement quantityDropDown;
  Select quantitySelect = new Select(quantityDropDown);

  public KindlePaperwhitePage(WebDriver driver)
  {
    super(driver);
  }

  public void selectQuantity(String quantity)
  {
    quantitySelect.selectByVisibleText(quantity);
  }
  
  public String getQuantitySelectValue()
  {
   return quantitySelect.getFirstSelectedOption().getText(); 
  }
  
}
