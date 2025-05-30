import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import java.lang.Integer as Integer
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

System.out.println("randomLastName(from childTestCase) = " + randomLastName)
System.out.println("randomFirstName(from childTestCase) = " + randomFirstName)
System.out.println("quoteNumber(from childTestCase) = " + quoteNumber)
System.out.println("todaysDate(from childTestCase) = " + todaysDate)
System.out.println("myDate(from childTestCase) = " + myDate)
System.out.println("totalPremium(from childTestCase) = " + totalPremium)
System.out.println("policyType(from childTestCase) = " + policyType)
System.out.println("isAgent(from childTestCase) = " + isAgent)
System.out.println("paperless(from childTestCase) = " + paperless)
System.out.println("addInterest(from childTestCase) = " + addInterest)

//System.out.println("censusBlock(from childTestCase) = " + censusBlock)
//System.out.println("payPlanOption(from childTestCase) = " + payPlanOption)

FileInputStream file = new FileInputStream(new File('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressAutoQuotes.xlsx'))

	XSSFWorkbook workbook = new XSSFWorkbook(file)

	XSSFSheet sheet = workbook.getSheet('Sheet1')

	//String Data_fromCell = sheet.getRow(0).getCell(0).getStringCellValue()
	//System.out.println(Data_fromCell)
	// count rows currently in the file
	'Read data from excel'
	int rowCount = sheet.getLastRowNum() + 1

	System.out.println('rowCount = ' + rowCount)

	'Write data to excel'
	try
	{
		//  Block of code to try to write to cell
		sheet.createRow(rowCount)

		sheet.getRow(rowCount).createCell(0).setCellValue((randomLastName + ', ') + randomFirstName)

		sheet.getRow(rowCount).createCell(1).setCellValue(randomFirstName)

		sheet.getRow(rowCount).createCell(2).setCellValue(randomLastName)

		sheet.getRow(rowCount).createCell(3).setCellValue(quoteNumber)

		if(shouldBind == false)
		{
			sheet.getRow(rowCount).createCell(4).setCellValue("policy not bound with script")
		}
		else if(shouldBind == true)
		{
			//WebUI.waitForElementNotPresent(findTestObject('Object Repository/Cypress 4/Page_/button_CC Modal Window'), 10)
			WebUI.waitForElementClickable(findTestObject('Cypress 4/Page_/input - Bind Application'), 10)
				
			'Bind Application > button'
			WebUI.click(findTestObject('Cypress 4/Page_/input - Bind Application'))
			
			if (WebUI.waitForElementPresent(findTestObject('Object Repository/Cypress 4/Page_/td_PolicyNumber'), 45))
			{
//		needs updated		WebUI.takeScreenshot(('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressScreenShots\\' + todaysTimeStamp + " - " + policyNumber) + '-policyCreated.jpg')
			
				String policyNumber = WebUI.getAttribute(findTestObject('Object Repository/Cypress 4/Page_/td_PolicyNumber'), 'innerHTML')
			
				sheet.getRow(rowCount).createCell(4).setCellValue(policyNumber)
			}
		}
			// removes all chars from string
			//sheet.getRow(rowCount).createCell(4).setCellValue(quoteNumber.replaceAll('[^\\d.]', ''))
			sheet.getRow(rowCount).createCell(5).setCellValue(myDate)   // does it write to file if this is commented out?
	
	//		policyCreated = new Date()
	//		System.out.println('myDate = ' + policyCreated)
			LocalDateTime myDateObj = LocalDateTime.now();
			//System.out.println("Before formatting: " + myDateObj);
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
			
			String policyCreated = myDateObj.format(myFormatObj);
			System.out.println("After formatting new policyCreated string: " + policyCreated);
	
			sheet.getRow(rowCount).createCell(6).setCellValue(policyCreated)
	
			sheet.getRow(rowCount).createCell(7).setCellValue(totalPremium)
	
			sheet.getRow(rowCount).createCell(8).setCellValue(policyType)
			
			sheet.getRow(rowCount).createCell(9).setCellValue(environment)
			
			sheet.getRow(rowCount).createCell(10).setCellValue(stateFL)
			
			sheet.getRow(rowCount).createCell(11).setCellValue(isAgent)
			
			sheet.getRow(rowCount).createCell(13).setCellValue(addInterest)
			
			//sheet.getRow(rowCount).createCell(12).setCellValue(censusBlock)
			sheet.getRow(rowCount).createCell(14).setCellValue(paperless)
			
			
			
			
			
			
			
			
			file.close()
		
			try {
				FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressAutoQuotes.xlsx'))				
		
				workbook.write(outFile)
		
				outFile.close()
			}
			catch (Exception e) {
				System.out.println(e)
		
				WebUI.delay(20)
				// try to write again, file is probably open...
				FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressAutoQuotes.xlsx'))
		
				workbook.write(outFile)
		
				outFile.close()
			}
		}
		catch (Exception e)
		{
			System.out.println(e)
		}
	/*
	 else {
			System.out.println('in the else, FAILED to find policy number')
		}
	*/	