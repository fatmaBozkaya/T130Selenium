package T130_SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M03 {
    public static void main(String[] args) {
        /*



4- Save butonuna tıklanır
5- Sonuç yazdırılır
 */

System.setProperty("webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
       // 1- http://babayigit.net/testdocs/ adresine gidilir
        driver.get("http://babayigit.net/testdocs/");
        driver.manage().window().maximize();
        //2- INFO FORM butonuna tıklanır
        driver.findElement(By.xpath("//img[@src='img/info.png']")).click();


       // 3- Form verileri girilir
        driver.findElement(By.id("firstName")).sendKeys("Tarık");
        driver.findElement(By.id("lastName")).sendKeys("Yigit");
driver.findElement(By.id("email")).sendKeys("yigit@gmail.com");
driver.findElement(By.id("phone")).sendKeys("05523214570");
driver.findElement(By.xpath("//*[@type='number']")).sendKeys("40");
driver.findElement(By.id("occupation")).sendKeys("engineer");
driver.findElement(By.id("male")).click();
driver.findElement(By.id("city")).sendKeys("Manisa");
driver.findElement(By.id("country")).sendKeys("Turkiye");

driver.findElement(By.xpath("//button")).click();

        System.out.println("Result Message: \n"+driver.findElement(By.id("resultMessage")).getText());




        //  driver.quit();
    }
}
