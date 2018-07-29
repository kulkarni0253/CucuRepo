package Com.radical.basic.RUNNER_FILE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true, // used to make console output in a readable format as this was written in RUBY language, with this can be used in any OS and language.
					//dryRun=true,
					
					features= {"src/test/resources/com/backgroundFF"}, // before runs in INCREMENT STYLE and AFter runs DECREMENT Style
					glue={"Com/radical/basic/backgroundSD"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
					}
			
			)
	
	public class RunBackgroundTest {	
	

}
