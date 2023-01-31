package clarusway.testies;


import clarusway.testies.utiles.BaseTestReport;


import org.testng.Assert;

import org.testng.annotations.Test;



public class Day05_C01_HTMLReport extends BaseTestReport {



    @Test

    public void test01(){


        extentTest=extentReports.createTest("test01");
        System.out.println( "Test01 started at ");

        driver.get("https://www.google.com/");

        Assert.fail();





        }

        public void test02(){

            extentTest = extentReports.createTest("test02");

            driver.get("https://www.google.com/");



        }




    }







