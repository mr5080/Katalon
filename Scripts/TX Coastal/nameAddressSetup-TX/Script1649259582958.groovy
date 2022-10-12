import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//

/*
def value = "Hello, ${realTransunionCreditReport}"
WebUI.comment("in subcase realTransunionCreditReport === " + realTransunionCreditReport)
return value
*/
if(		realTransunionCreditReport == false  && 		realAPlusClaimReport == false   &&   		manualNameAddress == false)
	{
	// Read in TX address from excel file, true mean the first line consider as a header.
		Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'TX Addresses', true)
		
		// random num between 2 - 500 (first line in excel file is a header)
		int randomTXaddress = 2 + ((Math.random() * ((190 - 2) + 1)) as int)
		
		// override randomness to specifiy address in file to use
		//randomTXaddress = 510 
		System.out.println(randomTXaddress)	
			
		int randomTXaddressPrior = 2 + ((Math.random() * ((120 - 2) + 1)) as int)
		
		System.out.println(randomTXaddressPrior)
		
		// Risk Adddress
		// minus 1 because first line is header in excel file
		addressTX = addressData.getValue(1, randomTXaddress - 1).toUpperCase()
		
		cityTX = addressData.getValue(2, randomTXaddress - 1).toUpperCase()
		
		stateTX = addressData.getValue(3, randomTXaddress - 1).toUpperCase()
		
		zipTX = addressData.getValue(4, randomTXaddress - 1)
		
	/*	// Prior Address, only used if Year Construction < 3 from current year
		addressTXPrior = addressData.getValue(1, randomTXaddressPrior - 1).toUpperCase()
		
		cityTXPrior = addressData.getValue(2, randomTXaddressPrior - 1).toUpperCase()
		
		stateTXPrior = addressData.getValue(3, randomTXaddressPrior - 1).toUpperCase()
		
		zipTXPrior = addressData.getValue(4, randomTXaddressPrior - 1)
	*/	
		Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
		
		int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
		
		System.out.println(randomFirstNameRow)
		
		 randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
		
		System.out.println('randomFirstName  =====    ' + randomFirstName)
		
		 randomFirstNameForInterest = firstNameData.getValue(1, randomFirstNameRow - 1)
		
		randomFirstName = randomFirstName.replaceAll('[\\d.]', '')
		
		randomFirstNameForInterest = randomFirstNameForInterest.replaceAll('[\\d.]', '')
		
		//System.out.println((((((addressTXPrior + ' ') + cityTXPrior) + ' ') + stateTXPrior) + ' ') + zipTXPrior)
		
		// Last name from excel file
		Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
		
		int randomLastNameRow = 1 + ((Math.random() * ((800 - 1) + 1)) as int)
		
		//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
		 randomLastName = lastNameData.getValue(1, randomLastNameRow)
		
		// removes any numbers from last name
		randomLastName = randomLastName.replaceAll('[\\d.]', '')
	
	} // end if
	//System.out.println((((((addressTXPrior + ' ') + cityTXPrior) + ' ') + stateTXPrior) + ' ') + zipTXPrior)
	else
	{ 	// need to manually set these for the hardcoded data below
		addressTXPrior = '6035 W Last Chance Ln'.toUpperCase()
		cityTXPrior = 'Dunnellon'.toUpperCase()
		stateTXPrior = 'TX'
		zipTXPrior = 34433
		randomFirstNameForInterest = "JOHN"
	
	}
	
	// hardcode for claims
	if (realAPlusClaimReport) {
		
		randomFirstName = ('claud').toUpperCase()
		randomLastName = ('summers').toUpperCase()
		addressTX = ('4245 ARCHDALE DR').toUpperCase()
		cityTX = ('CORPUS CHRISTI').toUpperCase()
		stateTX = 'TX'
		zipTX = 78416
		/*
		randomFirstName = 'Lillie'.toUpperCase()	
		randomLastName = 'Green'.toUpperCase()	
		addressTX = '1139 Riverscape St'.toUpperCase()
		cityTX = 'Bradenton'.toUpperCase()
		stateTX = 'TX'
		zipTX = 34208 
		*/
		/* second claim test case
		randomFirstName = ('Corine').toUpperCase()
		randomLastName = ('Green').toUpperCase()
		addressTX = ('1139 Riverscape St').toUpperCase()
		cityTX = ('Bradenton').toUpperCase()
		stateTX = 'TX'
		zipTX = 34208
		*/
	}
	
	//hardcode for Credit
	if (realTransunionCreditReport) {
		randomLastName = 'Kim'.toUpperCase()	
		randomFirstName = 'Mirian'.toUpperCase()
		addressTX = '1716 Cherry Ln'.toUpperCase()	
		cityTX = 'Lakeland'.toUpperCase()
		stateTX = 'FL'
		zipTX = 33811
	}
	
	//hardcode for Address
	if (manualNameAddress) {
		// Jacksonville allows sinkhole coverage, jacksonville is Duval, has restrictions, defect 1432 has details		
		/*randomFirstName = 'protection'.toUpperCase()
		randomLastName = 'class-10'.toUpperCase()		
		addressTX = '1156 RABBIT RUN'.toUpperCase()		
		cityTX = 'CORPUS CHRISTI'.toUpperCase()
		stateTX = 'TX'
		zipTX = 78415
		*/
		/*
		randomFirstName = 'protection'.toUpperCase()
		randomLastName = 'class-10'.toUpperCase()
		addressTX = '13417 SILVER EGRET LANE'.toUpperCase()
		cityTX = 'Texas City'.toUpperCase()
		stateTX = 'TX'
		zipTX = 77510		*/
		
		randomFirstName = 'andrea'.toUpperCase()
		randomLastName = 'bledey'.toUpperCase()
		addressTX = '404 WARWICK ST'.toUpperCase()
		cityTX = 'Galveston'.toUpperCase()
		stateTX = 'TX'
		zipTX = 77551
		
	}
	
	if (closedZip) {
		
		randomFirstName = 'closed'.toUpperCase()
		randomLastName = 'zippy'.toUpperCase()
		addressTX = '5303 Jackwood St'.toUpperCase()
		cityTX = 'Houston'.toUpperCase()
		stateTX = 'TX'
		zipTX = 77096
		
	}
		
	//def nameAddressData = [name: "Jerry", age: 42, city: "New York"]
	def nameAddressData = ['randomFirstName': randomFirstName, 
		'randomLastName': randomLastName,
		'randomFirstNameForInterest': randomFirstNameForInterest,
		'addressTX': addressTX,
		'cityTX': cityTX,
		'stateTX': stateTX,
		'zipTX': zipTX 	/*,
		'addressTXPrior': addressTXPrior,
		'cityTXPrior': cityTXPrior,
		'stateTXPrior': stateTXPrior,
		'zipTXPrior': zipTXPrior	*/	
		]
		
	WebUI.comment(nameAddressData['randomFirstName'])
	//System.exit(0)
	return nameAddressData
	
	
	
	

	
	
	
	
	
	