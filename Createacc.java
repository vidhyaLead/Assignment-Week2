package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Createacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvaraj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sharvesh");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("check@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9176611508");
		
		
		/* Select class
		WebElement ind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select indus = new Select(ind);
        indus.selectByValue("IND_GEN_SERVICES");
        WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select owner = new Select(own);
        owner.selectByIndex(5);
        WebElement sta = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select stat = new Select(sta);
        stat.selectByVisibleText("Indiana");

*/


		driver.close();




	}

}
