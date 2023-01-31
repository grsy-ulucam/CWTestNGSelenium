package clarusway.testies;

import org.testng.annotations.Test;

public class Day01_C02_Priority {

    // TestNG (default) olarak @Test annotationları alfabetik sıraya göre execute eder

    // TestNG prioritysinin sayi degeri en az olan testi ilk once calistirir

    // Priporty attribute u icin negatif degerler kullanilabilir

    // TestNG default (varsayilan) priority = 0 dir



    @Test(priority = 1)
    public void test02() {

    }

    @Test(priority = 2)
    public void test04() {

    }

    @Test(priority = -5)
    public void test01() {

    }

    @Test(priority = 100)
    public void test03() {

    }

}
