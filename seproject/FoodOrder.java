package seproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodOrder {

	public static void main(String[] args) {

		// 1st Open Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// 2nd Maximize The Window
		driver.manage().window().maximize();

		// 3rd open Website
		driver.get(
				"file:///C:/Users/Pawan%20Mahesh%20Mali/Downloads/upload_92b75a56-02bc-4268-9b5c-7504f597a45a/Selenium_waits_Assignment/example3.html");

		// 4th Explicit wait of 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// click on Dessert Button
		WebElement btn1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-type='dessert']")));
		btn1.click();

		//WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement btn2 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='dessert2']//button")));
		btn2.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		//WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(25));

		WebElement btn3 = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("confirmOrderBtn")));
		btn3.click();

		//WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement btn4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("closePopupBtn")));
		btn4.click();

		// driver.quit();

	}

}
