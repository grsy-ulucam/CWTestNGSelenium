package clarusway.testies.exercies.Day_2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2_03 {

    String driver;


   @BeforeMethod

   @Parameters ("browser")

    public  void setup(String browserName){

       if (browserName.equals("chrome")){

           driver="chrome";
       } else if (browserName.equals("firefox")) {
           driver="firefox";

       } else if (browserName.equals("opera")) {
           driver="opera";

       }
       System.out.println("Driver objesi oluşturuldu " +driver);

   }
     @AfterMethod
    public  void tearDown(){

       driver="-";
         System.out.println("driver sonladırıldı " +driver);

     }

       @Test

    public  void test (){
           System.out.println("test execution başladı");
           System.out.println("testte kullanılan driver = "+driver);

       }

}
