package openMrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindPatientPage {


    public FindPatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Search by ID or Name']")
    WebElement searchBar;
    public void setSearchBar(String str){
        searchBar.sendKeys(str);


    }

    @FindBy(className = "recent-lozenge")
    WebElement identifier;
    public void clickOnIdentifier(){
        identifier.click();
    }



}
