import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



if(manualAddress == 'manual')	// set to something I want
{
	def nameAddressData = ['randomFirstName': 'Mani',
		'randomLastName': 'Marson',
			'addressTX': '315 W 7TH ST',
			'cityTX': 'Freeport',
			'state': 'TX',
			'zipTX': '77541'
		]
	return nameAddressData	
}	

else if(manualAddress == 'PC10')	// address returns PC10
	{
		def nameAddressData = ['randomFirstName': 'Procy',
			'randomLastName': 'Tens',
			'addressTX': '1362 E CREEKVIEW DR',
			'cityTX': 'SALADO',
			'state': 'TX',
			'zipTX': '76571'
			]
		return nameAddressData
	}	

else if(manualAddress == 'truerisk')
{
	
	def nameAddressData = ['randomFirstName': 'King',
			'randomLastName': 'Kimley',
			'addressTX': '1201 DULLES AV',
			'cityTX': 'STAFFORD',
			'state': 'TX',
			'zipTX': '77477'
			]
		return nameAddressData
	/*
	def nameAddressData = ['randomFirstName': 'Victoria',
			'randomLastName': 'Alsip',
			'addressTX': '201 Yorkshire',
			'cityTX': 'Victoria',
			'state': 'TX',
			'zipTX': '77904'
			]
		return nameAddressData
	*/
}

else if(manualAddress == 'seacoast1')	
	{
		def nameAddressData = ['randomFirstName': 'Sea',
			'randomLastName': 'Coasty1',
			'addressTX': '1415 SANTA ANA AVE',
			'cityTX': 'RANCHO VIEJO',
			'state': 'TX',
			'zipTX': '78575'
			]
		return nameAddressData
	}

else if(manualAddress == 'seacoast2')
{
	def nameAddressData = ['randomFirstName': 'Sea',
		'randomLastName': 'Coasty2',
		'addressTX': '1110 Pine St',
		'cityTX': 'VICTORIA',
		'state': 'TX',
		'zipTX': '77901'
		]
	return nameAddressData
}

else if(manualAddress == 'tier3')
{
	def nameAddressData = ['randomFirstName': 'Tired',
		'randomLastName': 'Tier3',
		'addressTX': '23397 RICHARDS RD',
		'cityTX': 'HEMPSTEAD',
		'state': 'TX',
		'zipTX': '77445'
		]
	return nameAddressData
}
else if(manualAddress == 'dfw')
{
	def nameAddressData = ['randomFirstName': 'Dallas',
		'randomLastName': 'Dumbo',
		'addressTX': '808 CROSS LN',
		'cityTX': 'SOUTHLAKE',
		'state': 'TX',
		'zipTX': '76092'
		]
	return nameAddressData
}
else if(manualAddress == 'panhandle')
{
	def nameAddressData = ['randomFirstName': 'Pan',
		'randomLastName': 'Handler',
		'addressTX': '1005 TURNER ST',
		'cityTX': 'VERNON',
		'state': 'TX',
		'zipTX': '76384'
		]
	return nameAddressData
}
else if(manualAddress == 'remainder')
{
	def nameAddressData = ['randomFirstName': 'Remi',
		'randomLastName': 'Remainder',
		'addressTX': '100 KENDRA',
		'cityTX': 'CANYON LAKE',
		'state': 'TX',
		'zipTX': '78133'
		]
	return nameAddressData
}


else if(manualAddress == 'claims')
{
	// fill in eventually
}
	


//Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - Cypress Property and Casualty Insurance Company\\ProjectFiles\\CypressData.xlsx', 'TX Addresses', true)
Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'TX Addresses', true)
// random num between 2 - 500 (first line in excel file is a header)
int randomTXaddress = 2 + ((Math.random() * ((310 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomTXaddress = 510
System.out.println(randomTXaddress)
	
// Risk Adddress
// minus 1 because first line is header in excel file
addressTX = addressData.getValue(1, randomTXaddress - 1).toUpperCase()
cityTX = addressData.getValue(2, randomTXaddress - 1).toUpperCase()
state = addressData.getValue(3, randomTXaddress - 1).toUpperCase()
zipTX = addressData.getValue(4, randomTXaddress - 1)

Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
int randomFirstNameRow = 1 + ((Math.random() * ((835 - 1) + 1)) as int)
System.out.println(randomFirstNameRow)
randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
System.out.println('randomFirstName  =====    ' + randomFirstName)
randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
int randomLastNameRow = 1 + ((Math.random() * ((800 - 1) + 1)) as int)
//String randomLastName = lastNameData.getValue(1, randomLastNameRow).replaceAll("\\d","")
randomLastName = lastNameData.getValue(1, randomLastNameRow)
// removes any numbers from last name
randomLastName = randomLastName.replaceAll('[\\d.]', '')


//def nameAddressData = [name: "Jerry", age: 42, city: "New York"]
def nameAddressData = ['randomFirstName': randomFirstName,
	'randomLastName': randomLastName,
	'addressTX': addressTX,
	'cityTX': cityTX,
	'state': state,
	'zipTX': zipTX
	]
	
//WebUI.comment(nameAddressData['randomFirstName'])
//System.exit(0)
return nameAddressData
