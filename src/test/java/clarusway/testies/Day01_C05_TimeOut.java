package clarusway.testies;

import org.testng.annotations.Test;

public class Day01_C05_TimeOut {


    @Test  (timeOut = 1000)
    public void pastTest() {
        System.out.println(" past test 1 sn önce çalıştı");
    }


    @Test (timeOut = 1000)
    public void timeOutTest() throws InterruptedException {
        System.out.println("1 saniyeden sonra çalışır. ");
        Thread.sleep(1100);

    }
    @Test (timeOut = 1000)
    public void timeOutTest2() throws InterruptedException {
        Thread.sleep(1100);
        System.out.println("1 saniyeden sonra çalışır. ");
    }



}
