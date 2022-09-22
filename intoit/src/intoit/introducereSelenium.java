package intoit;

import org.openqa.selenium.chrome.ChromeDriver;

public class introducereSelenium {

	public static void main(String[] args) {
		// Invoking Browser
				//chromedriver.exe -> Chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ema\\Desktop\\selenium\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");	
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
