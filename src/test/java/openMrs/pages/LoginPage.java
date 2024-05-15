package openMrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//li[@id='Laboratory']")
    WebElement laboratoryLocator;

    @FindBy(xpath = "//input[@id='loginButton']")
    WebElement logInButton;

    public void enterUserName(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickOnLocator(){
        this.laboratoryLocator.click();
    }
    public void clickOnLogInButton(){
        this.logInButton.click();
    }

}
