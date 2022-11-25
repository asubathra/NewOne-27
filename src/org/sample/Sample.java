package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.manage().window().maximize();
	wd.get(" http://greenstech.in/selenium-course-content.html ");

	WebElement name = wd.findElement(By.xpath("//h1[text()='Selenium Certification Training in Chennai']"));
	name.sendKeys("Greens Velmurugan");
    String send = name.getText();
	System.out.println(send);
	
}
}