package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver= new ChromeDriver();
	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	static TakesScreenshot ts = (TakesScreenshot) driver;
//static Alert alert = driver.switchTo().alert();


	public static void launchBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static WebElement findXpath(String xpath) {
		WebElement useXpath = driver.findElement(By.xpath(xpath));
		return useXpath;
	}

	public static WebElement findId(String id) {
		return driver.findElement(By.xpath(id));

	}

//	name, className

	public static void sendKeys(String sendXpath, String value) {
		WebElement sendValue = driver.findElement(By.xpath(sendXpath));
		sendValue.sendKeys(value);
	}

	public static void btnClick(String clickBtn) {
		WebElement click = driver.findElement(By.xpath(clickBtn));
		click.click();
	}

	private void visibilityOf(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static WebElement btnToBeClickable(WebElement element) {
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(element));
		return until;
	}

	public static String getText(String xpath) {
		WebElement getT = driver.findElement(By.xpath(xpath));
		String text = getT.getText();
		return text;
	}

//	screenshot
//	public static void screenshot(String fileName) throws IOException {
//
//		File ss = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("src\\test\\resources\\screenshot\\" + fileName);
//		FileUtils.copyFile(ss, dest);
//	}
//
//	public static void screenshotelement(String fileName, WebElement element) throws IOException {
//
//		File ss = element.getScreenshotAs(OutputType.FILE);
//		File dest = new File("src\\test\\resources\\screenshot\\" + fileName);
//		FileUtils.copyFile(ss, dest);
//	}
	public static void alertaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// TODO Auto-generated method stub

	}
	public static void alertdismiss() {
		Alert alert = driver.switchTo().alert();
		// TODO Auto-generated method stub
alert.dismiss();
	}
	public static void closeWindow() {
	    if (driver != null) {
	        driver.close();
	    }}
 
	public static void quitBrowser() {
	        
	if (driver != null) {
	            driver.quit();
	            driver = null;
	        }}

//	Getting the title
	
	public static void gettitle() {
		// TODO Auto-generated method stub
System.out.println(driver.getTitle());
		
	}
	public static void geturl() {
		// TODO Auto-generated method stub
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	private void dropDownByText() {
		// TODO Auto-generated method stub

	
    WebElement element = driver.findElement(By.id("//select[@id='dropdown']"));
    Select select=new Select(element);

	}
	
	
}

