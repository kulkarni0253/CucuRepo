package Com.radical.basic.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/com/demo/Onefolder.feature", "src/test/resources/com/demo/Onefolder2.feature"},
		glue = {"Com/radical/basic/demo/" }
		
		)

public class RunOnefolderStepDefsTest {

}
