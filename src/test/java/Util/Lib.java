package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	private static XSSFWorkbook wk;

	public static String title(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public static WebElement findElem(WebDriver driver, String xpath) {
		WebElement el = driver.findElement(By.xpath(xpath));
		return el;
	}

	public static String readProperty(String key) throws IOException {
		File file = new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\GreatCourses\\locator.property");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;
	}

	public static void changeFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public static void takeScreenshot(WebDriver driver, String name) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,
				new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\GreatCourses\\error " + name + ".png"));
	}

	public static String readExcel(WebDriver driver, int col, int row) throws IOException {
		File file = new File("D:\\Google Drive\\PIIT\\Selenium\\Java\\GreatCourses\\mentoringData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheetAt(0);
		XSSFRow rw = sh.getRow(row - 1);
		XSSFCell cell = rw.getCell(col - 1);
		String value = cell.getStringCellValue();
		return value;

	}

	public static void switchWindow(WebDriver driver) {
		String win1 = driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		for (String win2 : wins) {
			if (!win2.equals(win1)) {
				driver.switchTo().window(win2);
			}
		}
	}

}
