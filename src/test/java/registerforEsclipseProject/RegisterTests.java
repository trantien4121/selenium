package registerforEsclipseProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomeRegisterPage;
import pages.RegisterPage;

import static org.testng.Assert.*;

public class RegisterTests {

    private WebDriver driver;
    public RegisterPage registerPage;
    public HomeRegisterPage homeRegisterPage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/QuanTriVieo/RegisterServlet");  //Test thu tren demo java da lam
        driver.manage().window().maximize();
    }
    @Test
    public void testSuccessfullyRegister(){
        registerPage = new RegisterPage(driver);
        registerPage.register("Test2", "Thu Nghiem L2", "2222", "test2@outlook.com");
        assertTrue(registerPage.getAlertText().contains("Register Successfully!!"),
                "Alert text is incorrect");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
