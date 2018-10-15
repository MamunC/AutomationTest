package tests.template;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utis.BrowserUtils;

/**
 * This class is used to setup the test environment.
 * It handles the following tasks:
 *  1) setup logger
 *  2) setup webdriver
 *  3) launch browser
 *  4) go to test url
 * @author chowdm
 *
 */
public class AutomationTemplate
{
  /**
   * Holds all passed in TestNG parameters
   */
  private InheritableThreadLocal<Map<String, String>> testParameters;

  protected WebDriver driver;

  @BeforeClass
  public void initializeTestParameters(ITestContext context)
  {
    testParameters = new InheritableThreadLocal<>();
    testParameters.set(context.getCurrentXmlTest().getAllParameters());
  }

  @BeforeClass(dependsOnMethods = { "initializeTestParameters" })
  public void setupClassLogger()
  {
    // TODO
  }

  @BeforeClass(dependsOnMethods = { "setupClassLogger" })
  public void setupTestPlatform()
  {
    // get passed in browser value. If browser value is not passed in, set default to chrome
    String browser = testParameters.get().get("browser") != null
        ? testParameters.get().get("browser") : "chrome";

    driver = BrowserUtils.loadBrowser(browser.toUpperCase());
    
    driver.get("http://amazon.ca");

  }

  @AfterClass(alwaysRun = true)
  public void tearDownTestEnvironment()
  {
    if (getDriver() == null)
    {
      return;
    }

    // If we can't quit the driver, keep going with other tests
    try
    {
      getDriver().quit();
    }
    catch (Exception e)
    {
    //  TestLog.debug("Failed to close driver [" + ExceptionUtils.getErrorMsg(e) + "]");
    }

  }

  /**
   * @return Just returns the driver
   */
  public WebDriver getDriver()
  {
    return driver;
  }

}
