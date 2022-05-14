package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("channaveerakanavi");
	driver.findElement(By.id("pass")).sendKeys("dsjjdjfdjfjdf");
	driver.findElement(By.name("login")).submit();
}
}

