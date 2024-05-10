package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US12_AccountsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US12_AccountsStepDefs extends BasePage {

   US12_AccountsPage accountsPage = new US12_AccountsPage();

    @Given("User navigates to the Accounts page")
    public void userNavigatesToTheAccountsPage() {
        String tabLocator = "Customers";
        String moduleLocator = "Accounts";

        navigateToModule(tabLocator, moduleLocator);
    }

    @When("User click the filter button")
    public void user_click_the_filter_button() {
        accountsPage.filterButton.click();
    }
//    @Then("User should see the following filter names:")
//    public void user_should_see_the_following_filter_names(io.cucumber.datatable.DataTable dataTable) {
//
//
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//        // Double, Byte, Short, Long, BigInteger or BigDecimal.
//        //
//        // For other transformations you can register a DataTableType.
//        //throw new io.cucumber.java.PendingException();
//    }



}
