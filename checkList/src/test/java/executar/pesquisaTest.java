package executar;

// Generated by Selenium IDE
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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class pesquisaTest {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void Pesquisa() throws InterruptedException {
	 
	  driver.get("http://10.254.16.80/17042019-v2018/");
	    driver.findElement(By.id("login")).sendKeys("cervello");
	    driver.findElement(By.id("senha")).sendKeys("cervello02");
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
	   // Util.tempo(4);
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
    driver.manage().window().setSize(new Dimension(1680, 1010));
    vars.put("window_handles", driver.getWindowHandles());
    
    driver.findElement(By.xpath("//*[@id=\"portal\"]/main/div[1]/section/div[2]/ul/li[5]/div/a/i")).click();
  //*[@id="portal"]/main/div[1]/section/div[2]/ul/li[5]/div/a/i
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector(".fancybox-item")).click();
    
    driver.switchTo().frame(0);
    
    driver.findElement(By.id("gbqfbb")).click();
    
    driver.findElement(By.cssSelector(".itemMenu")).click();
    
    
    
  //span[contains(.,'Pesquisa detalhada')]
 
    driver.findElement(By.cssSelector("li:nth-child(8) li:nth-child(1) .itemMenu")).click();
    
    
 /*
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector(".fancybox-item")).click();
   
   // driver.switchTo().defaultContent();
    //driver.switchTo().frame("iFrameOldModulo");
    driver.findElement(By.cssSelector("li:nth-child(8) li:nth-child(1) .itemMenu")).click();
    
    */
    driver.findElement(By.id("txtNumeroChamado")).click();
    driver.findElement(By.id("txtNumeroChamado")).sendKeys("300");
    driver.findElement(By.id("pesquisar")).click();
 
    
    driver.findElement(By.id("txtNumeroChamado")).click();
    driver.findElement(By.id("txtNumeroChamado")).sendKeys("30");
    driver.findElement(By.id("pesquisar")).click();
    
    driver.findElement(By.cssSelector(".col--36:nth-child(5) .fal")).click();
    Thread.sleep(8000);
    vars.put("win7707", waitForWindow(2000));
	driver.switchTo().window(vars.get("win7707").toString());
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".desktop--9:nth-child(2)")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btnSalvarTopico")).click(); driver.findElement(By.id("btnSalvar")).click();
  }
}