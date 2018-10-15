package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainPage extends Page
{

  @FindBy(xpath = "//*[@id='nav-link-shopall']")
  private WebElement shopByDeptButton;
  
  
  
  public AmazonMainPage(WebDriver driver)
  {
    super(driver);
  }
  
  public DepartmentsDirectoryPage clickShopByDeptButton(WebDriver driver)
  {
    shopByDeptButton.click();
    return new DepartmentsDirectoryPage(driver);
  }
  
  public boolean isShopByDeptButtonVisible()
  {
    return shopByDeptButton.isDisplayed() && shopByDeptButton.isEnabled();
  }

}
