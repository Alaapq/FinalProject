package com.finalProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadAndWriteConfig {
	Properties pro;

	public ReadAndWriteConfig() {
		File src = new File (System.getProperty("user.dir")+"//Configuration//config.properties");

		try {
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);

		}catch (Exception e){

			System.out.println("Exception is "+e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url =pro.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		String username =pro.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password =pro.getProperty("password");
		return password;
	}


	public String getEmail() {
		String password =pro.getProperty("useremail");
		return password;
	}

	public String getChromePath() {
		String chromepath =pro.getProperty("chromepath");
		return chromepath;
	}

	public String getIEpathURL() {
		String iepath =pro.getProperty("iepath");
		return iepath;
	}

	public String getfirefoxpathURL() {
		String firefoxpath =pro.getProperty("firefoxpath");
		return firefoxpath;
	}



	public void write(String useremail,String password) {
		try {
			OutputStream fis= new FileOutputStream(System.getProperty("user.dir")+"//Configuration//config.properties");
			//pro.setProperty("useremail",useremail);
			pro.put("useremail", useremail);
			pro.put("password",password);
			pro.store(fis, null);

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is useremail"+e.getMessage());
		}
	}


}
