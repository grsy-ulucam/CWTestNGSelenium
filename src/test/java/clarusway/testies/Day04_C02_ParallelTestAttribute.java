package clarusway.testies;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {


    @Test(
            threadPoolSize = 3,//kaç çekirdekte
            invocationCount = 7 // kaç defa
    )

    public void test() {

        System.out.println("current thread id= "+Thread.currentThread().getId());

    }
}
