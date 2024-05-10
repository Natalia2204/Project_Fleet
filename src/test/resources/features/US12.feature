Feature: Verify presence of 8 filter items on the Accounts page
  @B33G9-172
  Scenario Outline: Verify filter items on the Accounts page
    Given the user logged in as "<userType>"
    Given User navigates to the Accounts page
    When User click the filter button
    Then User should see the following filter names:
      | Filter Name      |
      | Account Name     |
      | Contact Name     |
      | Contact Email    |
      | Contact Phone    |
      | Owner            |
      | Business Unit    |
      | Created At       |
      | Updated At       |

    Examples:
      | userType        |
      | sales manager   |
      | store manager   |