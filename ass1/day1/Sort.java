package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		List<Integer>list=new ArrayList<Integer>();
		List<WebElement> ele = driver.findElements(By.className("a-price-whole"));
		for(int i=0;i<ele.size();i++)
		{
			String st=ele.get(i).getText();
			if(!st.isEmpty())
			{
				
				st=st.replaceAll(",","");
				int number=Integer.parseInt(st);
				list.add(number);
			}
			
		}
		Collections.sort(list);
		for(int i:list)
		{
			System.out.println(i);
		}
		
	}

}
