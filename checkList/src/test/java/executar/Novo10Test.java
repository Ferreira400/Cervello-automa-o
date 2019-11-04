package executar;

import org.junit.Test;
 
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
 
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.remote.Augmenter;

import com.lowagie.text.Rectangle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;








/**
 * Unit test for simple App.
 */
/*public class Novo10Test{
 
	@Test
	public void teste() throws JRException{
		//Obtem o valor atual do sistema
		long inicioContagem = System.currentTimeMillis();
		
		//Compilacao no formato jasper para o jrprint
		JasperFillManager.fillReportToFile("reports/relatorioTeste.jasper", null, new JREmptyDataSource(1));
		System.err.println("Tempo de compilacao jasper -> jrprint: " + (System.currentTimeMillis() - inicioContagem));
		
		//Reinicia o contador
		inicioContagem = System.currentTimeMillis();
		
		//Geracao do PDF
		JasperExportManager.exportReportToPdfFile("reports/relatorioTeste.jrprint");
		System.err.println("Tempo de geracao do PDF: " + (System.currentTimeMillis() - inicioContagem));
	}
}

*/



public class Novo10Test{

    private static final String FOLDER = "C:\\Users\\10097\\git\\";

    private static WebDriver driver;
    
    	
    @BeforeClass
    public static void setUp(){
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");
    	driver = new ChromeDriver();
    	
    	
    	
    	
    	
    }

    
    @Test
    public void testTakeScreenShot() throws IOException {
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
    }

    
    

    
    
    
    
    
    
    
    
    /*
    @Test
    public void testTakeScreenShotElement() throws IOException {
    	driver.get("http://10.254.16.80/17042019-v2018/");
        driver.findElement(By.id("login")).sendKeys("cervello");
        driver.findElement(By.id("senha")).sendKeys("cervello01");
        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
       // Util.tempo(4);
       
        driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
            
             
        takeScreenShot(driver.findElement(By.id("tag_cloud-2")));
        
        takeScreenShot();
    }
    
   */ 
    
    
    

    public void takeScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = UUID.randomUUID().toString();
        File targetFile = new File(FOLDER + fileName + ".png");
        FileUtils.copyFile(scrFile, targetFile);
    }

    
    /*
    public void takeScreenShot(WebElement element) throws IOException {
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Point p = element.getLocation();
       
        int width = element.getSize().getWidth();
        int height = element.getSize().getHeight();
        
        
        Rectangle rect = new Rectangle(element.getSize().getWidth(), element.getSize().getHeight());
        BufferedImage img = ImageIO.read(screen);
        BufferedImage dest = img.getSubimage(  p.getX(), p.getY(), width,   height);
       
        
        ImageIO.write(dest, "png", screen);
        FileUtils.copyFile(screen, new File(FOLDER + System.nanoTime() + ".png"));
        
    }
        */

    @AfterClass
    public static void cleanUp(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }

}

