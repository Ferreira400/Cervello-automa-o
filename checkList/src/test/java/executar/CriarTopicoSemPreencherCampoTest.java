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
public class CriarTopicoSemPreencherCampoTest {
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
  public void CriarTopicoSemPreencherCampo() throws InterruptedException {
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
    Thread.sleep(8000);
    vars.put("win7707", waitForWindow(2000));
	driver.switchTo().window(vars.get("win7707").toString());
	Thread.sleep(3000);
	driver.findElement(By.cssSelector(".desktop--9:nth-child(2)")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("btnSalvarTopico")).click();
	Thread.sleep(3000);
	assertThat(driver.switchTo().alert().getText(), is("Digite uma descição."));
    Thread.sleep(6000);
    driver.switchTo().alert().accept();
    Thread.sleep(6000);
  }
    
    
    @Test
    public void EstourarLimitedeCaracteres() throws InterruptedException {
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
      Thread.sleep(8000);
      vars.put("win7707", waitForWindow(2000));
  	driver.switchTo().window(vars.get("win7707").toString());
  	Thread.sleep(3000);
  	driver.findElement(By.cssSelector(".desktop--9:nth-child(2)")).click();
  	Thread.sleep(3000);
  	
  	for (int i = 0; i < 1; i++) {

		Thread.sleep(8000);
		driver.findElement(By.name("top_Descricao")).sendKeys("Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável.Selenide x Ajax\n" + 
				"Atualmente, a maioria dos aplicativos usa o Ajax. Ao testar o aplicativo da Web que utiliza o Ajax, é necessário inventar um código que resulte em alguma coisa. Aguarde até que o botão fique verde, espere até que div receba o texto necessário ou aguarde até que a mensagem de erro desapareça.\n" + 
				"\n" + 
				"Você pode encontrar toneladas de páginas da web, sugerindo truques sobre como fazer com que o Selenium espere uma resposta.\n" + 
				"\n" + 
				"A ferramenta Selenide resolve este problema como nenhum outro wrapper. Embora a Selenium forneça uma API rica para aguardar eventos diferentes, a Selenide sugere que você apenas não se incomode.\n" + 
				"\n" + 
				"Se você quiser verificar se o botão está verde, mas o botão ainda estiver vermelho, a Selenide apenas espera até que o botão fique verde. É uma solução única, fácil e estável." + "");

	}
  	

  	{
		WebElement dropdown = driver.findElement(By.id("ddlTopico"));
		Thread.sleep(3000);
		// dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
		dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
	}
  	
  	

	for (int i = 0; i < 2; i++) {
		Thread.sleep(3000);
		driver.findElement(By.id("btnSalvarTopico")).click();
	}
  	
		
	}
 
	 @Test
	    public void CriarTopicoOMESMO() throws InterruptedException {
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
	      Thread.sleep(8000);
	      vars.put("win7707", waitForWindow(2000));
	  	driver.switchTo().window(vars.get("win7707").toString());
	  	Thread.sleep(3000);
	  	driver.findElement(By.cssSelector(".desktop--9:nth-child(2)")).click();
	  	Thread.sleep(3000);	
	  	driver.findElement(By.name("top_Descricao")).sendKeys("teste");
	  		
	  	{
			WebElement dropdown = driver.findElement(By.id("ddlTopico"));
			Thread.sleep(3000);
			// dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
			dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
		}
	
  	
		for (int i = 0; i < 2; i++) {
			Thread.sleep(3000);
			driver.findElement(By.id("btnSalvarTopico")).click();
		}
  	
	 }
	 
	 
	 @Test
	    public void CriarTopicoFilho() throws InterruptedException {
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
	      Thread.sleep(8000);
	      vars.put("win7707", waitForWindow(2000));
	  	driver.switchTo().window(vars.get("win7707").toString());
	  	Thread.sleep(3000);
	  	driver.findElement(By.cssSelector(".desktop--9:nth-child(2)")).click();
	  	Thread.sleep(3000);	
	  	driver.findElement(By.name("top_Descricao")).sendKeys("teste");
	  		
	  	{
			WebElement dropdown = driver.findElement(By.id("ddlTopico"));
			Thread.sleep(3000);
			// dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
			dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
		}
	
		for (int i = 0; i < 2; i++) {
			Thread.sleep(3000);
			driver.findElement(By.id("btnSalvarTopico")).click();
		}
		
		driver.findElement(By.id("lnkAddTopico")).click();
		
		
		//driver.navigate().refresh();
		//driver.findElement(By.name("top_Descricao")).clear();
		
		driver.findElement(By.name("top_Descricao")).sendKeys("TesteFilho");
		
	  	{
				WebElement dropdown = driver.findElement(By.id("ddlTopico"));
				Thread.sleep(3000);
				// dropdown.findElement(By.xpath("//option[. = '(O MESMO)']")).click();
				dropdown.findElement(By.xpath("//option[. = 'teste']")).click();
			}
		
		for (int i = 0; i < 2; i++) {
			Thread.sleep(3000);
			driver.findElement(By.id("btnSalvarTopico")).click();
		}
		
	
	 }
	 
	 
	 
	 
  	
    
    /*
    driver.findElement(By.cssSelector(".laptop--18:nth-child(4)")).click();
    Thread.sleep(8000);
    driver.findElement(By.cssSelector(".col--36:nth-child(3) img")).click();
    Thread.sleep(8000);
    
    
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
    
    
    
  }

