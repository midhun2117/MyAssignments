package week2.ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		{
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
			
			WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select obj = new Select(element);
			obj.selectByVisibleText("Employee");
			WebElement element2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select mark = new Select(element2);
			mark.selectByValue("9001");
			WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select corp = new Select(element3);
			corp.selectByIndex(5);
			WebElement element4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			Select country = new Select(element4);
			country.selectByVisibleText("India");
			driver.findElement(By.name("submitButton")).click();
			System.out.println("View Lead");		}

	}
}
