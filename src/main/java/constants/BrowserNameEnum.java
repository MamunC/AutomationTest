package constants;

public enum BrowserNameEnum
{
  CHROME("chrome"), FIREFOX("firefox");

  private String name;

  BrowserNameEnum(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

}
