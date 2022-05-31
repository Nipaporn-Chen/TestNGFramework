package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(testName = "Wrong login info message")
    public void test07(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.username.sendKeys("test@yahoo.com");
        loginPage.password.sendKeys("password");
        loginPage.loginBtn.click();

        Assert.assertTrue(loginPage.LoginErrMsg.isDisplayed());
        //Assert.assertTrue(getDriver().findElement(By.xpath("//*[text()='Incorrect username/password']")).isDisplayed());
    }

}
