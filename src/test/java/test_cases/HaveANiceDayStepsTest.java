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
  public void init() {
    driverManager.startChrome();
  }

  @Steps
  private final HaveANiceDaySteps haveANiceDaySteps =
      new HaveANiceDaySteps(driverManager.startChrome());

  @Test
  public void userCanChooseHowAreThey() throws InterruptedException {
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
