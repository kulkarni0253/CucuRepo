package Com.radical.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					dryRun=false, //to check the code the code feature file creation, to check which glue code or feature file is having issues
					
					features= {"src/test/resources/com/hooksFF/"},
					glue={"Com/radical/basic/hooksSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
			
			)
	
	public class RunHooksTest {	
	

}
