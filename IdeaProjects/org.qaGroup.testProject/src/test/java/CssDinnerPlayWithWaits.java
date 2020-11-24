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

import javax.swing.text.html.CSS;

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


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate *");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 12 of 32"));
        if (gameLevel.getText().equals("Level 12 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate + apple");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 13 of 32"));
        if (gameLevel.getText().equals("Level 13 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }

        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento ~ pickle");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 14 of 32"));
        if (gameLevel.getText().equals("Level 14 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }

        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate > apple");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 15 of 32"));
        if (gameLevel.getText().equals("Level 15 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate :first-child");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 16 of 32"));
        if (gameLevel.getText().equals("Level 16 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate apple:only-child, plate pickle:only-child");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 17 of 32"));
        if (gameLevel.getText().equals("Level 17 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate apple:last-child, pickle");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 18 of 32"));
        if (gameLevel.getText().equals("Level 18 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }

        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate:nth-child(3)");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 19 of 32"));
        if (gameLevel.getText().equals("Level 19 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else{
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento:nth-last-child(3)");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 20 of 32"));
        if (gameLevel.getText().equals("Level 20 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("apple:first-of-type");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 21 of 32"));
        if (gameLevel.getText().equals("Level 21 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate:nth-of-type(even)");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 22 of 32"));
        if (gameLevel.getText().equals("Level 22 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate:nth-of-type(2n+3)");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 23 of 32"));
        if (gameLevel.getText().equals("Level 23 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("apple:only-of-type");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 24 of 32"));
        if (gameLevel.getText().equals("Level 24 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }



        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("apple:last-of-type, orange:last-of-type");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 25 of 32"));
        if (gameLevel.getText().equals("Level 25 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }




        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento:empty");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 26 of 32"));
        if (gameLevel.getText().equals("Level 26 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }



        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys(" apple:not(.small)");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 27 of 32"));
        if (gameLevel.getText().equals("Level 27 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }



        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys(" [for]");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 28 of 32"));
        if (gameLevel.getText().equals("Level 28 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("plate[for]");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 29 of 32"));
        if (gameLevel.getText().equals("Level 29 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }



        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("bento[for='Vitaly']");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 30 of 32"));
        if (gameLevel.getText().equals("Level 30 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }



        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("[for^='Sa']");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 31 of 32"));
        if (gameLevel.getText().equals("Level 31 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }


        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("[for$='ato']");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 32 of 32"));
        if (gameLevel.getText().equals("Level 32 of 32")) {
            System.out.println("Ok! You are a winner!");
        } else {
            System.out.println("I`m loose");
        }




        System.out.println("I`m on game level" + gameLevel.getText());
        System.out.println("My task is " + currentGameTask.getText());
        waitBeforeAnswer.until(ExpectedConditions.elementToBeClickable(rowForAnswer));
        rowForAnswer.sendKeys("[for*='obb']");
        Thread.sleep(1000);
        enterButton.click();
        waitAfterAnswer.until(ExpectedConditions.textToBe(By.className("level-text"), "Level 32 of 32"));
        if (gameLevel.getText().equals("Level 32 of 32")) {
            System.out.println("You did it! You rock at CSS.");
        } else {
            System.out.println("I`m loose");
        }






































    }
}
