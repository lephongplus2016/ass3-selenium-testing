package ass3_test_pagination_version1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;

public class ass3_test_pagination_version1 {
	WebDriver driver;
	String driverPath = "C:\\\\Users\\\\Admin\\\\Documents\\\\chromedriver_win32_version95\\\\chromedriver.exe";

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("We start at the following URL https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");
	}

	@Test
	public void Pagination_001_001() {
		System.out.print("Test Pagination_001_001\n");
		driver.findElement(By.linkText("Tiếp")).click();
		// https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/#google_vignette
		// https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-2
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contentEquals("https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/#google_vignette")) {

			driver.navigate().back();
			driver.findElement(By.linkText("Tiếp")).click();
			System.out.print("go to adverstisement\n");
		}
		driver.findElement(By.linkText("Trước")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");

	}

	@Test
	public void Pagination_001_002() {
		System.out.print("Test Pagination_001_002\n");
		driver.findElement(By.linkText("2")).click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-2");
	}

	@Test
	public void Pagination_001_003() {
		System.out.print("Test Pagination_001_003\n");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(" ");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");
	}

	@Test
	public void Pagination_001_004() {
		System.out.print("Test Pagination_001_004\n");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("1");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");
	}

	@Test
	public void Pagination_001_005() {
		System.out.print("Test Pagination_001_005\n");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("2");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-2");
	}

	@Test
	public void Pagination_001_006() {
		System.out.print("Test Pagination_001_006\n");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("75");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-75");
	}

	@Test
	public void Pagination_001_007() {
		System.out.println("Test Pagination_001_007");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("150");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-150");
	}

	@Test
	public void Pagination_001_008() {
		System.out.println("Test Pagination_001_008");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("0");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");
	}

	@Test
	public void Pagination_001_009() {
		System.out.println("Test Pagination_001_009");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("151");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-151");
	}

	public void Pagination_001_010() {
		System.out.println("Test Pagination_001_010");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("152");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-151");
	}

	@Test
	public void Pagination_001_011() {
		System.out.println("Test Pagination_001_011");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("2.5");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/page-2");
	}

	@Test
	public void Pagination_001_012() {
		System.out.println("Test Pagination_001_012");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("-1");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getCurrentUrl(), "https://vn-z.vn/forums/tin-tuc-cong-nghe-va-doi-song.6/");
	}

	@Test
	public void Pagination_001_013() {
		System.out.println("Test Pagination_001_013");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("abc");
		String valueOfTextBoxPage = currentElement.getAttribute("value");
		System.out.println("Value of textBoxPage: " + valueOfTextBoxPage);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(valueOfTextBoxPage, "");
	}

	@Test
	public void Pagination_001_014() {
		System.out.println("Test Pagination_001_014");
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("--");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);
		Assert.assertEquals(driver.getTitle(),
				"Oops! We ran into some problems | VN-Zoom | Cộng đồng Chia Sẻ Kiến Thức Công Nghệ và Phần Mềm Máy Tính");
	}

	@Test
	public void Pagination_002_001() {
		System.out.println("Test Pagination_002_014");
		long start = System.currentTimeMillis();

		// driver run
		driver.findElement(By.linkText("2")).click();

		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load - " + totalTime + " ms");
		assertTrue(totalTime < 5000);
	}

	@Test
	public void Pagination_002_002() {
		System.out.println("Test Pagination_002_002");
		long start = System.currentTimeMillis();

		// driver run
		driver.findElement(By.linkText("…")).click();
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys("--");
		currentElement.sendKeys(Keys.ENTER);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("We are currently on the following URL " + currentUrl);

		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load - " + totalTime + " ms");
		assertTrue(totalTime < 5000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
