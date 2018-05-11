package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class preCheckoutPage extends Lib{
	
	public static void proceedCheckout(WebDriver driver) throws IOException {
		WebElement proceedCheckout = findElem(driver, readProperty("proceedCheckout"));
		proceedCheckout.click();
	}
}
