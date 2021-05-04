package vidapay.step_definitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import vidapay.pages.amazon.AmazonHomePage;
import vidapay.utils.ConfigurationReader;
import vidapay.utils.Driver;


@Log4j2
public class AmazonAddToCartStepDefinitions {

    AmazonHomePage homePage = new AmazonHomePage();

    @Given("user is on amazon homepage")
    public void user_is_on_amazon_homepage() {
        log.debug("opening amazon homepage");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user search for {string}")
    public void user_search_for(String string) {
        log.debug("search item" + string);
       homePage.searchItem(string);
        System.out.println("in amazon search feature will pass");
        Assert.assertTrue(true);
    }
    @When("click the first result")
    public void click_the_first_result() {
        log.debug("getting the first result");
       homePage.clickFirstResult();
        System.out.println("this step always pass in amamzon search feature");
        Assert.assertTrue(true);
    }


}
