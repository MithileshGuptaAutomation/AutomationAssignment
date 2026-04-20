package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("work.mithileshg@gmail.com", "*******");

        // Validation (adjust based on actual page)
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("dashboard"));

        System.out.println("Login Successful");
    }    
        @Test
        public void verifyInvalidLogin() {

            LoginPage loginPage = new LoginPage(driver);

            loginPage.login("wrong@email.com", "wrongpass");

            String errorMsg = driver.findElement(By.xpath("//div[contains(@class,'error')]")).getText();

            Assert.assertTrue(errorMsg.length() > 0);

            System.out.println("Invalid Login Test Passed");
        }
    
}