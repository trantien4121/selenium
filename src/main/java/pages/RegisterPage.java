package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By fullnameField = By.id("fullname");
    private By passwordField = By.id("password");
    private By emailField = By.id("email");
    private By signUpButton = By.className("btn-success");
    private By alert = By.className("alert-success");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setFullname(String fullname){
        driver.findElement(fullnameField).sendKeys(fullname);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickSignUp(){
        driver.findElement(signUpButton).click();
    }
    public String getAlertText(){
        return driver.findElement(alert).getText();
    }
    public void register(String username, String fullname, String password, String email){
        this.setUsername(username);
        this.setFullname(fullname);
        this.setPassword(password);
        this.setEmail(email);

        this.clickSignUp();
    }

    public SecureAreaPageRegister clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new SecureAreaPageRegister(driver);
    }
}
