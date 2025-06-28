package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorsTest {
    WebDriver driver ;

   @BeforeClass
    public void setUp(){
       driver = new ChromeDriver();
         driver.get("https://the-internet.herokuapp.com/login");
         driver.manage().window().maximize();
   }


   @Test

    public void testLocators(){
      WebElement username = driver.findElement(By.id("username"));   // By id
      username.sendKeys("tomsmith");

      WebElement password = driver.findElement(By.name("password")); // By name
      password.sendKeys("SuperSecretPassword!");


      WebElement header = driver.findElement(By.tagName("h2")); // By tagName
       System.out.println("Header is " + header.getText());

       WebElement paragraph = driver.findElement(By.className("subheader")); // By className
       System.out.println("Paragraph is " + paragraph.getText());

       WebElement loginButton = driver.findElement(By.className("radius"));
       loginButton.click();



//       WebElement logoutButton = driver.findElement(By.linkText("Logout"));
//       System.out.println("Logout text " + logoutButton.getText());
//
//       WebElement partialLogoutButton = driver.findElement(By.partialLinkText("Log"));
//       System.out.println("Logout text " + partialLogoutButton.getText());
//       partialLogoutButton.click();

       WebElement flashMessage = driver.findElement(By.cssSelector("#flash"));
       System.out.println("Flash message :" + flashMessage.getText());

                                 // xpath
                                  // "//tagName[@attribute='value']"
       WebElement logoutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
       logoutButton.click();
   }

   @AfterClass
    public void tearDown() throws InterruptedException {
       Thread.sleep(3000);
       driver.quit();
   }

}






