package T130_SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //sayfa 10 sn icinde yüklenmezse testi durdurur
        //10 saniye dolmadan yüklenirse 10 saniye beklemez
        //1- https:www.google.com adresine gidilir
        driver.get("https://www.google.com");
        //2- Sayfanın title ve Url değerleri yazdırılır
        System.out.println("İlk site Title:"+driver.getTitle());

        System.out.println("İlk site Url:"+driver.getCurrentUrl());
        String handle1=driver.getWindowHandle();
        System.out.println("İlk site Window Handle:"+driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        //3- Yeni bir sekme açılarak www.wisequarter.com adresine gidilir ve
        driver.navigate().to("https://www.wisequarter.com");
        //4- Gidilen sayfanın title ve url değerleri yazdırılır ve
        String actualTitle=driver.getTitle();
        System.out.println("İkinci site Title:"+driver.getTitle());

        System.out.println("İkinci site Url:"+driver.getCurrentUrl());

        System.out.println("İkinci site Window Handle:"+driver.getWindowHandle());

        //   title'in wisequarter içerip içermediği kontrol edilir ve bilgi verilir
        String exceptedWord="wisequarter";

        if (actualTitle.contains(exceptedWord)){
            System.out.println("Title"+exceptedWord+"içeriyor");
        }else {
            System.out.println("Title"+exceptedWord+"içermiyor");
        }
        //5- Ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
        driver.switchTo().window(handle1);

        driver.navigate().to("https://www.testotomasyonu.com");
//6- Gidilen sayfanın title ve url değerleri yazdırılır ve
String sonTitle=driver.getTitle();
        System.out.println("Son site Title:"+driver.getTitle());

        System.out.println("Son site Url:"+driver.getCurrentUrl());
        String handle2=driver.getWindowHandle();
        System.out.println("Son site Window Handle:"+driver.getWindowHandle());
        //   title'in testotomasyonu içerip içermediği kontrol edilir ve bilgi verilir
        String exceptedWord2="testotomasyonu";

        if (sonTitle.contains(exceptedWord2)){
            System.out.println("Title"+exceptedWord2+"içeriyor");
    }else{
        System.out.println("Title"  +exceptedWord2+ "içermiyor");
    }
        //7- Açılan pencere kapatılır.
driver.quit();
        }

    }

