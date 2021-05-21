package test_cases;

import core.DriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.HaveANiceDaySteps;

@RunWith(SerenityRunner.class)
public class HaveANiceDayStepsTest {
    WebDriver driver=DriverManager.startChrome();

    @Steps
    private final HaveANiceDaySteps haveANiceDaySteps=new HaveANiceDaySteps(driver);

    @Test
    public void userCanChooseHowAreThey() throws InterruptedException {
        haveANiceDaySteps.openMainPage();
        haveANiceDaySteps.selectOption("Good");
        haveANiceDaySteps.pressOnButtonNext();
        haveANiceDaySteps.seeThatSubmitSuccessfully();
    }
}
