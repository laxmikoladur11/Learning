import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SeleniumCode {
    public static void MyMethod(WebDriver driver){
        driver.manage().window().maximize();
        driver.get("amazon.com");
        String text = driver.findElement(By.className("RNmpXc")).getText();
        Assert.assertTrue(text.contains("sasas"));
    }
}
