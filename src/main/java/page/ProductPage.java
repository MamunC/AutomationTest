package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Abstract product page to contain methods to handle common elements in all the product pages.
 * Class is made abstract to prevent instantiation of it, as it doesn't represent a single page.
 * @author chowdm
 *
 */
public abstract class ProductPage extends Page
{
  
  @FindBy(xpath = "//*[@id='add-to-cart-button']")
  private WebElement addToCartButton;

  public ProductPage(WebDriver driver)
  {
    super(driver);
  }
  
  public AddedToCartPage clickAddToCartButtonSkipAddons()
  {
    addToCartButton.click();
    closeAddonPopoverScreen();
    return new AddedToCartPage(driver);
  }
  
  public void closeAddonPopoverScreen()
  {
    driver.findElement(By.className("a-button-close")).click();
  
  }

}
