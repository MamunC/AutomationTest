package utis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.BrowserNameEnum;

public class BrowserUtils
{
  
  private BrowserUtils()
  {
    
  }

  public static WebDriver loadBrowser(String browser)
  {
    switch (BrowserNameEnum.valueOf(browser))
    {
    case CHROME:
      return loadChrome();
    case FIREFOX:
      return loadFireFox();
    default:
      return loadChrome();
    }

  }

  private static WebDriver loadFireFox()
  {
    // TODO Auto-generated method stub
    return null;
  }

  private static WebDriver loadChrome()
  {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
    
    WebDriver driver = new ChromeDriver();
    
    //Maximize the window
    driver.manage().window().maximize();
    
    return driver;
  }

}
