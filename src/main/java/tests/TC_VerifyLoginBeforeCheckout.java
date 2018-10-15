package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddedToCartPage;
import page.AmazonMainPage;
import page.DepartmentsDirectoryPage;
import page.KindlePaperwhitePage;
import tests.template.AutomationTemplate;

public class TC_VerifyLoginBeforeCheckout extends AutomationTemplate
{

  @Test
  public void testMethod()
  {

    AmazonMainPage main = new AmazonMainPage(driver);

    DepartmentsDirectoryPage dir = main.clickShopByDeptButton(driver);

    KindlePaperwhitePage kin = dir.clickKindlePaperwhiteLink();

    kin.selectQuantity("2");

    AddedToCartPage addedToCart = kin.clickAddToCartButtonSkipAddons();

    addedToCart.clickProceedToCheckoutButton();

    Assert.assertTrue(driver.getPageSource().contains("E-mail address or mobile phone number"),
        "Page did not ask for Email address or mobile number as expected");

  }

}
