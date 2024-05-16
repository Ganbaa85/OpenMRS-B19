package openMrs.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_tw.假設;
import openMrs.pages.HomePage;
import openMrs.pages.LoginPage;
import openMrs.pages.RegisterPage;
import openMrs.utils.DriverHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepDefs {
    WebDriver driver = DriverHelper.getDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    RegisterPage registerPage = new RegisterPage(driver);


    // Snippets for LogIn page
    @Given("User is on Login page user click on Username and enter admin")
    public void user_is_on_login_page_user_click_on_username_and_enter_admin() {
        driver.get("http://codefish.ninja/openmrs/login.htm");
        loginPage.enterUserName("admin");
    }

    @Then("User click on password form and enter Admin123")
    public void user_click_on_password_form_and_enter_admin123() {
        loginPage.enterPassword("Admin123");
    }

    @Then("User select any locator")
    public void user_select_any_locator() {
        loginPage.clickOnLocator();
    }

    @Then("User clicks on LogIn button")
    public void user_clicks_on_log_in_button() {
        loginPage.clickOnLogInButton();
    }


//Snippets for Register Page

    @Given("User is on main page user clicks on register patient Link")
    public void user_is_on_main_page_user_clicks_on_register_patient_link() {
        driver.get("http://codefish.ninja/openmrs/referenceapplication/home.page");
        homePage.clickOnRegisterPAge();
    }

    @When("User is on register patient page user validates url and title of the page")
    public void user_is_on_register_patient_page_user_validates_url_and_title_of_the_page() {
        String expectedUrl = "http://codefish.ninja/openmrs/registrationapp/registerPatient.page?appId=referenceapplication.registrationapp.registerPatient";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());

    }

    @Then("User enters given middle and family name")
    public void user_enters_given_middle_and_family_name() {
        registerPage.enterName("tony", "scareFace", "montana");
    }

    @Then("User clicks on greenArrow")
    public void user_clicks_on_green_arrow() {
        registerPage.greenButton();
    }

    @Then("User choose gender")
    public void user_choose_gender() {
        registerPage.chooseGender();
    }

    @Then("User clicks on greenArrow1")
    public void user_clicks_on_green_arrow1() {
        registerPage.greenButton();
    }

    @Then("User enter birth date")
    public void user_enter_birth_date() {
        registerPage.enterBirthDate("23", "1992");
    }

    @Then("User clicks on greenArrow3")
    public void user_clicks_on_green_arrow3() {
        registerPage.greenButton();
    }

    @Then("User enter address and city and country and postal code")
    public void user_enter_address_and_city_and_country_and_postal_code() {
        registerPage.enterAddress("Ventura Blvd", "Sunset avenue", "Montana", "Oregon", "USA", "12353");
    }

    @Then("User clicks on greenArrow4")
    public void user_clicks_on_green_arrow4() {
        registerPage.greenButton();
    }

    @Then("User enters phone number")
    public void user_enters_phone_number() {
        registerPage.enterPhoneNumber("123532134");
    }

    @Then("User clicks on greenArrow5")
    public void user_clicks_on_green_arrow5() {
        registerPage.greenButton();
    }

    @Then("User choose relatives and clicks on green arrow")
    public void user_choose_relatives_and_clicks_on_green_arrow() throws InterruptedException {
        registerPage.chooseRelatives();
    }

    @Then("User confirm form")
    public void user_confirm_form() throws InterruptedException {
        registerPage.clickConfrim();
    }
}
