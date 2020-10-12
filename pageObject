package MyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {

  WebDriver driver;

  public IndexPage(WebDriver driver)
  {
    this.driver=driver;
  }

  By username = By.name("session[username_or_email]");
  By password = By.name("session[password]");
  By LogInButton = By.cssSelector("div[data-testid='LoginForm_Login_Button']");

  public void Login(String uname, String passwd) {
    driver.findElement(username).sendKeys(uname);
    driver.findElement(password).sendKeys(passwd);
    driver.findElement(LogInButton).click();
  }
  
  // use type as WebElement when return something
  public WebElement getUserName() {
    return driver.findElement(username);
  }
  
}
