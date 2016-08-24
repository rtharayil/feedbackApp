package Features;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		/*tags= {"@done", "@done"},
	   	    features = "" , //refer to Feature file
	   	    glue = "“  */
		monochrome=true
	)
public class CucumberRunner {

}

