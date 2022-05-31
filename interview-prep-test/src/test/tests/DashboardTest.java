package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;

public class DashboardTest extends BaseTest {

    @Test(testName = "Enter new question button")
    public void test08(){
        LoginPage loginPage = new LoginPage(getDriver());
        //signing in as a user
        loginPage.username.sendKeys("test@yahoo.com");
        loginPage.password.sendKeys("password");
        loginPage.loginBtn.click();

        //opening coding dashboard
        HomePage homePage = new HomePage(getDriver());
        homePage.codingDashboard.sendKeys("//form[@class='form-inline']//button[text()='Coding']");
        //getDriver().findElement(By.xpath("//form[@class='form-inline']//button[text()='Coding']")).click();

        DashboardPage dashboardPage = new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.dashboardCoding.isEnabled());
        //Assert.assertTrue(getDriver().findElement(By.xpath("//button[text()='Enter new question ']")).isEnabled());
    }

}
