import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPageSearchField {


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


        @Test(priority = 1)
        public void findValidValue() {
            MainPageSearch mainSearch = new MainPageSearch(driver);
            mainSearch.searchFieldInput("пылесос");
            mainSearch.searchButtonClick();
            mainSearch.waitForPageTitle("Пылесосы");
            mainSearch.checkTheFirstItem("Пылесос");
            /*mainSearch.checkFindItemText("Пылесосы");*/
        }


        @Test(priority = 2, suiteName = "Regression")
        public void findInvalidValue()  {
            MainPageSearch mainPageSearch = new MainPageSearch(driver);
            mainPageSearch.searchFieldInput("::::::");
            mainPageSearch.searchButtonClick();
            mainPageSearch.waitForPageTitle("«::::::»");
            mainPageSearch.checkFindItemText("«::::::»");
            mainPageSearch.searchFieldInputClean();
            }

         @Test(priority = 3)
    public void findValueNotFromBraedCrumbs(){
            MainPageSearch mainPageSearch = new MainPageSearch(driver);
            mainPageSearch.searchFieldInput("чупакабра");
            mainPageSearch.searchButtonClick();
            mainPageSearch.waitForPageTitle("«чупакабра»");
            mainPageSearch.checkTheFirstItem("чупакабр");
            mainPageSearch.checkFindItemText("«чупакабра»");
         }





        }



