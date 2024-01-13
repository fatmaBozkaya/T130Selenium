package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https:www.testotomasyonu.com");
        // get(istenenUrl) ile ayni islemi yapar

        // youtube anasayfaya gidin
        driver.navigate().to("https://youtube.com");

        // title'in "YouTube" icerdigini test edin
        String expectedTitleIcerik = "Youtube";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Youtube title testi PASSED");
        } else {
            System.out.println("Youtube title testi FAİLLED");
        }

        // tekrar test otomasyonu ana sayfaya donun
        driver.navigate().back();

        // sayfa kaynaginin "Test Otomasyonu" icerdigini test edin
        String exceptedSayfaIcerik = "Test Otomasyonu";
        String actualSayfaKaynagi = driver.getPageSource();
        if (actualSayfaKaynagi.contains(exceptedSayfaIcerik)) {
            System.out.println("Test Otomasyonu sayfa kaynagi testi PASSED");
        } else {
            System.out.println("Test Otomasyonu sayfa kaynagi testi FAİLLED");
        }

        // bir daha youtube anasayfaya gidin
        driver.navigate().forward();
        // url'in https://www.youtube.com/ oldugunu test edin
        String exceptedUrl ="https://www.youtube.com/";
        String actualUrl =driver.getCurrentUrl();
        if (exceptedUrl.equals(actualUrl)){
         System.out.println("Youtube Url testi PASSED");
         }else{
        System.out.println("Youtube Url testi FAILED");
         }
        Thread.sleep(3000);
        driver.close();


    }
}