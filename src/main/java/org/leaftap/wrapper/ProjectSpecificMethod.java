package org.leaftap.wrapper;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.leaftaps.utilities.ReadExcel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class ProjectSpecificMethod {
	public String excelFileName;
	public static ChromeDriver driver; 
	
	@Parameters({"url"})
  @BeforeMethod
  public void login(String url) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
  
	@DataProvider(name="fetchdata")
	public Object[][] getData() throws IOException{
		ReadExcel data = new ReadExcel();
		Object[][] createLeadData = data.readExcel(excelFileName);
		return createLeadData;
		
	}
  
  	
  }
  

