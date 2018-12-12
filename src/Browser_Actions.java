import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Actions {
    public static void main (String [] args)
    {
        // System.setProperty("webdriver.chrome.driver","C:/Tools/vasya.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.get("http://mish.sheygam.com/#/wellcome");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());


        driver.quit();
    }

}
