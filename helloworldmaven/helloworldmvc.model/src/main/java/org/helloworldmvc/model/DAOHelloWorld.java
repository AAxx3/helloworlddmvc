package org.helloworldmvc.model;

import java.io.IOException;
import java.io.InputStream;

public class DAOHelloWorld {
	private String FileName = "HelloWorld.txt";
	private String helloWorldMessage = null;
	
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	private DAOHelloWorld(){
		readFile();
	}
	
	private static DAOHelloWorld instance = null; 
	public static DAOHelloWorld getinstance(){
		if (instance == null)
			instance = new DAOHelloWorld();
		return instance;
	}
	private void readFile(){
		try(InputStream is= this.getClass().getResourceAsStream("/"+FileName)){
			int c;
			helloWorldMessage = "";
			do{
				c = is.read();
				if (c != -1)
					helloWorldMessage +=(char)c;
				
			}while(c != -1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
