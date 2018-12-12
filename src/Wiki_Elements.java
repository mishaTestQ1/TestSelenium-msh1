import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki_Elements {
    public static void main (String [] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver","C:/Tools/vasya.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://google.com");


        driver.get("http://www.wikipedia.org");
        System.out.println(driver.getTitle());
        WebElement search_field = driver.findElement(By.id("searchInput"));
        search_field.click();
        search_field.sendKeys("Java");
        search_field.sendKeys(Keys.ENTER);

        WebElement link_indonesian = driver.findElement(By.xpath("//a[@title='Indonesian language']"));
        link_indonesian.click();
        Thread.sleep(2000);



        driver.quit();
    }

}
