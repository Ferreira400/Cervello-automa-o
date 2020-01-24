package executar;


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
public class ComentarioReprovarTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");
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
  public void comentarioReprovar() throws InterruptedException {
	  driver.get("http://10.254.16.80/17042019-v2018/");
	    driver.findElement(By.id("login")).sendKeys("cervello");
	    driver.findElement(By.id("senha")).sendKeys("cervello01");
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
	   // Util.tempo(4);
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
    driver.manage().window().setSize(new Dimension(1680, 1010));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
    vars.put("win8265", waitForWindow(2000));
    driver.switchTo().window(vars.get("win8265").toString());
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".laptop--18:nth-child(4)")).click();
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".col--36:nth-child(1) img")).click();
    Thread.sleep(8000);
    
    /*
    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(13) .acao--cancela")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtMotivo")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtMotivo")).sendKeys("ok");
    Thread.sleep(8000);
    driver.findElement(By.id("btnEnviarMensagemReprovacao")).click();
    Thread.sleep(8000);
 */
	for (int i = 0; i < 3; i++) {
		Thread.sleep(6000);
		driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(3n+6) .acao--cancela")).click();
		Thread.sleep(6000);
	driver.findElement(By.id("txtMotivo")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("txtMotivo")).sendKeys("ok");
	Thread.sleep(6000);
	driver.findElement(By.id("btnEnviarMensagemReprovacao")).click();
	Thread.sleep(6000);
	
	}
	
    
  }
}
