package StepDefination;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefination"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReport/junitreports.xml",
		"json:target/JSONReport/report.json",
		"html:target/HtmlReports/report.html"})
public class TestRunner {

}
