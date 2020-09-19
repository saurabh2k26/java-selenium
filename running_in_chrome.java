package MyFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "//Users//sshrivastava//Documents//selenium//chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get("http://google.com");
  }
}

//add selenium jar files in module dependencies
