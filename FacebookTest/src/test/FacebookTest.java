package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		File file =new File("/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/FacebookTest/src/test/facebook.properties");
		FileInputStream fileinput = null;
		
		try{
			fileinput = new FileInputStream(file);
		}
		catch
		(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		{
			prop.load(fileinput);
		}
		
		
		
		//chrome driver called
		System.setProperty("webdriver.chrome.driver", "/root/Documents/jee-oxygen/Worspace2/Java_Tutorials/FacebookTest/lib/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		//url link open & maximize the browser
		driver.get(prop.getProperty("ChromeURL"));
		driver.manage().window().maximize();			
		Thread.sleep(2000);
		
		//email id given
		driver.findElement(By.xpath(prop.getProperty("ChromeEmail"))).sendKeys(prop.getProperty("chromeemail"));		
		Thread.sleep(2000);
		
		//password given
		driver.findElement(By.xpath(prop.getProperty("ChromePassword"))).sendKeys(prop.getProperty("chromepassword"));		
		Thread.sleep(2000);
		
		//click login
		driver.findElement(By.xpath(prop.getProperty("ChromeLogin"))).click();		
		Thread.sleep(5000);



//*****************************************************************************************************

		//firefox driver called
		System.setProperty("webdriver.gecko.driver", "/root/Documents/jee-oxygen/Worspace/Java_Tutorials/SeleniumTest/lib/geckodriver/geckodriver");
		System.setProperty("webdriver.firefox.bin", "/root/Downloads/firefox/firefox-bin");
		driver = new FirefoxDriver();
		System.out.println("firefox driver called");
	
		//url link open
		driver.get(prop.getProperty("FirefoxURL"));
		Thread.sleep(2000);
		System.out.println("url link open");
		
		//email id given
		
		driver.findElement(By.xpath(prop.getProperty("FirefoxEmail"))).sendKeys(prop.getProperty("firefoxemail"));		
		Thread.sleep(3000);
		System.out.println("email id given");
		
		//password given
		driver.findElement(By.xpath(prop.getProperty("FirefoxPassword"))).sendKeys(prop.getProperty("firefoxpassword"));		
		Thread.sleep(2000);
		System.out.println("password given");
		
		driver.findElement(By.xpath(prop.getProperty("FirefoxPassword"))).sendKeys(Keys.RETURN);		
		Thread.sleep(2000);
	
/*		
		//click login
		driver.findElement(By.id(prop.getProperty("FirefoxLogin"))).click();		
		Thread.sleep(2000);
		System.out.println("click login");
*/

//***************************************************************************************************
		
		//searching name in the text field
		driver.findElement(By.xpath(prop.getProperty("FirefoxSearch"))).sendKeys(prop.getProperty("firefoxsearch"));		
		Thread.sleep(2000);
		
		//search button enter
		driver.findElement(By.xpath(prop.getProperty("FirefoxSearchButton"))).click();		
		Thread.sleep(2000);
		
		//select profile
		driver.findElement(By.xpath(prop.getProperty("FirefoxListSelect"))).click();		
		Thread.sleep(2000);
		
		//send friend req		
		driver.findElement(By.xpath(prop.getProperty("FirefoxSendFriendReqBtn"))).click();		
		Thread.sleep(2000);
		
//***************************************************************************************************		
		
		driver.findElement(By.xpath(prop.getProperty("ChromeAcceptBtnSelect"))).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ChromeAcceptReq"))).click();		
		Thread.sleep(2000);
		

		driver.findElement(By.xpath(prop.getProperty("ChromeSearch"))).sendKeys(prop.getProperty("chromesearch"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ChromeSearchButton"))).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ChromeListSelect"))).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ChromeSelectMsg"))).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("ChromeSay1"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("FirefoxSay1"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("ChromeSay2"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("FirefoxSay2"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("ChromeSay3"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("FirefoxSay3"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("ChromeSay4"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("FirefoxSay4"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.findElement(By.xpath(prop.getProperty("MsgTextbox"))).sendKeys(prop.getProperty("ChromeSay5"));		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("ClickSend"))).click();		
		Thread.sleep(2000);
		
//**************************************************************************************************
		
		driver.close();
		
	}

}
