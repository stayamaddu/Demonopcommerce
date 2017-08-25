package utils;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/featureFiles"}
		,glue={"stepDefinations"}
		,monochrome = true, tags={"@satya111"}
		)

public class RunnerTest {

}
