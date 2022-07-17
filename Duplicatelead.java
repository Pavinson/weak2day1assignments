package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
 		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("pavinsonA");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pavinson");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Son.A");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("pavinson.A");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Network");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aba@gmail.com");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("NW");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("pavin");
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		String title1 = driver.getTitle();
		
		if(title1.equalsIgnoreCase("View Lead | opentaps CRM")) {
			
		}
			if(title1.equals(title)) {
				
				System.out.println("Title is correct  ");
				
			}else {
				
				System.out.println("Title is not correct  ");
				
			}
		
	}

}
