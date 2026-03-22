package seproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		// 1st Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2nd open Website
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		// 3rd Maximize The Window
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement we = driver.findElement(By.xpath("//h1[@class='display-6']"));
		String formHeading = we.getText();
		System.out.println(formHeading);

		if (formHeading.equals("Web form")) {
			System.out.println("Test Case pass");
		} else {
			System.out.println("Test Case Failed");
		}

		driver.findElement(By.xpath("//input[@name='my-text']")).sendKeys("Pawan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys("PMCoder@4299");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@name='my-textarea']"))
				.sendKeys("Hello My Name is Pawan Mahesh Mali I am a software Tester");
		Thread.sleep(1000);

		driver.findElement(By.linkText("Return to index")).click();
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		// WebElement we1 = driver.findElement(By.name("my-select"));
		Select sel = new Select(driver.findElement(By.name("my-select")));
		sel.selectByVisibleText("Three");
		// sel.selectByValue("2");
		// sel.selectByIndex(1);

//		Thread.sleep(3000);
//		
//	    driver.findElement(By.name("my-datalist")).click();
//	    driver.findElement(By.xpath("//datalist[@id='my-options']")).click();
//	    Select sel2 = new Select(driver.findElement(By.xpath("")));
//	    sel2.selectByVisibleText("New York");

		Thread.sleep(3000);

		driver.findElement(By.name("my-file")).sendKeys("C:\\\\Users\\\\Pawan Mahesh Mali\\\\Desktop\\\\3rd.pptx");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='my-check-1']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='my-radio-2']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().refresh();

		// Thread.sleep(3000);

		Thread.sleep(5000);

		driver.close();

	}

}
