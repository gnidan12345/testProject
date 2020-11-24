import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CssDinnerPlayAnotherWay {
    private WebDriver driver;
    private String[] answers = new String[]

            {
                    "plate", //1
                    "bento", //2
                    "#fancy", //3
                    "plate apple", //4
                    "#fancy pickle", //5
                    ".small", //6
                    "orange.small", //7
                    "bento orange.small", //8
                    "plate,bento", //9
                    "*", //10
                    "plate *", //11
                    "plate + apple", //12
                    "bento ~ pickle", //13
                    "plate > apple", //14
                    "plate :first-child",//15
                    "plate apple:only-child, plate pickle:only-child",//16
                    "plate apple:last-child, pickle",//17
                    "plate:nth-child(3)",//18
                    "bento:nth-last-child(3)",//19
                    "apple:first-of-type",//20
                    "plate:nth-of-type(even)",//21
                    "plate:nth-of-type(2n+3)",//22
                    "apple:only-of-type",//23
                    "apple:last-of-type, orange:last-of-type",//24
                    "bento:empty",//25
                    " apple:not(.small)",//26
                    " [for]",//27
                    "plate[for]",//28
                    "bento[for='Vitaly']",//29
                    "[for^='Sa']",//30
                    "[for$='ato']",//31
                    "[for*='obb']"//32
            };


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "src/main/java/geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        driver.get("https://flukeout.github.io/");
        driver.manage().window().setSize(new Dimension(1024, 760));

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void letsPlay() throws InterruptedException {
        System.out.println("I`m playing game" + driver.getTitle());
        System.out.println("====================================");

        //define some locators for this game
        WebElement currentGameTask = driver.findElement(By.className("order"));
        WebElement gameLevel = driver.findElement(By.className("level-text"));
        WebElement rowForAnswer = driver.findElement(By.xpath("//*[@class='input-strobe' and @type = 'text']"));
        WebElement enterButton = driver.findElement(By.xpath("//div[contains(@class,'enter-button') and contains(text(), 'enter') ]"));

        //define an explicit wait
        WebDriverWait waitBeforeAnswer = (new WebDriverWait(driver, 8));
        WebDriverWait waitAfterAnswer = (new WebDriverWait(driver, 8));


        //lets play

        for (int i = 0; i < answers.length-1; i++) {

            System.out.println("I`m on game level" + gameLevel.getText());
            System.out.println("My task is " + currentGameTask.getText());
            waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
            rowForAnswer.sendKeys(answers[i]);
            enterButton.click();
            Thread.sleep(1000);
            enterButton.click();


            if (i < answers.length) {
                waitAfterAnswer.until(ExpectedConditions.textToBe(new By.ByClassName("level-text"), "Level " + (i + 2) + " of 32"));
                System.out.println("OK, I win level " + (i + 1));

            } else {
                //waitAfterAnswer.until(ExpectedConditions.textToBe(new By.ByClassName("level-text"), "Level " + " 32 of 32"));

                waitAfterAnswer.until(ExpectedConditions.presenceOfElementLocated(new By.ByClassName("winner")));
                System.out.println("You rock at CSS.");
                break;
            }
        }

    }
}















