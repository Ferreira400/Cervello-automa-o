package business;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasedeConhecimento {
	
	WebDriver driver = null;

	
	public void deve_ser_apresentado_a_página_inicial() throws Throwable {

		driver = new ChromeDriver();
		driver.get("http://10.254.16.80/17042019-v2018");
	   
		
	}

	
}
