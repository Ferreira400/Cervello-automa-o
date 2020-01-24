package executar;

import org.junit.Test;
import org.junit.Before;
import org.apache.commons.io.FileUtils;
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
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
public class TestefdsaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
 
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
  public void CriarTopico() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("http://10.254.16.80/17042019-v2018/");
	    driver.findElement(By.id("login")).sendKeys("cervello");
	    driver.findElement(By.id("senha")).sendKeys("cervello02");
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
    driver.findElement(By.cssSelector(".col--36:nth-child(3) img")).click();
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
 
    for (int i = 0; i < 3; i++) {

		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id=\"txtComentario\"]")).click();
		Thread.sleep(8000);
		 
		driver.findElement(By.xpath("//*[@id=\"txtComentario\"]")).sendKeys("fazendo teste " + i);
		Thread.sleep(8000);
		 
		driver.findElement(By.xpath("//*[@id=\"btnComentar\"]")).click();
		Thread.sleep(8000);
		 
	 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
    */
    
    Thread.sleep(20000);
 
     driver.findElement(By.cssSelector(".fa-file-pdf")).click();
     
     Thread.sleep(8000);
    
  }
}
