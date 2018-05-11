package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Homepg extends Lib {

	public static void typeMath(WebDriver driver) throws IOException {
		WebElement typeMath = findElem(driver, readProperty("typeMath"));
		typeMath.sendKeys("math");
	}

	public static void searchButton(WebDriver driver) throws IOException {
		WebElement searchButton = findElem(driver, readProperty("searchButton"));
		searchButton.click();
	}

}
