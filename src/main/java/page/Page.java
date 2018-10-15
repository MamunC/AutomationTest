package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * A generic Page class which all pages will extend from. 
 * It covers element initiations within the page
 * @author chowdm
 *
 */
public abstract class Page
{
  protected WebDriver driver;

  public Page(WebDriver driver)
  {
    this.driver = driver;
    this.initiateElements();
  }

  private void initiateElements()
  {
    PageFactory.initElements(driver, this);
  }

}
