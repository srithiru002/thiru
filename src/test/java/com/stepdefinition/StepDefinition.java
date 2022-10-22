package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.ComposePage;
import com.utilities.BaseMethods;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseMethods {

	ComposePage c = new ComposePage();

	@Given("User launch the browser and login to Gmail Account")
	public void user_launch_the_browser_and_login_to_gmail_account() throws IOException {
		launchBrowser();
		impilicitwait();
		launchURL(getProperties().getProperty("URL"));
		sendkeysReplace(c.getEmail(), getProperties().getProperty("username"));
		clickReplace(c.getNext1());
		sendkeysReplace(c.getPassword(), getProperties().getProperty("password"));
		clickReplace(c.getNext2());
		clickReplace(c.getClick1());
		frame("app");
		clickReplace(c.getGmail());

	}

	@When("User should click the Compose email button")
	public void user_should_click_the_compose_email_button() {
		impilicitwait();
		windowHandle(1);
		clickReplace(c.getCompose());

	}

	@Then("New pop-up should be displayed with the headers as a new message")
	public void new_pop_up_should_be_displayed_with_the_headers_as_a_new_message() {
		String text = driver.findElement(c.getNewmsg()).getText();
		System.out.println(text);
		Assert.assertEquals("true", "New Message", text);

	}

	@When("User should enter the receiver email ID")
	public void user_should_enter_the_receiver_email_id() {
		sendkeysReplace(c.getTo(), "abhaysheel.r@quesscorp.com");
	}

	@Then("Email ID is should passed in the to section")
	public void email_id_is_should_passed_in_the_to_section() throws AWTException {
		impilicitwait();
		WebElement g = driver.findElement(c.getTo());
		String attribute = g.getAttribute("value");
		System.out.println(attribute);
		Assert.assertEquals("true", "abhaysheel.r@quesscorp.com", attribute);
		driver.close();

	}

	@When("User should enter the receiver email ID in the TO section")
	public void user_should_enter_the_receiver_email_id_in_the_to_section() throws IOException {

		windowHandle(0);
		clickReplace(c.getClick1());
		frame("app");
		clickReplace(c.getGmail());
		user_should_click_the_compose_email_button();
		sendkeysReplace(c.getTo(), "thirunavukarasu1221@gmail.com");

	}

	@Then("Auto Suggestion of the email ID should pop-up")
	public void auto_suggestion_of_the_email_id_should_pop_up() throws AWTException {
		impilicitwait();
		String expect = "thirunavukarasu1221@gmail.com";
		WebElement f = driver.findElement(By.xpath("//div[@class='aL8']"));
		String text = f.getText();
		Assert.assertEquals("true", expect, text);
		System.out.println(text);
		clickEnter();

	}

	@When("User should enter multiple receiver email IDs in the TO section")
	public void user_should_enter_multiple_receiver_email_i_ds_in_the_to_section() throws AWTException {
		impilicitwait();
		WebElement q = driver.findElement(By.id(":cc"));
		q.sendKeys("abhaysheel.r@quesscorp.com");
		clickEnter();

	}

	@Then("Multiple receiver email IDs should be passed")
	public void multiple_receiver_email_i_ds_should_be_passed() {
		impilicitwait();
		List<WebElement> count = driver.findElements(By.xpath("//div[@class='agh']"));
		Assert.assertEquals(count, count);
		driver.close();
	}

	@When("User should enter subject in the Subject section")
	public void user_should_enter_subject_in_the_subject_section() throws AWTException, IOException {
		impilicitwait();
		user_should_enter_the_receiver_email_id_in_the_to_section();
		clickEnter();
		clickTap();
		actionsSendkey("Greetings Msg");
	}

	@Then("User typed text should be pass in the subject field")
	public void user_typed_text_should_be_pass_in_the_subject_field() {
		impilicitwait();
		WebElement g = driver.findElement(c.getSubjectval());
		String attribute = g.getAttribute("value");
		System.out.println(attribute);
		Assert.assertEquals("true", "Greetings Msg", attribute);

	}

	@When("User should type the message in the email body message area")
	public void user_should_type_the_message_in_the_email_body_message_area() throws AWTException {
		impilicitwait();
		clickTap();
		actionsSendkey("hi how are you");

	}

	@Then("User typed text should be pass in the message body area")
	public void user_typed_text_should_be_pass_in_the_message_body_area() {
		impilicitwait();
		String a = "hi how are you";
		WebElement g = driver.findElement(c.getBody());
		Assert.assertEquals("true", a, g.getText());
		System.out.println(g.getText());
	}

	@When("User should click the formatting option")
	public void user_should_click_the_formatting_option() {
		clickReplace(c.getFormatting());
	}

	@Then("Formatting dialog box should be pop-up")
	public void formatting_dialog_box_should_be_pop_up() {
		WebElement r = driver.findElement(c.getFordia());
		Assert.assertEquals("true", "Sans Serif", r.getText());
	}

	@When("User should click send button")
	public void user_should_click_send_button() {
		clickReplace(c.getSend());
		clickReplace(c.getViewmsg());
	}

	@Then("Sent message successfully pop-up will be shown")
	public void sent_message_successfully_pop_up_will_be_shown() {
		WebElement y = driver.findElement(By.xpath("//img[@class='ajz']"));
		y.click();
		List<WebElement> g = driver.findElements(By.xpath("//table[@class='ajC']//td"));
		for (int i = 0; i < g.size(); i++) {
			String text = g.get(i).getText();
			System.out.println(text);
		}
	}

}
