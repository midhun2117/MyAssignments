package week2.ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DupicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("inputLogin")).sendKeys(Keys.ENTER);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RCB");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Virat");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kohli");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("King");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cricket");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abcd@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("King");
		driver.findElement(By.className("smallSubmit")).click();	
		
		System.out.println(driver.getTitle());
		
	}

}
