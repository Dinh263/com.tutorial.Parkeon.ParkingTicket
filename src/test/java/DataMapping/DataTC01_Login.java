package DataMapping;

import java.io.IOException;


import CustomizedLibrary.ExcelUtility;

public class DataTC01_Login {
	ExcelUtility excelobj;
    final  static String SHEETNAME="TC01_Login";
    
    public DataTC01_Login(String fileName) throws IOException {
        excelobj=new ExcelUtility(fileName,SHEETNAME);
    }
    
    public String getUserName() {
    	return excelobj.getValueAt(0, 1);
    }
    
    public String getPassword() {
    	return excelobj.getValueAt(1, 1);
    }

}
