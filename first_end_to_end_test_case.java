package MyFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class FirstEndToEndTestCase {
  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "//Users//sshrivastava//Documents//selenium//geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.get("http://twitter.com");
    //driver.findElement(By.cssSelector("a[data-testid='loginButton']")).click();
    driver.findElement(By.name("session[username_or_email]")).sendKeys("******");
    driver.findElement(By.name("session[password]")).sendKeys("******");
    driver.findElement(By.cssSelector("div[data-testid='LoginForm_Login_Button']")).click();
    driver.findElement(By.cssSelector("a[aria-label='Profile']")).click();
    driver.findElement(By.cssSelector("a[href='/settings/profile']")).click();
    driver.findElement(By.cssSelector("input[name='displayName']")).clear();
    driver.findElement(By.cssSelector("input[name='displayName']")).sendKeys("aA1!@#$%^&*()");
    driver.findElement(By.cssSelector("div[data-testid='Profile_Save_Button']")).click();
    try
    {
      Thread.sleep(2000);
    }
       catch(Exception e)
    {
      System.out.println(e);
    }
    driver.findElement(By.cssSelector("a[href='/settings/profile']")).click();
    String name = driver.findElement(By.cssSelector("input[name='displayName']")).getAttribute("value");
    Assert.assertEquals(name, "aA1!@#$%^&*()");
    driver.findElement(By.cssSelector("input[name='displayName']")).clear();
    driver.findElement(By.cssSelector("input[name='displayName']")).sendKeys("VK");
    driver.findElement(By.cssSelector("div[data-testid='Profile_Save_Button']")).click();
    driver.quit();
  }
}
