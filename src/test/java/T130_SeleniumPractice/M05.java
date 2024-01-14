package T130_SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M05 {
    public static void main(String[] args) throws InterruptedException {

         // 1-Driver oluşturalim
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         // 2-Java class'imiza chnomedriver.exe i tanitalim
        System.setProperty("webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
         // 3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();
         // 4-"https://www.otto.de” adresine gidelim
        driver.get("https://www.otto.de");
         // 5-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklesini
         //   söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        Thread.sleep(1000);
        //  6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String actualTitle=driver.getTitle();
        System.out.println("site Title:"+driver.getTitle());

        System.out.println("site Url:"+driver.getCurrentUrl());
        String handle1=driver.getWindowHandle();
        System.out.println("site Window Handle:"+driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
         // 7-Title ve url inin "OTTO” kelimesinin içerip icermedigini kontrol edelim
        String exceptedWord="OTTO";

        if (actualTitle.contains(exceptedWord)){
            System.out.println("Title " + exceptedWord + " içeriyor");
        }else {
            System.out.println("Title " +exceptedWord+  " içermiyor");
        }
         // 8-Ardindan "https://wisequarter.com/” adresine gidip
        driver.get("https://wisequarter.com/");
         // 9-Bu adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        String exceptedWord1="Quarter";

        if (actualTitle.contains(exceptedWord)){
            System.out.println("Title"+ exceptedWord1 + " içeriyor");
        }else {
            System.out.println("Title"+ exceptedWord1 +" içermiyor");
        }
         // 10-Bir onceki web sayfamiza geri donelim

        driver.navigate().back();
        driver.get("https://www.otto.de");
        //  11-Sayfayı yenileyelim
        driver.navigate().refresh();
        //  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.quit();
        //  13- En son adim olarak butun sayfalarimizi kapatmis olalim


    }
}
