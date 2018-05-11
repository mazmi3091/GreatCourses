package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CheckoutPage;
import Pages.Homepg;
import Pages.preCheckoutPage;
import Pages.searchResultPage;
import Pages.zeroToInfinity;

public class Test {

	public static WebDriver driver;

	@BeforeClass
	public static void initialize() {
		System.getProperty("webdriver.chrome.driver",
				"D:\\Google Drive\\PIIT\\Selenium\\Java\\GreatCourses\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.thegreatcourses.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@org.junit.Test
	public void test() throws IOException, InterruptedException {

		Homepg.typeMath(driver);
		Homepg.searchButton(driver);

		searchResultPage.zeroToInf(driver);

		zeroToInfinity.dvdRadio(driver);
		zeroToInfinity.addToCart(driver);

		preCheckoutPage.proceedCheckout(driver);

		CheckoutPage.typeEmail(driver);
		CheckoutPage.noPass(driver);
		CheckoutPage.continueButton(driver);
		CheckoutPage.billingFirst(driver);
		CheckoutPage.billingLast(driver);
		CheckoutPage.billingStreet(driver);
		CheckoutPage.billingCity(driver);
		CheckoutPage.billingRegion(driver);
		CheckoutPage.billingZip(driver);
		CheckoutPage.newPass(driver);
		CheckoutPage.confirmPass(driver);
		CheckoutPage.billingContinue(driver);
		CheckoutPage.shippingContinue(driver);
		CheckoutPage.ccNumber(driver);
		CheckoutPage.expMonth(driver);
		CheckoutPage.expYear(driver);
		CheckoutPage.paymentContinue(driver);

	}

	@AfterClass
	public static void teardown() {
		System.out.println("Testing is finished");
		driver.manage().deleteAllCookies();
		driver.close();
	}
}
