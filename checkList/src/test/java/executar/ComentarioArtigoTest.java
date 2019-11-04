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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;


import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import java.awt.image.BufferedImage;

import java.util.*;


public class ComentarioArtigoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  private static final String FOLDER = "C:\\Users\\10097\\git\\Print\\";
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
  public void comentarioArtigoTakeScreenShot1() throws InterruptedException, IOException {
	  
	  
	  driver.get("http://10.254.16.80/17042019-v2018/");
	  //WebElement element = driver.findElement(By.id("hplogo"));
	  
	  WebElement element = driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/figure/img"));
	 
	
	//*[@id="frmLogin"]/figure/img
	 // driver.get("http://www.google.com");
	  //  WebElement element = driver.findElement(By.id("hplogo"));


	 // Obter captura de tela da página inteira 
	    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    BufferedImage  fullImg = ImageIO.read(screenshot);

	 // Obter a localização do elemento na página 
	    Point point = element.getLocation();

	 // Obtém a largura e a altura do elemento
	    int eleWidth = element.getSize().getWidth();
	    int eleHeight = element.getSize().getHeight();

	 // Recorta a captura de tela da página inteira para obter apenas a captura de tela do elemento
	    BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
	        eleWidth, eleHeight);
	    ImageIO.write(eleScreenshot, "png", screenshot);

	 // Copie a captura de tela do elemento no disco 
	    File screenshotLocation = new File("C:\\Users\\10097\\git\\Print\\CervelloLogo_screenshot.png");
	    FileUtils.copyFile(screenshot, screenshotLocation);
	  
  
  }
  
  
  /*
  
  @Test
  public void comentarioArtigoTakeScreenShot2() throws InterruptedException, IOException {
  	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");
  WebDriver driver  = new ChromeDriver();	

  driver.get("http://demo.guru99.com/test/guru99home/");
  driver.manage().window().maximize();
  		
  // Find the element to take a screenshot

  WebElement element = driver.findElement(By.xpath ("//*[@id=\"site-name\"]/a[1]/img"));
  

  // Along with driver pass element also in takeScreenshot() method.

  Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);

  ImageIO.write(Screenshot.getImage(), "jpg", new File("C:\\Users\\10097\\git\\Print\\ElementScreenshot.jpg"));
  	}
  
  */
  
  
  
  
  @Test
  public void comentarioArtigoTakeScreenShot() throws InterruptedException, IOException {
	  
	 
	  
	  
	  
	  
	  
    driver.get("http://10.254.16.80/17042019-v2018/");
    takeScreenShot();
    driver.findElement(By.id("login")).sendKeys("cervello");
    takeScreenShot();
    driver.findElement(By.id("senha")).sendKeys("cervello01");
    takeScreenShot();
    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
    takeScreenShot();
   // Util.tempo(4);
    driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
    takeScreenShot();
    driver.manage().window().setSize(new Dimension(1696, 1026));
    takeScreenShot();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
    takeScreenShot();
    
    
    
    Thread.sleep(3000);
    vars.put("win8311", waitForWindow(2000));
    driver.switchTo().window(vars.get("win8311").toString());
    takeScreenShot();
    driver.findElement(By.cssSelector(".laptop--18:nth-child(4)")).click();
    takeScreenShot();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".col--36:nth-child(1) img")).click();
    takeScreenShot();
    Thread.sleep(8000);
  
    
    for (int i = 0; i < 3; i++) {
        //System.out.print(i + " ..");
    	takeScreenShot();
    	Thread.sleep(4000);
    	
    	 driver.findElement(By.id("txtComentario")).click();
    	 takeScreenShot();
    	 Thread.sleep(4000);
    	    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste " + i );
    	    takeScreenShot();
    	    Thread.sleep(2000);
    	    driver.findElement(By.id("btnComentar")).click();
    	    takeScreenShot();
    	    Thread.sleep(4000);
    	    
    }

    
    for (int i = 0; i < 9; i++) {
    	takeScreenShot();
    Thread.sleep(4000);
    takeScreenShot();
    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(1) .fas")).click();
    
    Thread.sleep(4000);
  
    assertThat(driver.switchTo().alert().getText(), is("Deseja realmente excluir este comentário ?"));
    Thread.sleep(8000);
    takeScreenShot();
    Thread.sleep(8000);

    driver.switchTo().alert().accept();
    //takeScreenShot();
    Thread.sleep(4000);
    
    }
    
    
    
    
    
    
    
    
    //driver.findElement(By.id("btnComentar")).click();
   /*
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 7");
    Thread.sleep(8000);
    driver.findElement(By.id("btnComentar")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 8");
    Thread.sleep(8000);
    driver.findElement(By.id("btnComentar")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 9");
    Thread.sleep(8000);
    driver.findElement(By.id("btnComentar")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 10");
    Thread.sleep(8000);
    driver.findElement(By.id("btnComentar")).click();
    Thread.sleep(8000);
    
    */
    
    takeScreenShot();
  }
  
  public void takeScreenShot() throws InterruptedException, IOException {
      File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      String fileName = UUID.randomUUID().toString();
    //  String fileName =  UUID.randomUUID().toString().replace("-", "");
      //File targetFile = new File(FOLDER + fileName + "tests.jpg");
      File targetFile = new File(FOLDER + fileName + "teste.png");
     // FileUtils.copyFile(srcFile, new File("C:\\Users\\10097\\git\\Print\\"
    //		  + "ScreenshotsTaken/tests.jpg"));
      
      FileUtils.copyFile(scrFile, targetFile);
  }
  
  
}
