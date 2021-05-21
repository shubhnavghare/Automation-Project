package AssignmentTask.AssignmentTask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdditionOFNumber {
	@Test
	//Tests google cal
	public void googleCalculator(){
		
	
		
         
		//Setting the webdriver.chrome.driver property to its executable's location
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		//Instantiating driver 
		WebDriver driver= new ChromeDriver();

		//Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch google
		driver.get("https://www.calculator.net/");
		
		
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();/////////////////////////////////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();///
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();//
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();///
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();/////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();/////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();///
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();/////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();///
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();////
	  driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();/////
		 

	 

}
}
