package week2.ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
			driver.findElement(By.partialLinkText("Accounts")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit_Limited Account");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("ABD");
			driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("SA");
			driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("370000");
			
			WebElement element = driver.findElement(By.name("industryEnumId"));
			Select obj =new Select(element);
			obj.selectByValue("IND_SOFTWARE");
			WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
			Select owner =new Select(element1);
			owner.selectByVisibleText("S-Corporation");
			WebElement element2 = driver.findElement(By.id("dataSourceId"));
			Select source =new Select(element2);
			source.selectByValue("LEAD_EMPLOYEE");
			WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
			Select market =new Select(element3);
			market.selectByIndex(6);
			WebElement element4 = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select state =new Select(element4);
			state.selectByValue("TX");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		}

	}
}
