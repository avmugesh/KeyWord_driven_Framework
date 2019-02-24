package executionengine;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverscript.Driverengine;
import excelutils.Excelreader;

public class LoginPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Excelreader.setExcelPath();
		
		for(int rownum =1; rownum <6; rownum++){
			
			String m_name = Excelreader.celldata(rownum, 3);
			
			if(m_name.equals("Open_browser")){
				
				Driverengine.Open_browser();
			}
			else if(m_name.equals("Navigate")){
				Driverengine.Navigate();
			}
			else if(m_name.equals("input_uname")){
				Driverengine.input_uname();
			}
			else if(m_name.equals("input_pwd")){
				Driverengine.input_pwd();
			}
			else if(m_name.equals("click_login")){
				Driverengine.click_login();
			}
		}
		
		
		
		
		
		
	}

}
