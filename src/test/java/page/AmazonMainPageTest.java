package page;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import tests.template.AutomationTemplate;

public class AmazonMainPageTest extends AutomationTemplate
{

  private AmazonMainPage mainPage;

  @BeforeClass
  public void setup()
  {
    mainPage = new AmazonMainPage(driver);
  }

  @Test
  public void testShopByDeptButtonVisible()
  {
    Assert.assertTrue(mainPage.isShopByDeptButtonVisible(),
        "Shop By Department button is not interactable");

  }
}
