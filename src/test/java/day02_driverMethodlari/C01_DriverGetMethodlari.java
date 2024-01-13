package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        // Acilan sayfanin Title'inda 'otomasyon' gectigini test edin

        String expectedTitleIcerik = "otomasyon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title 'otomasyon' icermiyor, title testi FAILED");
            System.out.println("Actual title : " + actualTitle);
        }


        // acilan sayfanin url'inin otomasyon icerdigini test edin

        String expectedUrlIcerik = "otomasyon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url 'otomasyon' icermiyor, Url testi FAILED");
        }

     /*

      driver.getWindowHandle(): driver'in gittigi sayfanın Windowhandle degerini verir
      driver.getWindowHandles(): driver olusturulduktan sonra,test boyunca
      actiği tum sayfaların WindowHandle degerlerini bir set olarak verir
      */
        System.out.println(driver.getWindowHandle());
        //B046D009DBD9842CB4846AF32AE5FBB5
        System.out.println(driver.getWindowHandles());
        //[B046D009DBD9842CB4846AF32AE5FBB5]

        System.out.println("============Sayfa Kaynagi====================");
        System.out.println(driver.getPageSource());

        //tüm sayfa kaynagını dondurur
        //sayfa kaynagı ile ilgili bir test istenirse kaydedilip kullanılabilir.



        Thread.sleep(5000); //Java dan gelir kodları yazılan milisaniye kadar bekletir.
        driver.close();
    }
}
