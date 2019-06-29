import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\RBHD3\\eclipse-workspace\\HareKrishnaHareRam\\src\\test\\java\\features",
monochrome =true,
glue = "",
dryRun=false,
plugin = {"pretty","json:target/cucumber-json/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
 strict =true)

// Sai
public class Runner {

	
	
	
	

}
