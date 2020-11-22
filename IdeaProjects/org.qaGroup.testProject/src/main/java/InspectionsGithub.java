import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InspectionsGithub {
    private WebDriver driver;
    InspectionsGithub(WebDriver driver){this.driver = driver;}

    By accountNameField  = By.xpath("//span[@itemprop=\"additionalName\"]");


    public InspectionsGithub checkAccountName(String item){
       Assert.assertEquals(driver.findElement(accountNameField).getText(),item );
       return this;
    }
}
