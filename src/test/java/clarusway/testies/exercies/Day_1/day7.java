package clarusway.testies.exercies.Day_1;

import org.testng.annotations.Test;

public class day7 {

    @Test (groups = "smoke")
    public void testLogin() {

        System.out.println("smoke test yapılıyor");
    }
    @Test (groups = "regression")
    public void testAbout() {

        System.out.println("regression test yapılıyor");

    }
    @Test(groups = {"regression","smoke"})
    public void testRegistration() {
        System.out.println( "her ikisi yapılıyor" +
                "");
    }



}
