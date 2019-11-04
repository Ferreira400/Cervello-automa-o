package executar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TestaDevmedia{
 
    /**
     * @param args
     */
    public static void main(String[] args) throws InterruptedException{
         
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");
    	
        driver = new ChromeDriver();
        driver.get("http://10.254.16.80/17042019-v2018/");
         
      //  WebElement userName = driver.findElement("//input[@name='username']");
        //    userName.sendKeys("wilson");
 
    }
 
}