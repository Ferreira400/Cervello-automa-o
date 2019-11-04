package executar;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "BasedeConhecimento/feature",  glue = {"business"}

		)



public class rodar {

}
