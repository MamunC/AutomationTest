package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepartmentsDirectoryPage extends Page
{
  
  @FindBy(xpath = "//*[@id='shopAllLinks']/tbody/tr/td[2]/div[1]/ul/li[2]/a")
  private WebElement KindlePaperwhiteLink;

  public DepartmentsDirectoryPage(WebDriver driver)
  {
    super(driver);
  }
  
  public KindlePaperwhitePage clickKindlePaperwhiteLink()
  {
    KindlePaperwhiteLink.click();
    return new KindlePaperwhitePage(driver);
  }

}
