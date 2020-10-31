import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginAndLogout {
    private WebDriver driver;



    @BeforeMethod
        public void setup(){
         driver = new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/index.php/login");
         driver.manage().window().maximize();
        }


    @Test(priority = 1, description = "Login And CheckElements")
        public void testLogin(){
        //define elements
        WebElement loginElement = driver.findElement(By.id("txtUsername"));
        WebElement passwordElement = driver.findElement(By.xpath("//input[@name ='txtPassword']"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));

        //check and login
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
        loginElement.sendKeys("Admin");
        passwordElement.sendKeys("admin123");
        submitButton.click();

        //check result
        WebElement marketplaceMark = driver.findElement(By.id("MP_link"));
        Assert.assertEquals(marketplaceMark.getAttribute("value"), "Marketplace" );
        Assert.assertTrue(driver.getCurrentUrl().contains("/dashboard"));

        //back to previous page
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
        driver.navigate().refresh();

        WebElement messWarn = driver.findElement(By.xpath("//div[@class = \"message warning\" ]"));
        Assert.assertEquals(messWarn.getText(), "Invalid Request");


    }

  @AfterMethod
    public void teardown(){
        driver.quit();
    }
}