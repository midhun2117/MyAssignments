package week2.ass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Midhun");
		driver.findElement(By.name("lastname")).sendKeys("J");
		driver.findElement(By.xpath("//html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).sendKeys("dhanakrishnan@gmail.com"); 
		driver.findElement(By.id("password_step_input")).sendKeys("mid21abd17");
		
		
		
		WebElement element = driver.findElement(By.id("day"));
		Select obj = new Select(element);
		obj.selectByVisibleText("15");

		WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select obj1 = new Select(element1);
		obj1.selectByVisibleText("June");

		WebElement element2 = driver.findElement(By.id("year"));
		Select obj2 = new Select(element2);
		obj2.selectByVisibleText("1984");
		driver.findElement(By.className("_8esa")).click();
		
	}

}
