package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    protected WebDriver driver;

    public LoginPage (WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "email")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//div[@class='container']/button")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[text()='Incorrect username/password']")
    public WebElement LoginErrMsg;

}
