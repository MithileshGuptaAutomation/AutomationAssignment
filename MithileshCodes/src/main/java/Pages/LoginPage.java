package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    
    By loginLink = By.linkText("Login"); 
    By email = By.id("email");
    By password = By.id("password");
    By loginBtn = By.id("register");

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String user) {
        driver.findElement(email).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void login(String user, String pass) {
        clickLoginLink();
        enterEmail(user);
        enterPassword(pass);
        clickLogin();
    }
}