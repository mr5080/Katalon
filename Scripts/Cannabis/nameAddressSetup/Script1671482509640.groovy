import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



if(manualAddress == 'splitPC')	// address that returns split PC
{
	def nameAddressData = ['randomFirstName': 'SPLITTY',
		'randomLastName': 'MC SPLITSTER',
			'addressAZ': '5390 W INA RD',
			'cityAZ': 'TUCSON',
			'stateAZ': 'AZ',
			'zipAZ': '85743'
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

else if(manualAddress == 'manual')	// manual address
	{
		def nameAddressData = ['randomFirstName': 'MANNY',
			'randomLastName': 'MANNUALEL',
				'addressAZ': '5390 W INA RD',
				'cityAZ': 'TUCSON',
				'stateAZ': 'AZ',
				'zipAZ': '85743'
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
			'addressTX': '1362 E CREEKVIEW DR',
			'cityTX': 'SALADO',
			'stateTX': 'TX',
			'zipTX': '76571'
			]
		return nameAddressData
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
else if(manualAddress == 'claims')
{
	// fill in eventually
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


Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'AZ Addresses', true)
// random num between 2 - 500 (first line in excel file is a header)
int randomAZaddress = 2 + ((Math.random() * ((125 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomAZaddress = 510
System.out.println(randomAZaddress)
	
// Risk Adddress
// minus 1 because first line is header in excel file
addressAZ = addressData.getValue(1, randomAZaddress - 1).toUpperCase()
cityAZ = addressData.getValue(2, randomAZaddress - 1).toUpperCase()
stateAZ = addressData.getValue(3, randomAZaddress - 1).toUpperCase()
zipAZ = addressData.getValue(4, randomAZaddress - 1)

Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
System.out.println(randomFirstNameRow)
randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
System.out.println('randomFirstName  =====    ' + randomFirstName)
randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
int randomLastNameRow = 1 + ((Math.random() * ((800 - 1) + 1)) as int)
//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
randomLastName = lastNameData.getValue(1, randomLastNameRow)
// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')


//def nameAddressData = [name: "Jerry", age: 42, city: "New York"]
def nameAddressData = ['randomFirstName': randomFirstName,
	'randomLastName': randomLastName,
	'addressAZ': addressAZ,
	'cityAZ': cityAZ,
	'stateAZ': stateAZ,
	'zipAZ': zipAZ
	]
	
//WebUI.comment(nameAddressData['randomFirstName'])
//System.exit(0)
return nameAddressData
