package vidapay.pages.amazon;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchInputBox;

    @FindBy(id ="nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath="(//div[contains(@data-asin, 'B08')])[1]")
    private WebElement firstResult;

    public void searchItem(String item){
        searchInputBox.sendKeys(item);
        searchButton.click();
    }

    public void clickFirstResult(){
        firstResult.click();
    }


}
