package MyFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RunningOnChrome {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "//Users//sshrivastava//Documents//selenium//chromedriver");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://google.com");
    driver.quit();
  }
}
