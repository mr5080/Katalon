import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



//System.out.println("counter passed in = " + counter)

System.out.println("manualAddress(from childTestCase) = " + manualAddress)


if(manualAddress == 'manual')	// set to something I want
{
	def nameAddressData = ['randomFirstName': 'MANNI',
		'randomLastName': 'EMANUALA',
			'addressFL': '825 SCENIC GULF DR',
			'cityFL': 'MIRAMAR BEACH',
			'state': 'FL',
			'zipFL': '32550'
		]	
	return nameAddressData
}
	
	
else if(manualAddress == 'geocode')	// set to something I want
{
	// returns split Protection Class
	def nameAddressData = ['randomFirstName': 'MANNI',
		'randomLastName': 'EMANUALA',
			'addressFL': '16588 Kenneth Hutcherson Mem Dr',
			'cityFL': 'White Springs',
			'state': 'FL',
			'zipFL': '32096'
		]

	// actually a lightspeed address for testing the buttons Application/Lightspeed
/*	def nameAddressData = ['randomFirstName': 'LARRY',
			'randomLastName': 'LIGHTY',
			'addressAZ': '21 E SPEEDWAY BLVD',
			'cityAZ': 'TUCSON',
			'stateAZ': 'AZ',
			'zipAZ': '85705'
			]
*/			
		return nameAddressData	
}	

else if(manualAddress == 'PC10')	// address returns PC10
{
	def nameAddressData = ['randomFirstName': 'Procy',
		'randomLastName': 'Tens',
		'addressFL': '20 BIRDWELL RD',
		'cityFL': 'MONTICELLO',
		'state': 'FL',
		'zipFL': '32344'
		]
	return nameAddressData
	
	// returns split Protection Class
/*		def nameAddressData = ['randomFirstName': 'MANNI',
			'randomLastName': 'SPLITTY',
				'addressFL': '781 N LINCOLN CT',
				'cityFL': 'JACKSONVILLE',
				'state': 'FL',
				'zipFL': '32209'
			]
		return nameAddressData
*/	
}	

else if(manualAddress == 'truerisk')
{
	def nameAddressData = ['randomFirstName': 'Victoria',
			'randomLastName': 'Alsip',
			'addressTX': '201 Yorkshire',
			'cityTX': 'Victoria',
			'stateTX': 'TX',
			'zipTX': '77904'
			]
		return nameAddressData
}
else if(manualAddress == 'aplus')
{
	def nameAddressData = ['randomFirstName': 'JORI',
			'randomLastName': 'PORCHER',
			'addressFL': '3850 VICKERS LAKE DR',
			'cityFL': 'JACKSONVILLE',
			'state': 'FL',
			'zipFL': '32224'
			]
		return nameAddressData
}
	
//C:\Users\john.hughes\CORNERSTONE OPERATIONS GROUP\Cannabis - Documents\Product Startup\Product Development\Approved for COG\Third Party\Verisk\LightSpeed
else if(manualAddress == 'lightspeed')
{
	def nameAddressData = ['randomFirstName': 'LIGHTY',
			'randomLastName': 'LIGHTERS',
			'addressAZ': '124 S MONTEZUMA ST',
			'cityAZ': 'PRESCOTT',
			'stateAZ': 'AZ',
			'zipAZ': '86303'
			]
			
/*	def nameAddressData = ['randomFirstName': 'LARRY',
		'randomLastName': 'LIGHTY',
		'addressAZ': '21 E SPEEDWAY BLVD',
		'cityAZ': 'TUCSON',
		'stateAZ': 'AZ',
		'zipAZ': '85705'
		]	
/*
	def nameAddressData = ['randomFirstName': 'LARRY',
		'randomLastName': 'LIGHTY',
		'addressAZ': '10261 N SCOTTSDALE RD',
		'cityAZ': 'SCOTTSDALE',
		'stateAZ': 'AZ',
		'zipAZ': '85253'
		]
*/		
	return nameAddressData
		
}
	
	
else if(manualAddress == 'highCrime')
{
	def nameAddressData = ['randomFirstName': 'HIGH',
			'randomLastName': 'CRIMER',
			'addressFL': '630 GOODRICH AVE',
			'cityFL': 'SARASOTA',
			'state': 'FL',
			'zipFL': '34236'
			]
		System.out.println('got into highCrime else if')
			
		return nameAddressData
	}

else if(manualAddress == 'inland')
{
	def nameAddressData = ['randomFirstName': 'In',
			'randomLastName': 'Lander',
			'addressFL': '1314 PREAKNESS PT',
			'cityFL': 'TALLAHASSEE',
			'state': 'FL',
			'zipFL': '32308'
			]
		System.out.println('got into inland else if')
			
		return nameAddressData
}

else if(manualAddress == 'coastal')
{
	def nameAddressData = ['randomFirstName': 'On',
			'randomLastName': 'Coastal',
			'addressFL': '825 SCENIC GULF DR',
			'cityFL': 'MIRAMAR BEACH',
			'state': 'FL',
			'zipFL': '32550'
			]
		System.out.println('got into coastal else if')
			
		return nameAddressData
}
		
	
	
// manualAddress  not set, uses random below
//Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
	
	Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
//	C:\Users\JohnHughes\OneDrive - Cypress Property and Casualty Insurance Company\ProjectFiles\CypressData.xlsx
// random num between 2 - 500 (first line in excel file is a header)
int randomFLaddress = 2 + ((Math.random() * ((126 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomFLaddress = counter	// uncomment this to use the exel file and look though it
System.out.println(randomFLaddress)
	
// Risk Adddress
// minus 1 because first line is header in excel file
addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()
cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()
state = addressData.getValue(3, randomFLaddress - 1).toUpperCase()
zipFL = addressData.getValue(4, randomFLaddress - 1)
countyFL = addressData.getValue(5, randomFLaddress - 1)
yearOfConstFL = addressData.getValue(7, randomFLaddress - 1)	// if not found, will return randomly the street address...

Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
System.out.println(randomFirstNameRow)
randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
System.out.println('randomFirstName  =====    ' + randomFirstName)
randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
int randomLastNameRow = 1 + ((Math.random() * ((800 - 1) + 1)) as int)
//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
randomLastName = lastNameData.getValue(1, randomLastNameRow)
// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')





//def nameAddressData = [name: "Jerry", age: 42, city: "New York"]
def nameAddressData = ['randomFirstName': randomFirstName,
	'randomLastName': randomLastName,
	'addressFL': addressFL,
	'cityFL': cityFL,
	'state': state,
	'zipFL': zipFL
	
	,'countyFL': countyFL	// uncomment to loop through capacity excel file
	,'yearOfConstFL': yearOfConstFL	// uncomment to loop through capacity excel file
	]
	
//WebUI.comment(nameAddressData['randomFirstName'])
//System.exit(0)
return nameAddressData
