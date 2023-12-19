package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.Then;

public class CountryDropDownSteps {
//    @Then("I can see following country into dropdown")
//    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
//        List<List<String>> userList = dataTable.asLists(String.class);
//        for (List<String> list : userList) {
//            System.out.println(list);
//        }
//    }

    @Then("I can see following country into dropdown {string}")
    public void iCanSeeFollowingCountryIntoDropdown(String country) {
        new SelectNationalityPage().selectNationality(country);
        System.out.println(country);
     // Assert.assertEquals(new SelectNationalityPage().getCountryName(),country,"Country name not displayed");
    }
}
