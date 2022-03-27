package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.killDriver;

public class Hooks {

    Scenario scenario;

    @After
    public void tearDown() {
        gerarScreenShot();
        killDriver();
    }

    @Before
    public void setup(Scenario scenario) {
        this.scenario = scenario;
        getDriver();
    }


    public void gerarScreenShot() {

        try {
            File image = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(image, new File("target/screenshots/" + scenario.getName() + "_" + new Date().getTime() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
