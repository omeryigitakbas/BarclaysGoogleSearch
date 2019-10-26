package Main;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\10054730\\barclays\\BarclaysSearchBDDFramework\\src\\main\\java\\Features\\google_search.feature", //the path of the feature files
			glue={"StepDefinitions"}, //the path of the step definition files
			format= {"pretty","html:test-outout"} //to generate customize types of reporting
					//		monochrome = true, //display the console output in a proper readable format
					//		strict = true, //it will check if any step is not defined in step definition file
					//		dryRun = false //to check the mapping is proper between feature file and step definition file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
	public class TestRunner {
	//
	}

