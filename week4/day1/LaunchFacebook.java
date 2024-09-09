package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		if (title.contains("Facebook")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sabarinathan");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("cecssabarinathan@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345@12345");
	}

}
