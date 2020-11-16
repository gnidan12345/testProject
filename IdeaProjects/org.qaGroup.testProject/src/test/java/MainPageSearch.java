import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;



import java.util.concurrent.TimeUnit;

public class MainPageSearch {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver();

        //go to website
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();

        //implicity wait
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }
     @AfterTest
     private void tearDown(){
         driver.quit();
        }


    }

}
