import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageSearch {
    private WebDriver driver;
    public MainPageSearch(WebDriver driver){
        this.driver = driver;

        By searchField = By.xpath("//input[@name= 'search' and @placeholder = 'Я ищу...']");
    }
}
