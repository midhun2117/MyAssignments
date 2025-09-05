package weeklytest29_08;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

	public static void main(String[] args) throws IOException {
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
		float itemprice=price.get(0);
		System.out.println(name.get(0));
		System.out.println(itemprice);
		
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
		String itprice=Float.toString(itemprice);
		String inprice=driver.findElement(By.className("inventory_item_price")).getText();
		if(itprice.equals(inprice))
		{
			System.out.println("The prices are matches");
		}
		else
		{
			System.out.println("The prices are not match");
		}
		driver.findElement(By.linkText("CHECKOUT")).click();
		driver.findElement(By.id("first-name")).sendKeys("Melwin");
		driver.findElement(By.id("last-name")).sendKeys("christopher");
		driver.findElement(By.id("postal-code")).sendKeys("600119");
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		
		List<WebElement> printprice = driver.findElements(By.className("inventory_item_price"));
		List<Float>pprice=new ArrayList<Float>();
		for(WebElement e:printprice)
		{
			String sp=e.getText().replaceAll("[$]","");
			sp=sp.replace(" ", "");
			pprice.add(Float.parseFloat(sp));
		}
		Collections.sort(pprice);
		if(pprice.size()>=2)
		{
			System.out.println(pprice.get(pprice.size()-2));
		}
		else
		{
			System.out.println("The cart has the item below 2");
		}
		
		
		driver.findElement(By.linkText("FINISH")).click();
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/saucedemo.png");
		FileUtils.copyFile(src, des);
		driver.close();
		
	}

}
