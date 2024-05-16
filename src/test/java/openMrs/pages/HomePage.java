package openMrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    public HomePage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    WebElement registerPage;

    public void  clickOnRegisterPAge(){
        registerPage.click();
    }
    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension" )
    WebElement findPatientRecord;
    public void clickFindPatientRecord(){
        findPatientRecord.click();

    }




}
