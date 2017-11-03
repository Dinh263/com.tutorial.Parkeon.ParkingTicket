package DataMapping;

import java.io.IOException;

import CustomizedLibrary.ExcelUtility;

public class DataTC03_UpdatePassword {
	ExcelUtility excelobj;
	public static String SHEETNAME = "TC03_UpdatePassword";
	public DataTC03_UpdatePassword(String fileName) throws IOException {
		excelobj = new ExcelUtility(fileName, SHEETNAME);
	}
	
	public String getEmail() {
		return excelobj.getValueAt(0, 1);
	}
	
	public String getOldPassword() {
		return excelobj.getValueAt(1, 1);
	}
	
	public String getNewPassword() {
		return excelobj.getValueAt(2, 1);
	}
}
