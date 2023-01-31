package clarusway.testies.exercies.Day_1;

import org.testng.annotations.*;

public class day1 {
    @Test
    public void test01() {

        System.out.println("test 01 çalışıyor");
    }
    @Test
    public void test02() {

        System.out.println("test 02 çalışıyor");
    }


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite calisti");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite calisti");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test çalıştı..");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test çalıştı..");
    }



    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tBefore class calisti");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tAfter class calisti");
    }
    @BeforeMethod

    public void beforeMethod(){

        System.out.println("\t\t\tBefore method calisti");
    }
    @AfterMethod
    public void afterMethod(){

        System.out.println("\t\t\tAfter method calisti");
    }

}
