package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefinitions.RestaurantMenu;
import stepdefinitions.RestaurantMenuItem;

public class MenuManagementSteps {
    RestaurantMenuItem newMenuItem;
    RestaurantMenu locationMenu = new RestaurantMenu();

    @Given("I have menu item wth name {string} and price {int}")
    public void i_have_menu_item_wth_name_and_price(String newMenuItemName, int price) {
        newMenuItem = new RestaurantMenuItem(newMenuItemName, newMenuItemName, price);
        System.out.println("Step 1");
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        locationMenu.addMenuItem(newMenuItem);
        System.out.println("Step 2");
    }

    @Then("Menu Item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String string) {
        boolean exists = locationMenu.doesItemExist(newMenuItem);
        System.out.println("Step 3" + exists);
    }
}
