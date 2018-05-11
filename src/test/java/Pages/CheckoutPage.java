package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Util.Lib;

public class CheckoutPage extends Lib {

	public static void typeEmail(WebDriver driver) throws IOException, InterruptedException {
		WebElement email = findElem(driver, readProperty("email"));
		email.sendKeys("nomail@gmail.com");
		Thread.sleep(2000);
	}

	public static void noPass(WebDriver driver) throws IOException, InterruptedException {
		WebElement noPass = findElem(driver, readProperty("noPass"));
		noPass.click();
		Thread.sleep(2000);
	}

	public static void continueButton(WebDriver driver) throws IOException, InterruptedException {
		WebElement continueButton = findElem(driver, readProperty("continueButton"));
		continueButton.click();
		Thread.sleep(2000);
	}

	public static void billingFirst(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingFirst = findElem(driver, readProperty("billingFirst"));
		billingFirst.sendKeys("fname");
		Thread.sleep(1000);
	}

	public static void billingLast(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingLast = findElem(driver, readProperty("billingLast"));
		billingLast.sendKeys("lname");
		Thread.sleep(1000);
	}

	public static void billingStreet(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingStreet = findElem(driver, readProperty("billingStreet"));
		billingStreet.sendKeys("99-90 Pokemon Ave");
		Thread.sleep(1000);
	}

	public static void billingCity(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingCity = findElem(driver, readProperty("billingCity"));
		billingCity.sendKeys("Jamaica");
		Thread.sleep(1000);
	}

	public static void billingRegion(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingRegion = findElem(driver, readProperty("billingRegion"));
		Select sel = new Select(billingRegion);
		sel.selectByVisibleText("New York");
		Thread.sleep(1000);
	}

	public static void billingZip(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingZip = findElem(driver, readProperty("billingZip"));
		billingZip.sendKeys("11578");
		Thread.sleep(1000);
	}

	public static void newPass(WebDriver driver) throws IOException, InterruptedException {
		WebElement newPass = findElem(driver, readProperty("newPass"));
		newPass.sendKeys("newPasswordabc123!!");
		Thread.sleep(1000);
	}

	public static void confirmPass(WebDriver driver) throws IOException, InterruptedException {
		WebElement confirmPass = findElem(driver, readProperty("confirmPass"));
		confirmPass.sendKeys("newPasswordabc123!!");
		Thread.sleep(1000);
	}

	public static void billingContinue(WebDriver driver) throws IOException, InterruptedException {
		WebElement billingContinue = findElem(driver, readProperty("billingContinue"));
		billingContinue.click();
		Thread.sleep(4000);
	}

	public static void shippingContinue(WebDriver driver) throws IOException, InterruptedException {
		WebElement shippingContinue = findElem(driver, readProperty("shippingContinue"));
		shippingContinue.click();
		Thread.sleep(6000);
	}

	public static void ccNumber(WebDriver driver) throws IOException, InterruptedException {
		driver.switchTo().frame(0);
		WebElement ccNumber = findElem(driver, readProperty("ccNumber"));
		ccNumber.sendKeys("4201670185317095");
		Thread.sleep(2000);
	}

	public static void expMonth(WebDriver driver) throws IOException, InterruptedException {
		WebElement expMonth = findElem(driver, readProperty("expMonth"));
		Select sel = new Select(expMonth);
		sel.selectByIndex(5);
		Thread.sleep(2000);
	}

	public static void expYear(WebDriver driver) throws IOException, InterruptedException {
		WebElement expYear = findElem(driver, readProperty("expYear"));
		Select sel = new Select(expYear);
		sel.selectByIndex(4);
		Thread.sleep(2000);
	}

	public static void paymentContinue(WebDriver driver) throws IOException, InterruptedException {
		driver.switchTo().defaultContent();
		WebElement paymentContinue = findElem(driver, readProperty("paymentContinue"));
		paymentContinue.click();
		Thread.sleep(2000);
		takeScreenshot(driver, "01");
	}

}
