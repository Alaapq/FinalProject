package com.finalProject.testCases;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.finalProject.utilities.ReadAndWriteConfig;;
public class BaseClass {

	ReadAndWriteConfig readconfig =new ReadAndWriteConfig();
	public String baseUrl="https://"+readconfig.getApplicationURL();
	public String userName=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String useremail=readconfig.getEmail();
	public static WebDriver driver;
	public static String pathSearchData = System.getProperty("user.dir")+ "/src/test/java/com/finalProject/testData/SearchData.xlsx";
	public static String pathLoginData = System.getProperty("user.dir")+ "/src/test/java/com/finalProject/testData/LoginData.xlsx";
	public static String testPass ="Pass";
	public static String testFail ="Fail";
	public static int testPassColor =0;
	public static int testFailColor =1;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {


			if(br.equals("chrome")) {
				 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+readconfig.getChromePath());
					String downloadFilepath = "downloads";
					File file = new File(downloadFilepath);

					HashMap<String, Object> chromePrefs = new HashMap<>();
					chromePrefs.put("profile.default_content_settings.popups", 0);
					chromePrefs.put("download.default_directory", file.getAbsolutePath());
					ChromeOptions options = new ChromeOptions();
					options.setExperimentalOption("prefs", chromePrefs);


				 driver=new ChromeDriver(options);

			}else if (br.equals("firefox")) {
				 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+readconfig.getfirefoxpathURL());
					driver=new FirefoxDriver();

			}else if (br.equals("ie")){
				 System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+readconfig.getIEpathURL());
					driver=new InternetExplorerDriver();

			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);

	}



	@AfterClass
	public void tearDown() {
	//	driver.quit();

	}

	public void captureScreen(WebDriver driver ,String tname) throws IOException {

		try {
			TakesScreenshot ts= (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File (System.getProperty("user.dir")+"//Screenshots//"+tname+randomeNumrical(5)+".png");
			FileUtils.copyFile(source, target);
			//System.out.println("Screenshot taken ");
		}catch (Exception e){
			System.out.println("Exception is  / BaseClass / captureScreen "+e.getMessage());
		}

	}

	public String randomestring(int range) {
		  String generatedstring=  RandomStringUtils.randomAlphabetic(range);
		  return generatedstring;

	}

	public String randomeNumrical(int range) {
		  String generatedstring=  RandomStringUtils.randomNumeric(range);
		  return generatedstring;

	}

	public int parseToInteger(String target) {
		int dim;
		try{

			 dim = Integer.parseInt(target);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			 dim =0;
		}
		  return dim;
	}

	public String getMounthStatement (String mounth) {
		 String[] mounths=new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		  int targetMounth= Integer.parseInt(mounth);
		   return mounths[targetMounth-1];
	 }


	public void deleteAllFilesFromDownloads() {
       String directory = "downloads"; // If download is in IDE project folder
		File file = new File(directory);
		String[] currentFiles;
		if (file.isDirectory()) {
			currentFiles = file.list();
			for (String currentFile : currentFiles) {
				File myFile = new File(file, currentFile);
				myFile.delete();
			}
		}
	}

	public void deleteAllFilesFromScreenshots() {
	       String directory = "Screenshots"; // If download is in IDE project folder
			File file = new File(directory);
			String[] currentFiles;
			if (file.isDirectory()) {
				currentFiles = file.list();
				for (String currentFile : currentFiles) {
					File myFile = new File(file, currentFile);
					myFile.delete();
				}
			}
		}

}
