import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CssDinnerPlayWithWaits {
    private WebDriver driver;


    @BeforeClass
    public void setuo(){
        System.setProperty("webdriver.gecko.driver",  "src/main/java/geckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();
       // options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        driver.get("https://flukeout.github.io/");
        driver.manage().window().setSize(new Dimension(1024, 760));

    }

    @AfterClass
    public void tearDown(){
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

        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 2 of 32"));
        if (gameLevel.getText().equals("Level 2 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 3 of 32"));
        if (gameLevel.getText().equals("Level 3 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }

        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("#fancy");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 4 of 32"));
        if (gameLevel.getText().equals("Level 4 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }

        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate apple");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 5 of 32"));
        if (gameLevel.getText().equals("Level 5 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("#fancy pickle");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 6 of 32"));
        if (gameLevel.getText().equals("Level 6 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys(".small");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 7 of 32"));
        if (gameLevel.getText().equals("Level 7 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("orange.small");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 8 of 32"));
        if (gameLevel.getText().equals("Level 8 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento orange.small");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 9 of 32"));
        if (gameLevel.getText().equals("Level 9 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate,bento");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 10 of 32"));
        if (gameLevel.getText().equals("Level 10 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("*");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 11 of 32"));
        if (gameLevel.getText().equals("Level 11 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }








    }
}
