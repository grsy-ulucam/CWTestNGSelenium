package clarusway.testies.exercies.Day_1;

import org.testng.annotations.Test;

public class day5 {



    @Test (timeOut = 2000)
    public void test01() {
    }


    @Test (timeOut = 5000)
    public void test02() throws InterruptedException {

        System.out.println("test 02 çalıştı");
        Thread.sleep(2000);
    }


    @Test (timeOut = 3000)
    public void test03() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("test 03 çalıştı");

    }

}




