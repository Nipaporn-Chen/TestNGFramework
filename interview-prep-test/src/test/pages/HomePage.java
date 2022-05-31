package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage (WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//form[@class='form-inline']//button[text()='Coding']")
    public WebElement codingDashboard;

    @FindBy(xpath = "//nav//a/u[text()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath = "//button[text()='Add do ']")
    public WebElement addDo;

    @FindBy(id = "inputArea1" )
    public WebElement inputDo;

    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtn;

    @FindBy(xpath = "//button[text()=\"Add don't \"]")
    public WebElement addDont;

    @FindBy(id = "inputArea2")
    public WebElement inputDont;


}
