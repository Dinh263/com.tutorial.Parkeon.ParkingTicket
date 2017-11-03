package DataMapping;

import java.io.IOException;

import CustomizedLibrary.ExcelUtility;

public class DataTC02_RegisterAccount {
	ExcelUtility excelobj;
    final  static String SHEETNAME="TC02_RegisterAccount";
    public DataTC02_RegisterAccount(String fileName) throws IOException {
    	 excelobj=new ExcelUtility(fileName,SHEETNAME);
    }
    
    public String getCountryName() {
    	return excelobj.getValueAt(0,1);
    }
    
    public String getEmail() {
    	return excelobj.getValueAt(1, 1);
    }
    
    public String getCountryCode() {
    	return excelobj.getValueAt(2, 1);
    }
    
    public String getPhoneNumber() {
    	return excelobj.getValueAt(3, 1);
    }
    
    public String getPlateNumber() {
    	return excelobj.getValueAt(4, 1);
    }
    
    public String getPassword() {
    	return excelobj.getValueAt(5, 1);
    }
}
