package TMS;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Tms02Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tms02() throws InterruptedException {
	  driver = new ChromeDriver();
		driver.get("http://10.254.16.80/17042019-v2018/");
		driver.manage().window().setSize(new Dimension(1680, 1010));
		driver.findElement(By.id("login")).sendKeys("cervello");
		driver.findElement(By.id("senha")).sendKeys("cervello01");
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
		// Util.tempo(4);
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
		driver.manage().window().setSize(new Dimension(1680, 1010));
		vars.put("window_handles", driver.getWindowHandles());
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"portal\"]/main/div[1]/section/div[2]/ul/li[4]/div/a/i")).click();
		// driver.findElement(By.cssSelector(".col--36:nth-child(3) .fal")).click();
		
		Thread.sleep(3000);
		
		
		 driver.findElement(By.cssSelector(".fa-adjust")).click();
		    driver.findElement(By.cssSelector(".col--36:nth-child(19) img")).click();
		
		//driver.findElement(By.cssSelector(".desktop--9:nth-child(1)")).click();
		
		
		
		driver.findElement(By.cssSelector(".fa-file-pdf")).click();
    
    
  }
}
