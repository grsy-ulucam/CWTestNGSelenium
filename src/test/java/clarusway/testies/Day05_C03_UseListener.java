package clarusway.testies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day05_C03_UseListener {

    @Test

    public void passedTest(){

        System.out.println("passed test");

    }



    @Test

    public void failedTest(){

        System.out.println("failed test");

        Assert.fail();

    }



    @Test(

            timeOut = 500

    )

    public void timedOutTest() throws InterruptedException {

        System.out.println("Timed out test");

        Thread.sleep(600);

    }

}
