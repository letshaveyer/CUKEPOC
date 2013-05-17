package poctest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "json", "json:target/cucumber.json" }, features = { "." }, strict = true)
public class CucumberIT {

}  
