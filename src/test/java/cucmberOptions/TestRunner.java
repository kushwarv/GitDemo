package cucmberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features",
		//run all the feature files then give the package name.if want to run single file then mentioned file name 
		glue="stepDefinations" //glue is parameter to define step definations package
		)

public class TestRunner {

}
