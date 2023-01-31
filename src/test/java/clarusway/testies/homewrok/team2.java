package clarusway.testies.homewrok;

import clarusway.testies.utiles.BaseTest;
import clarusway.testies.utiles.BaseTestReport;
import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class team2 extends BaseTestReport {



    @Test
    public void n11() {

        //Kullanıcı url gider.


        driver.get("https://www.n11.com/");
        //kullanıcı olarak giriş yapar.

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("n11"), "url n11 içermiyor");

        //Kullanıcı urunu arar ve urunu sepete ekler

        WebElement dahasonra= driver.findElement(By.xpath("//button[@class='dn-slide-deny-btn']"));

          dahasonra.click();









        WebElement searchBox= driver.findElement(By.id("searchData"));
         searchBox.sendKeys("tablet");

         WebElement tıkla= driver.findElement(By.className("iconsSearch"));

         tıkla.click();




        Actions actions = new Actions(driver);

        WebElement urunekle= driver.findElement(By.xpath("(//span[@class='btnBasket'])[1]"));
        actions.click(urunekle).perform();








        //Kullanıcı sepet sayfasına gider



        WebElement sepet=driver.findElement(By.className("btn btnBlack btnGoBasket"));

        actions.click(sepet).perform();



        //Kullanıcı sepete eklenen urunleri gorur
        //Kullanıcı urunun miktarını degıstırebılmelıdır
        //Kullanıcı sepetten bir veya bırden fazla urunu cıkartabımelıdır.






    }



    @AfterMethod
    @Override
    public void teardown(ITestResult result) throws IOException {
       // super.teardown(result);
    }

    @Test
    public  void test01(){
// https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
// Web sitesini maximize yapınız.
// İkinci emojiye tıklayınız.
// Tüm ikinci emoji öğelerine tıklayınız.
// Parent iframe geri dönünüz.
// Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button'a basınız.
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");



        driver.switchTo().frame("emoojis");



        // İkinci emojiye tıklayınız.

        WebElement secondEmojiTab = driver.findElement(By.xpath("//a[contains(@href,'nature')]"));

        secondEmojiTab.click();



        // Tüm ikinci emoji öğelerine tıklayınız.

        List<WebElement> emojiList = driver.findElements(By.xpath("//div[@id='nature']//img"));

        emojiList.forEach(WebElement::click); // her bir img elementine tiklaniyor



        // Parent iframe geri dönünüz.

        driver.switchTo().defaultContent();





        //Form dolduruluyor

        WebElement text = driver.findElement(By.id("text"));

        text.sendKeys("Text");



        WebElement smiles = driver.findElement(By.id("smiles"));

        smiles.sendKeys("Smiles");



        WebElement nature = driver.findElement(By.id("nature"));

        nature.sendKeys("Nature");



        WebElement food = driver.findElement(By.id("food"));

        food.sendKeys("Food");



        WebElement activities = driver.findElement(By.id("activities"));

        activities.sendKeys("Activities");



        WebElement places = driver.findElement(By.id("places"));

        places.sendKeys("Places");



        WebElement objects = driver.findElement(By.id("objects"));

        objects.sendKeys("Objects");





        WebElement applyButton = driver.findElement(By.id("send"));

        applyButton.click();





    }




}
