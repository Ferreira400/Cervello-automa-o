package executar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mongodb.util.Util;

import backEnd.ParametroFazerLogin;

import org.junit.Test;

public class cervello01 {

	private WebDriver driver;
	
       
		@Before
		public void setUp() {
			
		
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");
    	
        driver = new ChromeDriver();
        //	driver.get("http://www.taketest.com.br/");
         driver.get("http://10.254.16.80/17042019-v2018/");
        // driver.manage().window().maximize();
         driver.findElement(By.id("login")).sendKeys("cervello");
         driver.findElement(By.id("senha")).sendKeys("cervello01");
         driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
        // Util.tempo(4);
         driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
		}
        
	@Test
	public void test() {
		//fail("Not yet implemented");
	         
	         driver.findElement(By.xpath("//a[@href='../Workflow/CatalogoServico']")).click();
	         
	}
	
	
	@Test
	public void testo() {
		//fail("Not yet implemented");
		
		  driver.findElement(By.xpath("//a[@href='../BaseConhecimento/Home']")).click();
	         
	       
	}
	
	
	
    
	@Test
	public void testee() {
		//fail("Not yet implemented");
		  
        driver.findElement(By.xpath("//*[@id=\"dvMinhasPendencias\"]/section/div[2]/ul/li[1]/a/span[2]/span[2]")).click();
		 
	}
	
	
	
 
	@After
	public void fechar() {
		driver.quit();
	}
	
	


}
