package TMS;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.FixMethodOrder;
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

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArtigoCompletoTest {
	private static final String FOLDER = "C:\\Users\\10097\\git\\Print\\";
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	ATUTestRecorder recorder;
	private WebElement elem;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();

		// create an object of ATUTestRecorder class and pass 3 parameters explained
		// above.
		recorder = new ATUTestRecorder("C:\\Users\\10097\\git\\Print\\", "Script_Video_" + dateFormat.format(date),
				false);

		// To start video recording.
		recorder.start();

		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() throws ATUTestRecorderException {
		// close browser
		driver.quit();
		// Stop the recording
		recorder.stop();
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
	public void /* testejepe */ testeTakeScreenShot1() throws InterruptedException, IOException {

		driver = new ChromeDriver();
		driver.get("http://10.254.16.80/17042019-v2018/");
		driver.manage().window().setSize(new Dimension(1680, 1010));
		takeScreenShot1();
		driver.findElement(By.id("login")).sendKeys("cervello");
		takeScreenShot1();
		driver.findElement(By.id("senha")).sendKeys("cervello01");
		takeScreenShot1();
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
		takeScreenShot1();
		// Util.tempo(4);
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/button")).click();
		takeScreenShot1();
		{
			WebElement element = driver.findElement(
					By.cssSelector(".col--36:nth-child(2) > .cards__item--portal .cards__legenda--portal"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}

		takeScreenShot1();

		vars.put("window_handles", driver.getWindowHandles());
		driver.findElement(By.cssSelector(".col--36:nth-child(4) .fal")).click();
		takeScreenShot1();
		vars.put("win2865", waitForWindow(2000));
		driver.switchTo().window(vars.get("win2865").toString());
		takeScreenShot1();
		driver.findElement(By.cssSelector(".laptop--18:nth-child(2)")).click();
		takeScreenShot1();
		driver.findElement(By.cssSelector(".center")).click();
		takeScreenShot1();
		vars.put("window_handles", driver.getWindowHandles());
		driver.findElement(By.id("lnkSelIcone")).click();
		takeScreenShot1();
		vars.put("win3800", waitForWindow(2000));
		driver.switchTo().window(vars.get("win3800").toString());
		takeScreenShot1();
		driver.findElement(By.cssSelector(".fa-adjust")).click();
				
		// driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(vars.get("win2865").toString());
		takeScreenShot1();
		driver.findElement(By.cssSelector(".pt--40px > .botao--marca")).click();
		takeScreenShot1();

		driver.findElement(By.name("top_Descricao")).click();
		takeScreenShot1();
		driver.findElement(By.name("top_Descricao")).sendKeys("Junit8" + "");
		takeScreenShot1();
		driver.findElement(By.id("ddlTopico")).click();
		takeScreenShot1();
		{
			WebElement dropdown = driver.findElement(By.id("ddlTopico"));
			Thread.sleep(3000);
			// dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
			dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
		}
		takeScreenShot1();
		Thread.sleep(3000);
		// driver.findElement(By.id("lnkSelIcone")).click();
		driver.findElement(By.xpath("//*[@id=\"frmSalvarTopico\"]/div/section/div[2]/div[4]/a/span")).click();
		takeScreenShot1();
		


		driver.findElement(By.xpath("//*[@id=\"modalImagem\"]/div/div/a")).click();
		takeScreenShot1();

		driver.findElement(By.id("ddlTopico")).click();
		takeScreenShot1();
		driver.findElement(By.id("btnSalvarTopico")).click();
		takeScreenShot1();
		driver.findElement(By.id("btnSalvarTopico")).click();
		takeScreenShot1();

	}

	@Test
	public void /* excluirComentario */ teste3() throws InterruptedException {
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
		Thread.sleep(8000);
		vars.put("win7707", waitForWindow(2000));
		driver.switchTo().window(vars.get("win7707").toString());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".desktop--9:nth-child(1)")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtTitulo")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtTitulo")).sendKeys("Melhoria10");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".base__edita--previa")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//body[contains(.,\'dddddddddddd\')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("btnSalvarEditor")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtDescricao")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtDescricao")).sendKeys("Melhoria10");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPalavraChave")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtPalavraChave")).sendKeys("Melhoria20");

		driver.findElement(By.xpath("//option[. = 'Junit8']")).click();
		// driver.findElement(By.xpath("//option[5]")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.id("btnSalvar")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("lnkPublicarArtigo")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector(".laptop--18:nth-child(4)")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"dvPjaxBs_Render\"]/div/ul/li[1]/div/a")).click();
		Thread.sleep(3000);
		
		
		for (int i = 0; i < 9; i++) {

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
			
		
		/*
		
		driver.findElement(By.id("txtComentario")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 1");
		Thread.sleep(3000);
		driver.findElement(By.id("btnComentar")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 2");
		Thread.sleep(3000);
		driver.findElement(By.id("btnComentar")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 3");
		Thread.sleep(3000);
		driver.findElement(By.id("btnComentar")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 4");
		Thread.sleep(3000);
		driver.findElement(By.id("btnComentar")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtComentario")).sendKeys("fazendo teste 5");
		Thread.sleep(3000);
		driver.findElement(By.id("btnComentar")).click();
		Thread.sleep(3000);
		
		
		*/
		
		
		/*
		
		Funcionando a função de aprovação de comentario
		
		for (int i = 0; i < 3; i++) {
			Thread.sleep(6000);
	//	driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(1) .acao--simples")).click();
		Thread.sleep(6000);
	//	driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(2) .acao--simples")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#dvComentario > ol > li:nth-child(-n+3) > div > div.linha > a.acao--simples.lnkAprovarComentario")).click();
		Thread.sleep(6000);
		
	
		}
		
		*/
		
		/*
		for (int i = 0; i < 3; i++) {
			Thread.sleep(6000);
			driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(-n+3) .acao--cancela")).click();
			Thread.sleep(6000);
		driver.findElement(By.id("txtMotivo")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("txtMotivo")).sendKeys("ok");
		Thread.sleep(6000);
		driver.findElement(By.id("btnEnviarMensagemReprovacao")).click();
		Thread.sleep(6000);
		}
		
		*/
		for (int i = 0; i < 9; i++) {
	    	
			Thread.sleep(6000);
	    driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(-n+9) .fas")).click();
	    Thread.sleep(6000);
	    assertThat(driver.switchTo().alert().getText(), is("Deseja realmente excluir este comentário ?"));
	    Thread.sleep(6000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(6000);

	    }
		/*
		
		driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(1) .fas")).click();
		Thread.sleep(3000);
		assertThat(driver.switchTo().alert().getText(), is("Deseja realmente excluir este comentário ?"));
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector(".base__comentario--portal:nth-child(2) .fas")).click();
		Thread.sleep(3000);
		assertThat(driver.switchTo().alert().getText(), is("Deseja realmente excluir este comentário ?"));
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		*/
		
		
		driver.findElement(By.xpath("//*[@id=\"dvPjaxBs_Render\"]/div/div[1]/a[1]")).click();
		Thread.sleep(3000);
		// Defini o tipo de topico
		// driver.findElement(By.xpath("//option[5]")).click();
		driver.findElement(By.xpath("//option[. = 'Junit8']")).click();
		Thread.sleep(3000);
		// (Artigo,Relacionamentos,Permissões)
		driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/ul/li[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ddlProjeto\"]/option[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ddlTipo\"]/option[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ddlAssunto\"]/option[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"lnkAddAssunto\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ddlTelas\"]/option[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"lnkAddTela\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"btnSalvar\"]")).click();
		// (Artigo,Relacionamentos,Permissões)
		driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tabstrip-3\"]/div[1]/section/div[2]/div/label[1]")).click();

	}

	@Test
	public void /* editorArtigo() */ teste4() throws InterruptedException {
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

//Seleciona Cards
		driver.findElement(By.xpath("//*[@id=\"portal\"]/main/div[1]/section/div[2]/ul/li[4]/div/a/i")).click();
		Thread.sleep(3000);
		vars.put("win8265", waitForWindow(2000));
		driver.switchTo().window(vars.get("win8265").toString());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".laptop--18:nth-child(4)")).click();
		Thread.sleep(3000);
		// Seleciona Artigo
		driver.findElement(By.xpath("//*[@id=\"dvPjaxBs_Render\"]/div/ul/li[1]/div/a")).click();
		Thread.sleep(3000);
		// Clicar no editar
		driver.findElement(By.xpath("//*[@id=\"dvPjaxBs_Render\"]/div/div[1]/a[1]")).click();
		Thread.sleep(3000);
		// Defini o tipo de topico
		// driver.findElement(By.xpath("//option[5]")).click();
		driver.findElement(By.xpath("//option[. = 'Junit8']")).click();
		Thread.sleep(3000);

		// (Artigo,Relacionamentos,Permissões)
		driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/ul/li[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ddlProjeto\"]/option[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ddlTipo\"]/option[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ddlAssunto\"]/option[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"lnkAddAssunto\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"ddlTelas\"]/option[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"lnkAddTela\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"btnSalvar\"]")).click();
		// (Artigo,Relacionamentos,Permissões)
		driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tabstrip-3\"]/div[1]/section/div[2]/div/label[1]")).click();

	}

	public void takeScreenShot1() throws InterruptedException, IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String fileName = UUID.randomUUID().toString();
		// String fileName = UUID.randomUUID().toString().replace("-", "");
		// File targetFile = new File(FOLDER + fileName + "tests.jpg");
		File targetFile = new File(FOLDER + fileName + "teste.png");
		// FileUtils.copyFile(srcFile, new File("C:\\Users\\10097\\git\\Print\\"
		// + "ScreenshotsTaken/tests.jpg"));

		FileUtils.copyFile(scrFile, targetFile);
	}

}
