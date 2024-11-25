<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>form_Effective DateExpires one year from Ef_d2c8bd</name>
   <tag></tag>
   <elementGuidId>1c82e64f-6622-4078-9e05-3a5c44a1a7d1</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='newQuoteForm']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#newQuoteForm</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>form</value>
      <webElementGuid>8bb4f10c-3805-40ca-a0ae-3d9346cbfb02</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>action</name>
      <type>Main</type>
      <value>main.cfm</value>
      <webElementGuid>959f2dde-771d-4a8b-b24a-326c0d29d2cf</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>newQuoteForm</value>
      <webElementGuid>35cc3597-77db-48de-8788-fa1602d1c995</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>newQuoteForm</value>
      <webElementGuid>58d6dc52-419b-40b4-adb3-b321cae5babc</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>method</name>
      <type>Main</type>
      <value>post</value>
      <webElementGuid>781208ff-a403-4767-bf35-049174e0d4d0</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>target</name>
      <type>Main</type>
      <value>MainIS21test</value>
      <webElementGuid>843941e2-3e23-4af0-9d97-e107ebb6b135</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> 
		
		 
		
		 
	
		
		
		

	
	
	
		
		
			
			
				* Effective Date:
				
					
					Expires one year from Effective Date	
				
			

			
			* State:
			
	

	
	FLORIDATEXAS
	
	
	
	
	
	FLORIDATEXAS

	
		
		
				
					* Policy Type:
	

	
	
	
	
	HomeownersCondo

	
		
	
				 
			
	
	
	
		
		* First Name:
		
		
		Middle Name:
		
	
	
	
	
	
		
		* Last Name:
		
		Suffix:
		
	
	
	
	
		
		* Address:
		
	
	
		
		
	
	
		
		* City:
		
			
				
			
		
	
	
		
		* Property Zip Code:
		
		
		
		
			
		
	

	
	
		
	
				
			
	
	

			
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
			
		
				
					NOTE: The address above has beensuccessfully geocoded.
				
			
	
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				
				
			
	</value>
      <webElementGuid>f1ddc94d-d967-4e3e-924f-581d36c981e5</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;newQuoteForm&quot;)</value>
      <webElementGuid>50058aed-8450-49cd-8924-6133fb2f03b2</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/TX Evergreen HO3-NOTUSED/Page_/iframe_Agent Transaction Report_MainIS21test</value>
      <webElementGuid>83c27059-d924-45ad-84c4-df3f451a7361</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//form[@id='newQuoteForm']</value>
      <webElementGuid>dfaf8a33-d5da-44ad-a9cf-8cee271ca3d8</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='ISiLeftMenuContent']/form</value>
      <webElementGuid>8e8b3124-3605-4b0e-a8cc-df5c9a6ce0c5</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='X'])[2]/following::form[1]</value>
      <webElementGuid>c56564d5-87fb-4c18-939d-ee7188b17710</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Verify the working street address using the interface below:'])[2]/following::form[1]</value>
      <webElementGuid>fc078e6b-eb43-419a-9356-5cc0fbe1ef7d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form</value>
      <webElementGuid>7bf85079-e6e4-4db0-b179-0b5b46fd1444</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//form[@id = 'newQuoteForm' and @name = 'newQuoteForm' and (text() = concat(&quot; 
		
		 
		
		 
	
		
		
		

	
	
	
		
		
			
			
				* Effective Date:
				
					
					Expires one year from Effective Date	
				
			

			
			* State:
			
	

	
	FLORIDATEXAS
	
	
	
	
	
	FLORIDATEXAS

	
		
		
				
					* Policy Type:
	

	
	
	
	
	HomeownersCondo

	
		
	
				 
			
	
	
	
		
		* First Name:
		
		
		Middle Name:
		
	
	
	
	
	
		
		* Last Name:
		
		Suffix:
		
	
	
	
	
		
		* Address:
		
	
	
		
		
	
	
		
		* City:
		
			
				
			
		
	
	
		
		* Property Zip Code:
		
		
		
		
			
		
	

	
	
		
	
				
			
	
	

			
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
			
		
				
					NOTE: The address above has beensuccessfully geocoded.
				
			
	
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				
				
			
	&quot;) or . = concat(&quot; 
		
		 
		
		 
	
		
		
		

	
	
	
		
		
			
			
				* Effective Date:
				
					
					Expires one year from Effective Date	
				
			

			
			* State:
			
	

	
	FLORIDATEXAS
	
	
	
	
	
	FLORIDATEXAS

	
		
		
				
					* Policy Type:
	

	
	
	
	
	HomeownersCondo

	
		
	
				 
			
	
	
	
		
		* First Name:
		
		
		Middle Name:
		
	
	
	
	
	
		
		* Last Name:
		
		Suffix:
		
	
	
	
	
		
		* Address:
		
	
	
		
		
	
	
		
		* City:
		
			
				
			
		
	
	
		
		* Property Zip Code:
		
		
		
		
			
		
	

	
	
		
	
				
			
	
	

			
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
			
		
				
					NOTE: The address above has beensuccessfully geocoded.
				
			
	
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				
				
			
	&quot;))]</value>
      <webElementGuid>fb9a319e-c1b3-4013-b925-5c9f8a46fd96</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
