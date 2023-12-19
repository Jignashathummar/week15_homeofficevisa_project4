package gov.uk.check.visa.pages;

import gov.uk.check.visa.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(className = "govuk-select")
    List<WebElement> countryName;

    @CacheLookup
    @FindBy(id = "response")
    List<WebElement> nationalityDropDown1;


    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDown, nationality);
        log.info("Click on '" + nationalityDropDown + "' tab");
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
        log.info("Click on '" + continueButton + "' tab");
    }

    public void clickOnDropDownList() {
        clickOnElement(nationalityDropDown);
        log.info("Click on '" + nationalityDropDown + "' tab");
    }

    public String getCountryName() {
        return getTextFromElement(nationalityDropDown);
    }

    public Object selectCountryByName(String country) {
        List<WebElement> products = new ArrayList<>();
        for (WebElement e : nationalityDropDown1) {
            if (e.getText().equals(country)) {
//                e.click();
                System.out.println("country");

                break;
            }
        }
        return products;
    }

//    public void selectLengthOfStay(String country) {
//        clickOnElement(nationalityDropDown);
//        log.info("Click on : " + country + "more or less");
//
//
//        switch (country) {
//            case "lessThanSixMonths":
//                System.out.println("6 months or less");
//                break;
//            case "longer than six months":
//                System.out.println("longer than 6 months");
//                break;
//            default:
//                System.out.println("Error message");
//        }
//    }
}
