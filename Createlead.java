package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Createlead {

	public static void main(String[] args) {
	
		  WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
	 		
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.get("http://leaftaps.com/crmsfa/control/main?externalLoginKey=EL882970578009");
			
			driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("pavinsonA");
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pavinson");
			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Son.A");
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("pavinson.A");
			
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Network");
			
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aba@gmail.com");
			
			driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("NW");
			
			driver.findElement(By.className("smallSubmit")).click();
			
			String title = driver.getTitle();
			
			if(title.equals("View Lead | opentaps CRM")) {
				System.out.println("Title is correct = "+title);
			}else {
				System.out.println("Title is not correct = "+title);
			}
		
	}

}
