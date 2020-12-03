import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.lang.String

FileInputStream file = new FileInputStream (new File("C:\\Users\\john.hughes\\Documents\\ProjectFiles\\TestFile.xlsx"))
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheet('Sheet1');

'Read data from excel'
String Data_fromCell=sheet.getRow(0).getCell(0).getStringCellValue();
System.out.println(Data_fromCell)

// count rows
int rowCount = sheet.getLastRowNum() + 1;
System.out.println('rowCount = ' + rowCount);


'Write data to excel'
//sheet.createRow(0);	//new
//sheet.getRow(0).createCell(0).setCellValue("sheilaaaaaaaa");
//sheet.getRow(rowCount).getCell(0).setCellValue(Data_fromCell)

try {//  Block of code to try to write to cell
	sheet.createRow(rowCount);	//create new row
	sheet.getRow(rowCount).createCell(0).setCellValue('tryRebecca2')
	sheet.getRow(rowCount).createCell(1).setCellValue('smith2')
	//System.out.println('in the try ')
}
catch(Exception e) { //  Block of code to handle errors
	//sheet.createRow(rowCount);	//create new row
	//sheet.getRow(rowCount).createCell(0).setCellValue('catchRebecca')
	System.out.println(e)
}

file.close();
FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\john.hughes\\Documents\\ProjectFiles\\TestFile.xlsx"));
workbook.write(outFile);
outFile.close();


