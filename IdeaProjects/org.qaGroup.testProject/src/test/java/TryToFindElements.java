import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TryToFindElements {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        //disable notifications
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        // go to site
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();

        //wait??
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown(){driver.quit();}


    @Test(description = "get page elements and check,match,extract")
    public void findElements(){

    String mainPageSource = driver.getPageSource();
    WebElement searchField = driver.findElement(By.xpath("//input[@name = 'search']"));

        // 1. check the certain text exists on the page
        Assert.assertTrue(mainPageSource.contains("Доставка по всей Украине"));

        //2.check the equality of expected and actual result
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='menu-toggler__text']")).getText(), "Каталог товаров");

        //3.check location of the element and does it match with expectation

       // System.out.println(driver.findElement(By.xpath("//a[@class=\"menu-categories__link\"]/span")).getLocation());

        Assert.assertEquals(driver.findElement(By.xpath("//a[@class='menu-categories__link']/span")).getLocation().toString(), "(198, 144)");

        //4. check if element is enabled on text

        Assert.assertTrue(searchField.isEnabled());

        Assert.assertFalse(!searchField.isEnabled());

        //5. check attribute value

        Assert.assertEquals(searchField.getAttribute("placeholder"), "Я ищу...");
        Assert.assertNotEquals(searchField.getAttribute("placeholder"), "Я  не ищу...");

        //6.check the quantity of the elements on the page
        Assert.assertEquals(driver.findElements(By.xpath("//a[@class='menu-categories__link']/span")).size(), 17);
    }
}
