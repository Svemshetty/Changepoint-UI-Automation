package org.changepointreporting.framework;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseClass {
	
    WebDriver driver;
	public Properties prop;
	
	public BaseClass() {
		if(prop==null) {			
			try {
				prop= new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\project.properties");
				prop.load(fs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void openBrowser(String browserName) {
		System.out.println("sush testing");
//		if (browserName.equals("Chrome"))
//			driver = new ChromeDriver();
//		else if (browserName.equals("IE"))
//			driver = new InternetExplorerDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void navigate(String urlKey) {
		System.out.println(prop.getProperty(urlKey));
		//driver.get(prop.getProperty(urlKey));
	}

}
