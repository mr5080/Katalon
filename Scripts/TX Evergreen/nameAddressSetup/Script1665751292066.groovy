import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



if(manualAddress == 'manual')	// set to something I want
{
	def nameAddressData = ['randomFirstName': 'Gramble',
		'randomLastName': 'Ovid',
			'addressTX': '3900 Broadway Ste A, ',
			'cityTX': 'San Antonio',
			'stateTX': 'TX',
			'zipTX': '78209'
		]
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
		
		/* another PC10
		 * 
		  	33204 LAGO VIEJO DR
			LA FERIA, TX 78559
		 */		
	}	


else if(manualAddress == 'claim')
{
	int randomClaim = 1 + ((Math.random() * ((7 - 1) + 1)) as int)
	randomClaim = 7
	if(randomClaim == 1)
	{
	// this is good one, returns 3 claims
		def nameAddressData = ['randomFirstName': 'Chris',	// this is a valid TX claim address with no validations!!!!!!!!!!!!!!
			'randomLastName': 'Boyen',
			'addressTX': '1931 Chandler Ln',
			'cityTX': 'Arlington',
			'stateTX': 'TX',
			'zipTX': '76014'
			]
			return nameAddressData
	}
	else if(randomClaim == 2)		// this is a valid TX claim address with no validations!!!!!!!!!!!!!!
	{
	// this is good one, returns 3 claims
		def nameAddressData = ['randomFirstName': 'Jemmy',
			'randomLastName': 'Clayborn',
			'addressTX': '18 Laguna Rd',
			'cityTX': 'Montgomery',
			'stateTX': 'TX',
			'zipTX': '77356'
			]
			return nameAddressData
	}		
	else if(randomClaim == 3)
	{	
		def nameAddressData = ['randomFirstName': 'Ray', // 1 claim
			'randomLastName': 'Hinkins',
			'addressTX': '1381 Lakeview Dr',
			'cityTX': 'Southlake',
			'stateTX': 'TX',
			'zipTX': '76092'
			]
			return nameAddressData
	
	}
	else if(randomClaim == 4)
	{	
		def nameAddressData = ['randomFirstName': 'Pearl',	
			'randomLastName': 'Dettmar',
			'addressTX': '15205 Verela Dr',
			'cityTX': 'Austin',
			'stateTX': 'TX',
			'zipTX': '78725'
			]
		return nameAddressData
	}
	else if(randomClaim == 5)
	{	
		def nameAddressData = ['randomFirstName': 'Tracy',	
			'randomLastName': 'Bennison',
			'addressTX': '3107 Ivy Falls Dr',
			'cityTX': 'Houston',
			'stateTX': 'TX',
			'zipTX': '77068'
			]
	return nameAddressData
	}
	else if(randomClaim == 6)
	{
		def nameAddressData = ['randomFirstName': 'Brinna',	
			'randomLastName': 'Lean',
			'addressTX': '3519 Imperial Ave',
			'cityTX': 'Midland',
			'stateTX': 'TX',
			'zipTX': '79707'
			]
			return nameAddressData
	}
	
	else if(randomClaim == 7)
	{
	// this is good one, returns 3 claims
		def nameAddressData = ['randomFirstName': 'Doralin',	
			'randomLastName': 'Cowdry',
			'addressTX': '11919 Waterdance Ln',
			'cityTX': 'Houston',
			'stateTX': 'TX',
			'zipTX': '77095'
			]
		return nameAddressData
	}
}
	

else if(manualAddress == 'creditReport')  //Cypress TrueRisk Propery Test Cases - State - TX    ---   TRANSUNION --- 03.23.2022.xlsx  good as of 8.11.25
{
	int randomCredit = 1 + ((Math.random() * ((3 - 1) + 1)) as int)
	//randomCredit = 3
	if(randomCredit == 1)
	{
		def nameAddressData = ['randomFirstName': 'Billy',
			'randomLastName': 'Anglin',
			'addressTX': '72 Rugged',
			'cityTX': 'Corpus Christi',
			'stateTX': 'TX',
			'zipTX': '78413'
			]
			return nameAddressData
	}
	else if(randomCredit == 2)
	{
		def nameAddressData = ['randomFirstName': 'Manuel',
			'randomLastName': 'ARINMENDI',
			'addressTX': '3535 DALLAS',
			'cityTX': 'Houston',
			'stateTX': 'TX',
			'zipTX': '77019'
			]
			return nameAddressData
	}
	else if(randomCredit == 3)
	{
		def nameAddressData = ['randomFirstName': 'Amir',
			'randomLastName': 'Assar',
			'addressTX': '3450 One Allen',
			'cityTX': 'Houston',
			'stateTX': 'TX',
			'zipTX': '77002'
			]
			return nameAddressData
	}
}


Object addressData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Users\\JohnHughes\\OneDrive - CORNERSTONE OPERATIONS GROUP\\ProjectFiles\\CypressData.xlsx', 'TX Addresses', true)
// random num between 2 - 500 (first line in excel file is a header)
int randomTXaddress = 2 + ((Math.random() * ((210 - 2) + 1)) as int)

// override randomness to specifiy address in file to use
//randomTXaddress = 510
System.out.println(randomTXaddress)
	
// Risk Adddress
// minus 1 because first line is header in excel file
addressTX = addressData.getValue(1, randomTXaddress - 1).toUpperCase()
cityTX = addressData.getValue(2, randomTXaddress - 1).toUpperCase()
stateTX = addressData.getValue(3, randomTXaddress - 1).toUpperCase()
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
	'stateTX': stateTX,
	'zipTX': zipTX
	]
	
//WebUI.comment(nameAddressData['randomFirstName'])
//System.exit(0)
return nameAddressData
