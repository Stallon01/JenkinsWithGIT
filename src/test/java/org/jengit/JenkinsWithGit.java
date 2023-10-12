package org.jengit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsWithGit {
	@Test(priority = 1)
	public void browserLaunchFB() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
	@Test(priority = 2)
	public void printStatement() {
		System.out.println("Print Successful");

	}
}
