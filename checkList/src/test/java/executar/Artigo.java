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

import javax.swing.Action;

public class Artigo {

	
	
	
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
	  public void criandoartigo() throws InterruptedException {
	    driver.get("http://10.254.16.80/17042019-v2018/");
	    driver.findElement(By.id("login")).sendKeys("cervello");
        driver.findElement(By.id("senha")).sendKeys("cervello01");
        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
      // Util.tempo(4);
        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
	    driver.manage().window().setSize(new Dimension(848, 1009));
	    vars.put("window_handles", driver.getWindowHandles());
	    driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
	    vars.put("win1743", waitForWindow(2000));
	    driver.switchTo().window(vars.get("win1743").toString());
	    driver.findElement(By.cssSelector(".desktop--9:nth-child(1)")).click();
	    driver.findElement(By.id("txtTitulo")).click();
	    driver.findElement(By.id("txtTitulo")).click();
	    driver.findElement(By.id("txtTitulo")).sendKeys("teste10112");
	    driver.findElement(By.id("txtDescricao")).click();
	    driver.findElement(By.id("txtDescricao")).sendKeys("teste10112");
	    driver.findElement(By.id("txtPalavraChave")).click();
	    driver.findElement(By.id("txtPalavraChave")).sendKeys("teste10112");
	    driver.findElement(By.cssSelector(".base__edita--previa")).click();
	
	    {
	        WebElement element = driver.findElement(By.cssSelector(".base__edita--previa"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	    
	    Thread.sleep(3000);
	      {
	        WebElement element = driver.findElement(By.tagName("body"));
	        Actions act = new Actions(driver);
	        act.moveToElement(element, 0, 0).perform();
	       
	      }
	      
	      Thread.sleep(3000);	      
	      
	      driver.switchTo().frame(10);
	      driver.switchTo().frame(0);
	      driver.findElement(By.cssSelector("body")).click();
	      driver.switchTo().defaultContent();
	      driver.switchTo().defaultContent();
	      driver.findElement(By.id("btnSalvarEditor")).click();
	      
	      Thread.sleep(3000);
	      {
	        WebElement element = driver.findElement(By.id("btnSalvarEditor"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	      Thread.sleep(3000);
	      {
	        WebElement element = driver.findElement(By.tagName("body"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element, 0, 0).perform();
	      }
	      
	      Thread.sleep(3000);
	      driver.findElement(By.id("btnSalvar")).click();
	      driver.findElement(By.id("lnkPublicarArtigo")).click();
	    }
	  }


