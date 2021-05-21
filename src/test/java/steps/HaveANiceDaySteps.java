package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HaveANiceDaySteps {
  WebDriver driver;

  public void setDriver(WebDriver driver) {
    this.driver = driver;
  }

  @Step("Given user open main page")
  public void openMainPage() throws InterruptedException {
    driver.get("https://www.surveymonkey.com/r/9MVSPYS");
  }

  @Step("When user selects option {0}")
  public void selectOption(String option) {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + option + "')]"));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    element.click();
  }

  @Step("And user press on button Next")
  public void pressOnButtonNext() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    element.click();
  }

  @Step("Then user sees that they can submit successfully")
  public void seeThatSubmitSuccessfully() {
    WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(),'Have a nice day.')]")));
    WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Have a nice day.')]"));
    Assert.assertTrue("Message is not displayed", element.isDisplayed());
  }
}
