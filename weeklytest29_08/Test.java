package weeklytest29_08;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> findElements = driver.findElements(By.className("inventory_item_name"));
		List<String>name=new ArrayList<String>();
		for(WebElement e:findElements)
		{
			name.add(e.getText());
		}
		
		List<WebElement> findprice = driver.findElements(By.className("inventory_item_price"));
		List<Float>price=new ArrayList<Float>();
		for(WebElement e:findprice)
		{
			String sp=e.getText().replaceAll("[$]","");
			sp=sp.replace(" ", "");
			price.add(Float.parseFloat(sp));
		}
		System.out.println(name.get(0));
		System.out.println(price.get(0));
		
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]")).click();
	}

}
