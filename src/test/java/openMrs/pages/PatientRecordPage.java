package openMrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PatientRecordPage {

    public PatientRecordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
