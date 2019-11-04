package executar;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.FixMethodOrder;
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
import org.openqa.selenium.TakesScreenshot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Teste50Test {
 WebDriver driver;
 @Before
 public void setup() throws Exception {
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\10097\\git\\Cervello-Automacao\\chromedriver.exe");
	 
	  driver = new ChromeDriver(); 
	 
  //Create new firefox custom profile.
	  
	  
  FirefoxProfile profile = new FirefoxProfile();
  //Disable javascript for newly created profile.
     profile.setPreference("javascript.enabled", false);
     //Use custom profile which has javascript disabled In webdriver launched browser.
     
   
   
     
     driver = new FirefoxDriver(profile);     
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
 }
 
 @Test
 public void getCoordinates(){
  //Click on button to get Javascript alert.
  driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
  //Check If alert Is present or not.
  if(checkAlertPresent()){
   //If alert present then bellow given code will be executed.
   Alert alert = driver.switchTo().alert();
   System.out.println(alert.getText());   
   System.out.println("Alert present");
   alert.accept();
  }  
 }
 
 public boolean checkAlertPresent(){
   try{
    //It will return true If alert present.
    driver.switchTo().alert();
    return true;
   }catch(NoAlertPresentException ex){
    //It will return false If alert not present and print bellow given message In console.
    System.out.println("No Alert present. Verify If javascript Is disabled.");
    return false;
   }
 }
}