package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class zeroToInfinity extends Lib{

	public static void dvdRadio(WebDriver driver) throws IOException {
		WebElement dvd = findElem(driver, readProperty("dvd"));
		dvd.click();
	}
	
	public static void addToCart(WebDriver driver) throws IOException {
		WebElement addToCart = findElem(driver, readProperty("addToCart"));
		addToCart.click();
	}
	
	
}
