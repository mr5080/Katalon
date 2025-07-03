import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



if(manualAddress == 'manual')	// set to something I want
{
	def nameAddressData = ['randomFirstName': 'manny',
		'randomLastName': 'Pored',
			'addressFL': '1820 Greenhill Dr',
			'cityFL': 'Clearwater',
			'stateFL': 'FL',
			'zipFL': '33755'
		]
	return nameAddressData
}

else if(manualAddress == 'PC10')	// address returns PC10
{
		def nameAddressData = ['randomFirstName': 'Procy',
			'randomLastName': 'Tens',
			'addressFL': '7451 NW DEYSBROOK LN',
			'cityFL': 'PORT ST LUCIE',
			'stateFL': 'FL',
			'zipFL': '34987'
			]			
		return nameAddressData
		
		/* another PC10
		 *
			  33204 LAGO VIEJO DR
			LA FERIA, FL 78559
			
			7451 NW DEYSBROOK LN
			PORT ST LUCIE, FL 34987
			
		 */
}

else if(manualAddress == 'truerisk')
{
	def nameAddressData = ['randomFirstName': 'Michael',
			'randomLastName': 'THATE',
			'addressFL': '1201 DULLES AVE',
			'cityFL': 'STAFFORD',
			'stateFL': 'FL',
			'zipFL': '77477'
			]
		return nameAddressData
	/*
	def nameAddressData = ['randomFirstName': 'Victoria',
			'randomLastName': 'Alsip',
			'addressFL': '201 Yorkshire',
			'cityFL': 'Victoria',
			'stateFL': 'FL',
			'zipFL': '77904'
			]
		return nameAddressData
	*/
}
else if(manualAddress == 'claim')
{
	int randomClaim = 1 + ((Math.random() * ((7 - 1) + 1)) as int)
	if(randomClaim == 1)
	{	
		def nameAddressData = ['randomFirstName': 'Filmore', // 1 claim
			'randomLastName': 'Shevels',
			'addressFL': '12108 Bayonne St',
			'cityFL': 'Jacksonville',
			'stateFL': 'FL',
			'zipFL': '32224'
			]
			return nameAddressData
	
	}
	else if(randomClaim == 2)
	{	
		def nameAddressData = ['randomFirstName': 'Christal',	// 1 claim - only 2 counts SMOKE WATER HAIL - Claim types WIND, HAIL, LIGHT, WEATHER & FLOOD are excluded when determining number of claims from Property Report
			'randomLastName': 'Grishankov',
			'addressFL': '3676 Casitas Dr',
			'cityFL': 'Jacksonville',
			'stateFL': 'FL',
			'zipFL': '32224'
			]
		return nameAddressData
	}
	else if(randomClaim == 2)
	{	
		def nameAddressData = ['randomFirstName': 'Jori',	// 3 claims - only 1 counts HAIL WIND SMOKE - Claim types WIND, HAIL, LIGHT, WEATHER & FLOOD are excluded when determining number of claims from Property Report
			'randomLastName': 'Porcher',
			'addressFL': '3850 Vickers Lake Dr',
			'cityFL': 'Jacksonville',
			'stateFL': 'FL',
			'zipFL': '32224'
			]
	return nameAddressData
	}
	else if(randomClaim == 3)
	{
		def nameAddressData = ['randomFirstName': 'Stace',	// 3 claims - only 2 counts WIND RIOT ROBBERY  - Claim types WIND, HAIL, LIGHT, WEATHER & FLOOD are excluded when determining number of claims from Property Report
			'randomLastName': 'Pally',
			'addressFL': '3682 Casitas Dr',
			'cityFL': 'Jacksonville',
			'stateFL': 'FL',
			'zipFL': '32224'
			]
			return nameAddressData
	}
	else if(randomClaim == 4)
	{	
	// this is good one, returns 3 claims
		def nameAddressData = ['randomFirstName': 'Lynelle',	// 3 claims - 3 counts ID, GLASS, SMOKE  - Claim types WIND, HAIL, LIGHT, WEATHER & FLOOD are excluded when determining number of claims from Property Report
			'randomLastName': 'Sonnenschein',
			'addressFL': '16307 Baycross Dr',
			'cityFL': 'Lakewood Ranch',
			'stateFL': 'FL',
			'zipFL': '34202'
			]
	return nameAddressData
	}
	else if(randomClaim == 5)
	{
	// this is good one, returns 3 claims
		def nameAddressData = ['randomFirstName': 'Aggi',	// 3 claims - 3 counts ice, fire, sink  - Claim types WIND, HAIL, LIGHT, WEATHER & FLOOD are excluded when determining number of claims from Property Report
			'randomLastName': 'Alger',
			'addressFL': '2630 Interlock Dr',
			'cityFL': 'Kissimmee',
			'stateFL': 'FL',
			'zipFL': '34741'
			]
			return nameAddressData
	}
	else if(randomClaim == 6)
	{
	// this is good one, returns 3 claims
		def nameAddressData = ['randomFirstName': 'Stella',	// 3 claims - 3 counts ice, fire, sink  - Claim types WIND, HAIL, LIGHT, WEATHER & FLOOD are excluded when determining number of claims from Property Report
			'randomLastName': 'Forman',
			'addressFL': '3371 Wellington Rd',
			'cityFL': 'Pensacola',
			'stateFL': 'FL',
			'zipFL': '32504'
			]
		return nameAddressData
	}
	//return nameAddressData
}	

	
else if(manualAddress == 'creditReport')
{
/*	def nameAddressData = ['randomFirstName': 'LORI',    // new 4.15.2025 COG06918, data is returned, but the credit score will not match 00V77 column is not on the new data
		'randomLastName': 'Oberman',
		'addressFL': '1425 E Mulberry Dr',
		'cityFL': 'Tampa',
		'stateFL': 'FL',
		'zipFL': '33604'
		]
*/	
	
		def nameAddressData = ['randomFirstName': 'Avel',    // new 4.15.2025 COG06918
		'randomLastName': 'Maqueda',
		'addressFL': '2220 NE 59th PL',
		'cityFL': 'Ocala',
		'stateFL': 'FL',
		'zipFL': '34479'
		]
/*	def nameAddressData = ['randomFirstName': 'Kim',
			'randomLastName': 'Mirian',
			'addressFL': '1716 Cherry Ln',
			'cityFL': 'Lakeland',
			'stateFL': 'FL',
			'zipFL': '33811'
			]
*/			
	/*
		randomLastName = 'Kim'.toUpperCase()	
		randomFirstName = 'Mirian'.toUpperCase()
		addressFL = '1716 Cherry Ln'.toUpperCase()	
		cityFL = 'Lakeland'.toUpperCase()
		stateFL = 'FL'
		zipFL = 33811
	 */
		return nameAddressData
}


Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
// random num between 2 - 500 (first line in excel file is a header)
int randomFLaddress = 2 + ((Math.random() * ((660 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomFLaddress = 510
System.out.println(randomFLaddress)
	
// Risk Adddress
// minus 1 because first line is header in excel file
addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()
cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()
stateFL = addressData.getValue(3, randomFLaddress - 1).toUpperCase()
zipFL = addressData.getValue(4, randomFLaddress - 1)

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
	'addressFL': addressFL,
	'cityFL': cityFL,
	'stateFL': stateFL,
	'zipFL': zipFL
	]
	
//WebUI.comment(nameAddressData['randomFirstName'])
//System.exit(0)
return nameAddressData
