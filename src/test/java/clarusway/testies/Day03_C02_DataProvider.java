package clarusway.testies;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {

    // user name , email, password, number


    @Test (dataProvider = "getData")
    public void test(String username,String email,String password,int number){

        System.out.println("username= "+username);
        System.out.println("password= "+password);
        System.out.println("email= "+email);
        System.out.println("number= "+number);

    }
    @DataProvider
    public Object [][] getData(){

        Object [][] data={
                {"Karl" ,"karl@cw.com","123",1},
                {"Drake" ,"darke@cw.com","abc",2},
                {"Gary" ,"garry@cw.com","abc123",1},
                {"Elly" ,"elly@cw.com","def123",1}

        };

              return  data;
        }

}
