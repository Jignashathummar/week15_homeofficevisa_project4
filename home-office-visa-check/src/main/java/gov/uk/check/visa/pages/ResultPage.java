package gov.uk.check.visa.pages;

import gov.uk.check.visa.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    // You will need a visa to come to the Uk
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;
    // You need a visa to work in health and care
    @CacheLookup    // Can not use className not allowing to run programme
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultText;
    // You need visa text
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement youNeedVisaText;


    public String getResultMessage(){
        log.info("Checking text is Displayed");
        return getTextFromElement(resultMessage);


    }
    public boolean verifyTextDisplayed(){
        log.info("Checking text is Displayed");
        return verifyThatTextIsDisplayed(resultText,"You need a visa to work in health and care");


    }
    public boolean verifyTextDisplayed1(){
        log.info("Checking text is Displayed");
        return verifyThatTextIsDisplayed(youNeedVisaText,"You may need a visa");
    }


}
