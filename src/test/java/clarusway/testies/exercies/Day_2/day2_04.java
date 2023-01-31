package clarusway.testies.exercies.Day_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class day2_04 {


    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")

    public  void setup(String browserValue){
        switch (browserValue){

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;



            case "firefox":

                WebDriverManager.firefoxdriver().setup();

                driver = new FirefoxDriver();

                break;

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }



    @AfterMethod

    public  void  teardown (){

        driver.quit();
    }

    @Test
    @Parameters("aranacak kelime")

    public void parametersTest(String kelime) throws InterruptedException {

        driver.get("https://www.amazon.com");
        WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));



        searchText.sendKeys(kelime);



        Thread.sleep(5000);



    }


}
