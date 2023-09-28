package jahan;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Madam {
	public static  WebDriver d;
	public static String browser="FF";
	public static String url="http://peramsons.com/baggies/console/login.php";
	public static void launch_browser() {
		if (browser.equals("FF")) {
			System.setProperty(" webdriver.gecko.driver", "C:\\Webdrive\\bin\\gecodriver.exe");
			d=new FirefoxDriver();
		}
		else if (browser.equals("GC")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\bin\\chromedriver.exe");
			d=new ChromeDriver();



		}

		else if (browser.equals("EDGE")) {
			d=new EdgeDriver();
		}

		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().deleteAllCookies();
	}

	public static void Close_browser() {
		d.quit();

	}
}
