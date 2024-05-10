package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.US08_CalendarPage;
import com.fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US08_CalendarStepDefs extends BasePage {

    US08_CalendarPage calendarPage = new US08_CalendarPage();

    @Given("User navigates to the calendar page")

        public void user_hover_mouse_on_fleet_tab_and_click_on_vehicles_module() {
            String tabLocator = "Activities";
            String moduleLocator = "Calendar Events";
            navigateToModule(tabLocator,moduleLocator);
        }

    @Given("the user is creating a new recurring event")
    public void the_user_is_creating_a_new_recurring_event() {
        calendarPage.CreateCalendarEvent.click();
    }
    @When("user view the Repeat Every input option")
    public void they_view_the_repeat_every_input_option() {
        BrowserUtils.selectCheckBox(calendarPage.repeatCheckBox, true);
    }
    @Then("the default value displayed should be {string}")
    public void the_default_value_displayed_should_be(String string) {

        System.out.println("actual value = " + calendarPage.repeatEveryDays.getAttribute("value"));
        Assert.assertEquals(string, calendarPage.repeatEveryDays.getAttribute("value" ));
        System.out.println("expected value = " + string);
    }


    @When("user clear the Repeat Every field")
    public void userClearTheRepeatEveryField() {
        calendarPage.repeatEveryDays.clear();
    }

    @Then("user should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String message) {

        String actualMessage = calendarPage.message.getText();
        System.out.println("expected = " + message);
        System.out.println("actual = " + calendarPage.message.getText());;

        Assert.assertEquals(calendarPage.message.getText(),message);
    }
}
