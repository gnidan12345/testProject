import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitHubTestAndPreProdEnv {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://github.com/gnidan12345");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void loginInto(){
        LoginGithub login = new LoginGithub(driver);
        login.loginUserIntoAccount("gnidan12345", "julia14071980");
    }

    @Test(priority = 2 )
    public  void inspectMainPage(){
        InspectionsGithub inspect = new InspectionsGithub(driver);
        inspect.checkAccountName("gnidan12345");
    }

    @Test(priority = 3)
    public void logoutFromGitHub() throws InterruptedException {
        LogoutGithub logout = new LogoutGithub(driver);
        logout.logoutUserFromAccount("gnidan12345");

    }
}
