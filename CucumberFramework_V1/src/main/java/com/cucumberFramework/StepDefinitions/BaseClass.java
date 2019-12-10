package com.cucumberFramework.StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cucumberFramework.Configuration.ReadConfig;


public class BaseClass {


public static Logger logger=LogManager.getLogger(BaseClass.class);
 //propertyConfigurator.configure
public static WebDriver driver;
public static ReadConfig readConfig=new ReadConfig();
String Browser="FireFox";
	public void setup(String Browser) {
		if(Browser.equalsIgnoreCase("ChromeDriver")) {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+readConfig.getChromePath());
			driver=new ChromeDriver();
		} else if(Browser.equalsIgnoreCase("FireFox")) {
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+readConfig.getFireFoxPath());
			driver=new FirefoxDriver();
		}else if(Browser.equalsIgnoreCase("IEDriver")) {
			  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+readConfig.getIEPath());
				driver=new InternetExplorerDriver();
			}
	}
public void getURL() {
	driver.get("https://ui.cogmento.com/");
}
}

