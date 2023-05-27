package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Find by')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9176611508");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text = driver.findElement(By.linkText("16455")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("16455")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		// String ph = driver.findElement(By.name("//input[@name='phoneNumber']")).getText();
		// System.out.println(ph);
		
		
		
		// driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("25");
		// driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		// driver.findElement(By.xpath("//div[@class='x-panel-tc']/div[@id='ext-gen316']")).click();
		// driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[@id='ext-gen876']")).click();
		
	}
}
