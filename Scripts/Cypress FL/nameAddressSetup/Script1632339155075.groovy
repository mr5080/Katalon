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
	def nameAddressData = ['randomFirstName': 'Amal',
		'randomLastName': 'Owens',
		'addressFL': '4183 Orchid Dr',
		'cityFL': 'Hernando Beach',
		'stateFL': 'FL',
		'zipFL': '34607'
		]
	return nameAddressData
		
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
	
else if(manualAddress == 'creditReport')
{
	def nameAddressData = ['randomFirstName': 'Kim',
			'randomLastName': 'Mirian',
			'addressFL': '1716 Cherry Ln',
			'cityFL': 'Lakeland',
			'stateFL': 'FL',
			'zipFL': '33811'
			]
			
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
int randomFLaddress = 2 + ((Math.random() * ((210 - 2) + 1)) as int)

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
