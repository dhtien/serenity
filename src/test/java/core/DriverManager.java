package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
  WebDriver driver;

  public WebDriver startDriver() {
    // Webdriver config
    if (System.getProperties().getProperty("browser").equalsIgnoreCase("chrome")) {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
    }else if (System.getProperties().getProperty("browser").equalsIgnoreCase("firefox"))
    {
      WebDriverManager.firefoxdriver().setup();
      driver = new FirefoxDriver();
    }

    return driver;
  }

  public void closeDriver() {
    // Chrome config
    driver.close();
  }

  public WebDriver getDriver() {
    return driver;
  }
}
