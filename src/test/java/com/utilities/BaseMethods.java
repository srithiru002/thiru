package com.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {

	public static WebDriver driver;

	public static Properties getProperties() throws IOException {
		FileInputStream stream = new FileInputStream("src\\test\\resources\\Config.properties");
		Properties pro = new Properties();
		pro.load(stream);
		return pro;

	}

	public static void launchBrowser() throws IOException {

		String browser = getProperties().getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-web-security");
			opt.addArguments("--allow-running-insecure-content");
			opt.setAcceptInsecureCerts(true);
			opt.addArguments("start-maximized");
			opt.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new ChromeDriver(opt);
			driver.manage().deleteAllCookies();
		} else {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

	}

	public static void launchURL(String URL) {
		driver.get(URL);

	}

	public static void clickElement(By by) {

		WebElement cli = driver.findElement(by);
		cli.click();

	}

	public static void PassText(By by, String text) {

		WebElement tex = driver.findElement(by);
		tex.sendKeys(text);

	}

	public static void untilElement(By by) {
		WebElement ele = driver.findElement(by);
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOf(ele));

	}

	public static void sendkeysReplace(By by, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(by);
		js.executeScript("arguments[0].setAttribute('value',\'" + value + "\')", ele);
	}

	public static void clickReplace(By by) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(by);
		js.executeScript("arguments[0].click()", ele);

	}

	public static void impilicitwait() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public static void windowHandle(int value) {
		Set<String> t = driver.getWindowHandles();
		List<String> l = new LinkedList<String>();
		l.addAll(t);
		driver.switchTo().window(l.get(value));

	}

	public static void frame(String text) {
		driver.switchTo().frame(text);

	}

	public static void defaultcon() {
		driver.switchTo().defaultContent();

	}

	public static void frameByValue(int val) {
		driver.switchTo().frame(val);

	}

	public static void clickEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void clickTap() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void actionsSendkey(String text) {

		Actions a = new Actions(driver);
		a.sendKeys(text).perform();
	}
	public static void moveToEle(By by) {

		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(by);
		a.moveToElement(ele).perform();
	}
}
