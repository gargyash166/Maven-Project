package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\gargy\\eclipse-workspace\\weeek1230Maven\\src\\test\\resources\\FeaturesFile\\signup.feature" ,glue="StepDefination",
monochrome=true, //true means for not want the unwanted output 
plugin= {"html:src/test/resources/target/reportsigup.html"})
public class TestRunner {
	

}
