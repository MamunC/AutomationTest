package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddedToCartPage extends Page
{

  @FindBy(className = "hlb-checkout-button")
  private WebElement proceedToCheckoutButton;

  public AddedToCartPage(WebDriver driver)
  {
    super(driver);
  }

  public void clickProceedToCheckoutButton()
  {
    proceedToCheckoutButton.click();
  }

}
