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
	// Read in FL address from excel file, true mean the first line consider as a header.
		Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
		
		// random num between 2 - 500 (first line in excel file is a header)
		int randomFLaddress = 2 + ((Math.random() * ((220 - 2) + 1)) as int)
		
		// override randomness to specifiy address in file to use
		//randomFLaddress = 510 // 105 causes address correction to pop, 130 WEST PALM BEACH CO
		System.out.println(randomFLaddress)
			
		int randomFLaddressPrior = 2 + ((Math.random() * ((120 - 2) + 1)) as int)
		
		System.out.println(randomFLaddressPrior)
		
		// Risk Adddress
		// minus 1 because first line is header in excel file
		addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()
		
		cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()
		
		stateFL = addressData.getValue(3, randomFLaddress - 1).toUpperCase()
		
		zipFL = addressData.getValue(4, randomFLaddress - 1)
		
		// Prior Address, only used if Year Construction < 3 from current year
		addressFLPrior = addressData.getValue(1, randomFLaddressPrior - 1).toUpperCase()
		
		cityFLPrior = addressData.getValue(2, randomFLaddressPrior - 1).toUpperCase()
		
		stateFLPrior = addressData.getValue(3, randomFLaddressPrior - 1).toUpperCase()
		
		zipFLPrior = addressData.getValue(4, randomFLaddressPrior - 1)
		
		Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
		
		int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
		
		System.out.println(randomFirstNameRow)
		
		 randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
		
		System.out.println('randomFirstName  =====    ' + randomFirstName)
		
		 randomFirstNameForInterest = firstNameData.getValue(1, randomFirstNameRow - 1)
		
		randomFirstName = randomFirstName.replaceAll('[\\d.]', '')
		
		randomFirstNameForInterest = randomFirstNameForInterest.replaceAll('[\\d.]', '')
		
		System.out.println((((((addressFLPrior + ' ') + cityFLPrior) + ' ') + stateFLPrior) + ' ') + zipFLPrior)
		
		// Last name from excel file
		Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
		
		int randomLastNameRow = 1 + ((Math.random() * ((800 - 1) + 1)) as int)
		
		//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
		 randomLastName = lastNameData.getValue(1, randomLastNameRow)
		
		// removes any numbers from last name
		randomLastName = randomLastName.replaceAll('[\\d.]', '')
	
	} // end if
	//System.out.println((((((addressFLPrior + ' ') + cityFLPrior) + ' ') + stateFLPrior) + ' ') + zipFLPrior)
	else
	{ 	// need to manually set these for the hardcoded data below
		addressFLPrior = '6035 W Last Chance Ln'.toUpperCase()
		cityFLPrior = 'Dunnellon'.toUpperCase()
		stateFLPrior = 'FL'
		zipFLPrior = 34433
		randomFirstNameForInterest = "JOHN"
	
	}
	
	// hardcode for claims
	if (realAPlusClaimReport) {
		
		randomFirstName = ('Amal').toUpperCase()
		randomLastName = ('Owens').toUpperCase()
		addressFL = ('4183 Orchid Dr').toUpperCase()
		cityFL = ('Hernando Beach').toUpperCase()
		stateFL = 'FL'
		zipFL = 34607
		/*
		randomFirstName = 'Lillie'.toUpperCase()	
		randomLastName = 'Green'.toUpperCase()	
		addressFL = '1139 Riverscape St'.toUpperCase()
		cityFL = 'Bradenton'.toUpperCase()
		stateFL = 'FL'
		zipFL = 34208 
		*/
		/* second claim test case
		randomFirstName = ('Corine').toUpperCase()
		randomLastName = ('Green').toUpperCase()
		addressFL = ('1139 Riverscape St').toUpperCase()
		cityFL = ('Bradenton').toUpperCase()
		stateFL = 'FL'
		zipFL = 34208
		*/
	}
	
	//hardcode for Credit
	if (realTransunionCreditReport) {
		randomLastName = 'Kim'.toUpperCase()	
		randomFirstName = 'Mirian'.toUpperCase()
		addressFL = '1716 Cherry Ln'.toUpperCase()	
		cityFL = 'Lakeland'.toUpperCase()
		stateFL = 'FL'
		zipFL = 33811
	}
	
	//hardcode for Address
	if (manualNameAddress) 
	{
		// Jacksonville allows sinkhole coverage, jacksonville is Duval, has restrictions, defect 1432 has details		
	/*	randomFirstName = 'protection'.toUpperCase()
		randomLastName = 'class-10'.toUpperCase()		
		addressFL = '5371 CYPRESS LINKS BLVD'.toUpperCase()		
		cityFL = 'ELKTON'.toUpperCase()
		stateFL = 'TX'
		zipFL = 32033
	*/	
		/*
		randomFirstName = 'WBDR'.toUpperCase()
		randomLastName = 'Yes'.toUpperCase()
		addressFL = '3304 N JEFFERSON ST'.toUpperCase()
		cityFL = 'Tampa'.toUpperCase()
		stateFL = 'FL'
		zipFL = 33603
		*/
		
	
		
		randomFirstName = 'three'.toUpperCase()
		randomLastName = 'sixty'.toUpperCase()
		addressFL = '10331 AUTUMN BREEZE DR 201'.toUpperCase()
		cityFL = 'BONITA SPRINGS'.toUpperCase()
		stateFL = 'FL'
		zipFL = 34135
		
	}
		
	//def nameAddressData = [name: "Jerry", age: 42, city: "New York"]
	def nameAddressData = ['randomFirstName': randomFirstName, 
		'randomLastName': randomLastName,
		'randomFirstNameForInterest': randomFirstNameForInterest,
		'addressFL': addressFL,
		'cityFL': cityFL,
		'stateFL': stateFL,
		'zipFL': zipFL,
		'addressFLPrior': addressFLPrior,
		'cityFLPrior': cityFLPrior,
		'stateFLPrior': stateFLPrior,
		'zipFLPrior': zipFLPrior		
		]
		
	WebUI.comment(nameAddressData['randomFirstName'])
	//System.exit(0)
	return nameAddressData
	
	
	
	

	
	
	
	
	
	