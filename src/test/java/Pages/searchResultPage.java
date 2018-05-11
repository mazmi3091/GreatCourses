package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class searchResultPage extends Lib{
	public static void zeroToInf(WebDriver driver) throws IOException, InterruptedException {
		WebElement zeroToInf = findElem(driver, readProperty("zeroToInf"));
		zeroToInf.click();
		Thread.sleep(3000);
	}
}
