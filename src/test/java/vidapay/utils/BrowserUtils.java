package vidapay.utils;

import org.apache.logging.log4j.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BrowserUtils {


    private static Logger log = LogManager.getLogger(BrowserUtils.class.getName());

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 40);

    public static void wait(int seconds){
        log.debug("Thread.sleep is staring for" + seconds);
        try{
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void waitTillElementDisplayed(List<WebElement> element){
        int count =0;
        while(true){
            count++;
            System.out.println(count);
            if(element.size() > 0 || count > 1){
                break;
            }
        }
    }

    public static void clickOnElement(WebElement element){

        log.debug("Clicking web element when it's clickable");

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }


    public static void clickWithJS(WebElement element){
        log.debug("Clicking web element with java script");
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) (Driver.getDriver())).executeScript("arguments[0].click()", element);
    }


    public static void enterText(WebElement element, String text){
        log.debug("Entering text into input box");
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text, Keys.TAB);
    }




    public static void scroll(int x, int y){
        log.debug("Scrolling with coordinate" + x + "." + y);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy("+x+", "+y+")");
    }

    public static void moveToElement(WebElement webElement){

        log.debug("Move to element using Action class");

        wait.until(ExpectedConditions.elementToBeClickable(webElement));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(webElement).perform();


    }

    public static void waitTillTitleChangeTo(String title){
        wait.until(ExpectedConditions.titleIs(title));
    }




}
