package clarusway.testies.exercies.Day_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class day9 {

    @Test
    public void hardAssertionTypes() {

        System.out.println("hardassert öncesi çalışır");

        Assert.assertEquals(2,2);

        System.out.println("hardassert sonrası çalışır");
    }

    @Test
    public void softAssertion() {
        System.out.println("Soft Assertion oncesi calisiyor");

        SoftAssert softAssert =new SoftAssert();

        softAssert.assertEquals(1,1);

        softAssert.assertTrue(true);

        System.out.println("Soft Assertion oncesi calisiyor");


        softAssert.assertAll();

    }


}
