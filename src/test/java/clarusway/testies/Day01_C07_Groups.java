package clarusway.testies;

import org.testng.annotations.Test;

public class Day01_C07_Groups {


    @Test (groups = {"smoke","regression"})
    public void testLogin() {
    }

    @Test (groups = {"regression"})
    public void testAbout() {
    }

    @Test(groups = {"regression"})
    public void testContact() {
    }
    @Test(groups = {"regression","smoke"})
    public void testRegistration() {
    }

    @Test(groups = {"regression","smoke"})
    public void testCheckout() {
    }

}
