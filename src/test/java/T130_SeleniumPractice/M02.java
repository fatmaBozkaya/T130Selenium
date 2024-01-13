package T130_SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M02 {

 //....Exercise-1:...
  //Create a new class with main method

  public static void main(String[] args) throws InterruptedException {
// Set Path
        System.setProperty("webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
       // Create a chrome driver
        WebDriver driver=new ChromeDriver();
// Maximize window
        driver.manage().window().maximize();
       // Open google home page https://www.google.com
        driver.get("https://www.google.com");
      System.out.println(driver.getTitle());
//  On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
      System.out.println(driver.getCurrentUrl());

      driver.navigate().back();
      //  Wait about 4 sn
        Thread.sleep(3000);
       // Navigate forward to amazon
        driver.navigate().forward();
        //Refresh page
        driver.navigate().refresh();
       // Close/quit the browser
     // System.out.println(driver.getPageSource());  sayfanın kodları
        driver.quit();
        //And Last step print "All is well" on console
        System.out.println("");
        System.err.println("All is well");

  }
}
