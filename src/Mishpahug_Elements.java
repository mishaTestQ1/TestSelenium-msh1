import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mishpahug_Elements {
    public static void main (String [] args)
    {
        // System.setProperty("webdriver.chrome.driver","C:/Tools/vasya.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://google.com");


        driver.get("http://mish.sheygam.com/#/wellcome");
        System.out.println(driver.getTitle());
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));

        driver.quit();
    }

}
