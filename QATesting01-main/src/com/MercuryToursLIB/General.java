package com.MercuryToursLIB;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MercuryTourselements.ObjectsInfo;

public class General extends ObjectsInfo {
	public void setup() {
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
public void  adminLogin() throws InterruptedException {
	driver.findElement(By.name(uid)).sendKeys("uid");
	driver.findElement(By.name(pwd)).sendKeys("pwd");
	driver.findElement(By.name(submitname)).click();
	Thread.sleep(4000);
}
public void adminLogout() throws InterruptedException {
	driver.findElement(By.linkText(signoffLink)).click();
	Thread.sleep(4000);

}
public void Teardown() {
	driver.quit();
}
}
