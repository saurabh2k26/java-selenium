package MyObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPagePF {

  WebDriver driver;

  public IndexPagePF(WebDriver driver)
  {
    this.driver=driver;
    PageFactory.initElements(driver, this);
  }

  @FindBy(name="session[username_or_email]")
  WebElement username;

  @FindBy(name="session[password]")
  WebElement password;

  @FindBy(css="div[data-testid='LoginForm_Login_Button']")
  WebElement LogInButton;

  public void Login(String uname, String passwd) {
    username.sendKeys(uname);
    password.sendKeys(passwd);
    LogInButton.click();
  }
}
