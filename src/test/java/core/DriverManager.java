package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {
  public static WebDriver startChrome() {
    // Chrome config
    WebDriverManager.chromedriver().setup();
    WebDriver driver;
    driver=new ChromeDriver();
    return driver;
  }
}
