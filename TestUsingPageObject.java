package MyTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import MyObjects.IndexPage;

public class FirstPageObjectTest {
  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "//Users//sshrivastava//Documents//selenium//geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    driver.get("http://twitter.com");
    //driver.findElement(By.cssSelector("a[data-testid='loginButton']")).click();
    IndexPage indexPage = new IndexPage(driver);

    indexPage.Login("*****", "********");
    
    driver.quit();
  }
}
