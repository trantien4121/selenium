package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("http://localhost:8080/QuanTriVieo/RegisterServlet");  //Test thu tren demo java da lam
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375, 812));

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());   //Dem tat ca cac the a
//
//        WebElement inputsLink = driver.findElement(By.linkText("Forgot Password"));
//        inputsLink.click();     //Tim kiem link co ten la Forgot Password va click vao

        homePage = new HomePage(driver);

        //Vi du: Truy cap vao trang do, click vao Shifting Content -> Menu Element ->Home
        //Dem xem co bao nhieu phan tu menu ( nhu home) xuat hien

//            WebElement inputsLinks = driver.findElement(By.linkText("Shifting Content"));
//            inputsLinks.click();
//
//            WebElement inputsLinks_step2 = driver.findElement(By.linkText("Example 1: Menu Element"));
//            inputsLinks_step2.click();
//
//            WebElement inputsLinks_step3 = driver.findElement(By.linkText("Home"));
//
//            System.out.println(driver.getTitle());
//            List<WebElement> tabs = driver.findElements(By.tagName("li"));
//            System.out.println(tabs.size());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//    }
}
