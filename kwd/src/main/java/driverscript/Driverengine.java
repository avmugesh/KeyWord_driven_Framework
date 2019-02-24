package driverscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataEngine.test;

public class Driverengine {

		private static WebDriver driver;
	public static void Open_browser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void Navigate(){
		driver.get("http://newtours.demoaut.com/");
	}
	public static void input_uname(){
		driver.findElement(By.name(test.Xpath1)).sendKeys("demo123");
	}
	public static void input_pwd(){
		driver.findElement(By.name("password")).sendKeys("demo123");
	}
	public static void click_login(){
		driver.findElement(By.name("login")).click();
	}
}
