import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitHubTestAndPreProdEnv {
    WebDriver driver;
    Enviroment testEnvironment = ConfigFactory.create(Enviroment.class);

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get(testEnvironment.myurl());
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void loginInto(){
        LoginGithub login = new LoginGithub(driver);
        login.loginUserIntoAccount(testEnvironment.login(), testEnvironment.password());
    }

//
//@Test(priority = 2 )
////    public  void inspectMainPage(){
////        InspectionsGithub inspect = new InspectionsGithub(driver);
////        inspect.checkAccountName(testEnvironment.accountowner());
////    }
    @Test(priority = 2)
    public void logoutFromGitHub() throws InterruptedException {
        LogoutGithub logout = new LogoutGithub(driver);
        logout.logoutUserFromAccount(testEnvironment.accountowner());

    }
}
