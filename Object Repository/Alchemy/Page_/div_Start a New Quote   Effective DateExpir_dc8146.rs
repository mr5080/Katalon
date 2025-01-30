<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Start a New Quote   Effective DateExpir_dc8146</name>
   <tag></tag>
   <elementGuidId>820f4a96-6155-4d22-b9bb-d3bf0f2b0960</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#ISiLeftMenuContent</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='ISiLeftMenuContent']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>d7d42124-4fef-4178-8ff7-bb24bd337546</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>ISiLeftMenuContent</value>
      <webElementGuid>e1c20ac5-2e44-4dc3-bc40-135419199029</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>ISiBasicDiv</value>
      <webElementGuid>27da47e0-db50-4fdb-b776-6ff97a75d500</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
			
	Start a New Quote
	
		 
		
		 
		
		 
	
		
		
		

	
	
	

	

		
			Effective Date:
			
				
				Expires one year from Effective Date
			
		


		
			Risk State:
			
				
				
				✓
					
							ALABAMA
						
							ALASKA
						
							ARIZONA
						
							ARKANSAS
						
							COLORADO
						
							CONNECTICUT
						
							ILLINOIS
						
							MARYLAND
						
							MASSACHUSETTS
						
							MICHIGAN
						
							MISSOURI
						
							MONTANA
						
							NEVADA
						
							NEW JERSEY
						
							NEW MEXICO
						
							OHIO
						
							OKLAHOMA
						
							OREGON
						
							PENNSYLVANIA
						
							WASHINGTON
						
				
				
				
					
							ALABAMA
						
							ALASKA
						
							ARIZONA
						
							ARKANSAS
						
							COLORADO
						
							CONNECTICUT
						
							ILLINOIS
						
							MARYLAND
						
							MASSACHUSETTS
						
							MICHIGAN
						
							MISSOURI
						
							MONTANA
						
							NEVADA
						
							NEW JERSEY
						
							NEW MEXICO
						
							OHIO
						
							OKLAHOMA
						
							OREGON
						
							PENNSYLVANIA
						
							WASHINGTON
						
				
			
		


		
			Policy Type:
			
				
					
								Business Owners - Appointed Agent
							
								Business Owners - Direct
							
								Business Owners - Wholesale
							
				
			
		



				 
			
	
	
	
	
	

	
	
	
	
	
	
	

	
		Location Address:
		✓
	

	
		Ext Address:
		✓
	

	
		City:
		
			
				✓
			
		
	

	
		Location Zip Code:
		
		
			✓
		
	

	
	
		
	
		
				
			

	
	

			
				//	JAC 10/31/2016 once you change zip code and the user wants to use the first city in the drop down it will never be used
				//	unless we go through the UpdateZipcode function. triggerCityChange is called after zipcodehandler is called in the onchange attribute
				function triggerCityChange(){
					UpdateZipcode($('#ApplicantCityCB').val());
				};

				
				function refreshStartNewQuoteButton () {
					if( $('#PolicyTypeCode').length) {
						$(&quot;#PolicyTypeCode&quot;).trigger(&quot;change&quot;);
					}
				}
			
		
	
	
	
		// 20180122 - SRX11871 - COG AccessHome Geocoding
		// SRX23978 - Shared Environmental Client Identification
		setTimeout(function(){
			try {
				// SRX23978 - Shared Environmental Client Identification
				ProcessOverrideDisableGMGeocodeRequest(document.getElementById('PolicyTypeCode')[document.getElementById('PolicyTypeCode').selectedIndex].value,document.getElementById('VeriskSupportedPolicyTypeCodeList').value,'');
			} catch(err) { }
		},10);
	
	
		</value>
      <webElementGuid>633e52b6-b6bb-4e37-a816-c9525567282f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;ISiLeftMenuContent&quot;)</value>
      <webElementGuid>2f0b3322-d469-4ade-9232-ce4a6f8192e7</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/Alchemy/Page_/iframe_System FAQ_MainIS28test</value>
      <webElementGuid>597663a5-741f-4454-84c6-d5ca791acdd5</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='ISiLeftMenuContent']</value>
      <webElementGuid>145b4844-9932-440a-b7bb-054c0454d463</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='HELP'])[1]/following::div[1]</value>
      <webElementGuid>96bb4e1d-da6f-4d2b-9511-59c63d417dd2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='SEARCH'])[1]/following::div[1]</value>
      <webElementGuid>1afa59a8-4c78-4c61-bb31-af9c231d161b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]</value>
      <webElementGuid>6fb5b1c7-5e31-48c4-8cdc-6caa3758bbad</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'ISiLeftMenuContent' and (text() = concat(&quot;
			
	Start a New Quote
	
		 
		
		 
		
		 
	
		
		
		

	
	
	

	

		
			Effective Date:
			
				
				Expires one year from Effective Date
			
		


		
			Risk State:
			
				
				
				✓
					
							ALABAMA
						
							ALASKA
						
							ARIZONA
						
							ARKANSAS
						
							COLORADO
						
							CONNECTICUT
						
							ILLINOIS
						
							MARYLAND
						
							MASSACHUSETTS
						
							MICHIGAN
						
							MISSOURI
						
							MONTANA
						
							NEVADA
						
							NEW JERSEY
						
							NEW MEXICO
						
							OHIO
						
							OKLAHOMA
						
							OREGON
						
							PENNSYLVANIA
						
							WASHINGTON
						
				
				
				
					
							ALABAMA
						
							ALASKA
						
							ARIZONA
						
							ARKANSAS
						
							COLORADO
						
							CONNECTICUT
						
							ILLINOIS
						
							MARYLAND
						
							MASSACHUSETTS
						
							MICHIGAN
						
							MISSOURI
						
							MONTANA
						
							NEVADA
						
							NEW JERSEY
						
							NEW MEXICO
						
							OHIO
						
							OKLAHOMA
						
							OREGON
						
							PENNSYLVANIA
						
							WASHINGTON
						
				
			
		


		
			Policy Type:
			
				
					
								Business Owners - Appointed Agent
							
								Business Owners - Direct
							
								Business Owners - Wholesale
							
				
			
		



				 
			
	
	
	
	
	

	
	
	
	
	
	
	

	
		Location Address:
		✓
	

	
		Ext Address:
		✓
	

	
		City:
		
			
				✓
			
		
	

	
		Location Zip Code:
		
		
			✓
		
	

	
	
		
	
		
				
			

	
	

			
				//	JAC 10/31/2016 once you change zip code and the user wants to use the first city in the drop down it will never be used
				//	unless we go through the UpdateZipcode function. triggerCityChange is called after zipcodehandler is called in the onchange attribute
				function triggerCityChange(){
					UpdateZipcode($(&quot; , &quot;'&quot; , &quot;#ApplicantCityCB&quot; , &quot;'&quot; , &quot;).val());
				};

				
				function refreshStartNewQuoteButton () {
					if( $(&quot; , &quot;'&quot; , &quot;#PolicyTypeCode&quot; , &quot;'&quot; , &quot;).length) {
						$(&quot;#PolicyTypeCode&quot;).trigger(&quot;change&quot;);
					}
				}
			
		
	
	
	
		// 20180122 - SRX11871 - COG AccessHome Geocoding
		// SRX23978 - Shared Environmental Client Identification
		setTimeout(function(){
			try {
				// SRX23978 - Shared Environmental Client Identification
				ProcessOverrideDisableGMGeocodeRequest(document.getElementById(&quot; , &quot;'&quot; , &quot;PolicyTypeCode&quot; , &quot;'&quot; , &quot;)[document.getElementById(&quot; , &quot;'&quot; , &quot;PolicyTypeCode&quot; , &quot;'&quot; , &quot;).selectedIndex].value,document.getElementById(&quot; , &quot;'&quot; , &quot;VeriskSupportedPolicyTypeCodeList&quot; , &quot;'&quot; , &quot;).value,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
			} catch(err) { }
		},10);
	
	
		&quot;) or . = concat(&quot;
			
	Start a New Quote
	
		 
		
		 
		
		 
	
		
		
		

	
	
	

	

		
			Effective Date:
			
				
				Expires one year from Effective Date
			
		


		
			Risk State:
			
				
				
				✓
					
							ALABAMA
						
							ALASKA
						
							ARIZONA
						
							ARKANSAS
						
							COLORADO
						
							CONNECTICUT
						
							ILLINOIS
						
							MARYLAND
						
							MASSACHUSETTS
						
							MICHIGAN
						
							MISSOURI
						
							MONTANA
						
							NEVADA
						
							NEW JERSEY
						
							NEW MEXICO
						
							OHIO
						
							OKLAHOMA
						
							OREGON
						
							PENNSYLVANIA
						
							WASHINGTON
						
				
				
				
					
							ALABAMA
						
							ALASKA
						
							ARIZONA
						
							ARKANSAS
						
							COLORADO
						
							CONNECTICUT
						
							ILLINOIS
						
							MARYLAND
						
							MASSACHUSETTS
						
							MICHIGAN
						
							MISSOURI
						
							MONTANA
						
							NEVADA
						
							NEW JERSEY
						
							NEW MEXICO
						
							OHIO
						
							OKLAHOMA
						
							OREGON
						
							PENNSYLVANIA
						
							WASHINGTON
						
				
			
		


		
			Policy Type:
			
				
					
								Business Owners - Appointed Agent
							
								Business Owners - Direct
							
								Business Owners - Wholesale
							
				
			
		



				 
			
	
	
	
	
	

	
	
	
	
	
	
	

	
		Location Address:
		✓
	

	
		Ext Address:
		✓
	

	
		City:
		
			
				✓
			
		
	

	
		Location Zip Code:
		
		
			✓
		
	

	
	
		
	
		
				
			

	
	

			
				//	JAC 10/31/2016 once you change zip code and the user wants to use the first city in the drop down it will never be used
				//	unless we go through the UpdateZipcode function. triggerCityChange is called after zipcodehandler is called in the onchange attribute
				function triggerCityChange(){
					UpdateZipcode($(&quot; , &quot;'&quot; , &quot;#ApplicantCityCB&quot; , &quot;'&quot; , &quot;).val());
				};

				
				function refreshStartNewQuoteButton () {
					if( $(&quot; , &quot;'&quot; , &quot;#PolicyTypeCode&quot; , &quot;'&quot; , &quot;).length) {
						$(&quot;#PolicyTypeCode&quot;).trigger(&quot;change&quot;);
					}
				}
			
		
	
	
	
		// 20180122 - SRX11871 - COG AccessHome Geocoding
		// SRX23978 - Shared Environmental Client Identification
		setTimeout(function(){
			try {
				// SRX23978 - Shared Environmental Client Identification
				ProcessOverrideDisableGMGeocodeRequest(document.getElementById(&quot; , &quot;'&quot; , &quot;PolicyTypeCode&quot; , &quot;'&quot; , &quot;)[document.getElementById(&quot; , &quot;'&quot; , &quot;PolicyTypeCode&quot; , &quot;'&quot; , &quot;).selectedIndex].value,document.getElementById(&quot; , &quot;'&quot; , &quot;VeriskSupportedPolicyTypeCodeList&quot; , &quot;'&quot; , &quot;).value,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
			} catch(err) { }
		},10);
	
	
		&quot;))]</value>
      <webElementGuid>b69e6c26-6235-4eaa-a5f6-8b5629cb8f03</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
