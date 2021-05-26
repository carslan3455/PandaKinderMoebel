package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featuer"},
        tags = "@Smoke",
        glue = {"stepDefs"},
        plugin = {
         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","summary"
        }
)


public class Smoke_Runner extends AbstractTestNGCucumberTests {


}
