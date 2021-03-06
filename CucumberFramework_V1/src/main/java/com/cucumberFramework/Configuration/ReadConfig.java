package com.cucumberFramework.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadConfig {

	Logger logger=LogManager.getLogger();
	static Properties pro;
	public void readFileConfig() throws IOException {
		try {
		File src=new File("./Configuration/config.properties");
		FileInputStream fis=new FileInputStream(src);
	  pro=new Properties();
		pro.load(fis);
		}catch(Exception e) {
			logger.info(e.getMessage());

		}
		
	}
	
	public static String getChromePath() {
		String chromePath=pro.getProperty("chromePath");
		return chromePath;
	}
	public String getFireFoxPath() {
		String fireFoxPath=pro.getProperty("fireFoxPath");
		return fireFoxPath;
	}
	public String getIEPath() {
		String iePath=pro.getProperty("iePath");
		return iePath;
	}
	public String getUrl() {
		String URL=pro.getProperty("URL");
		return URL;
	}
}


