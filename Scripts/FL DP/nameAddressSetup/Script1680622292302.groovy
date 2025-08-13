import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



//System.out.println("counter passed in = " + counter)


if(manualAddress == 'manual')	// set to something I want
	{
		def nameAddressData = ['randomFirstName': 'MANNI',
			'randomLastName': 'EMANUALA',
				'addressFL': '5714 BRAIT AVE',
				'cityFL': 'JACKSONVILLE',
				'stateFL': 'FL',
				'zipFL': '32209'
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
			'stateFL': 'FL',
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
			'stateFL': 'FL',
			'zipFL': '32344'
			]
		return nameAddressData
		
		// returns split Protection Class
/*		def nameAddressData = ['randomFirstName': 'MANNI',
			'randomLastName': 'SPLITTY',
				'addressFL': '781 N LINCOLN CT',
				'cityFL': 'JACKSONVILLE',
				'stateFL': 'FL',
				'zipFL': '32209'
			]
		return nameAddressData
*/	}	

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
			'stateFL': 'FL',
			'zipFL': '34236'
			]
		return nameAddressData
	}
else if(manualAddress == 'creditReport')
	{
		def nameAddressData = ['randomFirstName': 'LORI',    // new 4.15.2025 COG06918, data is returned, but the credit score will not match 00V77 column is not on the new data
			'randomLastName': 'Oberman',
			'addressFL': '1425 E Mulberry Dr',
			'cityFL': 'Tampa',
			'stateFL': 'FL',
			'zipFL': '33604'
			]
		
	/*
			def nameAddressData = ['randomFirstName': 'Avel',    // new 4.15.2025 COG06918
			'randomLastName': 'Maqueda',
			'addressFL': '2220 NE 59th PL',
			'cityFL': 'Ocala',
			'stateFL': 'FL',
			'zipFL': '34479'
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


// manualAddress  not set, uses random below
//Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\john.hughes\\Documents\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
	
	Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'FL Addresses', true)
//	C:\Users\JohnHughes\OneDrive - Cypress Property and Casualty Insurance Company\ProjectFiles\CypressData.xlsx
// random num between 2 - 500 (first line in excel file is a header)
int randomFLaddress = 2 + ((Math.random() * ((250 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomFLaddress = counter	// uncomment this to use the exel file and look though it
System.out.println(randomFLaddress)
	
// Risk Adddress
// minus 1 because first line is header in excel file
addressFL = addressData.getValue(1, randomFLaddress - 1).toUpperCase()
cityFL = addressData.getValue(2, randomFLaddress - 1).toUpperCase()
stateFL = addressData.getValue(3, randomFLaddress - 1).toUpperCase()
zipFL = addressData.getValue(4, randomFLaddress - 1)
countyFL = addressData.getValue(5, randomFLaddress - 1)
yearOfConstFL = addressData.getValue(7, randomFLaddress - 1)	// if not found, will return randomly the street address...

Object firstNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'FirstName', false)
int randomFirstNameRow = 1 + ((Math.random() * ((1000 - 1) + 1)) as int)
System.out.println(randomFirstNameRow)
randomFirstName = firstNameData.getValue(1, randomFirstNameRow)
System.out.println('randomFirstName  =====    ' + randomFirstName)
randomFirstName = randomFirstName.replaceAll('[\\d.]', '')

// Last name from excel file
Object lastNameData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'LastName', false)
int randomLastNameRow = 1 + ((Math.random() * ((1000 - 1) + 1)) as int)
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
	
	,'countyFL': countyFL	// uncomment to loop through capacity excel file
	,'yearOfConstFL': yearOfConstFL	// uncomment to loop through capacity excel file
	]
	
//WebUI.comment(nameAddressData['randomFirstName'])
//System.exit(0)
return nameAddressData
