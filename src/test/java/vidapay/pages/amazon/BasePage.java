package vidapay.pages.amazon;

import org.openqa.selenium.support.PageFactory;

import vidapay.utils.Driver;

public abstract class BasePage {



    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
