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
public class Teste20Test {
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
  public void teste20() throws InterruptedException {
	  driver.get("http://10.254.16.80/17042019-v2018/");
	    driver.findElement(By.id("login")).sendKeys("cervello");
	    driver.findElement(By.id("senha")).sendKeys("cervello01");
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
	   // Util.tempo(4);
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
    driver.manage().window().setSize(new Dimension(1696, 1026));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
    Thread.sleep(3000);
    vars.put("win852", waitForWindow(2000));
    driver.switchTo().window(vars.get("win852").toString());
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".laptop--18:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".center")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".center"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.id("lnkSelIcone")).click();
    vars.put("win8752", waitForWindow(2000));
    driver.switchTo().window(vars.get("win8752").toString());
    driver.findElement(By.cssSelector(".fa-accusoft")).click();
    Thread.sleep(3000);
    //driver.close();
    Thread.sleep(3000);
    driver.switchTo().window(vars.get("win852").toString());
    driver.findElement(By.cssSelector(".pt--40px > .botao--marca")).click();
  }
}
