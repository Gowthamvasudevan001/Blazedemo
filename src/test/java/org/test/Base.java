package org.test;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

public static WebDriver driver;
	
	public static Select se;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void close() {
		driver.quit();
	}
	
	public void startTime() {
		Date st = new Date();
		System.out.println(st);
	}
	
	public void endTime() {
		Date et = new Date();
		System.out.println(et);
	}
	
	public void launchurl(String url) {
		driver.get(url);
	}
	
	public void fill(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public static void sele(WebElement element,String txt) {
		se=new Select(element);
		se.selectByVisibleText(txt);
	}
	
	
	
	/*public void flightselect(WebElement table) {
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			WebElement rows = row.get(i);
			
			List<WebElement> coloumn = rows.findElements(By.tagName("td"));
			for (int j = 5; j < coloumn.size(); j++) {
				WebElement coloumn1 = coloumn.get(j);
				String text1 = coloumn1.getText();
				String val = text1.substring(1);
				Double value = Double.valueOf(val);
				if(value.equals(200.98)) {
				driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
				}
				else {
					System.out.println("bad");
				}
			}
		}
	}*/
	
	public void printBooking(WebElement table) {
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for (int i = 0; i < row.size(); i++) {
			WebElement rows = row.get(i);
			
			List<WebElement> coloumn = rows.findElements(By.tagName("td"));
			for (int j = 0; j < coloumn.size(); j++) {
				WebElement All = coloumn.get(j);
				String text = All.getText();
				System.out.println(text);
			}
		}
	}
}
