package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chorome.deriver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();

    }
}
