package vidapay.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
              "rerun:target/rerun.txt",
              "json:target/cucumber.json"
        },
        features = {
                "src/test/resources/feature"
        },
        glue = "vidapay/step_definitions",
        dryRun = false,

       tags = "@AmazonCart"
)



public class CucumberRunner {
}
