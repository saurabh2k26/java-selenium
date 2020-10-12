package MyFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RunningOnFirefox {
  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "//Users//sshrivastava//Documents//selenium//geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://google.com");
    driver.quit();
  }
}
