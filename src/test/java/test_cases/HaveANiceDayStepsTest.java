package test_cases;

import core.DriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HaveANiceDaySteps;

@RunWith(SerenityRunner.class)
public class HaveANiceDayStepsTest {
  DriverManager driverManager = new DriverManager();

  @Before
  public void init() {}

  @Steps HaveANiceDaySteps haveANiceDaySteps;

  @Test
  public void userCanChooseHowAreThey() throws InterruptedException {
    haveANiceDaySteps.setDriver(driverManager.startChrome());
    haveANiceDaySteps.openMainPage();
    haveANiceDaySteps.selectOption("Good");
    haveANiceDaySteps.pressOnButtonNext();
    haveANiceDaySteps.seeThatSubmitSuccessfully();
  }

  @After
  public void teardown() {
    driverManager.closeChrome();
  }
}
