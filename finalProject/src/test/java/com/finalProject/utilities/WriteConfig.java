package com.finalProject.utilities;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WriteConfig {
	Properties pro;
	OutputStream fis;

	public WriteConfig() {
		//File src = new File (System.getProperty("user.dir")+"//Configuration//config.properties");

		try {
			fis= new FileOutputStream(System.getProperty("user.dir")+"//Configuration//config.properties");
			pro=new Properties();
		// pro.load(fis);

		}catch (Exception e){

			System.out.println("Exception is "+e.getMessage());
		}
	}


	public void setPassword(String password) {

		try {
			//fis= new FileOutputStream(System.getProperty("user.dir")+"//Configuration//config.properties");
			pro.put("password", password);
			//pro.setProperty("password",password);
			//pro.store(fis, null);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is password"+e.getMessage());
		}
	}


	public void setEmail(String useremail) {

		try {
			//fis= new FileOutputStream(System.getProperty("user.dir")+"//Configuration//config.properties");

			//pro.setProperty("useremail",useremail);
			pro.put("useremail", useremail);

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is useremail"+e.getMessage());
		}
	}

	public void save() {

		try {
			pro.store(fis, null);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is save"+e.getMessage());
		}
	}

}
