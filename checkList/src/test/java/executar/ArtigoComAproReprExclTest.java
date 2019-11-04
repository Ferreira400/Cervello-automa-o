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
public class ArtigoComAproReprExclTest {
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
  public void excluirComentario() throws InterruptedException {
	  driver.get("http://10.254.16.80/17042019-v2018/");
	  driver.manage().window().setSize(new Dimension(1680, 1010));
	    driver.findElement(By.id("login")).sendKeys("cervello");
	    driver.findElement(By.id("senha")).sendKeys("cervello01");
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
	   // Util.tempo(4);
	    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
    driver.manage().window().setSize(new Dimension(1680, 1010));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
    Thread.sleep(8000);
    vars.put("win7707", waitForWindow(2000));
    driver.switchTo().window(vars.get("win7707").toString());
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".desktop--9:nth-child(1)")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtTitulo")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtTitulo")).sendKeys("9091");
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".base__edita--previa")).click();
    Thread.sleep(8000);
    driver.findElement(By.cssSelector("body")).click();
    Thread.sleep(8000);
    driver.switchTo().defaultContent();
    Thread.sleep(8000);
    driver.switchTo().defaultContent();
    Thread.sleep(8000);
    driver.findElement(By.id("btnSalvarEditor")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtDescricao")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtDescricao")).sendKeys("9091");
    Thread.sleep(8000);
    driver.findElement(By.id("txtPalavraChave")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtPalavraChave")).sendKeys("9091");
    Thread.sleep(8000);
    driver.findElement(By.id("btnSalvar")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("lnkPublicarArtigo")).click();
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".laptop--18:nth-child(4)")).click();
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".col--36:nth-child(1) img")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 1");
	    Thread.sleep(8000);
	    driver.findElement(By.id("btnComentar")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 2");
	    Thread.sleep(8000);
	    driver.findElement(By.id("btnComentar")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 3");
	    Thread.sleep(8000);
	    driver.findElement(By.id("btnComentar")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 4");
	    Thread.sleep(8000);
	    driver.findElement(By.id("btnComentar")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 5");
	    Thread.sleep(8000);
	    driver.findElement(By.id("btnComentar")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(1) .acao--simples")).click();
	     Thread.sleep(8000);
	    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(2) .acao--simples")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(3) .acao--cancela")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtMotivo")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("txtMotivo")).sendKeys("ok");
	    Thread.sleep(8000);
	    driver.findElement(By.id("btnEnviarMensagemReprovacao")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(1) .fas")).click();
	    Thread.sleep(8000);
	    assertThat(driver.switchTo().alert().getText(), is("Deseja realmente excluir este comentário ?"));
	    Thread.sleep(8000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(8000);
	    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(2) .fas")).click();
	    Thread.sleep(8000);
	    assertThat(driver.switchTo().alert().getText(), is("Deseja realmente excluir este comentário ?"));
	    Thread.sleep(8000);
	    driver.switchTo().alert().accept();
    
   
  }
}
