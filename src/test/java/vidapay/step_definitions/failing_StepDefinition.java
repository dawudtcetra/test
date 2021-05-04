package vidapay.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class failing_StepDefinition {
    @Given("I run the maven with command line using parameter")
    public void i_run_the_maven_with_command_line_using_parameter() {
        System.out.println("this step will pass");
        Assert.assertTrue(true);
    }
    @Then("I should see failed test rerun")
    public void i_should_see_failed_test_rerun() {
        System.out.println("this step is under failing feature and will fail");
        Assert.assertTrue(false);
    }

    @Given("I run the maven with command line using parameter a")
    public void i_run_the_maven_with_command_line_using_parameter_a() {
        System.out.println("this step will pass");
        Assert.assertTrue(true);
    }
    @Then("I should see failed test rerun a")
    public void i_should_see_failed_test_rerun_a() {
        System.out.println("this step is under failing feature and will fail");
        Assert.assertTrue(false);
    }

    @Given("I run the maven with command line using parameter b")
    public void i_run_the_maven_with_command_line_using_parameter_b() {
        System.out.println("this step will pass");
        Assert.assertTrue(true);
    }
    @Then("I should see failed test rerun b")
    public void i_should_see_failed_test_rerun_b() {
        System.out.println("this step is under failing feature and will fail");
        Assert.assertTrue(false);
    }






}
