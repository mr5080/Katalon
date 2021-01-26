import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.time.*
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LA-EvergreenData.xlsx', 'LA Addresses', true)

//WebUI.acceptAlert()
// random num between 2 - 120 (first line in excel file is a header)
int randomLAaddress = 2 + ((Math.random() * ((19 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomFLaddress = 105 // 105 causes address correction to pop		// this works for FL, need to find one for LA
System.out.println(randomLAaddress)

int randomLAaddressPrior = 2 + ((Math.random() * ((19 - 2) + 1)) as int)

System.out.println(randomLAaddressPrior)

// Risk Adddress
// minus 1 because first line is header in excel file
String addressLA = addressData.getValue(1, randomLAaddress - 1).toUpperCase()

String cityLA = addressData.getValue(2, randomLAaddress - 1).toUpperCase()

String stateLA = addressData.getValue(3, randomLAaddress - 1).toUpperCase()

String zipLA = addressData.getValue(4, randomLAaddress - 1)

System.out.println((((((addressLA + ' ') + cityLA) + ' ') + stateLA) + ' ') + zipLA)

// Prior Address, only used if Year Construction < 3 from current year
String addressLAPrior = addressData.getValue(1, randomLAaddressPrior - 1).toUpperCase()

String cityLAPrior = addressData.getValue(2, randomLAaddressPrior - 1).toUpperCase()

String stateLAPrior = addressData.getValue(3, randomLAaddressPrior - 1).toUpperCase()

String zipLAPrior = addressData.getValue(4, randomLAaddressPrior - 1)

System.out.println((((((addressLAPrior + ' ') + cityLAPrior) + ' ') + stateLAPrior) + ' ') + zipLAPrior)



Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx',
	'FirstName', false)

int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)

System.out.println(randomFirstNameRow)

String randomFirstName = firstNameData.getValue(1, randomFirstNameRow)

randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

System.out.println(randomFirstName)

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\LA-EvergreenData.xlsx', 'LastName', false)

int randomLastNameRow = 1 + ((Math.random() * ((900 - 1) + 1)) as int)

System.out.println(randomLastNameRow)

//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
String randomLastName = lastNameData.getValue(1, randomLastNameRow)

// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')

System.out.println(randomLastName)

String fullName = (randomFirstName + ' ') + randomLastName

// Gets this Fridays date
LocalDate dt = LocalDate.now()

String thisFridayDate = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))

String yearThisFriday = thisFridayDate.toString().substring(0, 4 // year
	)

String dayThisFriday = thisFridayDate.toString().substring(8, 10 // day
	)

String monthThisFriday = thisFridayDate.toString().substring(5, 7 // month
	)

//System.out.println("Fridays date this week = " + thisFridayDate)
thisFridayDate = ((((monthThisFriday + '/') + dayThisFriday) + '/') + yearThisFriday)

System.out.println('Fridays date this week = ' + thisFridayDate)

// get todays date
mydate = new Date()

System.out.println('myDate = ' + mydate)

todaysDate = mydate.format('MM/dd/yyyy')

System.out.println('todaysDate = ' + todaysDate)

todaysTimeStamp = mydate.format(('MMddyyyy' + '-') + 'HHmm')

System.out.println('todaysTimeStamp = ' + todaysTimeStamp)

currentYear = Integer.parseInt(mydate.format('yyyy'))

System.out.println('currentYear = ' + currentYear)

//WebUI.delay(10)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accesshometest.cogisi.com/is/root/logon/index.cfm')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_AGENT CODE_userloginid'), 
    '0')

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_USERNAME_userloginname'), 
    'JHUGHES')

WebUI.setEncryptedText(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_password'), 
    '1w8xCCmEypU3q31XlL176w==')

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_TEST DATA accesshometest.cogisi.com/input_PASSWORD_LoginButton'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/li_Start a New Quote'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LA Evergreen/Page_/select_DP3Dwelling Property CitizensDwellin_86c77a'), 'HOEG', true)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Property Zip Code_ApplicantZip'), zipLA)

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Name_ApplicantName'), fullName.toUpperCase())

WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Address_ApplicantAddress1'), addressLA)
//WebUI.setText(findTestObject('Object Repository/LA Evergreen/Page_/input_Address_ApplicantAddress1'), Keys.chord(Keys.TAB))


WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input'))

WebUI.delay(10)

boolean elementPresent = WebUI.waitForAlert(10)

if (elementPresent == true) {
	alertText = WebUI.getAlertText()
	System.out.println('The title of the alert is: \n' + alertText)
	WebUI.delay(1)
	WebUI.acceptAlert()
	System.out.println('Accept address validation has been accepted' )
	//WebUI.switchToDefaultContent()
//	WebUI.setText(  findTestObject('Object Repository/Cypress 4/Page_/input_Address_ApplicantAddress2') , 'apt 2')  // proves i have access to the screen again
}
		
WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input_X_GMAcceptButton'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/input'))

WebUI.click(findTestObject('Object Repository/LA Evergreen/Page_/button_Accept'))

