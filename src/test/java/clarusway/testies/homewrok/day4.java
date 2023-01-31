package clarusway.testies.homewrok;

import clarusway.testies.utiles.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 extends BaseCrossBrowserTest {

//Go to URL:
//https://opensource demo.orangehrmlive.com/
//Login with negative credentilas by Data Provider.
//Then assert that ‘’Invalid credentials’’ is displayed. (edited) 


    @AfterMethod
    @Override
    public void teardown() {
        //super.teardown();
    }

    @Test(dataProvider = "data")
    public void testName(String name, String password) {

        //https://opensource demo.orangehrmlive.com/

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

        username.sendKeys(name);

        WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));

        password1.sendKeys(password);

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));

        button.click();

        //Then assert that ‘’Invalid credentials’’ is displayed.(edited)

        WebElement ınvalid = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));

        Assert.assertTrue(ınvalid.isDisplayed());

    }

    //Login with negative credentilas by Data Provider.
    @DataProvider
    public Object[][] data() {
        return new Object[][]{
                {"admin", "admin"}
        };
    }

}
