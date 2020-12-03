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
import org.openqa.selenium.Keys as Keys
//import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory

// First name from excel file
Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 'FirstName', false)
int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
System.out.println(randomFirstNameRow)
String randomFirstName = firstNameData.getValue(1, randomFirstNameRow)  
System.out.println(randomFirstName)

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 'LastName', false)
int randomLastNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
System.out.println(randomLastNameRow)
String randomLastName = lastNameData.getValue(1, randomLastNameRow) 
System.out.println(randomLastName)

// Read address in from excel file    //true mean the first line consider as a header.
Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 'TX Addresses', true)
//Object excelData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Downloads\\Issue Log_AccessHomeInsuranceCompany_Home_TX_01272020.xlsx', 'TX Addresses', true)

int randomTXaddress = 1 + ((Math.random() * ((523 - 1) + 1)) as int)
System.out.println(randomTXaddress)

String address = excelData.getValue(1, randomTXaddress-1)  // minus 1 because first line is header in excel file
String city = excelData.getValue(2, randomTXaddress-1)
String state = excelData.getValue(3, randomTXaddress-1)
String zip = excelData.getValue(4, randomTXaddress-1)

System.out.println(address + " " + city + " " + state + " " + zip)


/*
WebUI.openBrowser('')

// need to figure out how to get a random local point from certain lat long, update below and contine to pass city/address back to ezlinx script
WebUI.navigateToUrl('https://www.google.com/maps/@29.6633316,-95.6546837,18z')


WebUI.click(findTestObject('Object Repository/Page_Google Maps/canvas_Menu_widget-scene-canvas'))

WebUI.click(findTestObject('Object Repository/Page_Google Maps/canvas_Menu_widget-scene-canvas'))

'Click on the top left cell'
//WebUI.clickOffset(findTestObject('Object Repository/Page_Google Maps/canvas_Menu_widget-scene-canvas'), -100, -100)

String address = WebUI.getText(findTestObject('Object Repository/Page_Google Maps/div_14119 Becket Woods Ln'))
System.out.println("address = " + address)

String city = WebUI.getText(findTestObject('Object Repository/Page_Google Maps/div_Sugar Land TX 77498'))
System.out.println("city = " + city)

//WebUI.rightClick(findTestObject('Object Repository/Page_Google Maps/div_Sugar Land TX 77498'))

//WebUI.closeBrowser()

*/