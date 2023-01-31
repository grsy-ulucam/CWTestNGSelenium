package clarusway.testies.homewrok;

import clarusway.testies.utiles.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class day1 extends BaseTest {

    @Override
    public void tearDown() {
        // super.tearDown();
    }

    @Test
    public void name() {

        // Test Case3: Negative Password Test

        // Open page https://practicetestautomation.com/practice-test-login/

        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username student into Username field.

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        username.sendKeys("student");

        //Type password incorrectPassword into Password field.

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        password.sendKeys("Password");

        //  Puch Submit button.

        WebElement submit = driver.findElement(By.className("btn"));

        submit.click();

        //Verify error message is displayed.

        WebElement errorMessage = driver.findElement(By.xpath("//div[@id='error']"));

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(errorMessage.isDisplayed(),"istenen alana ulaşılamadı");


        // Verify error message text is Your password is invalid!

        softAssert.assertTrue(errorMessage.getText().contains("Your password is invalid!"));

        softAssert.assertAll();


          }

}
