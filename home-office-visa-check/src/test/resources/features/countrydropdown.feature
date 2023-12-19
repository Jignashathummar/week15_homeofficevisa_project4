@regression
Feature: Country drop down Feature
  Im order to check country name
  As a User
  I need country name list

  @author_Jignasha @smoke @sanity
  Scenario Outline: Verify the following country available in country dropdown list
    Given I am on homepage
    When I click on start button
   Then I can see following country into dropdown "<country>"
    Examples:
      |     country            |
      |Albania                 |
      |Bhutan                  |
      |British protected person|
      |Haiti                   |
      |Kazakhstan              |
      |Mozambique              |
      |Norway                  |
      |Portugal                |
      |Russia                  |
      |Zambia                  |



