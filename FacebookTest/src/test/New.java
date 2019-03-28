package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	
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
		
		
		
		
	}
	
	@SuppressWarnings("null")
	public static void chromeOpenLogin() throws InterruptedException {
		Properties prop = null;

		
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
		
	}
		

}



		