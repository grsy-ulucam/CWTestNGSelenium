package clarusway.testies.exercies.Day_1;

import org.testng.annotations.Test;

public class day4 {

    @Test (enabled =true)
    public void test01() {
        System.out.println("enabled test");

    }
    @Test (enabled = false)
    public void test02() {
        System.out.println("disenabled test");
    }

}
