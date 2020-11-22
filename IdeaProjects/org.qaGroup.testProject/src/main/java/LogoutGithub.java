import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutGithub {
    private WebDriver driver;
    LogoutGithub(WebDriver driver){this.driver = driver;}


    By headerButton = By.xpath("//summary[@aria-label = 'View profile and more']");
    By signOutItemFromList = By.xpath("//button[contains(@class, 'dropdown-signout')]");
    By nameInDropdown = By.xpath("//strong[@class ='css-truncate-target']");

    public LogoutGithub headerButtonClick(){
        driver.findElement(headerButton).click();return this;
    }

    public LogoutGithub signOutItemFromListClick(){
        driver.findElement(signOutItemFromList).click();return this;
    }

    public LogoutGithub waitUntilPageTitle(){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBePresentInElement
                        (driver.findElement(By.xpath("//div[@class='col-md-7 text-center text-md-left ']")), "Built for developers"));
        return this;
    }

    public LogoutGithub waitUntilNamePresentInDropdwn(String text){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBePresentInElement
                        (driver.findElement(nameInDropdown), text));
        return this;
    }

    public LogoutGithub logoutUserFromAccount(String name) throws InterruptedException {
        headerButtonClick();
        Thread.sleep(2000);
        waitUntilNamePresentInDropdwn(name);
        signOutItemFromListClick();
        waitUntilPageTitle();
        return this;
    }

}
