package openMrs.pages;

import openMrs.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRecordPage {

    public PatientRecordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(text(),'Delete Patient')]")
    WebElement deletePatient;

    public void setDeletePatient() {
        deletePatient.click();
    }

    @FindBy(xpath = "//input[@id='delete-reason']")
    WebElement writeReasonBar;

    public void setWriteReasonBar(String string) {
        writeReasonBar.sendKeys(string);
    }

    @FindBy(xpath = "//label[text()='Reason: ']//following-sibling::button[text()='Confirm']")
    WebElement confirmButton;

    public void clickConfirmButton() {
        confirmButton.click();
    }

    @FindBy(xpath = "//p[.='Patient has been deleted successfully']")
    WebElement confirmMessage;
    public String getConfirmMessage(){
        return BrowserUtils.getText(confirmMessage);
    }





}
