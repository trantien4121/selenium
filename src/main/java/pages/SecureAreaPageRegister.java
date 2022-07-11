package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPageRegister {
    private WebDriver driver;

    private By statusAlert = By.className("alert");

    public SecureAreaPageRegister(WebDriver driver){
        this.driver = driver;

    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}

