package openMrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class            RegisterPage {

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='givenName']")
    WebElement givenName;

    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middleName;

    @FindBy(xpath = "//input[@name='familyName']")
    WebElement familyName;

    @FindBy(xpath = "//button[@id='next-button']")
    WebElement greenButton;

    @FindBy(xpath = "//select[@id='gender-field']")
    WebElement genderDropdown;

    @FindBy(xpath = "//input[@name='birthdateDay']")
    WebElement day;

    @FindBy(xpath = "//select[@name='birthdateMonth']")
    WebElement monthDropdown;

    @FindBy(xpath = "//input[@name='birthdateYear']")
    WebElement year;

    @FindBy(xpath = "//input[@name='address1']")
    WebElement address1;

    @FindBy(xpath = "//input[@name='address2']")
    WebElement address2;

    @FindBy(xpath = "//input[@name='cityVillage']")
    WebElement city;

    @FindBy(xpath = "//input[@name='stateProvince']")
    WebElement state;

    @FindBy(xpath = "//input[@name='country']")
    WebElement country;

    @FindBy(xpath = "//input[@name='postalCode']")
    WebElement postalCode;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"submit\"]]")
    WebElement confirmButton;

    public void  enterName( String givenName, String middleName, String familyName){

        this.givenName.sendKeys(givenName);
        this.middleName.sendKeys(middleName);
        this.familyName.sendKeys(familyName);


    }

    public void chooseGender(){
        Select  select = new Select(genderDropdown);
        select.selectByVisibleText("Male");


    }

    public void enterBirthDate(String day, String year){

        this.day.sendKeys(day);
        Select select = new Select(monthDropdown);
        select.selectByVisibleText("May");
        this.year.sendKeys(year);


    }

    public void  enterAddress (String address1, String address2, String city, String state, String country, String postalCode ){
        this.address1.sendKeys(address1);
        this.address2.sendKeys(address2);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.country.sendKeys(country);
        this.postalCode.sendKeys(postalCode);
      ;

    }

    public void enterPhoneNumber (String phoneNumber){
        this.phoneNumber.sendKeys(phoneNumber);


    }

    public void chooseRelatives (){
        this.greenButton.click();

    }



    public void greenButton(){
        greenButton.click();
    }

    public void clickConfrim(){
        this.confirmButton.click();
    }












}
