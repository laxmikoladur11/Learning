import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class SomeClassTest {

    @Test
    public void SomeTest(){
//      WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        SeleniumCode.MyMethod(driver);
        driver.quit();
    }

//public void MyMethod(WebDriver driver){
//    driver.manage().window().maximize();
//    driver.get("amazon.com");
//    String text = driver.findElement(By.className("RNmpXc")).getText();
//    Assert.assertTrue(text.contains("sasas"));
//}
}
