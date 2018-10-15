package page;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tests.template.AutomationTemplate;

public class KindlePaperwhitePageTest extends AutomationTemplate
{
  KindlePaperwhitePage kin;

  @BeforeClass
  public void setup()
  {
    AmazonMainPage main = new AmazonMainPage(driver);

    DepartmentsDirectoryPage dir = main.clickShopByDeptButton(driver);

    kin = dir.clickKindlePaperwhiteLink();
  }

  @Test
  public void testDefaultQuantitySelectValue()
  {
    Assert.assertEquals(kin.getQuantitySelectValue().trim(), "1",
        "Default value in quantity drop down is not as expected");
  }

}
