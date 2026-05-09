package org.facebook;
import org.baseclass.*;
import org.openqa.selenium.WebElement;

public class FacebookLoginpage extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("https://www.tutorialspoint.com/selenium/practice/alerts.php");
//		WebElement xpath=findXpath("//input[@id='_R_oiqjbjb9pb6amH1_']");
//		xpath.sendKeys("tamilachin@gmail.com");
//		sendKeys("//input[@id='_R_oqqjbjb9pb6amH1_']","Tamil@123");
btnClick("//button[text()='Alert']");
     alertaccept();
     btnClick("//button[@onclick='myDesk()']");
    alertdismiss();
//     quitBrowser();
//launchBrowser("https://www.faceboook.com");
     gettitle();
     geturl();
	}

}
