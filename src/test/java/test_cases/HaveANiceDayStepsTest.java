package test_cases;

import core.DriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HaveANiceDaySteps;

@RunWith(SerenityRunner.class)
public class HaveANiceDayStepsTest {
  DriverManager driverManager;
  WebDriver driver;

  @Before
  public void init() {
    driverManager = new DriverManager();
    driver = driverManager.startDriver();
  }

  @Steps HaveANiceDaySteps haveANiceDaySteps;

  @Test
  public void userCanChooseHowAreThey() {
    haveANiceDaySteps.setDriver(driver);
    haveANiceDaySteps.openMainPage();
    haveANiceDaySteps.selectOption("Good");
    haveANiceDaySteps.pressOnButtonNext();
    haveANiceDaySteps.seeThatSubmitSuccessfully();
  }

  @After
  public void teardown() {
    driverManager.closeDriver();
  }
}
