package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DatatableSteps {
    @Given("I placed an order for the following items")
    public void i_placed_an_order_for_the_following_items(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for(Map<String, String> row: rows) {
            System.out.println(row);
        }
    }
    @When("^I generate the bill$")
    public void i_generate_the_bill(DataTable dataTable) {
        List<String> billData = dataTable.asList(String.class);
        for(String billItem: billData) {
            System.out.println(billItem);
        }
    }

    @Then("a bill for sandwich should be generated")
    public void a_bill_for_sandwich_should_be_generated(DataTable dataTable) {
        List<List<String>> billData = dataTable.asLists(String.class);
        for(List<String> billItems: billData) {
                System.out.println(billItems);
        }
    }
}
