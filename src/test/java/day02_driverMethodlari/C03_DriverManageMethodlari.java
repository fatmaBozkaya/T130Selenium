package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
        görev odaklıdır
        sayfanın acılması veya kullancagımız webElementlerin bulunması icin
        bekleyecegi MAXIMUM suredir
         */
        driver.manage().window().maximize();
        System.out.println("Maximize gorunum size : " +driver.manage().window().getSize());
        System.out.println("Maximize gorunum position : " +driver.manage().window().getPosition());


        Thread.sleep(3000);//görev odaklı degildir mutlaka 3 sn bekler
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen gorunum size : " +driver.manage().window().getSize());
        System.out.println("Fullscreen gorunum position : " +driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(300,300));
        driver.manage().window().setSize(new Dimension(500,500));

        System.out.println("Özel gorunum size : " +driver.manage().window().getSize());
        System.out.println("Özel gorunum position : " +driver.manage().window().getPosition());

        driver.close();
    }
}
