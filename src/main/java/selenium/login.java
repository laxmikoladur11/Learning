package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {


    public static void loginTest(String[] args)
    {

       WebDriver driver = new ChromeDriver();
        String url="http://the-internet.herokuapp.com/login";
        driver.get(url);



    }
}
