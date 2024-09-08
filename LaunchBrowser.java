package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		//driver.close();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sabarinathan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6379499669");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sabari7@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sudharsanam");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raja");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("KSR Kalvi Nagar, Thiruchengode");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("67, Gandhinagar, Attur");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Namakkal");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636102");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tamilnadu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		if(title2.contains("View Lead")) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is not verified");
		}
	}

}
