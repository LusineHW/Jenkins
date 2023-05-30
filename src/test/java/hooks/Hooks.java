package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void beforeDisplayMeesage(Scenario sc) {
        System.out.println("Before" + sc.getName());
    }

    @After
    public void afterDisplayMessage(Scenario sc) {
        System.out.println("After"+ sc.getName());
    }
}
