package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseMethods;

public class ComposePage {
	

    
	WebDriver driver;

    public ComposePage() {
       PageFactory.initElements(driver, this);
    }


    private By email=By.xpath("//input[@type='email']");
    private By next1=By.xpath("//button//span[.='Next']");
    private By password=By.name("Passwd");
    private By next2=By.xpath("//*[@id=\"passwordNext\"]/div/button/span");
    private By click1=By.xpath("//a[@class='gb_A']");
    private By gmail=By.xpath("//span[@class='Rq5Gcb'][.='Gmail']");
    private By compose=By.xpath("//div[.='Compose'][@class='T-I T-I-KE L3']");
    private By to=By.xpath("//*[@id=':cc']");
    private By cc=By.xpath("//span[@id=':5r']");
    private By bcc=By.xpath("//span[@id=':5q']");
    private By cc1=By.xpath("//span[@id=':cm']");
    private By bcc1=By.xpath("//span[@id=':cq']");
    private By suggestmail=By.xpath("//div[@class='aL8']");
    private By newmsg=By.xpath("//span[.='New Message']");
    private By composeclose=By.id(":5h");
    private By subject=By.id(":8g");
    private By subjectval=By.id(":8g");
    private By body=By.id(":9n");
    private By formatting=By.xpath("//div[@class='dv']");
    private By fordia=By.xpath("(//div[.='Sans Serif'])[1]");
    private By sent=By.xpath("//a[.='Sent']");
    private By confirmsent=By.xpath("//table[@id=':5h']//tr[1]");
    private By send=By.id(":86");
    private By viewmsg=By.id("link_vsm");
    
   
    


	public By getSend() {
		return send;
	}
	public void setSend(By send) {
		this.send = send;
	}
	
	public By getViewmsg() {
		return viewmsg;
	}
	public void setViewmsg(By viewmsg) {
		this.viewmsg = viewmsg;
	}
	public By getSent() {
		return sent;
	}
	public void setSent(By sent) {
		this.sent = sent;
	}
	public By getConfirmsent() {
		return confirmsent;
	}
	public void setConfirmsent(By confirmsent) {
		this.confirmsent = confirmsent;
	}
	public By getBody() {
		return body;
	}
	public By getFormatting() {
		return formatting;
	}
	public void setFormatting(By formatting) {
		this.formatting = formatting;
	}
	public By getFordia() {
		return fordia;
	}
	public void setFordia(By fordia) {
		this.fordia = fordia;
	}
	public void setBody(By body) {
		this.body = body;
	}
	public By getSubjectval() {
		return subjectval;
	}
	public void setSubjectval(By subjectval) {
		this.subjectval = subjectval;
	}
	public By getComposeclose() {
		return composeclose;
	}
	public By getSubject() {
		return subject;
	}
	public void setSubject(By subject) {
		this.subject = subject;
	}
	public void setComposeclose(By composeclose) {
		this.composeclose = composeclose;
	}
	public By getNewmsg() {
		return newmsg;
	}
	public void setNewmsg(By newmsg) {
		this.newmsg = newmsg;
	}
	public By getSuggestmail() {
		return suggestmail;
	}
	public void setSuggestmail(By suggestmail) {
		this.suggestmail = suggestmail;
	}
	public By getCc1() {
		return cc1;
	}
	public void setCc1(By cc1) {
		this.cc1 = cc1;
	}
	public By getBcc1() {
		return bcc1;
	}
	public void setBcc1(By bcc1) {
		this.bcc1 = bcc1;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public By getTo() {
		return to;
	}
	public void setTo(By to) {
		this.to = to;
	}
	public By getCc() {
		return cc;
	}
	public void setCc(By cc) {
		this.cc = cc;
	}
	public By getBcc() {
		return bcc;
	}
	public void setBcc(By bcc) {
		this.bcc = bcc;
	}
	public By getCompose() {
		return compose;
	}
	public void setCompose(By compose) {
		this.compose = compose;
	}
	public By getClick1() {
		return click1;
	}
	public void setClick1(By click1) {
		this.click1 = click1;
	}
	public By getGmail() {
		return gmail;
	}
	public void setGmail(By gmail) {
		this.gmail = gmail;
	}
	public By getEmail() {
		return email;
	}
	public void setEmail(By email) {
		this.email = email;
	}
	public By getNext1() {
		return next1;
	}
	public void setNext1(By next1) {
		this.next1 = next1;
	}
	public By getPassword() {
		return password;
	}
	public void setPassword(By password) {
		this.password = password;
	}
	public By getNext2() {
		return next2;
	}
	public void setNext2(By next2) {
		this.next2 = next2;
	}
	
    
    
    
    
}

