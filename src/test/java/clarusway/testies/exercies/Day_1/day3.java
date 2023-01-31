package clarusway.testies.exercies.Day_1;

import org.testng.annotations.Test;

public class day3 {

    @Test (dependsOnMethods = "test03")
    public void test01() {
    }
    @Test (dependsOnMethods = "test01")
    public void test02() {
    }
    @Test
    public void test03() {
    }



}
