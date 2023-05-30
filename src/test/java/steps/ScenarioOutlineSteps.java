package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class ScenarioOutlineSteps {

    int initialBillAmount;
    int taxRate;

    @Given("Select User name {string}")
    public void select_user_name(String string) {
        System.out.println("User name is: " + string);
    }

    @When("User enters initial bill amount {int}")
    public void user_enters_initial_bill_amount_initial_bill_amount(int initialBill) {
        this.initialBillAmount = initialBill;
        System.out.println("Initial bill amount is: " + initialBill);
    }

    @When("Sales Tax Rate is {int} percent")
    public void sales_tax_rate_is_tax_rate_percent(int tax) {
        this.taxRate = tax;
        System.out.println("Tax rate is: " + tax);
    }

    @Then("Final bill amount is {int}")
    public void final_bill_amount_is_calculate_bill_amount(int expectedValue) {
        double actualValue = this.initialBillAmount + this.initialBillAmount * (this.taxRate*0.01);
        System.out.println("Expected final bill amount is: " + expectedValue);
        System.out.println("Actual final bill amount is: " + actualValue);
        assertTrue(expectedValue == actualValue);
        invokeWebPage(this.taxRate);
    }

    private void invokeWebPage(int taxRate) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/percent-calculator.html");

        WebElement taxRateTextBox = driver.findElement(By.id("cpar1"));
        WebElement billAmountTextBox = driver.findElement(By.id("cpar2"));
        WebElement button = driver.findElement(By.xpath("//table[1]//input[@value='Calculate']"));

        billAmountTextBox.sendKeys(Integer.toString(initialBillAmount));
        taxRateTextBox.sendKeys(Integer.toString(taxRate));
        button.click();
        WebElement result = driver.findElement(By.xpath("//h2[@class='h2result']"));
        System.out.println(result.getText());
        System.out.println(taxRate);
        boolean resultFinalBill = result.getText().contains("Result: " + taxRate);
        System.out.println(resultFinalBill);

        driver.quit();
    }
}
