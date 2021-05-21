package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
  WebDriver driver;

  public WebDriver startChrome() {
    // Chrome config
    if (this.driver == null) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }
    return driver;
  }

  public void closeChrome() {
    // Chrome config
    driver.close();
  }

  public WebDriver getDriver() {
    return driver;
  }
}
