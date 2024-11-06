package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\gargy\\eclipse-workspace\\weeek1230Maven\\src\\test\\resources\\FeaturesFile\\signup3.feature" ,glue="StepDefination",
monochrome=true,//true means for not want the unwanted output 
tags="@single or @multiple ",
plugin= {"html:src/test/resources/target/reportcommonfullsigup.html"})
public class TestRunner3 {
	

}
