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
}
