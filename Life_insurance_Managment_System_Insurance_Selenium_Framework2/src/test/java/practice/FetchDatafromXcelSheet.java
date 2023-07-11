package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Newa_generic_utility.ExcelUtlity;
import Newa_generic_utility.FileUtlity;

public class FetchDatafromXcelSheet
{
	public static void main(String[] args) throws Throwable 
	{
	     ExcelUtlity Elib = new ExcelUtlity();
	  	 FileUtlity fLib = new FileUtlity();
	  	 
	     String TEST_SCRIPT_EXCEL_FILE_PATH = fLib.getFilePathFromPropertiesFile("testScriptdatafilePath");
	     System.out.println( TEST_SCRIPT_EXCEL_FILE_PATH);
	     
	     String CLIENTID = Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Client_id");
	     String CLIENTNAME = Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Client_name");
	     String SEX= Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Sex");
	     String BIRTHDATE= Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Birth_Date");
	     String NID = Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Nid");
	     String RELATIONSHIP = Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Relationship");
	     String PRIORITY= Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Priority");
	     String PHONENUMBER= Elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH,"lims", "tc_02", "Phone");
	     
	     System.out.println(CLIENTID);
	     System.out.println(CLIENTNAME);
	     System.out.println(SEX);
	     System.out.println(BIRTHDATE);
	     System.out.println(NID);
	     System.out.println(RELATIONSHIP);
	     System.out.println(PRIORITY);
	     System.out.println(PHONENUMBER);
	     
	    String CLIENTID1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 2);
	    String CLIENTNAME1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 3);
	    String SEX1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 4);
	    String BIRTHDATE1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 5);
	    String NID1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 6);
	    String RELATIONSHIP1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 7);
	    String PRIORITY1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 8);
	    String PHONENUMBER1 = Elib.getDataFromExcel(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", 4, 9);
	
	    System.out.println(CLIENTID1);
	     System.out.println(CLIENTNAME1);
	     System.out.println(SEX1);
	     System.out.println(BIRTHDATE1);
	     System.out.println(NID1);
	     System.out.println(RELATIONSHIP1);
	     System.out.println(PRIORITY1);
	     System.out.println(PHONENUMBER1);
	      
		
	      
	      
	      
	}

}
