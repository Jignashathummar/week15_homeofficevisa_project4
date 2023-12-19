package gov.uk.check.visa.pages;

import gov.uk.check.visa.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(className = "govuk-radios__input")
    WebElement radioButtonSelect;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement tourismOrVisitingFamilyAndFriends;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement workAcademicVisitOrBusiness;

    @CacheLookup
    @FindBy(id = "response-2")
    WebElement study;

    @CacheLookup
    @FindBy(id = "response-3")
    WebElement transit;

    @CacheLookup
    @FindBy(id = "response-4")
    WebElement joinPartnerOrFamilyForALongStay;

    @CacheLookup
    @FindBy(id = "response-5")
    WebElement getMarriedOrEnterIntoACivilPartnership;

    @CacheLookup
    @FindBy(id = "response-6")
    WebElement stayWithYourChildIfTheyAreAtSchool;

    @CacheLookup
    @FindBy(id = "response-7")
    WebElement haveMedicalTreatment;

    @CacheLookup
    @FindBy(id = "response-8")
    WebElement forOfficialDiplomaticOrGovernmentBusiness;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;



    public void selectReasonForTravel(String reason){
        selectByVisibleTextFromDropDown(radioButtonSelect,reason);
        log.info("Select from : " + radioButtonSelect.getText());
    }
    public void clickOnTourismOrVisitingFamilyAndFriends(){
        clickOnElement(tourismOrVisitingFamilyAndFriends);
        log.info("Click on '" + tourismOrVisitingFamilyAndFriends + "' tab");
    }
    public void clickOnWorkAcademicVisitOrBusiness(){
        clickOnElement(workAcademicVisitOrBusiness);
        log.info("Click on '" + workAcademicVisitOrBusiness + "' tab");
    }
    public void clickOnStudy(){
        clickOnElement(study);
        log.info("Click on '" + study + "' tab");
    }
    public void clickOnTransit(){
        clickOnElement(transit);
        log.info("Click on '" + transit + "' tab");
    }
    public void clickOnJoinPartnerOrFamilyForALongStay(){
        clickOnElement(joinPartnerOrFamilyForALongStay);
        log.info("Click on '" + joinPartnerOrFamilyForALongStay + "' tab");
    }
    public void clickOnGetMarriedOrEnterIntoACivilPartnership(){
        clickOnElement(getMarriedOrEnterIntoACivilPartnership);
        log.info("Click on '" + getMarriedOrEnterIntoACivilPartnership + "' tab");
    }
    public void clickOnStudyWithYourChildIfTheyAreAtSchool(){
        clickOnElement(stayWithYourChildIfTheyAreAtSchool);
        log.info("Click on '" + stayWithYourChildIfTheyAreAtSchool + "' tab");
    }
    public void clickOnHaveMedicalTreatment(){
        clickOnElement(haveMedicalTreatment);
        log.info("Click on '" + haveMedicalTreatment + "' tab");
    }
    public void clickOnForOfficialOrGovernmentBusiness(){
        clickOnElement(forOfficialDiplomaticOrGovernmentBusiness);
        log.info("Click on '" + forOfficialDiplomaticOrGovernmentBusiness + "' tab");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on '" + continueButton + "' tab");
    }
    public void selectReasonForVisit(String reason){
        clickOnElement(tourismOrVisitingFamilyAndFriends);
        log.info("Click on '" + tourismOrVisitingFamilyAndFriends + "' tab");
    }
    public void selectReasonForVisit1(String reason){
        clickOnElement(workAcademicVisitOrBusiness);
        log.info("Click on '" + workAcademicVisitOrBusiness + "' tab");
    }
    public void selectReasonForVisit2(String reason){
        clickOnElement(study);
        log.info("Click on '" + study + "' tab");
    }
    public void selectReasonForVisit3(String reason){
        clickOnElement(transit);
        log.info("Click on '" + transit+ "' tab");
    }
    public void selectReasonForVisit4(String reason){
        clickOnElement(joinPartnerOrFamilyForALongStay);
        log.info("Click on '" + joinPartnerOrFamilyForALongStay + "' tab");
    }
    public void selectReasonForVisit5(String reason){
        clickOnElement(getMarriedOrEnterIntoACivilPartnership);
        log.info("Click on '" + getMarriedOrEnterIntoACivilPartnership + "' tab");
    }
    public void selectReasonForVisit6(String reason){
        clickOnElement(stayWithYourChildIfTheyAreAtSchool);
        log.info("Click on '" + stayWithYourChildIfTheyAreAtSchool + "' tab");
    }
    public void selectReasonForVisit7(String reason){
        clickOnElement(haveMedicalTreatment);
        log.info("Click on '" + haveMedicalTreatment + "' tab");
    }
    public void selectReasonForVisit8(String reason){
        clickOnElement(forOfficialDiplomaticOrGovernmentBusiness);
        log.info("Click on '" + forOfficialDiplomaticOrGovernmentBusiness + "' tab");
    }
}
