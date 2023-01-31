package clarusway.testies.homewrok;

import clarusway.testies.utiles.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 extends BaseCrossBrowserTest {
 /*
Open the site http://opencart.abstracta.us/
Using the Search function do it with Data Provider for Mac, iPad and Samsung
     */

    @AfterMethod
    @Override
    public void teardown() {
        //super.teardown();
    }

    @Test (dataProvider = "data")
    public void testName(String key) {

        driver.get("http://opencart.abstracta.us/");

        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));

        search.sendKeys(key);

    }

    @DataProvider

    public Object[][] data() {
        return new Object[][]{

                {"Mac"},
                {"ipad"},
                {"Samsung"}

        };

    }

}