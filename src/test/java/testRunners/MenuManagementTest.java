package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
   @CucumberOptions
            (features = {"src/test/java/cucumber/feature"},
                    glue = {"steps", "hooks"},
                    plugin= {"pretty", "html:target/SystemTestReports/html",
                    "jason:target/SystemTestReports/json/report.jason",
                    "junit:target/SystemTestReports/junit/report.xml"},
                    dryRun = false,
                    monochrome = true
            )

    public class MenuManagementTest {
    }
