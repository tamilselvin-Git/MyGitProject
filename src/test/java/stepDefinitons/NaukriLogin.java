package stepDefinitons;

import java.time.Duration;
import java.util.Collection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='login_Layer']"))).click();
	@Nullable
	WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")));			
	email.click();
	email.sendKeys("tamilselvincse@gmail.com",Keys.TAB,"Naukri@123",Keys.ENTER);
	//driver.switchTo().alert().getText();
	WebElement element = driver.findElement(By.xpath("//div//img[@class='nI-gNb-icon-img']"));
	element.click();
	WebElement element2 = driver.findElement(By.xpath("//div//a[@class='nI-gNb-info__sub-link']"));
	element2.click();
	driver.findElement(By.xpath("//span[text()='Resume']")).click();
//	@Nullable
//	WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@data-title='download-resume']")));
//	element4.click();
//	@Nullable
//	WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='dummyUpload typ-14Bold']")));
//	element3.click();
	
	//element3.sendKeys("C:\\Users\\Abcom\\eclipse-workspace\\TestSelenium\\src\\test\\resources\\Tamilselvi.N.docx");
	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Tamilselvi.N.docx";

	WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

	upload.sendKeys(path);
	System.out.println(upload.getText());
	@Nullable
	WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='photoBadge no-img']")));
	
	element5.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Collection<WebElement> list = driver.findElements(By.xpath("//div[contains(@class='widgetHead')]//span[contains(text()='edit')]"));
	System.out.println("size"+list.size());
	WebElement aws =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class='widgetHead')]//span[contains(text()='edit')]")));
	
	js.executeScript(
		    "arguments[0].scrollIntoView({behavior:'smooth', block:'center'});",
		    aws
		);
	Thread.sleep(1000);

aws.click();
	
	}
	
}
