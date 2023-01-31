package clarusway.testies.homewrok;

import clarusway.testies.utiles.BaseTest;
import org.testng.annotations.Test;

public class day3 extends BaseTest {


    @Override
    public void tearDown() {

    }
    /*
      Create tests that depend on each other

    Create beforeClass and set up settings.

    By creating interdependent tests;

    First go to Facebook.

    Then go to Google depending on Facebook,

    Then go to Amazon depending on Google

    Close the driver.
     */

    @Test (dependsOnMethods = "facebook")
    public void google() {

        driver.get("https://www.google.com.tr/?hl=tr");
    }

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com/");

    }

    @Test (dependsOnMethods = "google")
    public void amazon() {

        driver.get("https://www.amazon.com.tr/");
    }
}
