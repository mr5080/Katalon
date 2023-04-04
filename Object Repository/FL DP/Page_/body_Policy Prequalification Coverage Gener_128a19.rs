<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Policy Prequalification Coverage Gener_128a19</name>
   <tag></tag>
   <elementGuidId>2ba53b99-4f27-4434-83ad-4f90e3ec8b39</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>fdbf3882-ac46-46a5-804f-7cbe49121c37</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>marginwidth</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>77d9bb94-5428-4232-8fed-9de9e710b928</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>marginheight</name>
      <type>Main</type>
      <value>0</value>
      <webElementGuid>50097197-e274-4109-a466-15e483c1b542</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
		

	
		
		
		
		
		
		




	
		
			
				
				
					 Policy
				
					 Prequalification
				
					 Coverage
				
					 General
				
					 History
				
					 Interests
				
					 Statements
				
					 Billing
				
					 Display Quote
				
					 Bind/Submit Application
				
			
		
	
	
		
					
					&lt; General
                    
					
                
					
					Interests >
                    
					
                
					
					Exit
                    
					
                
					
					Return to Agent
                    
					
                
    

	
		

							
							
						
	

								
								
							Quote Number: 3106516  
	
	
	
		
		
	Effective Date:  
				
			    
				 MCO: 81  HO Form: DP3  
	

	

	

	

								
								
							 
							
							Loss History Information
							
						
								
								
							Number of Paid Losses in the Past 3 Years 
				
				
			 
							
							Loss History Information
							
						
								
								
							
				
				
				
				
				
				
				
				
				

				
					
					
					
						
							
								Please list any losses, whether or not paid by insurance, during the last 3 years, at this or any location 
								
									
										
									
								
							
						
					



					

						
			 
								
								
							Apply credit if policy is inforce for > = 2 years and has 0 claims since inception. 
					
						Yes
						No
					
				 Paid Claim Rating Plan  
				
				
					
								
									0
								
								
								
									1
								
								
								
									2
								
								
								
									3
								
								
								
									4+
								
								
				
				 


	
		
					
					&lt; General
					
					
				
					
					Interests >
					
					
				
					
					Exit
					
					
				
					
					Return to Agent
					
					
				
	

	

		
	

	
	
		
			
				
					
						
						
							×
						
					
					
				

				
					
					
					
				

				
				
					
					
				
					Confirm
				 
					
				
					Close
				
					
				
				
			
		
	

    
        
            
                Loading...
            
            
                Loading...
            
        
	

	
	
	
		
		
			
			
				
				
					
						
						
							×
						
					
					
				

				
				
					
						
						
						
					
	
					
					
						
					
				
					Confirm
				 
					
				
					Close
				
						
					
					
				
				
			
		
	

			
			
			
		
				
				
				
				
			
			
		
				
				
				
				
				
				
				
				
				
				
				
				
			 
			 
		 var jsPublicWebserviceURL = 'https://cypresstest.cogisi.com/is/webservices/';  var GoogleAPIKey = 'AIzaSyBg3d6-GolpGx5FzPri1QJtfGu-3hZm63E';  var jsISAlertUrl = 'https://cypresstest.cogisi.com/is/webservices/SharedFunctionLibrary/CoreFunctionLibrary.cfc?EUDATA=rGFQPNOE59wPibquSjz12CWE1gCD4uFN4mizMJREcA24ZriNSHAsXyIwKlSt2llZHlYh2LSwgScB1zjvv05VaLiJEwUXb6TYigIu9u7hI4%2FkYs1VQCwDLSvoXhIVHfZ4GxGHSYJdypewuDkaFVRtLIGVagTsLCJUUBRYFZEwB%2FJRgQP+XZ7oosfNn%2FgU1EAB%2FLEf66dKsywSXWsYyeq1pQ%3D%3D';  var ISBlockedMOCIsActive = 'N';  
			 
		
		
		
		
		
		
		
		
		 
			
			
			
			
			
				
			
	
		var CurrentUrl = document.getElementById(&quot;CurrentUrl&quot;);
		if(CurrentUrl){
			CurrentUrl.value = window.top.location.origin + window.top.location.pathname;
		} else {
			$(&quot;#mainForm&quot;).prepend('&lt;input type=&quot;hidden&quot; name=&quot;CurrentUrl&quot; id=&quot;CurrentUrl&quot; value=&quot;' + window.top.location.origin + window.top.location.pathname + '&quot; />');
		}
		var ISiPublicRootURL = &quot;https://cypresstest.cogisi.com/is/root/&quot;;
		var DisableMessageArray = [];

		var SubPageLoadActions = [];

		var DisableArrayExists = false;
		// Check lenght of the preexixting array
		if(DisableCheckArray &amp;&amp; DisableCheckArray.length > 0){
			DisableArrayExists = true;
			var DisableTempArray = DisableCheckArray;
		}
		
			var DisableCheckArray = new Array(2);
			
				DisableCheckArray[0] = new Array(3);
				DisableCheckArray[0][0] = &quot;LossFreeRenewal&quot;;
				DisableCheckArray[0][1] = &quot;USERTYPE,=,Agent;&quot;;
				DisableCheckArray[0][2] = &quot;&quot;;
			
				DisableCheckArray[1] = new Array(3);
				DisableCheckArray[1][0] = &quot;PaidClaimRatingPlan&quot;;
				DisableCheckArray[1][1] = &quot;USERTYPE,=,Agent;&quot;;
				DisableCheckArray[1][2] = &quot;&quot;;
			
			// If array exists then prepend to the new array created
			if(DisableArrayExists){
				DisableCheckArray = DisableTempArray.concat(DisableCheckArray);
			}
			console.log(DisableCheckArray); 


		var DisableOptionArrayExists = false;
		// Check lenght of the preexixting array
		if(DisableOptionCheckArray &amp;&amp; DisableOptionCheckArray.length > 0){
			DisableOptionArrayExists = true;
			var DisableOptionTempArray = DisableOptionCheckArray;
		}
		
			// if disabled array does not exist then empty it
			if(!DisableOptionArrayExists){
				var DisableOptionCheckArray = [];
			}
		

		/* 
			GlobalCheckDisable();
		 */

		var CalcArrayExists = false;
		// Check lenght of the preexixting array
		if(CalculationArray &amp;&amp; CalculationArray.length > 0){
			CalcArrayExists = true;
			var CalculatedTempArray = CalculationArray;
		}
		
		
			// if required array does not exist then empty it
			if(!CalcArrayExists){
				var CalculationArray = [];
			}
		




		var ReqArrayExists = false;
		// Check lenght of the preexixting array
		if(RequiredArray &amp;&amp; RequiredArray.length > 0){
			ReqArrayExists = true;
			var ReqTempArray = RequiredArray;
		}
		
		
			var RequiredArray = new Array(1);
			
				RequiredArray[0] = &quot;PriorClaimCount&quot;;
			
			// If array exists then prepend to the new array created
			if(ReqArrayExists){
				RequiredArray = ReqTempArray.concat(RequiredArray);
			}
			console.log(RequiredArray); 
		var boolHighlightRequired = false;

		/* Yashik: Run disable checks forcefully eg while adding rules dynamically from JS */
		

		var RequiredCodeArrayExists = false;
		// Check lenght of the preexixting array
		if(RequiredCodeArray &amp;&amp; RequiredCodeArray.length > 0){
			RequiredCodeArrayExists = true;
			var RequiredCodeTempArray = RequiredCodeArray;
		}
		
			// if disabled array does not exist then empty it
			if(!RequiredCodeArrayExists){
				var RequiredCodeArray = [];
			}
		

		
		function ISiAOnPageLoadStart() {
			
					try{
						
						SeedCCData('applicationlocalrooturl|https://cypresstest.cogisi.com/is/Application/^applicationpublicrooturl|https://cypresstest.cogisi.com/is/Application/');
					} catch(e){
						alert(&quot;Javascript error from ISiAFooterJavaScriptArray.  Search the source code for:  06E935B3&quot;);
						console.log(e);
					};
				
					try{
						
						if(typeof parent.HideLoading !== 'undefined'){parent.HideLoading();} else if (typeof HideLoading !== 'undefined'){HideLoading();};
					} catch(e){
						alert(&quot;Javascript error from ISiAFooterJavaScriptArray.  Search the source code for:  06E935B4&quot;);
						console.log(e);
					};
				
			$('[data-toggle=&quot;tooltip&quot;]').tooltip();
			
				GlobalCheckDisable();
			
		}
	

		
			
				
					
						Debugging information and Tools
				        
				          ×
				        
					
					
						
							Log
							Queries
							Form
							URL Auth Data WDDX Rate Flow Validation Errors Validation
							Other
							Error Log
						
						
							
								
CS-99 - Loaded FORM variable ROOFCONSTRUCTIONYEAR_1 with value: 2015 
CS-99 - Loaded FORM variable USERTYPE with value: internal 
CS-99 - Loaded FORM variable WMROOFGEOMETRY_1 with value: NA 
CS-99 - Loaded FORM variable SUBDIVISION_1 with value:  
CS-99 - Loaded FORM variable ROWHOUSE_1 with value: N 
CS-99 - Loaded FORM variable POLICYTYPECODE with value: DP3 
CS-99 - Loaded FORM variable EXTERIORWALLCOVER_1 with value: CONCRETEBLOCK 
CS-99 - Loaded FORM variable HEATTYPE1_1 with value: OIL 
CS-99 - Loaded FORM variable WMWINDOWPROTECTION_1 with value: HURRICANE 
CS-99 - Loaded FORM variable INTERNALPROTECTIONCLASS_1 with value: 1 
CS-99 - Loaded FORM variable CURRENTPAGE with value: 700 
CS-99 - Loaded FORM variable OCCUPANCY_1 with value: TENANT 
CS-99 - Loaded FORM variable SQUAREFOOTAGE_1 with value: 2546 
CS-99 - Loaded FORM variable RESPONDINGFIRESTATION_1 with value: JACKSONVILLE 
CS-99 - Loaded FORM variable PURCHASEPRICE_1 with value: 305080 
CS-99 - Loaded FORM variable EFFECTIVEDATEMAXIMUM with value: 12/29/2025 
CS-99 - Loaded FORM variable LASTHEATINGUPDATE_1 with value: 2021 
CS-99 - Loaded FORM variable FOUNDATION_1 with value: CLOSED 
CS-99 - Loaded FORM variable ISQUICKQUOTE with value: N 
CS-99 - Loaded FORM variable WINDPOOL_1 with value: N 
CS-99 - Loaded FORM variable FOUNDATIONTYPE_1 with value: BASEMENT 
CS-99 - Loaded FORM variable INITIALEFFECTIVEDATE with value: 04/09/2023 
CS-99 - Loaded FORM variable LASTPAGE with value: 600 
CS-99 - Loaded FORM variable WINDMITPREMIUM_1 with value: 15000 
CS-99 - Loaded FORM variable EFFECTIVEDATE with value: 04/09/2023 
CS-99 - Loaded FORM variable TERRITORYCODE_1 with value: 39 
CS-99 - Loaded FORM variable LASTELECTRICALUPDATE_1 with value: 2018 
CS-99 - Loaded FORM variable UWQUOTECODE with value: A 
CS-99 - Loaded FORM variable NOSAVEPLANNEDSUBDIVISION_1 with value: N 
CS-99 - Loaded FORM variable NUMBERFAMILIES_1 with value: 2 
CS-99 - Loaded FORM variable DWELLINGTYPE_1 with value: DWELLING 
CS-99 - Loaded FORM variable DISTANCEFIREHYDRANT_1 with value: LT1000 
CS-99 - Loaded FORM variable BARRIERISLAND_1 with value: N 
CS-99 - Loaded FORM variable NOSAVEBARRIERISLAND_1 with value: N 
CS-99 - Loaded FORM variable WMROOFCOVERING_1 with value: FBC 
CS-99 - Loaded FORM variable WMROOFANCHORAGE_1 with value: CLIPS 
CS-99 - Loaded FORM variable IBHS_1 with value: PARTIAL 
CS-99 - Loaded FORM variable NOSAVENEARSINKHOLE_1 with value: N 
CS-99 - Loaded FORM variable ROOFCONSTRUCTION_1 with value: 3TAB 
CS-99 - Loaded FORM variable LASTROOFUPDATE_1 with value: 2019 
CS-99 - Loaded FORM variable FIRECODE_1 with value:  
CS-99 - Loaded FORM variable CURRENTPROGRESSPAGE with value: 700 
CS-99 - Loaded FORM variable COMPANYCODE with value: 81 
CS-99 - Loaded FORM variable BCEGS_1 with value: 4 
CS-99 - Loaded FORM variable MARKETVALUE_1 with value: 300000 
CS-99 - Loaded FORM variable NOSAVEROWHOUSE_1 with value: N 
CS-99 - Loaded FORM variable WINDSPEED_1 with value: 110 
CS-99 - Loaded FORM variable NUMSTORIES_1 with value: 1 
CS-99 - Loaded FORM variable ROOFDECKATTACH_1 with value: NA 
CS-99 - Loaded FORM variable TERRAIN_1 with value: B 
CS-99 - Loaded FORM variable CONSTRUCTIONTYPE_1 with value: V 
CS-99 - Loaded FORM variable CONSTRUCTIONYEAR_1 with value: 2015 
CS-99 - Loaded FORM variable ROOFCONDITION_1 with value: ABOVEAVERAGE 
CS-99 - Loaded FORM variable DISTANCEFIRESTATION_1 with value: 1 
CS-99 - Loaded FORM variable EFFECTIVEDATEMINIMUM with value: 01/16/2015 
CS-99 - Loaded FORM variable WBDR_1 with value: N 
CS-99 - Loaded FORM variable NUMROOMS_1 with value: 11 
CS-99 - Loaded FORM variable CURRENTURL with value: https://cypresstest.cogisi.com/is/root/index.cfm 
CS-99 - Loaded FORM variable ACCESSNUMBER with value: 2 
CS-99 - Loaded FORM variable WMWATERRESISTANCE_1 with value: N 
CS-99 - Loaded FORM variable PLANNEDSUBDIVISION_1 with value: N 
CS-99 - Loaded FORM variable LASTPLUMBINGUPDATE_1 with value: 2020 
CS-99 - Loaded FORM variable ROOFLAYERS_1 with value: 1 
CS-99 - Loaded FORM variable AUTHTOKEN with value: a82741540573558027i15151613s3902970422694160i54330 
CS-99 - Loaded FORM variable FAMILYUNITSROW_1 with value: 1 
CS-99 - Loaded FORM variable BUILDINGUNITS_1 with value: 1 
CS-99 - Loaded FORM variable NEARSINKHOLE_1 with value: N 
CS-10 - Loaded BOTH scope(s) with 67 elements 
Custom Scope Load Duration:5 
Auth.setValue: IPAddress = 98.237.120.185 
Current Webservice Address: https://cypresstest.cogisi.com/is/root/ 
Auth.setValue: AuthToken = a82741540573558027i15151613s3902970422694160i54330 
Auth.setValue: AuthPurpose = ISiApp 
Auth.setValue: Verified = true 
Auth.setValue: DataPacket = 2ISiAppJHUGHESQuoteN2040a82741540573558027i15151613s3902970422694160i5433003106516internalTopMenuOneSection60yes04/04/2023 03:18:18PM 
AUT-18 - Successfully Completed 'RefreshDataPacket' function 
AUT-05 - Successfully Validated The Requested 'AuthToken' 
Auth.Verify Duration : 46 
Client Number: 21 
Auth.setValue: ManualID = 2040 
Ran Query (1)
Auth.setValue: LayoutName = TopMenuOneSection 
Auth.setValue: FreeMenuNav = N 
Including PreProcessing_Main from PreProcessing_Index 
QUO-082 SetValue Quote Data Element: keyname-PrimaryKey 
Loading ClientCode Quote template 
Ran Query (2)
WDX-52 - Successfully deserialized the WDDX Packet 
QUO-082 SetValue Quote Data Element: keyname-QuoteNumber 
WDX-99 - WDDX Set Value - QuoteNumber=3106516 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-ManualID 
WDX-99 - WDDX Set Value - ManualID=2040 Changed=false 
WDX-98 - WDDX Cleared key - PolicyID 
Auth.setValue: ManualID = 2040 
QUO-082 SetValue Quote Data Element: keyname-StateCode 
WDX-99 - WDDX Set Value - StateCode=9 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-PolicyTypeCode 
WDX-99 - WDDX Set Value - PolicyTypeCode=DP3 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWStatusCode 
WDX-99 - WDDX Set Value - UWStatusCode=C Changed=false 
QUO-082 SetValue Quote Data Element: keyname-CompanyCode 
WDX-99 - WDDX Set Value - CompanyCode=81 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWQuoteCode 
WDX-99 - WDDX Set Value - UWQuoteCode=A Changed=false 
QUO-082 SetValue Quote Data Element: keyname-AgentCode 
WDX-99 - WDDX Set Value - AgentCode=10100 Changed=false 
WDX-99 - WDDX Set Value - IsQuickQuote=N Changed=false 
WDX-99 - WDDX Set Value - InterfaceVersion=UA Changed=false 
WDX-98 - WDDX Cleared key - ExpirationDate 
DetermineReadOnly - X 
[DRO01] Quote: 3106516 UWStatusCode: C LoadRelatedQuotes:true 
QUO-082 SetValue Quote Data Element: keyname-UWStatusCode 
WDX-99 - WDDX Set Value - UWStatusCode=C Changed=false 
QUO-083 SetValue keyname-UWStatusCode No Additional Processing 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 0 
QUO-80 - Loading Applicant List 
QUO-80 - Total Number of applicants - 1 
QUO-80 - Current Applicant List -  
QUO-80 - Adding Applicant 1:KEITH ANN LEBLANC JR to applicant list 
QUO-80 - Loading Applicant List Completed 
WDX-99 - WDDX Set Value - MidtermChangeMode=No Changed=false 
WDDX.LoadData Duration : 9 
Loading ClientCode Quote template 
WDX-99 - WDDX Set Value - ViewID=2 Changed=false 
Ran Query (3)
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
Ran Query (4)
PostAdditionalAction: Loading the Last Page Properties:  
SFORM-02 - Starting process of Saving data from SubmittedData to data 
WDX-98 - WDDX Cleared key - FIRECODE_1 
SFORM-99 - Skipping NOSAVEPLANNEDSUBDIVISION_1 
WDX-99 - WDDX Set Value - RESPONDINGFIRESTATION_1=JACKSONVILLE Changed=false 
SFORM-99 - Skipping NOSAVEBARRIERISLAND_1 
WDX-99 - WDDX Set Value - WMWATERRESISTANCE_1=N Changed=false 
WDX-99 - WDDX Set Value - ROOFCONDITION_1=ABOVEAVERAGE Changed=false 
WDX-99 - WDDX Set Value - BUILDINGUNITS_1=1 Changed=false 
WDX-99 - WDDX Set Value - ISQUICKQUOTE=N Changed=false 
WDX-99 - WDDX Set Value - FOUNDATION_1=CLOSED Changed=false 
WDX-99 - WDDX Set Value - CONSTRUCTIONYEAR_1=2015 Changed=false 
WDX-99 - WDDX Set Value - TERRAIN_1=B Changed=false 
WDX-99 - WDDX Set Value - LASTPAGE=600 Changed=true 
WDX-99 - WDDX Set Value - NEARSINKHOLE_1=N Changed=false 
WDX-99 - WDDX Set Value - INTERNALPROTECTIONCLASS_1=1 Changed=true 
WDX-99 - WDDX Set Value - LASTROOFUPDATE_1=2019 Changed=true 
WDX-99 - WDDX Set Value - CONSTRUCTIONTYPE_1=V Changed=false 
WDX-99 - WDDX Set Value - LASTHEATINGUPDATE_1=2021 Changed=true 
WDX-99 - WDDX Set Value - WINDMITPREMIUM_1=15000 Changed=false 
WDX-99 - WDDX Set Value - ACCESSNUMBER=2 Changed=false 
WDX-99 - WDDX Set Value - NUMBERFAMILIES_1=2 Changed=false 
WDX-99 - WDDX Set Value - NUMSTORIES_1=1 Changed=false 
WDX-99 - WDDX Set Value - MARKETVALUE_1=300000 Changed=false 
WDX-99 - WDDX Set Value - ROOFLAYERS_1=1 Changed=false 
WDX-98 - WDDX Cleared key - SUBDIVISION_1 
WDX-99 - WDDX Set Value - ROWHOUSE_1=N Changed=false 
WDX-99 - WDDX Set Value - WMROOFGEOMETRY_1=NA Changed=false 
WDX-99 - WDDX Set Value - ROOFDECKATTACH_1=NA Changed=false 
WDX-99 - WDDX Set Value - NUMROOMS_1=11 Changed=false 
WDX-99 - WDDX Set Value - WBDR_1=N Changed=false 
WDX-99 - WDDX Set Value - DWELLINGTYPE_1=DWELLING Changed=false 
WDX-99 - WDDX Set Value - DISTANCEFIRESTATION_1=1 Changed=false 
SFORM-99 - Skipping NOSAVEROWHOUSE_1 
WDX-99 - WDDX Set Value - LASTELECTRICALUPDATE_1=2018 Changed=true 
WDX-99 - WDDX Set Value - IBHS_1=PARTIAL Changed=false 
WDX-99 - WDDX Set Value - CURRENTPROGRESSPAGE=700 Changed=true 
QUO-082 SetValue Quote Data Element: keyname-COMPANYCODE 
WDX-99 - WDDX Set Value - COMPANYCODE=81 Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATEMAXIMUM=12/29/2025 Changed=false 
WDX-99 - WDDX Set Value - ROOFCONSTRUCTIONYEAR_1=2015 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-POLICYTYPECODE 
WDX-99 - WDDX Set Value - POLICYTYPECODE=DP3 Changed=false 
WDX-99 - WDDX Set Value - LASTPLUMBINGUPDATE_1=2020 Changed=true 
WDX-99 - WDDX Set Value - FOUNDATIONTYPE_1=BASEMENT Changed=false 
WDX-99 - WDDX Set Value - FAMILYUNITSROW_1=1 Changed=false 
WDX-99 - WDDX Set Value - TERRITORYCODE_1=39 Changed=false 
WDX-99 - WDDX Set Value - USERTYPE=internal Changed=false 
SFORM-99 - Skipping NOSAVENEARSINKHOLE_1 
WDX-99 - WDDX Set Value - WMWINDOWPROTECTION_1=HURRICANE Changed=false 
WDX-99 - WDDX Set Value - CURRENTPAGE=700 Changed=true 
WDX-99 - WDDX Set Value - OCCUPANCY_1=TENANT Changed=false 
WDX-99 - WDDX Set Value - BCEGS_1=4 Changed=false 
WDX-99 - WDDX Set Value - WMROOFCOVERING_1=FBC Changed=false 
WDX-99 - WDDX Set Value - SQUAREFOOTAGE_1=2546 Changed=false 
WDX-99 - WDDX Set Value - ROOFCONSTRUCTION_1=3TAB Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATEMINIMUM=01/16/2015 Changed=false 
WDX-99 - WDDX Set Value - WMROOFANCHORAGE_1=CLIPS Changed=false 
WDX-99 - WDDX Set Value - PLANNEDSUBDIVISION_1=N Changed=false 
WDX-99 - WDDX Set Value - DISTANCEFIREHYDRANT_1=LT1000 Changed=false 
WDX-99 - WDDX Set Value - WINDPOOL_1=N Changed=false 
WDX-99 - WDDX Set Value - HEATTYPE1_1=OIL Changed=false 
WDX-99 - WDDX Set Value - BARRIERISLAND_1=N Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATE=04/09/2023 Changed=false 
WDX-99 - WDDX Set Value - EXTERIORWALLCOVER_1=CONCRETEBLOCK Changed=false 
WDX-99 - WDDX Set Value - PURCHASEPRICE_1=305080 Changed=false 
WDX-99 - WDDX Set Value - INITIALEFFECTIVEDATE=04/09/2023 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWQUOTECODE 
WDX-99 - WDDX Set Value - UWQUOTECODE=A Changed=false 
WDX-99 - WDDX Set Value - WINDSPEED_1=110 Changed=false 
SFORM-03 - Completed process of Saving data from SubmittedData to data count:63 
AL100 - Check for Agent or Agent Change 
Ran Query (8)
ValidatePageID: PageID validated ViewID:2 PageID:700 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 0 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (9)
WDDX.SAVE Duration : 26 
Ran Query (10)
SetRatingStatus RatingStatusCode 14:18:18.608 - Desired:V Expected:X Returned:V 
getManualID returns 2040 
Ran Query (11)
Running Validation PageChange with PageIdentifier:sections:51,1400,3000,3100,3300 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (12)
SetRatingStatus RatingStatusCode 14:18:18.735 - Desired:X Expected:V Returned:X 
WDX-98 - WDDX Cleared key - RequireUWIDs 
WDX-98 - WDDX Cleared key - ResultTasks 
Completed Validation - Continue 
Setting Validation equal to prior result: continue 
Ran Query (13)
WDX-99 - WDDX Set Value - ViewID=2 Changed=false 
Ran Query (14)
Loading the current View Properties: TextHeaderClass_1=row ISiMidHeading,NameLabelLocation=Top,UserHelpLeftString=?,DateEntryType=Both,YesNoEntryType=radio,DefaultLayout=TopMenuOneSection,AvailableLayouts=TopMenuOneSection,PageIDOnCCSuccess=92 
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
Loading the current Page Properties:  
Preprocessing - Step 21a - AdditionalAction:  CurrentPage:700 
Auth.setValue: LayoutName = TopMenuOneSection 
DepositSchedule - Start - https://cypresstest.cogisi.com/is/webservices/ISUtilitiesCFC/ISTransfer/ISTransferWS.cfc?quotenumber=3106516&amp;AuthToken=a82741540573558027i15151613s3902970422694160i54330 
DepositSchedule, No change in Bill Control, skipping process: 819DP304/09/2023AApp_A 
WDX-99 - WDDX Set Value - ValidBilling=true Changed=false 
ImpactTotalPremium:  
TotalPremium: 832 
Start HTML : 207 
Index Preprocessing Duration : 214 
FR-012 'ConditionalOperatorsCheck' Complete - [OldSystemFlag,=,Y]() = false 
FR-012 'ConditionalOperatorsCheck' Complete - [OldSystemFlag,=,Y]() = false 
Ran Query (15)
WDX-99 - WDDX Set Value - PageHistory=100,101,200,400,500,600,700 Changed=true 
Prior Page ID: 600 
Next Page ID: 800 
Processing Area: 1 
getManualID returns 2040 
Ran Query (16)
Starting Render Page - CurrentApplicant:1 CurrentRisk:1 CurrentDetail:0 Question Count:15 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: DefaultFieldName to value:USERTYPE 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Load Section Properties: SectionClass=sticky-top border-bottom ISiA-Max25p 
CSET-94 - LoadKeyValueString key: SectionClass to value:sticky-top border-bottom ISiA-Max25p 
Start Widget [0]:hidden Fieldname:USERTYPE 
CSET-94 - LoadKeyValueString key: DefaultFieldName to value:USERTYPE 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:QuoteNumber 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:3106516 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 1 
Start Question [0] - EffectiveDateWidget 
CSET-94 - LoadKeyValueString key: ReadOnlyCondition to value:USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR 
Start Widget [0]:EffectiveDateWidget Fieldname:EffectiveDate 
CSET-94 - LoadKeyValueString key: ReadOnlyCondition to value:USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR 
Starting to look for widget specific file - EffectiveDateWidget -  - suffix: 
QUO-05 - Effective date initialization started 
QUO-05 - Saved user type: internal 
QUO-05 - Current user type: internal 
QUO-07 - Effective date did not initialization as user type logged in is same 
Existing date value used: 04/09/2023 
conditionalOperatorCheck - internal.&lt;>.internal 
conditionalOperatorCheck - internal.=.internal 
FR-005 'ConditionalOperatorsCheck' Complete - [USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR] = true 
Complete Widget Specific File 
End Widget :EffectiveDateWidget with suffix:  
Widget Duration : 3 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:CompanyCode 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:81 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:PolicyTypeCode 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:DP3 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 0 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:UWQuoteCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 0 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:PolicyTypeCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWQuoteCode,&lt;>,A; 
conditionalOperatorCheck - a.&lt;>.a 
FR-012 'ConditionalOperatorsCheck' Complete - [UWQuoteCode,&lt;>,A](1) = NO 
Checking Question Conditonals [UWQuoteCode,&lt;>,A;], return:NO 
Did not show this question [0] 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:CompanyCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
CSET-94 - LoadKeyValueString key: DefaultValue to value:N 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND 
conditionalOperatorCheck - a.=.a 
FR-005 'ConditionalOperatorsCheck' Complete - [UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND]1 = false 
Checking Question Conditonals [UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND], return:false 
Did not show this question [0] 
Start Question [0] - ButtonWidget 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: ButtonAppendLoading to value:Y 
CSET-94 - LoadKeyValueString key: ButtonAppendSubmit to value:Y 
CSET-94 - LoadKeyValueString key: ConfirmationHeading to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonDisplayType to value:ConfirmationPopup 
CSET-94 - LoadKeyValueString key: ConfirmationText to value:Are you sure you want to unlock the quote, you may have to resubmit for underwriter approval? 
CSET-94 - LoadKeyValueString key: ButtonText to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonAppendAddAction to value:RESETCANAGENTBIND 
CSET-94 - LoadKeyValueString key: EditCanAgentBind to value:Y 
CSET-94 - LoadKeyValueString key: ButtonClass to value:w-100 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND 
conditionalOperatorCheck - n.=.y 
FR-005 'ConditionalOperatorsCheck' Complete - [CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND]1 = false 
Checking Question Conditonals [CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND], return:false 
Did not show this question [0] 
Start Question [0] - Text 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: RightClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:ReadOnly,=,TRUE; 
conditionalOperatorCheck - false.=.true 
FR-012 'ConditionalOperatorsCheck' Complete - [ReadOnly,=,TRUE](1) = NO 
Checking Question Conditonals [ReadOnly,=,TRUE;], return:NO 
Did not show this question [0] 
Start Question [0] - ButtonWidget 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: ButtonAppendLoading to value:Y 
CSET-94 - LoadKeyValueString key: ButtonAppendSubmit to value:Y 
CSET-94 - LoadKeyValueString key: ConfirmationHeading to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonDisplayType to value:ConfirmationPopup 
CSET-94 - LoadKeyValueString key: ConfirmationText to value:You may have to resubmit for underwiter approval? 
CSET-94 - LoadKeyValueString key: ButtonText to value:Remove Submission 
CSET-94 - LoadKeyValueString key: ButtonAppendAddAction to value:RESETUWSTATUSCODE 
CSET-94 - LoadKeyValueString key: ButtonClass to value:w-100 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND 
conditionalOperatorCheck - c.=.s 
FR-005 'ConditionalOperatorsCheck' Complete - [UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND]1 = false 
Checking Question Conditonals [UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND], return:false 
Did not show this question [0] 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: DefaultValue to value:No 
CSET-94 - LoadKeyValueString key: ForceValue to value:No 
Start Widget [0]:hidden Fieldname:IsQuickQuote 
CSET-94 - LoadKeyValueString key: DefaultValue to value:No 
CSET-94 - LoadKeyValueString key: ForceValue to value:No 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - ErrorDisplay 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
Start Widget [0]:ErrorDisplay Fieldname: 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
Starting to look for widget specific file - ErrorDisplay -  - suffix: 
Complete Widget Specific File 
End Widget :ErrorDisplay with suffix:  
Widget Duration : 1 
Page Duration : 15 
Processing Area: 2 
getManualID returns 2040 
Ran Query (17)
Starting Render Page - CurrentApplicant:1 CurrentRisk:1 CurrentDetail:0 Question Count:4 
Start Question [1500010] - NUMBER 
CSET-94 - LoadKeyValueString key: NumberMaxValue to value:9999 
CSET-94 - LoadKeyValueString key: NumberMinValue to value:0 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1500010]:NUMBER Fieldname:PriorClaimCount 
CSET-94 - LoadKeyValueString key: NumberMaxValue to value:9999 
CSET-94 - LoadKeyValueString key: NumberMinValue to value:0 
Starting to look for widget specific file - NUMBER - Numeric4 - suffix: 
Number Format Mask: _^ 
Complete Widget Specific File 
End Widget :NUMBER with suffix:  
Widget Duration : 1 
Start Question [1600010] - DetailSelection 
CSET-94 - LoadKeyValueString key: DisplayFormat to value:accordion 
CSET-94 - LoadKeyValueString key: TabTitleVariable to value:TypeOfLoss 
CSET-94 - LoadKeyValueString key: DetailVariable to value:NumberClaims 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1600010]:DetailSelection Fieldname:NumberClaims 
CSET-94 - LoadKeyValueString key: DisplayFormat to value:accordion 
CSET-94 - LoadKeyValueString key: TabTitleVariable to value:TypeOfLoss 
CSET-94 - LoadKeyValueString key: DetailVariable to value:NumberClaims 
Starting to look for widget specific file - DetailSelection -  - suffix: 
getManualID returns 2040 
Ran Query (18)
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
CSET-95 - Setting Set Value - ShowEndorsementLinks=no 
Indexes - IndexCounter: CurrentDetail:NumberClaims 
Item to be deleted:  
Starting Accordion Detail Widget 
Complete Widget Specific File 
End Widget :DetailSelection with suffix:  
Widget Duration : 5 
Start Question [1600070] - YesNo 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:select 
CSET-94 - LoadKeyValueString key: Required to value:N 
CSET-94 - LoadKeyValueString key: YesNoType to value:Y/N 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1600070]:YesNo Fieldname:LossFreeRenewal 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:select 
CSET-94 - LoadKeyValueString key: Required to value:N 
CSET-94 - LoadKeyValueString key: YesNoType to value:Y/N 
Starting to look for widget specific file - YesNo - Yes/No - suffix: 
YesNo Type from settings: YES/NO 
Complete Widget Specific File 
conditionalOperatorCheck - internal.=.agent 
FR-012 'ConditionalOperatorsCheck' Complete - [UserType,=,Agent]() = NO 
End Widget :YesNo with suffix:  
Widget Duration : 2 
Start Question [1600080] - SelectQry 
CSET-94 - LoadKeyValueString key: Required to value:N 
Start Widget [1600080]:SelectQry Fieldname:PaidClaimRatingPlan 
CSET-94 - LoadKeyValueString key: Required to value:N 
Starting to look for widget specific file - SelectQry - Text - suffix: 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
Ran Query (19)
Multiple options found for select 
Choice selected is 0 
Option 0 added with value 0 
Option 1 added with value 1 
Option 2 added with value 2 
Option 3 added with value 3 
Option 4+ added with value 4 
Complete Widget Specific File 
conditionalOperatorCheck - internal.=.agent 
FR-012 'ConditionalOperatorsCheck' Complete - [UserType,=,Agent]() = NO 
End Widget :SelectQry with suffix:  
Widget Duration : 4 
Page Duration : 15 
Start RenderButton [ButtonType: PrimaryButton] 
End RenderButton [ButtonType: PrimaryButton] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: Secondary] 
End RenderButton [ButtonType: Secondary] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: PrimaryButton] 
End RenderButton [ButtonType: PrimaryButton] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: Secondary] 
End RenderButton [ButtonType: Secondary] 
RenderButton Duration (milliseconds): 0 
Ran Query (20)
CSET-03 - No Settings Found for ISBlockedMOC 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 1 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (21)
WDDX.SAVE Duration : 30 
Auth.setValue: DataPacket = 31065162internal0TopMenuOneSectionISiAppa82741540573558027i15151613s3902970422694160i543302040QuoteJHUGHESN60yes04/04/2023 03:18:18PM 
AUT-18 - Successfully Completed 'RefreshDataPacket' function 
Auth.setValue: Changed = false 
AUT-07 - 'AuthToken:DataPacket' Data Save 
Field Name List: ,USERTYPE,QuoteNumber,EffectiveDate,CompanyCode,PolicyTypeCode,UWQuoteCode,PolicyTypeCode,PolicyNumber,CompanyCode,CypressConversionReadOnlyMessageIsQuickQuote,PriorClaimCount,NumberClaims,LossFreeRenewal,PaidClaimRatingPlan,DateOfLoss,TypeOfLoss,AmountOfLoss,LossDescription,LossLocation,ClaimTierRating 
WDX-99 - WDDX Set Value - OnLastPage=N Changed=true 
							
							
								

1:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? ORDER BY ViewID ASC

1:All Views Query sqlparameters: 2040

1:All Views Query recordcount: 5

1:All Views Query ExecutionTime: 1

2:Get Quote Data SQL: SELECT TOP 1 * FROM WebInfo WITH (NOLOCK) where QuoteNumber = ? 

2:Get Quote Data sqlparameters: 3106516

2:Get Quote Data recordcount: 1

2:Get Quote Data ExecutionTime: 2

3:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? AND ViewID = ? ORDER BY ViewID ASC

3:All Views Query sqlparameters: 2040,2

3:All Views Query recordcount: 1

3:All Views Query ExecutionTime: 1

4:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

4:Pages Query sqlparameters: 2040,2,600

4:Pages Query recordcount: 1

4:Pages Query ExecutionTime: 1

5:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in ('NONE','RATING')
								AND (ISNULL(PolicyTypeCode, '') = '' OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, '') = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

5:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,

5:QuestionsQry recordcount: 0

5:QuestionsQry ExecutionTime: 1

6:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in ('NONE','RATING')
								AND (ISNULL(PolicyTypeCode, '') = '' OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, '') = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

6:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,Y

6:QuestionsQry recordcount: 0

6:QuestionsQry ExecutionTime: 1

7:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in ('NONE','RATING')
								AND (ISNULL(PolicyTypeCode, '') = '' OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, '') = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

7:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,Z

7:QuestionsQry recordcount: 0

7:QuestionsQry ExecutionTime: 1

8:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

8:Pages Query sqlparameters: 2040,2,700

8:Pages Query recordcount: 1

8:Pages Query ExecutionTime: 1

9:Save Quote Data SQL: UPDATE WebInfo SET InfoWDDX = ? , UWQuoteCode = ? , UWStatusCode = ? , AgentCode = ? , EffectiveDate = ? , ManualID = ? , StateCode = ? , CompanyCode = ? ,
						PolicyTypeCode = ? , Underwriter = ? , ApplicantFirst = ? , ApplicantMiddle = ? , ApplicantLast = ? , ApplicantSuffix = ? , ApplicantAddress1 = ? ,
						ApplicantAddress2 = ? , ApplicantCity = ? , ApplicantState = ? , ApplicantZip = ? , ApplicantZip4 = ? , ApplicantHomePhone = ? ,
						ApplicantWorkPhone = ? , ApplicantEmail = ? , ProgramCode = ? , DateUpdated = GETDATE(), UWStatusDate = GETDATE() where QuoteNumber = ? 

9:Save Quote Data sqlparameters: {WDDX Packet},A,C,10100,2023-04-09,2040,9,81,DP3,,KEITH,ANN,LEBLANC,JR,1837 W 19TH ST,,JACKSONVILLE,FL,32209,,717-765-5091,,john.hughes@cornerops.com,,3106516

9:Save Quote Data recordcount: 1

9:Save Quote Data ExecutionTime: 4

10:Save Quote Data ExecutionTime: 1

11:ManualPageSections Query SQL:  SELECT DISTINCT s.SectionID
					FROM ManualPageSections s WITH (NOLOCK)
					WHERE ManualID = ?
					AND PageID = ?
				

11:ManualPageSections Query sqlparameters: 2040,600

11:ManualPageSections Query recordcount: 5

11:ManualPageSections Query ExecutionTime: 1

12:Save Quote Data ExecutionTime: 2

13:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? AND ViewID = ? ORDER BY ViewID ASC

13:All Views Query sqlparameters: 2040,2

13:All Views Query recordcount: 1

13:All Views Query ExecutionTime: 1

14:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

14:Pages Query sqlparameters: 2040,2,700

14:Pages Query recordcount: 1

14:Pages Query ExecutionTime: 1

15:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.ProgressMilestone = 'Y'
						ORDER BY m2.PageOrder
					

15:Pages Query sqlparameters: 2040,2

15:Pages Query recordcount: 10

15:Pages Query ExecutionTime: 2

16:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in ('NONE','RATING')
								AND (ISNULL(PolicyTypeCode, '') = '' OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

16:QuestionsQry sqlparameters: 2040,700,1,2022-01-01,2022-01-01,D,B,N,O,DP3

16:QuestionsQry recordcount: 15

16:QuestionsQry ExecutionTime: 3

17:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in ('NONE','RATING')
								AND (ISNULL(PolicyTypeCode, '') = '' OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

17:QuestionsQry sqlparameters: 2040,700,2,2022-01-01,2022-01-01,D,B,N,O,DP3

17:QuestionsQry recordcount: 4

17:QuestionsQry ExecutionTime: 2

18:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in ('NONE','RATING')
								AND (ISNULL(PolicyTypeCode, '') = '' OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

18:QuestionsQry sqlparameters: 2040,701,2,2022-01-01,2022-01-01,D,B,N,O,DP3

18:QuestionsQry recordcount: 6

18:QuestionsQry ExecutionTime: 2

19:Choices Query SQL:  Select ManualChoices.* from ManualChoices
				WHERE ManualID = ?
				AND QuestionNumber = ?
				AND DisableClient = 0
				AND 1=1
				Order By QuestionChoiceNumber

19:Choices Query sqlparameters: 2040,1600080

19:Choices Query recordcount: 5

19:Choices Query ExecutionTime: 0

20:Get Client Setting Data ISBlockedMOC SQL: Select FieldName, SettingValue, SettingConditionals, AgentFlag,
						TestModeFlag, UWQuoteCode
						From ISClientSettings
						WHERE ClientNumber = ? 
						AND SettingName = ? 
						AND (StateCode = ?  or StateCode = 0)
						AND (CompanyCode = ?  or CompanyCode = 0)
						AND (PolicyTypeCode = ?  or PolicyTypeCode = 'x' )
						AND (ManualID = ?  or ManualID = 0)
						AND (UWQuoteCode = ?  or UWQuoteCode = 'x' )
						AND StartDate &lt;= ? 
						AND (EndDate Is Null or EndDate > ? ) Order By FieldName, SortOrder 

20:Get Client Setting Data ISBlockedMOC sqlparameters: 21,ISBlockedMOC,0,0,x,0,x,2023-04-04,2023-04-04

20:Get Client Setting Data ISBlockedMOC recordcount: 0

20:Get Client Setting Data ISBlockedMOC ExecutionTime: 1

21:Save Quote Data SQL: UPDATE WebInfo SET InfoWDDX = ? , UWQuoteCode = ? , UWStatusCode = ? , AgentCode = ? , EffectiveDate = ? , ManualID = ? , StateCode = ? , CompanyCode = ? ,
						PolicyTypeCode = ? , Underwriter = ? , ApplicantFirst = ? , ApplicantMiddle = ? , ApplicantLast = ? , ApplicantSuffix = ? , ApplicantAddress1 = ? ,
						ApplicantAddress2 = ? , ApplicantCity = ? , ApplicantState = ? , ApplicantZip = ? , ApplicantZip4 = ? , ApplicantHomePhone = ? ,
						ApplicantWorkPhone = ? , ApplicantEmail = ? , ProgramCode = ? , DateUpdated = GETDATE(), UWStatusDate = GETDATE() where QuoteNumber = ? 

21:Save Quote Data sqlparameters: {WDDX Packet},A,C,10100,2023-04-09,2040,9,81,DP3,,KEITH,ANN,LEBLANC,JR,1837 W 19TH ST,,JACKSONVILLE,FL,32209,,717-765-5091,,john.hughes@cornerops.com,,3106516

21:Save Quote Data recordcount: 1

21:Save Quote Data ExecutionTime: 8
							
							
								struct

ACCESSNUMBER: 2
AUTHTOKEN: a82741540573558027i15151613s3902970422694160i54330
BARRIERISLAND_1: N
BCEGS_1: 4
BUILDINGUNITS_1: 1
COMPANYCODE: 81
CONSTRUCTIONTYPE_1: V
CONSTRUCTIONYEAR_1: 2015
CURRENTPAGE: 700
CURRENTPROGRESSPAGE: 700
CURRENTURL: https://cypresstest.cogisi.com/is/root/index.cfm
DISTANCEFIREHYDRANT_1: LT1000
DISTANCEFIRESTATION_1: 1
DWELLINGTYPE_1: DWELLING
EFFECTIVEDATE: 04/09/2023
EFFECTIVEDATEMAXIMUM: 12/29/2025
EFFECTIVEDATEMINIMUM: 01/16/2015
EXTERIORWALLCOVER_1: CONCRETEBLOCK
FAMILYUNITSROW_1: 1
FIELDNAMES: AUTHTOKEN,CURRENTPAGE,LASTPAGE,CURRENTPROGRESSPAGE,CURRENTURL,ACCESSNUMBER,USERTYPE,INITIALEFFECTIVEDATE,EFFECTIVEDATEMINIMUM,EFFECTIVEDATEMAXIMUM,EFFECTIVEDATE,UWQUOTECODE,POLICYTYPECODE,COMPANYCODE,ISQUICKQUOTE,TERRITORYCODE_1,CONSTRUCTIONTYPE_1,CONSTRUCTIONYEAR_1,OCCUPANCY_1,NUMBERFAMILIES_1,ROWHOUSE_1,NOSAVEROWHOUSE_1,DWELLINGTYPE_1,BUILDINGUNITS_1,FAMILYUNITSROW_1,HEATTYPE1_1,SQUAREFOOTAGE_1,PURCHASEPRICE_1,NUMROOMS_1,NUMSTORIES_1,BCEGS_1,WINDPOOL_1,NEARSINKHOLE_1,NOSAVENEARSINKHOLE_1,ROOFLAYERS_1,EXTERIORWALLCOVER_1,ROOFCONSTRUCTIONYEAR_1,ROOFCONSTRUCTION_1,ROOFCONDITION_1,FOUNDATION_1,FOUNDATIONTYPE_1,MARKETVALUE_1,RESPONDINGFIRESTATION_1,FIRECODE_1,INTERNALPROTECTIONCLASS_1,DISTANCEFIRESTATION_1,DISTANCEFIREHYDRANT_1,PLANNEDSUBDIVISION_1,NOSAVEPLANNEDSUBDIVISION_1,SUBDIVISION_1,BARRIERISLAND_1,NOSAVEBARRIERISLAND_1,WINDMITPREMIUM_1,WMWATERRESISTANCE_1,WMROOFCOVERING_1,ROOFDECKATTACH_1,WMROOFANCHORAGE_1,WBDR_1,WMROOFGEOMETRY_1,WMWINDOWPROTECTION_1,IBHS_1,TERRAIN_1,WINDSPEED_1,LASTELECTRICALUPDATE_1,LASTROOFUPDATE_1,LASTPLUMBINGUPDATE_1,LASTHEATINGUPDATE_1
FIRECODE_1: [empty string]
FOUNDATIONTYPE_1: BASEMENT
FOUNDATION_1: CLOSED
HEATTYPE1_1: OIL
IBHS_1: PARTIAL
INITIALEFFECTIVEDATE: 04/09/2023
INTERNALPROTECTIONCLASS_1: 1
ISQUICKQUOTE: N
LASTELECTRICALUPDATE_1: 2018
LASTHEATINGUPDATE_1: 2021
LASTPAGE: 600
LASTPLUMBINGUPDATE_1: 2020
LASTROOFUPDATE_1: 2019
MARKETVALUE_1: 300000
NEARSINKHOLE_1: N
NOSAVEBARRIERISLAND_1: N
NOSAVENEARSINKHOLE_1: N
NOSAVEPLANNEDSUBDIVISION_1: N
NOSAVEROWHOUSE_1: N
NUMBERFAMILIES_1: 2
NUMROOMS_1: 11
NUMSTORIES_1: 1
OCCUPANCY_1: TENANT
PLANNEDSUBDIVISION_1: N
POLICYTYPECODE: DP3
PURCHASEPRICE_1: 305080
RESPONDINGFIRESTATION_1: JACKSONVILLE
ROOFCONDITION_1: ABOVEAVERAGE
ROOFCONSTRUCTIONYEAR_1: 2015
ROOFCONSTRUCTION_1: 3TAB
ROOFDECKATTACH_1: NA
ROOFLAYERS_1: 1
ROWHOUSE_1: N
SQUAREFOOTAGE_1: 2546
SUBDIVISION_1: [empty string]
TERRAIN_1: B
TERRITORYCODE_1: 39
USERTYPE: internal
UWQUOTECODE: A
WBDR_1: N
WINDMITPREMIUM_1: 15000
WINDPOOL_1: N
WINDSPEED_1: 110
WMROOFANCHORAGE_1: CLIPS
WMROOFCOVERING_1: FBC
WMROOFGEOMETRY_1: NA
WMWATERRESISTANCE_1: N
WMWINDOWPROTECTION_1: HURRICANE
 
							
							
								
									struct [empty]

 
								
							
								
									[cfc1] component is.application.includes.class_Auth

PRIMARYKEY: 3106516 
IPADDRESS: 98.237.120.185 
SECONDARYKEY: [empty string] 
VIEWID: 2 
DATAPACKET: 31065162internal0TopMenuOneSectionISiAppa82741540573558027i15151613s3902970422694160i543302040QuoteJHUGHESN60yes04/04/2023 03:18:18PM 
USERTYPE: internal 
VERIFIED: true 
USERLOGINID: 0 
LAYOUTNAME: TopMenuOneSection 
AUTHPURPOSE: ISiApp 
CHANGED: false 
AUTHTOKEN: a82741540573558027i15151613s3902970422694160i54330 
MANUALID: 2040 
WDDXEXTENSIONID: [empty string] 
DATATYPE: Quote 
USERLOGINNAME: JHUGHES 
PAGEID: [empty string] 
FREEMENUNAV: N 
Methods: 
	GETAGENTPROFILEITEM
		[function]
		Arguments: 
			Name: profileItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETPROFILEITEM
		[function]
		Arguments: 
			Name: profileItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETUSERDETAILS
		[function]
		Arguments: 
			Name: UserLoginID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: UserLoginName 
			Required: Required 
			Type: string 
			default: 
		ReturnType: struct 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: UseDefaultOnBlank 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INIT
		[function]
		Arguments: 
			Name: Purpose 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: auth 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	NEWTOKEN
		[function]
		Arguments: none 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	REFRESHDATAPACKET
		[function]
		Arguments: 
			Name: XMLNodeArray 
			Required: Required 
			Type: array 
			default: 
		ReturnType: array 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVE
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATEUSERLOG
		[function]
		Arguments: 
			Name: Process 
			Required: Required 
			Type: string 
			default: 
		 
			Name: ProcessInfo 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	VERIFY
		[function]
		Arguments: 
			Name: token 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	VERIFYSUPPORTINGTOKEN
		[function]
		Arguments: 
			Name: tokenType 
			Required: Required 
			Type: string 
			default: 
		 
			Name: token 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
								
							
								
									[cfc1] component is.application.includes.class_Quote

FIELDSTOTRACKISCHANGED: [empty string] 
WDDXTABLE: DECPAGES 
RATEFLOW: Yes 
COMPANYCODE: 81 
STATUS: Loaded 
WARNUSERONEFFDTCHANGE: No 
AGENTCODE: 10100 
PRIMARYKEY: 3106516 
NUMBEROFAPPLICANTS: 1 
EFFDTCHANGED: false 
POLICYTYPECODE: DP3 
AGENTBACKAPP: No 
FIELDNAMEBLACKLIST: NONE,FIELDNAMES,CurrentUrl,AuthToken,PrimaryKey,SecondaryKey,OVERRIDEMANUALID,OVERRIDEMENUNAVIGATION,OVERRIDEUSERTYPE,OVERRIDEVIEWID,sAuthToken,sAuthTokenType,ErrorMessage,ErrorFieldName,APPRESTART,JSResize,EMAILBODY,EMAILSUBJECT,ParentID,ParentText,TargetManual 
APPLICANTLIST: 1:KEITH ANN LEBLANC JR 
FIELDSFORREASSIGNDRIVER: DriverFlagzzzz,ExcludedDriverzzzz,ApplicantBirthDatezzzz,ApplicantMaritalStatuszzzz,ApplicantSexzzzz,LicenseDatezzzz,DriverYearsLicensedzzzz,LicenseStatuszzzz,LicenseStatezzzz,DriverDefensivezzzz,DefensiveDrivingDatezzzz,DriverYouthTrainingzzzz,DriverMVDIzzzz,DriverUSCitizenzzzz,DriverOOSzzzz,DriverAgezzzz,ApplicantRelationshipzzzz,PercentUsezzzz,LicenseTypezzzz,AVDatezzzz,AVTypeCodezzzz,Ignore_,CompDed_,CollDED_,PrimaryDriver_,RatedDriver_,VehicleVin_,VehicleUse_ 
RATEEFFECTIVEDATE: 1/1/2022 
QUOTENUMBER: 3106516 
DATATYPE: Quote 
APPLICANTNAME: KEITH ANN LEBLANC JR 
UWSTATUSCODE: C 
MANUALID: 2040 
MAXINSUREDID: 0 
CHANGED: true 
UWQUOTECODE: A 
RELATEDQUOTES: 
	[array] 
MIDTERMCHANGEMODE: No 
WDDXPURPOSECODE: NONE 
READONLY: false 
STATECODE: 9 
READONLYMESSAGE: [empty string] 
MAXRISKID: 0 
RELATEDQUOTEUPDATEBLACKLIST: NONE,VIEW,START,PAGE,NEXTPAGE,SEARCHVALUE,ISPUBLICQUOTE,SCROLLTO,RATINGERRORS,BILLCONTROL,CHARGEFEELIST,USECHARGEFEELIST,TAXLIST,FILINGFEES,FOCUSOBJECT,EXCELQUOTE,WORDQUOTE,EMAILQUOTE,PolicyID,ADDPREVIOUSITEM,ADDPREVIOUSITEMNUM,AddPreviousDetailNum,QUOTENUMBER,QCODE,UWSTATUSCODE,UWSTATUSDATE,HASCHANGED,NEEDTORATE,MANUALID,STATECODE,RATELOOP,RATEEFFECTIVEFIELD,RATEEFFECTIVEDATE,RATEEFFECTIVEENDDATE,ManualEffectiveDate,PolicyTypeCode,POLICYTYPELIST,ISCOMPANYRATED,INITIALEFFECTIVEDATE,INITIALCOMPANYCODE,NUMBEROFAPPLICANTS,NUMBEROFRISKS,RISKTODELETE,RISKTOREPLACE,EFFECTIVEDATE,EXPIRATIONDATE,TRANSEFFECTIVEDATE,TransEffectiveDateMinimum,TransEffectiveDateMaximum,EffectiveDateMinimum,EffectiveDateMaximum,QuoteList,EndorseList,UWQuoteCode,GetDetails,AddDetails,DeleteDetails,StartDetailsView,AccessNumber,APPLICANTTODELETE,CopyRiskRating,PrimaryDriver,ValidationSeverityLevel,EffectiveTime,SensitiveDataFields,FILEUPLOAD_TABLE,ADDITIONALINTERESTS,SCHEDULEDPROPERTY,AVCount 
POLICYMODE: false 
LOADED: true 
NUMBEROFRISKS: 1 
QUOTELAUNCHEFFECTIVEDATE: [empty string] 
WDDXEXTENSIONID: [empty string] 
LOADRELATEDQUOTES: true 
CURRENTDETAILFIELD: [empty string] 
Methods: 
	BRIDGE
		[function]
		Arguments: 
			Name: BridgeAction 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKBILLPOLICYFIELDS
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKBINDINGAUTHORITYOPT
		[function]
		Arguments: 
			Name: HideFrom 
			Required: Required 
			Type: string 
			default: 
		 
			Name: Authority 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKHIDEFROMUSER
		[function]
		Arguments: 
			Name: HideCode 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKREASSIGNDRIVERS
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETEAPPLICANT
		[function]
		Arguments: 
			Name: ApplicantToDelete 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETEDETAIL
		[function]
		Arguments: 
			Name: DetailItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DetailSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: QuestionNumber 
			Required: Required 
			Type: string 
			default: 
		 
			Name: SectionID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: FieldName 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETERISK
		[function]
		Arguments: 
			Name: RiskToDelete 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DETERMINEREADONLY
		[function]
		Arguments: 
			Name: CurrentRatingStatusCode 
			Required: Optional 
			Type: string 
			default: X
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GENERATENEWQUOTE
		[function]
		Arguments: none 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETDISPLAYRISKLIST
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETFEE
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: FeeName 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETIDNUMBER
		[function]
		Arguments: 
			Name: ID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: type 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DetailType 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: PrimaryField 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: PrimaryFieldID 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETINSUREDS
		[function]
		Arguments: 
			Name: bIncludeExcluded 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: query 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETKEYS
		[function]
		Arguments: none 
		ReturnType: array 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETMANUALRECORD
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETMANUALSTATUSCODES
		[function]
		Arguments: none 
		ReturnType: Any 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETPRIMARYFIELD
		[function]
		Arguments: 
			Name: keyName 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETRISKDESCRIPTIONLIST
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETRISKSTORATELIST
		[function]
		Arguments: none 
		ReturnType: Any 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETSPECIFICWEBAPPRATINGRESULTSPREMIUM
		[function]
		Arguments: 
			Name: FieldName 
			Required: Optional 
			Type: Any 
			default: 
		 
			Name: type 
			Required: Optional 
			Type: Any 
			default: 
		 
			Name: tempSuffix 
			Required: Optional 
			Type: Any 
			default: 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: UseDefaultOnBlank 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETWEBAPPRATINGRESULTSPREMIUM
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INIT
		[function]
		Arguments: none 
		ReturnType: quote 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INITIALIZEADDITIONALQUOTES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	ISCHANGEDELIMS
		[function]
		Arguments: 
			Name: value 
			Required: Required 
			Type: string 
			default: 
		 
			Name: delim 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADAPPLICANTLIST
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADCLIENTCODE
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADDATA
		[function]
		Arguments: 
			Name: PrimaryKey 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADSUPPLIMENT
		[function]
		Arguments: 
			Name: inPurposeCode 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	MAPIDNUMBER
		[function]
		Arguments: 
			Name: ID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: type 
			Required: Required 
			Type: string 
			default: 
		 
			Name: relatedID 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: DetailFieldName 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: RelatedType 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	POSTSAVEFORMDATA
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	RETURNWDDX
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVE
		[function]
		Arguments: 
			Name: bSetRatingStatus 
			Required: Optional 
			Type: string 
			default: false
		 
			Name: bIgnoreReadOnly 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVERELATEDQUOTES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETEFFECTIVEDATES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bPushThoughChanges 
			Required: Optional 
			Type: boolean 
			default: true
		 
			Name: DoAdditionalProcessing 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SHOWADDRESS
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DataPrefix 
			Required: Optional 
			Type: string 
			default: Applicant
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SHOWPREMIUM
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATENUMBEROF
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATERELATEDQUOTES
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
								
								
									
		
			
			
				Key Name
				Value
			
			
			
				
					
						_1
						N
					
				
					
						ACCESSNUMBER
						2
					
				
					
						ADDRESSCHANGED
						N
					
				
					
						ADDRESSCHANGED_1
						N
					
				
					
						AGENTADDRESS
						15 MAIN ST Suite 101, HOUSTON, TX 77002 1111
					
				
					
						AGENTCANWRITE12099
						Y
					
				
					
						AGENTCANWRITECENTRALFL
						Y
					
				
					
						AGENTCANWRITESWFL
						Y
					
				
					
						AGENTCODE
						10100
					
				
					
						AGENTDATALOADED
						10100
					
				
					
						AGENTDATELOADED
						04/04/2023
					
				
					
						AGENTENOTIFYADDRESS
						test.agency@cornerops.com
					
				
					
						AGENTHASACHSETUP
						no
					
				
					
						AGENTINFO
						TEST AGENCY - 10100
					
				
					
						AGENTMVRCHARGEFLAG
						N
					
				
					
						ALTERNATEREPORTPROTECTIONCLASS_1
						10W/10
					
				
					
						ALTERNATEREPORTPROTECTIONCLASS_1_1
						10W/10
					
				
					
						APPLICANTADDRESS1
						1837 W 19TH ST
					
				
					
						APPLICANTADDRESS1_1
						1837 W 19TH ST
					
				
					
						APPLICANTADDRESSTYPE
						domestic
					
				
					
						APPLICANTADDRESSTYPE_1
						domestic
					
				
					
						APPLICANTAGEZZZZ1
						43
					
				
					
						APPLICANTBIRTHDATEZZZZ1
						02/02/1980
					
				
					
						APPLICANTCITY
						JACKSONVILLE
					
				
					
						APPLICANTCITY_1
						JACKSONVILLE
					
				
					
						APPLICANTEMAILZZZZ1
						john.hughes@cornerops.com
					
				
					
						APPLICANTFIRSTZZZZ1
						KEITH
					
				
					
						APPLICANTHOMEPHONEZZZZ1
						717-765-5091
					
				
					
						APPLICANTLASTZZZZ1
						LEBLANC
					
				
					
						APPLICANTMARITALSTATUSZZZZ1
						S
					
				
					
						APPLICANTMIDDLEZZZZ1
						ANN
					
				
					
						APPLICANTNAME
						KEITH ANN LEBLANC JR
					
				
					
						APPLICANTRELATIONSHIPZZZZ1
						SELF
					
				
					
						APPLICANTSTATE
						FL
					
				
					
						APPLICANTSTATE_1
						FL
					
				
					
						APPLICANTSUFFIXZZZZ1
						JR
					
				
					
						APPLICANTZIP
						32209
					
				
					
						APPLICANTZIP_1
						32209
					
				
					
						APPLICATIONFORECLOSURES_1
						N
					
				
					
						APPLIESTOLIST
						O
					
				
					
						AppProtectionClass_1
						1
					
				
					
						AppReportProtectionClass_1
						
					
				
					
						AreaID
						3
					
				
					
						ARSONCONVICTION_1
						N
					
				
					
						AUTOLATLONGINDICATORLAT
						L
					
				
					
						AUTOUNDERWRITING
						0
					
				
					
						BARRIERISLAND_1
						N
					
				
					
						BCEGS_1
						4
					
				
					
						BCEGS_1_1
						06
					
				
					
						BCEGS_2_1
						03
					
				
					
						BCEGS_3_1
						04
					
				
					
						BCEGS_4_1
						04
					
				
					
						BCEGSYEAR_1
						2012
					
				
					
						BCEGSYEAR_1_1
						1996
					
				
					
						BCEGSYEAR_2_1
						2001
					
				
					
						BCEGSYEAR_3_1
						2008
					
				
					
						BCEGSYEAR_4_1
						2012
					
				
					
						BILLCONTROL
						819DP304/09/2023AApp_A
					
				
					
						BOBCARRIERNAME
						GEICO
					
				
					
						BOBDISCEXPDATE
						03/22/2024
					
				
					
						BOBDISCEXPDAYS_1
						348
					
				
					
						BOBDISCOUNT
						Y
					
				
					
						BOBDISCSTARTDATE
						03/22/2023
					
				
					
						BOBDISCSTARTDAYS_1
						18
					
				
					
						BOBTRANSFER_1
						N
					
				
					
						BUILDERONLY
						N
					
				
					
						BUILDINGUNITS_1
						1
					
				
					
						BURGLARALARMCREDIT_1
						CENTRAL
					
				
					
						CANAGENTBIND
						N
					
				
					
						CANENTERPAYMENTS
						no
					
				
					
						CANWRITECENTRALFL
						Y
					
				
					
						CANWRITEPALMBEACH
						Y
					
				
					
						CANWRITESWFL
						Y
					
				
					
						CCHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						CENSUSBLOCKID_1
						120310029014008
					
				
					
						CHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						CITY
						Jacksonville
					
				
					
						CITY_1
						Jacksonville
					
				
					
						COMPANYCODE
						81
					
				
					
						CONSTRUCTIONTYPE_1
						V
					
				
					
						CONSTRUCTIONYEAR_1
						2015
					
				
					
						CONTENTSLIMIT_1
						25000
					
				
					
						COUNTRYNAME
						US
					
				
					
						COUNTRYNAME_1
						US
					
				
					
						COUNTYCODE_1
						12031
					
				
					
						COUNTYCODE_1_1
						12031
					
				
					
						COUNTYFIPSCODE_1
						12031
					
				
					
						COUNTYFIPSCODE_1_1
						12031
					
				
					
						COUNTYNAME_1
						DUVAL
					
				
					
						COUNTYNAME_1_1
						DUVAL
					
				
					
						COVEREDPORCH_1
						N
					
				
					
						CURRENTDETAILFIELD
						OptionalCoverages_1
					
				
					
						CURRENTPAGE
						700
					
				
					
						CURRENTPROGRESSPAGE
						700
					
				
					
						CYPRESSCONVERSION
						N
					
				
					
						DECTAXLIST
						
					
				
					
						DEDUCTIBLE_1
						5000
					
				
					
						DEFAULTEDTOZIPINDICATORLAT
						N
					
				
					
						DEPBILLCONTROL
						819DP304/09/2023AApp_A
					
				
					
						DEPOSITDATE
						04/04/2023
					
				
					
						DEPOSITUNVERIFIED
						Y
					
				
					
						DISTANCEFIREHYDRANT_1
						LT1000
					
				
					
						DISTANCEFIRESTATION_1
						1
					
				
					
						DISTANCEFIRESTATION_1_1
						01
					
				
					
						DTAC_1
						17.1114
					
				
					
						DUEDATE
						
					
				
					
						DwellingAge_1
						8
					
				
					
						DWELLINGLIMIT_1
						300000.00
					
				
					
						DWELLINGTYPE_1
						DWELLING
					
				
					
						EFFECTIVEDATE
						04/09/2023
					
				
					
						EFFECTIVEDATEMAXIMUM
						12/29/2025
					
				
					
						EFFECTIVEDATEMINIMUM
						01/16/2015
					
				
					
						EFFECTIVEDATESET
						04/04/2023
					
				
					
						EFFECTIVEDATEUSERLOGINNAME
						JHUGHES
					
				
					
						EFFECTIVEDATEUSERTYPE
						internal
					
				
					
						EXOTICPETS_1
						N
					
				
					
						EXTERIORWALLCOVER_1
						CONCRETEBLOCK
					
				
					
						FAIRRENTALADDTLLIVINGLIMIT_1
						20
					
				
					
						FAMILYUNITSROW_1
						1
					
				
					
						FARMORRANCH_1
						N
					
				
					
						FEELOOKUPPROCESS
						App_A
					
				
					
						FIREALARMCREDIT_1
						CENTRAL
					
				
					
						FIREPROTECTIONAREA_1
						JACKSONVILLE
					
				
					
						FIREPROTECTIONAREA_1_1
						JACKSONVILLE
					
				
					
						FIRESTATIONDISTANCEBAND_1
						01
					
				
					
						FIRESTATIONDISTANCEBAND_1_1
						01
					
				
					
						FIRESTATIONDISTANCERANGE_1
						1 MILE OR LESS
					
				
					
						FIRESTATIONDISTANCERANGE_1_1
						1 MILE OR LESS
					
				
					
						FLOODCARRIER_1
						FREE WATER
					
				
					
						FLOODPOLICYNUM_1
						651561651651
					
				
					
						FLOODZONE_1
						A
					
				
					
						FOUNDATION_1
						CLOSED
					
				
					
						FOUNDATIONTYPE_1
						BASEMENT
					
				
					
						GMBLOCK
						4008
					
				
					
						GMBLOCK_1
						4008
					
				
					
						GMBLOCKGROUP
						0
					
				
					
						GMBLOCKGROUP_1
						0
					
				
					
						GMCOUNTY
						031
					
				
					
						GMCOUNTY_1
						031
					
				
					
						GMFIPS_1
						120310029014008
					
				
					
						GMGEOCODEFORMSUBMITALERT_1
						No
					
				
					
						GMGEOCODERESULTID_1
						12962548
					
				
					
						GMLATITUDE
						30.355421
					
				
					
						GMLATITUDE_1
						30.355421
					
				
					
						GMLONGITUDE
						-81.687349
					
				
					
						GMLONGITUDE_1
						-81.687349
					
				
					
						GMMATCHEDADDRESS
						1837 19th St, Jacksonville, FL, 32209
					
				
					
						GMMATCHEDADDRESS_1
						1837 19th St, Jacksonville, FL, 32209
					
				
					
						GMSTATE
						12
					
				
					
						GMSTATE_1
						12
					
				
					
						GMTRACT
						002901
					
				
					
						GMTRACT_1
						002901
					
				
					
						GMUSCBGEOCODINGCOMPLETED_1
						Yes
					
				
					
						GMUSPSVERIFICATIONSUCCESSFUL_1
						Yes
					
				
					
						GQRECVEHICLES_1
						N
					
				
					
						GQRENOVATION_1
						N
					
				
					
						HEATTYPE1_1
						OIL
					
				
					
						HOMELATITUDE_1
						30.355421
					
				
					
						HOMELONGITUDE_1
						-81.687349
					
				
					
						HTMLTEXTAGENTCODE
						DBA TEST AGENCY
					
				
					
						HTMLTEXTAGENTCODEEMAIL
						test.agency@cornerops.com
					
				
					
						HTMLTEXTSUBAGENTCODE
						JOHN HUGHES 564873
					
				
					
						IBHS_1
						PARTIAL
					
				
					
						INITIALEFFECTIVEDATE
						04/09/2023
					
				
					
						INITIALRATEEFFECTIVEDATE
						01/01/2022
					
				
					
						INTERFACEVERSION
						UA
					
				
					
						InternalProtectionClass_1
						1
					
				
					
						ISOProtectionClass_1
						1
					
				
					
						ISQUICKQUOTE
						N
					
				
					
						LASTELECTRICALUPDATE_1
						2018
					
				
					
						LASTHEATINGUPDATE_1
						2021
					
				
					
						LASTPAGE
						600
					
				
					
						LASTPLUMBINGUPDATE_1
						2020
					
				
					
						LASTROOFUPDATE_1
						2019
					
				
					
						LIMITEDWATERDMG_1
						N
					
				
					
						LIVESTOCK_1
						N
					
				
					
						LoadRisk
						1
					
				
					
						LOCATIONZIP_1
						32209
					
				
					
						MandatoryFungi_1
						Y
					
				
					
						MandatoryOrdLaw_1
						Y
					
				
					
						MANUALEFFECTIVEDATE
						01/01/2022
					
				
					
						MANUALID
						2040
					
				
					
						MANUALRENEWALDATE
						01/01/2022
					
				
					
						MARKETVALUE_1
						300000
					
				
					
						MATCHTYPE_1
						A
					
				
					
						MAXPAYMENTAMOUNT
						859
					
				
					
						MEDICALLIMIT_1
						5000
					
				
					
						MIDTERMCHANGEMODE
						No
					
				
					
						MinPremAdj
						N
					
				
					
						MoldFungiLimit_1
						10000
					
				
					
						NAMEDINSUREDFLAGZZZZ1
						Y
					
				
					
						NEARSINKHOLE_1
						N
					
				
					
						NEEDTORATE
						1
					
				
					
						NEXTPAGE
						99
					
				
					
						NOTIFYAGENTFLAG
						Y
					
				
					
						NUMBERFAMILIES_1
						2
					
				
					
						NUMBEROFACRES_1
						N
					
				
					
						NUMBEROFAPPLICANTS
						1
					
				
					
						NUMBEROFRISKS
						1
					
				
					
						NUMROOMS_1
						11
					
				
					
						NUMSTORIES_1
						1
					
				
					
						OCCUPANCY_1
						TENANT
					
				
					
						OCCUPATIONTYPEZZZZ1
						EMPLOYED
					
				
					
						OCCUPIEDDAYCARE_1
						N
					
				
					
						OnLastPage
						N
					
				
					
						OPENWATEREXPOSURE_1
						N
					
				
					
						OPTIONALCOVERAGES_1
						0
					
				
					
						OrdinanceLaw_1
						10
					
				
					
						OTHERSTRUCTURESAMOUNT_1
						2
					
				
					
						OtherStructuresLimit_1
						6000
					
				
					
						OWNERCODE
						O
					
				
					
						PAGEHISTORY
						100,101,200,400,500,600,700
					
				
					
						PageID
						200
					
				
					
						PAPERLESS
						Y
					
				
					
						PASSEDCAPACITYRULES
						Y
					
				
					
						PAYMENTAMOUNTLIST
						
					
				
					
						PAYMENTDATELIST
						
					
				
					
						PERSONALLIABILITYLIMIT_1
						100000
					
				
					
						PIFREQUIREDDEPOSITAMOUNT
						
					
				
					
						PLANNEDSUBDIVISION_1
						N
					
				
					
						POLICYHASACHSET
						N
					
				
					
						POLICYHASRCCSET
						N
					
				
					
						PolicyNumberPartList
						IFD,FLPOLICYNO:7,-00
					
				
					
						POLICYTERM
						12
					
				
					
						POLICYTYPECODE
						DP3
					
				
					
						POLICYTYPELIST
						'DP3'
					
				
					
						PREDIRECTION
						W
					
				
					
						PREDIRECTION_1
						W
					
				
					
						PREVIOUSADDRESS1
						850 Queen St
					
				
					
						PREVIOUSADDRESSTYPE
						domestic
					
				
					
						PREVIOUSCITY
						Harrisburg
					
				
					
						PREVIOUSSTATE
						PA
					
				
					
						PREVIOUSZIP
						17113
					
				
					
						PRIORCARRIER_1
						TRAVELERS
					
				
					
						PRIOREXPDAYS_1
						-21
					
				
					
						PRIOREXPIRATIONDATE_1
						04/30/2023
					
				
					
						PRIORINSURANCE_1
						Y
					
				
					
						PRIORPOLICYNUMBER_1
						2313564897
					
				
					
						ProtectionClass_1
						1
					
				
					
						ProtectionClassList_1
						1
					
				
					
						ProtectionSubscription_1
						
					
				
					
						PURCHASEDATE_1
						09/03/2018
					
				
					
						PURCHASEDAYS_1
						1679
					
				
					
						PURCHASEPRICE_1
						305080
					
				
					
						QUOTENUMBER
						3106516
					
				
					
						RATEEFFECTIVEDATE
						1/1/2022
					
				
					
						RATEEFFECTIVEFIELD
						ManualStart
					
				
					
						RatingCount
						1
					
				
					
						REASSIGNDRIVERS
						Y
					
				
					
						RENTEDLT5DAYS_1
						N
					
				
					
						RENTEDSTUDENT_1
						N
					
				
					
						REPORTPROTECTIONCLASS_1
						1
					
				
					
						REPORTPROTECTIONCLASS_1_1
						1
					
				
					
						REQUIREDDEPOSITAMOUNT
						27
					
				
					
						REQUIREDDEPOSITCODE
						
					
				
					
						RESPONDINGFIRESTATION_1
						JACKSONVILLE
					
				
					
						RESPONDINGFIRESTATION_1_1
						JACKSONVILLE
					
				
					
						RESULTCOUNTAIRHAZARD
						1
					
				
					
						ResultCountBCEGS_1
						4
					
				
					
						RESULTCOUNTCENSUS
						1
					
				
					
						RESULTCOUNTCUSTOM
						1
					
				
					
						RESULTCOUNTLAT
						1
					
				
					
						ResultCountPPC_1
						1
					
				
					
						RESULTCOUNTSINKHOLE
						1
					
				
					
						RESULTCOUNTWINDPOOL
						1
					
				
					
						ReturnSourceBCEGS_1
						ADDRESS
					
				
					
						RETURNSOURCECENSUS
						ADDRESS
					
				
					
						RETURNSOURCECUSTOM
						ADDRESS
					
				
					
						RETURNSOURCELAT
						N/A
					
				
					
						ReturnSourcePPC_1
						ADDRESS
					
				
					
						RETURNSOURCESINKHOLE
						ADDRESS
					
				
					
						RETURNSOURCEWINDPOOL
						ADDRESS
					
				
					
						REVERTFEELIST
						
					
				
					
						RISKAGE_1
						8
					
				
					
						ROOFCONDITION_1
						ABOVEAVERAGE
					
				
					
						ROOFCONSTRUCTION_1
						3TAB
					
				
					
						ROOFCONSTRUCTIONYEAR_1
						2015
					
				
					
						ROOFDECKATTACH_1
						NA
					
				
					
						ROOFLAYERS_1
						1
					
				
					
						ROWHOUSE_1
						N
					
				
					
						SECUREDBUILDINGCREDIT_1
						SINGLEENTRY
					
				
					
						SeniorRetiree_1
						N
					
				
					
						SERVICEFEE
						0
					
				
					
						SINKHOLEAREASCORE_1
						2
					
				
					
						SINKHOLEDEDUCTIBLE_1
						10
					
				
					
						SINKHOLELIMIT_1
						N
					
				
					
						SINKHOLEPLACEMENTTYPE_1
						E
					
				
					
						SINKHOLERISKSCORE_1
						4
					
				
					
						SPRINKLER_1
						PARTIAL
					
				
					
						SQUAREFOOTAGE_1
						2546
					
				
					
						STATECODE
						9
					
				
					
						STATECODE_1
						FL
					
				
					
						STREETNAME
						19th
					
				
					
						STREETNAME_1
						19th
					
				
					
						STREETNUMBER
						1837
					
				
					
						STREETNUMBER_1
						1837
					
				
					
						STREETTYPE
						St
					
				
					
						STREETTYPE_1
						St
					
				
					
						SUBAGENTCODE
						10100_JHUGHES
					
				
					
						SWIMMINGPOOL_1
						N
					
				
					
						TAXLIST
						
					
				
					
						TERRAIN_1
						B
					
				
					
						TERRITORYCODE_1
						39
					
				
					
						TOTALPREMIUM
						832
					
				
					
						TRAMPOLINE_1
						N
					
				
					
						UNREPAIREDDAMAGE_1
						N
					
				
					
						USECHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						USERTYPE
						internal
					
				
					
						USPSCOMPLETEADDRESS-APPLICANT
						1837 W 19TH ST, JACKSONVILLE, FL, 32209
					
				
					
						USPSCOMPLETEADDRESS-APPLICANT_1
						1837 W 19TH ST, JACKSONVILLE, FL, 32209
					
				
					
						USPSCOMPLETEADDRESS-PREVIOUS
						850 Queen St, Harrisburg, PA 17113
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-APPLICANT
						0
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-APPLICANT_1
						0
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-PREVIOUS
						1
					
				
					
						UWQUOTECODE
						A
					
				
					
						UWSTATUSCODE
						C
					
				
					
						VALIDBILLING
						true
					
				
					
						VALIDRATING
						true
					
				
					
						VERINTGADDRESSCHANGED_1
						N
					
				
					
						VERINTGApplicantAddress1_1
						1837 W 19TH ST
					
				
					
						VERINTGApplicantAddress2_1
						
					
				
					
						VERINTGApplicantCity_1
						JACKSONVILLE
					
				
					
						VERINTGApplicantState_1
						FL
					
				
					
						VERINTGApplicantZip_1
						32209
					
				
					
						VERINTGCITY_1
						Jacksonville
					
				
					
						VERINTGCOUNTRYNAME_1
						US
					
				
					
						VERINTGErrorCode_1
						OK
					
				
					
						VERINTGErrorMessage_1
						OK
					
				
					
						VERINTGHitFlag_1
						Y
					
				
					
						VERINTGNumberReorders_1
						1
					
				
					
						VERINTGOrderDate_1
						4/4/2023
					
				
					
						VERINTGOrderMessage_1
						 UWOrderRules - 
					
				
					
						VERINTGOrderReason_1
						2
					
				
					
						VERINTGPREDIRECTION_1
						W
					
				
					
						VERINTGRECORDCOUNTBCEGS_1
						4
					
				
					
						VERINTGRECORDCOUNTPPC_1
						1
					
				
					
						VERINTGReferenceNumber_1
						d468ad2e-54b0-4df9-b780-bfc750b2a1d6
					
				
					
						VERINTGReportStatus
						
					
				
					
						VERINTGReportStatusDate
						
					
				
					
						VERINTGReportStatusMessage
						
					
				
					
						VERINTGResultID_1
						20276226
					
				
					
						VERINTGRETURNSOURCEBCEGS_1
						ADDRESS
					
				
					
						VERINTGRETURNSOURCEPPC_1
						ADDRESS
					
				
					
						VERINTGSTATECODE_1
						FL
					
				
					
						VERINTGStopErrorCode
						
					
				
					
						VERINTGStopErrorMessage
						
					
				
					
						VERINTGSTREETNAME_1
						19th
					
				
					
						VERINTGSTREETNUMBER_1
						1837
					
				
					
						VERINTGSTREETTYPE_1
						St
					
				
					
						VERINTGZIP4CODE_1
						4815
					
				
					
						VERINTGZIPCODE_1
						32209
					
				
					
						VERISKRESULTID
						12962548
					
				
					
						VERISKRESULTID_1
						12962548
					
				
					
						VIEWID
						2
					
				
					
						WBDR_1
						N
					
				
					
						WINDHAILDEDUCTIBLE_1
						5
					
				
					
						WindHailDeductibleAmount_1
						15000
					
				
					
						WINDMITPREMIUM_1
						15000
					
				
					
						WINDPOOL_1
						N
					
				
					
						WINDPOOLINDICATOR_1
						N
					
				
					
						WINDPOOLZONE_1
						-
					
				
					
						WINDSPEED_1
						110
					
				
					
						WLMClass
						NC2
					
				
					
						WMROOFANCHORAGE_1
						CLIPS
					
				
					
						WMROOFCOVERING_1
						FBC
					
				
					
						WMROOFGEOMETRY_1
						NA
					
				
					
						WMWATERRESISTANCE_1
						N
					
				
					
						WMWINDOWPROTECTION_1
						HURRICANE
					
				
					
						ZIP4CODE
						4815
					
				
					
						ZIP4CODE_1
						4815
					
				
					
						ZIPCODE
						32209
					
				
					
						ZIPCODE_1
						32209
					
				
			
		
	
								
							
								
									struct

AdministratorNotificationEmailFromList: [empty string]
AdministratorNotificationEmailList: [empty string]
AdministratorNotificationTestEmailList: [empty string]
AuthorizedIPAddressList: 127.0.0.1,10.211.113.62,10.212.113.62
ClientColorSchema: [empty string]
ClientNumber: 21
ClientVarsDatasource: ClientVarsDB
DecpageEffectiveDateOffsetDays: 0
DefaultHomePage: [empty string]
EbixDataDatasource: EbixdataSQL
ExtraApplicationName: Test
ISArchiveDatasource: ISArchive21TestSQL
ISBackupDatasource: ISBackup
ISCCDataDatasource: ISCCData21TestSQL
ISCLIENTSQRY:  
	[query]
	 
	[Record # 1] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: [empty string] 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: [empty string] 
	CLIENTNAME: Access Home Insurance Company 
	CLIENTNUMBER: 21 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: [empty string] 
	CLIENTZIP: [empty string] 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: [empty string] 
	EBIXFLAG: N 
	IAPATH: accesshome 
	ISITESTURL: https://accesshometest.cogisi.com/is/root/ 
	ISIURL: https://accesshome.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: accesshome 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://accesshome.cogisi.com/ 
	RUNASCLIENT: [empty string] 
	RUNASIS: Y 
	SHORTNAME: Access Home 
	SSLFLAG: Y
	 
	[Record # 2] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: [empty string] 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: [empty string] 
	CLIENTNAME: Cypress Insurance Company 
	CLIENTNUMBER: 20 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: [empty string] 
	CLIENTZIP: [empty string] 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: 84 
	EBIXFLAG: N 
	IAPATH: cypress 
	ISITESTURL: https://cypresstest.cogisi.com/is/root/ 
	ISIURL: https://cypress.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: cypress 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://cypress.cogisi.com/ 
	RUNASCLIENT: 21 
	RUNASIS: Y 
	SHORTNAME: Access Home 
	SSLFLAG: Y
	 
	[Record # 3] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: 425 N. Prince St. 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: Lancaster 
	CLIENTNAME: Cornerstone 
	CLIENTNUMBER: 18 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: PA 
	CLIENTZIP: 17603 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: [empty string] 
	EBIXFLAG: N 
	IAPATH: cornerstone 
	ISITESTURL: https://cornerstonetest.cogisi.com/is/root/ 
	ISIURL: https://cornerstone.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: cornerstone 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://cornerstone.cogisi.com/ 
	RUNASCLIENT: [empty string] 
	RUNASIS: Y 
	SHORTNAME: Cornerstone 
	SSLFLAG: Y
ISClientDatasource: ISClient21TestSQL
ISDataDatasource: ISData21TestSQL
ISISERVERLOCALURL: https://cypresstest.cogisi.com/is/
ISISERVERURL: https://cypresstest.cogisi.com/is/
ISRatingDatasource: ISRating21TestSQL
ISStatDatasource: ISStat21TestSQL
ISToolsDatasource: ISTools
ISiLocalURLRoot: https://cypresstest.cogisi.com/is/root/
ISiPublicURLRoot: https://cypresstest.cogisi.com/is/root/
IsLocal: false
IsTestMode: true
LocalIPAddressList: 10.211.113.0,127.0.0.1,::1,10.211.113.62
MobileAppCFCPathRoot: [empty string]
NavigationIconOrderList: [empty string]
PUBLICWEBSERVICEURL: https://cypresstest.cogisi.com/is/
ParameterEncryptionKey: e4xyugq/Z67nR9wPvRJ53g==
PublicHTTPHostName: [empty string]
ReportServerLocalURLRoot: http://cypresstest.cogisi.com/ReportServer/Pages/
ReportServerPublicURLRoot: http://cypresstest.cogisi.com/ReportServer/Pages/
SQLParameters: ;SERVER=10.212.113.64;Provider=SQLNCLI11;
ServerLocalURLRoot: https://cypresstest.cogisi.com/
ServerPublicURLRoot: https://cypresstest.cogisi.com/
ThisServerHostsMultipleClientNumbers: true
UseChoicePointWebserviceInsteadOfDLL: true
UseEncryptWebserviceInsteadOfDLL: true
UseHTTPSLocal: true
UseISClaimsWebserviceInsteadOfDLL: true
UseISConvertToWebInfoWebserviceInsteadOfDLL: true
UseISDataAdjustWebserviceInsteadOfDLL: true
UseISOSearchWebserviceInsteadOfDLL: true
UseISTransferWebserviceISOPropertyInsteadOfDLL: true
UseISTransferWebserviceInsteadOfDLL: true
UseISTransferWebserviceReverseTransferInsteadOfDLL: true
UseISTransferWebserviceTransferMainInsteadOfDLL: true
UseISiEDTWebserviceInsteadOfDLL: true
UseISiThirdPartyWebserviceInsteadOfDLL: true
VINWebServiceStaticToken: c0a1846b-ab76-446e-af2f-6004503f3769
WebserviceCallTimeoutValue: 60
WebserviceLocalURLRoot: https://cypresstest.cogisi.com/is/webservices/
WebservicePublicURLRoot: https://cypresstest.cogisi.com/is/webservices/
dbPassword: cypressSQLPASS_437eYu8i
dbUsername: CypressSQLUser
 
								
							
								
									
            
                
                    
                        Step
                        Rate Number
                        Description
                        Rate Mode
                        Flow Info
                        Value
                        Premium
                    
                
                
                    
                        
                            1
                            20
                            Set Risk Zip
                            GetRiskZip
                             
                            32209
                            $0.00
                        
                    
                        
                            2
                            80
                            Set Endorsement Factor
                            EndorsementFactor
                             
                            1
                            $0.00
                        
                    
                        
                            3
                            90
                            Initialize Adjust Base Factor
                            EndorsementFactor
                             
                            1
                            $0.00
                        
                    
                        
                            4
                            110
                            Calculate age of house
                            Subtract
                              !PolicyYear=2023, ConstructionYear=2015
                            8
                            $0.00
                        
                    
                        
                            5
                            120
                            Set Term Count/Tenure
                            SetVariable
                              !TermCount=1
                            1
                            $0.00
                        
                    
                        
                            6
                            150
                            Set DwellingAge in structure
                            AssignField
                              AgeofDwelling=8
                            0
                            $0.00
                        
                    
                        
                            7
                            160
                            Load Agent fields based on ISClientSettings LoadAgentExtFields
                            LoadProfile
                             
                            0
                            $0.00
                        
                    
                        
                            8
                            170
                            Initialize Senior/Retiree Field
                            SetVariable
                              SeniorRetiree
                            
                            $0.00
                        
                    
                        
                            9
                            180
                            Initialize Senior/Retiree Field
                            SetVariable
                              'N'
                            N
                            $0.00
                        
                    
                        
                            10
                            240
                            Assign Senior/Retiree Field
                            AssignField
                              TempSeniorRetiree=N
                            0
                            $0.00
                        
                    
                        
                            11
                            270
                            Initialize MandatoryFungi (used for ManualCoverages)
                            SetVariable
                              'Y'
                            Y
                            $0.00
                        
                    
                        
                            12
                            290
                            Set MandatoryFungi
                            AssignField
                              TempMandatoryFungi=Y
                            0
                            $0.00
                        
                    
                        
                            13
                            300
                            Set MoldFungiLimit
                            AssignField
                              '10000'
                            0
                            $0.00
                        
                    
                        
                            14
                            340
                            Initialize MandatoryOrdLaw (used for ManualCoverages)
                            SetVariable
                              'Y'
                            Y
                            $0.00
                        
                    
                        
                            15
                            360
                            Set MandatoryOrdLaw
                            AssignField
                              TempMandatoryOrdLaw=Y
                            0
                            $0.00
                        
                    
                        
                            16
                            361
                            Fire Protection Class and Responding Fire Dept
                            TPR 0010
                              'VeriskPPC'
                            0
                            $0.00
                        
                    
                        
                            17
                            370
                            Set OrdinanceLaw
                            AssignField
                              '10'
                            0
                            $0.00
                        
                    
                        
                            18
                            380
                            Run ISO Location report and Set Protection Class
                            ISOLocation
                            Error ordering ISO Location Report 
                            0
                            $0.00
                        
                    
                        
                            19
                            390
                            Policy Number
                            SetStructure
                              IFD, FLPOLICYNO:7, -00=0
                            IFD,FLPOLICYNO:7,-00
                            $0.00
                        
                    
                        
                            20
                            400
                            Calc WindHailDeductible Amount
                            Multiply
                              DwellingLimit=300000, WindHailDeductible=5
                            1500000
                            $0.00
                        
                    
                        
                            21
                            410
                            Calc WindHailDeductible Amount
                            Divide
                              TempWindHailDeductibleAmount=1500000, 100=0.01
                            15000
                            $0.00
                        
                    
                        
                            22
                            420
                            Set WindHailDeductible Amount
                            AssignField
                              TempWindHailDeductibleAmount=15000
                            15000
                            $0.00
                        
                    
                        
                            23
                            10000
                            Lookup WLMClass for Wind Mit Lookup-New Construction
                            RateSupport5
                              RoofDeckAttach=NA, Terrain=B, WindSpeed=110, IBHS=PARTIAL, WBDR=N
                            NC2
                            $0.00
                        
                    
                        
                            24
                            10030
                            Lookup Wind Mit Factor-New Construction
                            LookupRate
                              WLMClass, WMRoofGeometry=NA, WMWindowProtection=HURRICANE, WMWaterResistance=N
                            0
                            $0.00
                        
                    
                        
                            25
                            10050
                            Calc Wind Mitigation Amount
                            Subtract
                              1, WindMitFactor=0
                            1
                            $0.00
                        
                    
                        
                            26
                            10051
                            Calc EC Wind Mitigation Amount
                            Subtract
                              1, WindMitFactor=0
                            1
                            $0.00
                        
                    
                        
                            27
                            10052
                            Calc EC Wind Mitigation Amount
                            Multiply
                              TempWindMitEC=1, .05=0.05
                            0.05
                            $0.00
                        
                    
                        
                            28
                            10053
                            Calc EC Wind Mitigation Amount
                            Add
                              TempWindMitEC=0.05, .95=0.95
                            1
                            $0.00
                        
                    
                        
                            29
                            10060
                            Set Protection Class to use for Rating
                            SetVariable
                              ProtectionClass=1
                            1
                            $0.00
                        
                    
                        
                            30
                            10071
                            Calc Coverage B Limit

                            Multiply
                              DwellingLimit=300000, OtherStructuresAmount=2
                            600000
                            $0.00
                        
                    
                        
                            31
                            10072
                            Calc Coverage B Limit

                            Divide
                              TempOtherStructuresLimit=600000, 100=0.01
                            6000
                            $0.00
                        
                    
                        
                            32
                            10073
                            Other Structures Limit
                            AssignField
                              TempOtherStructuresLimit=6000
                            6000
                            $0.00
                        
                    
                        
                            33
                            10074
                            Calc Coverage D/E Limit
                            Multiply
                              DwellingLimit=300000, .2=0.2
                            60000
                            $0.00
                        
                    
                        
                            34
                            10075
                            Set Coverage D/E Limit
                            SetVariable
                              TempFairRentalLimit=60000
                            60000
                            $0.00
                        
                    
                        
                            35
                            10080
                            Lookup AOP Deductible Factor 
                            LookupRate
                              Deductible=5000
                            0.86
                            $0.00
                        
                    
                        
                            36
                            10090
                            Lookup Hurricane Deductible Factor 
                            LookupRate
                              WindHailDeductible=5
                            0.94
                            $0.00
                        
                    
                        
                            37
                            10100
                            Lookup PC/Construction Factor 
                            LookupRate
                              RateProtectionClass=1, ConstructionType=V
                            1
                            $0.00
                        
                    
                        
                            38
                            10110
                            Save PC/Construction Factor for OrdLaw, ACV Loss Settlement &amp; PPRC
                            SetVariable
                              ProtectionConstFactor=1
                            1
                            $0.00
                        
                    
                        
                            39
                            10120
                            Lookup Fire Alarm Factor 
                            LookupRate
                              FireAlarmCredit=CENTRAL
                            0.92
                            $0.00
                        
                    
                        
                            40
                            10130
                            Lookup Sprinkler Factor 
                            LookupRate
                              Sprinkler=PARTIAL
                            0.93
                            $0.00
                        
                    
                        
                            41
                            10140
                            Lookup Secured Community Factor
                            LookupRate
                              SecuredBuildingCredit=SINGLEENTRY
                            0.94
                            $0.00
                        
                    
                        
                            42
                            10170
                            Lookup Year of Construction Factor
                            StepRate
                              ConstructionYear=2015
                            1
                            $0.00
                        
                    
                        
                            43
                            10180
                            Lookup Cov B Factor
                            LookupRate
                              OtherStructuresAmount=2
                            1
                            $0.00
                        
                    
                        
                            44
                            10211
                            Set WH Excl Factor to 1, if not excluded, for PPRC
                            SetVariable
                              1
                            1
                            $0.00
                        
                    
                        
                            45
                            10250
                            Calc Cov A Amount of insurance factor (&lt;= 1,000,000)
                            StepInterpolate
                             {Interpolate between 300000 (2.679)  and 310000 (2.768)}  DwellingLimit=300000
                            2.679
                            $0.00
                        
                    
                        
                            46
                            10310
                            Save Cov A Amount of Insurance Factor for ACV Loss Settle &amp; ACV Roof
                            SetVariable
                              AmountOfInsuranceFactor=2.679
                            2.679
                            $0.00
                        
                    
                        
                            47
                            10320
                            Calc Cov C Amount of insurance factor (&lt;= 1,000,000)
                            StepInterpolate
                             {Interpolate between 25000 (0.5)  and 30000 (0.6)}  ContentsLimit=25000
                            0.5
                            $0.00
                        
                    
                        
                            48
                            10380
                            Save Cov C Amount of Insurance Factor for PPRC
                            SetVariable
                              CovCAmountOfInsFactor=0.5
                            0.5
                            $0.00
                        
                    
                        
                            49
                            10390
                            Call Rating Subroutine - Fire Dwelling
                            CallSub
                              PerilCode='CovAFire'=CovAFire
                            0
                            $0.00
                        
                    
                        
                            50
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $0.00
                        
                    
                        
                            51
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $0.00
                        
                    
                        
                            52
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $0.00
                        
                    
                        
                            53
                            30070
                            Lookup Fire Base Rate 
                            LookupRate
                              PerilCode=CovAFire
                            106
                            $0.00
                        
                    
                        
                            54
                            30071
                            Save Fire Cov A Base Rate 
                            SetVariable
                              BaseRate=106
                            106
                            $0.00
                        
                    
                        
                            55
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=106, AmountOfInsuranceFactor=2.679
                            283.974
                            $0.00
                        
                    
                        
                            56
                            30100
                            Apply PC/Construction Factor to Prem
                            Multiply
                              ProtectionConstFactor=1, Prem=283.974
                            284
                            $0.00
                        
                    
                        
                            57
                            30120
                            Apply AOP Deductible Factor to Prem
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=284
                            244.24
                            $0.00
                        
                    
                        
                            58
                            30250
                            Apply Fire Alarm Factor to Prem
                            Multiply
                              ProtectionFireFactor=0.92, Prem=244.24
                            224.7008
                            $0.00
                        
                    
                        
                            59
                            30260
                            Apply Sprinkler Factor to Prem
                            Multiply
                              SprinklerFactor=0.93, Prem=224.7008
                            208.971744
                            $0.00
                        
                    
                        
                            60
                            30290
                            Lookup Row/Townhouse Factor
                            LookupRate
                              FamilyUnitsRow=1, PerilCode=CovAFire
                            1
                            $0.00
                        
                    
                        
                            61
                            30300
                            Apply Row/Townhouse Factor to Prem
                            Multiply
                              RowTownhouseFactor=1, Prem=208.971744
                            208.971744
                            $0.00
                        
                    
                        
                            62
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $0.00
                        
                    
                        
                            63
                            30310
                            Apply Age of Risk Factor to Prem
                            Multiply
                              AgeofRiskFactor=0.73, Prem=208.971744
                            152.54937312
                            $0.00
                        
                    
                        
                            64
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $0.00
                        
                    
                        
                            65
                            30320
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovAFire, Occupancy=TENANT
                            1
                            $0.00
                        
                    
                        
                            66
                            30330
                            Apply Owner Occupancy Credit Factor to Prem
                            Multiply
                              OwnerOccupancyFactor=1, Prem=152.54937312
                            152.54937312
                            $0.00
                        
                    
                        
                            67
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=152.54937312
                            152.54937312
                            $0.00
                        
                    
                        
                            68
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=152.54937312, 1
                            153
                            $0.00
                        
                    
                        
                            69
                            30500
                            Return from Subroutine
                            EndSub
                             
                            153
                            $0.00
                        
                    
                        
                            70
                            10400
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=153, 1
                            153
                            $0.00
                        
                    
                        
                            71
                            10410
                            Fire Dwelling Premium
                            AddToBase
                              Prem_Total=153
                            153
                            $153.00
                        
                    
                        
                            72
                            10420
                            Call Rating Subroutine - Fire Contents
                            CallSub
                              PerilCode='CovCFire'=CovCFire
                            0
                            $153.00
                        
                    
                        
                            73
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $153.00
                        
                    
                        
                            74
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $153.00
                        
                    
                        
                            75
                            30570
                            Lookup Fire Contents Base Rate 
                            LookupRate
                              PerilCode=CovCFire
                            45
                            $153.00
                        
                    
                        
                            76
                            30571
                            Save Fire Contents Base Rate for RC
                            SetVariable
                              BaseRate=45
                            45
                            $153.00
                        
                    
                        
                            77
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=45, CovCAmountOfInsFactor=0.5
                            22.5
                            $153.00
                        
                    
                        
                            78
                            30600
                            Apply PC/Construction Factor to Prem for CovC
                            Multiply
                              ProtectionConstFactor=1, Prem=22.5
                            23
                            $153.00
                        
                    
                        
                            79
                            30620
                            Apply AOP Deductible Factor to Prem for CovC
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=23
                            19.78
                            $153.00
                        
                    
                        
                            80
                            30750
                            Apply Fire Alarm Factor to Prem for CovC
                            Multiply
                              ProtectionFireFactor=0.92, Prem=19.78
                            18.1976
                            $153.00
                        
                    
                        
                            81
                            30760
                            Apply Sprinkler Factor to Prem for CovC
                            Multiply
                              SprinklerFactor=0.93, Prem=18.1976
                            16.923768
                            $153.00
                        
                    
                        
                            82
                            30790
                            Lookup Row/Townhouse Factor for Cov C
                            LookupRate
                              FamilyUnitsRow=1, PerilCode=CovCFire
                            1
                            $153.00
                        
                    
                        
                            83
                            30800
                            Apply Row/Townhouse Factor to Prem for CovC
                            Multiply
                              RowTownhouseFactor=1, Prem=16.923768
                            16.923768
                            $153.00
                        
                    
                        
                            84
                            30809
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $153.00
                        
                    
                        
                            85
                            30810
                            Apply Age of Dwelling Factor to Prem for CovC
                            Multiply
                              AgeofRiskFactor=0.73, Prem=16.923768
                            12.35435064
                            $153.00
                        
                    
                        
                            86
                            30820
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovCFire, Occupancy=TENANT
                            1
                            $153.00
                        
                    
                        
                            87
                            30830
                            Apply Owner Occupancy Credit Factor to Prem for CovC
                            Multiply
                              OwnerOccupancyFactor=1, Prem=12.35435064
                            12.35435064
                            $153.00
                        
                    
                        
                            88
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=12.35435064, 1
                            12
                            $153.00
                        
                    
                        
                            89
                            30950
                            Return from Subroutine
                            EndSub
                             
                            12
                            $153.00
                        
                    
                        
                            90
                            10430
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=12, 1
                            12
                            $153.00
                        
                    
                        
                            91
                            10440
                            Fire Contents Premium
                            AddToBase
                              Prem_Total=12
                            12
                            $165.00
                        
                    
                        
                            92
                            10450
                            Call Rating Subroutine - EC Dwelling
                            CallSub
                              PerilCode='CovAEC'=CovAEC
                            0
                            $165.00
                        
                    
                        
                            93
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $165.00
                        
                    
                        
                            94
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $165.00
                        
                    
                        
                            95
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $165.00
                        
                    
                        
                            96
                            30080
                            Lookup EC / Hurr Dwelling Base Rate 
                            LookupRate
                              PerilCode=CovAEC, TerritoryCode=39
                            253
                            $165.00
                        
                    
                        
                            97
                            30081
                            Save EC Cov A Base Rate 
                            SetVariable
                              BaseRate=253
                            253
                            $165.00
                        
                    
                        
                            98
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=253, AmountOfInsuranceFactor=2.679
                            677.787
                            $165.00
                        
                    
                        
                            99
                            30091
                            Round EC Prem 
                            Multiply
                              Prem=677.787, 1
                            678
                            $165.00
                        
                    
                        
                            100
                            30120
                            Apply AOP Deductible Factor to Prem
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=678
                            583.08
                            $165.00
                        
                    
                        
                            101
                            30270
                            Apply Secured Community Factor to Prem
                            Multiply
                              SecuredCommunityFactor=0.94, Prem=583.08
                            548.0952
                            $165.00
                        
                    
                        
                            102
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $165.00
                        
                    
                        
                            103
                            30310
                            Apply Age of Risk Factor to Prem
                            Multiply
                              AgeofRiskFactor=0.73, Prem=548.0952
                            400.109496
                            $165.00
                        
                    
                        
                            104
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $165.00
                        
                    
                        
                            105
                            30320
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovAEC, Occupancy=TENANT
                            1
                            $165.00
                        
                    
                        
                            106
                            30330
                            Apply Owner Occupancy Credit Factor to Prem
                            Multiply
                              OwnerOccupancyFactor=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            107
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            108
                            30370
                            Calc EC Wind Mit Credit for Cov A
                            Multiply
                              Prem=400.109496, WindMitFactor=0
                            0
                            $165.00
                        
                    
                        
                            109
                            30380
                            Apply EC Wind Mitigation Factor to Prem
                            Multiply
                              ECWindMitAmount=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            110
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=400.109496, 1
                            400
                            $165.00
                        
                    
                        
                            111
                            30500
                            Return from Subroutine
                            EndSub
                             
                            400
                            $165.00
                        
                    
                        
                            112
                            10460
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=400, 1
                            400
                            $165.00
                        
                    
                        
                            113
                            10470
                            EC Dwelling Premium
                            AddToBase
                              Prem_Total=400
                            400
                            $565.00
                        
                    
                        
                            114
                            10480
                            Call Rating Subroutine - EC Contents
                            CallSub
                              PerilCode='CovCEC'=CovCEC
                            0
                            $565.00
                        
                    
                        
                            115
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $565.00
                        
                    
                        
                            116
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $565.00
                        
                    
                        
                            117
                            30580
                            Lookup EC/ Hurr Contents Base Rate 
                            LookupRate
                              PerilCode=CovCEC, TerritoryCode=39
                            127
                            $565.00
                        
                    
                        
                            118
                            30581
                            Save EC Contents Base Rate for RC
                            SetVariable
                              BaseRate=127
                            127
                            $565.00
                        
                    
                        
                            119
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=127, CovCAmountOfInsFactor=0.5
                            63.5
                            $565.00
                        
                    
                        
                            120
                            30591
                            Round EC Prem
                            Multiply
                              Prem=63.5, 1
                            64
                            $565.00
                        
                    
                        
                            121
                            30620
                            Apply AOP Deductible Factor to Prem for CovC
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=64
                            55.04
                            $565.00
                        
                    
                        
                            122
                            30770
                            Apply Secured Community Factor to Prem for CovC
                            Multiply
                              SecuredCommunityFactor=0.94, Prem=55.04
                            51.7376
                            $565.00
                        
                    
                        
                            123
                            30809
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $565.00
                        
                    
                        
                            124
                            30810
                            Apply Age of Dwelling Factor to Prem for CovC
                            Multiply
                              AgeofRiskFactor=0.73, Prem=51.7376
                            37.768448
                            $565.00
                        
                    
                        
                            125
                            30820
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovCEC, Occupancy=TENANT
                            1
                            $565.00
                        
                    
                        
                            126
                            30830
                            Apply Owner Occupancy Credit Factor to Prem for CovC
                            Multiply
                              OwnerOccupancyFactor=1, Prem=37.768448
                            37.768448
                            $565.00
                        
                    
                        
                            127
                            30831
                            Calc EC Wind Mit Credit for Cov C
                            Multiply
                              Prem=37.768448, WindMitFactor=0
                            0
                            $565.00
                        
                    
                        
                            128
                            30839
                            Apply EC Wind Mitigation Factor to Prem for CovC
                            Multiply
                              ECWindMitAmount=1, Prem=37.768448
                            37.768448
                            $565.00
                        
                    
                        
                            129
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=37.768448, 1
                            38
                            $565.00
                        
                    
                        
                            130
                            30950
                            Return from Subroutine
                            EndSub
                             
                            38
                            $565.00
                        
                    
                        
                            131
                            10490
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=38, 1
                            38
                            $565.00
                        
                    
                        
                            132
                            10500
                            EC Contents Premium
                            AddToBase
                              Prem_Total=38
                            38
                            $603.00
                        
                    
                        
                            133
                            10510
                            Lookup Construction Factor 
                            LookupRate
                              ConstructionType=V
                            1
                            $603.00
                        
                    
                        
                            134
                            10520
                            Save Construction Factor for OrdLaw, ACV Loss Settle, Screened Encl &amp; PPRC
                            SetVariable
                              ConstructionFactor=1
                            1
                            $603.00
                        
                    
                        
                            135
                            10630
                            Call Rating Subroutine - Hurr Dwelling
                            CallSub
                              PerilCode='CovAHurr'=CovAHurr
                            0
                            $603.00
                        
                    
                        
                            136
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $603.00
                        
                    
                        
                            137
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $603.00
                        
                    
                        
                            138
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $603.00
                        
                    
                        
                            139
                            30080
                            Lookup EC / Hurr Dwelling Base Rate 
                            LookupRate
                              PerilCode=CovAHurr, TerritoryCode=39
                            456
                            $603.00
                        
                    
                        
                            140
                            30082
                            Save Hurr Cov A Base Rate 
                            SetVariable
                              BaseRate=456
                            456
                            $603.00
                        
                    
                        
                            141
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=456, AmountOfInsuranceFactor=2.679
                            1221.624
                            $603.00
                        
                    
                        
                            142
                            30110
                            Apply Construction Factor to Prem
                            Multiply
                              ConstructionFactor=1, Prem=1221.624
                            1222
                            $603.00
                        
                    
                        
                            143
                            30130
                            Apply Hurricane Deductible Factor to Prem
                            Multiply
                              HurrDeductibleFactor=0.94, Prem=1222
                            1148.68
                            $603.00
                        
                    
                        
                            144
                            30160
                            Lookup BCEG Factor for Cov A
                            LookupRate
                              BCEGS=04, PerilCode=CovAHurr
                            0
                            $603.00
                        
                    
                        
                            145
                            30170
                            Calc BCEG Amount
                            Subtract
                              1, BCEGFactor=0
                            1
                            $603.00
                        
                    
                        
                            146
                            30180
                            BCEG + Wind Mit - uncapped amount
                            Add
                              BCEGAmount=1, WindMitFactor=0
                            1
                            $603.00
                        
                    
                        
                            147
                            30190
                            Set Capped BCEG + Wind Mit Discount Factor
                            SetVariable
                              0.9
                            0.9
                            $603.00
                        
                    
                        
                            148
                            30210
                            Calc Adjustment for BCEG Factor due to cap
                            Subtract
                              UncapBCEGWindMit=1, .9=0.9
                            0.1
                            $603.00
                        
                    
                        
                            149
                            30220
                            Calc Capped BCEG Factor
                            Add
                              BCEGCapAdjust=0.1, BCEGFactor=0
                            0.1
                            $603.00
                        
                    
                        
                            150
                            30230
                            Apply Capped BCEG Factor to Prem
                            Multiply
                              Prem=1148.68, CappedBCEGFactor=0.1
                            114.868
                            $603.00
                        
                    
                        
                            151
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $603.00
                        
                    
                        
                            152
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $603.00
                        
                    
                        
                            153
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            154
                            30371
                            Calc Hurr Wind Mit Credit for Cov A
                            Multiply
                              Prem=114.868, WindMitFactor=0
                            0
                            $603.00
                        
                    
                        
                            155
                            30390
                            Apply Wind Mitigation Factor to Prem
                            Multiply
                              WindMitAmount=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            156
                            30400
                            Apply Year of Construction Factor to Prem
                            Multiply
                              YearBuiltFactor=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            157
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=114.868, 1
                            115
                            $603.00
                        
                    
                        
                            158
                            30500
                            Return from Subroutine
                            EndSub
                             
                            115
                            $603.00
                        
                    
                        
                            159
                            10640
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=115, 1
                            115
                            $603.00
                        
                    
                        
                            160
                            10650
                            Hurr Dwelling Premium
                            AddToBase
                              Prem_Total=115
                            115
                            $718.00
                        
                    
                        
                            161
                            10660
                            Call Rating Subroutine - Hurr Contents
                            CallSub
                              PerilCode='CovCHurr'=CovCHurr
                            0
                            $718.00
                        
                    
                        
                            162
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $718.00
                        
                    
                        
                            163
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $718.00
                        
                    
                        
                            164
                            30580
                            Lookup EC/ Hurr Contents Base Rate 
                            LookupRate
                              PerilCode=CovCHurr, TerritoryCode=39
                            237
                            $718.00
                        
                    
                        
                            165
                            30582
                            Save Hurr Contents Base Rate for RC
                            SetVariable
                              BaseRate=237
                            237
                            $718.00
                        
                    
                        
                            166
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=237, CovCAmountOfInsFactor=0.5
                            118.5
                            $718.00
                        
                    
                        
                            167
                            30610
                            Apply Construction Factor to Prem for CovC
                            Multiply
                              ConstructionFactor=1, Prem=118.5
                            119
                            $718.00
                        
                    
                        
                            168
                            30630
                            Apply Hurricane Deductible Factor to Prem for CovC
                            Multiply
                              HurrDeductibleFactor=0.94, Prem=119
                            111.86
                            $718.00
                        
                    
                        
                            169
                            30651
                            Lookup BCEG Factor for Cov C
                            LookupRate
                              BCEGS=04, PerilCode=CovCHurr
                            0
                            $718.00
                        
                    
                        
                            170
                            30670
                            Calc BCEG Amount
                            Subtract
                              1, BCEGFactor=0
                            1
                            $718.00
                        
                    
                        
                            171
                            30680
                            BCEG + Wind Mit - uncapped amount
                            Add
                              BCEGAmount=1, WindMitFactor=0
                            1
                            $718.00
                        
                    
                        
                            172
                            30690
                            Set Capped BCEG + Wind Mit Discount Factor
                            SetVariable
                              0.9
                            0.9
                            $718.00
                        
                    
                        
                            173
                            30710
                            Calc Adjustment for BCEG Factor due to cap
                            Subtract
                              UncapBCEGWindMit=1, .9=0.9
                            0.1
                            $718.00
                        
                    
                        
                            174
                            30720
                            Calc Capped BCEG Factor
                            Add
                              BCEGCapAdjust=0.1, BCEGFactor=0
                            0.1
                            $718.00
                        
                    
                        
                            175
                            30730
                            Apply Capped BCEG Factor to Prem
                            Multiply
                              Prem=111.86, CappedBCEGFactor=0.1
                            11.186
                            $718.00
                        
                    
                        
                            176
                            30833
                            Calc Hurr Wind Mit Credit for Cov C
                            Multiply
                              Prem=11.186, WindMitFactor=0
                            0
                            $718.00
                        
                    
                        
                            177
                            30840
                            Apply Wind Mitigation Factor to Prem for CovC
                            Multiply
                              WindMitAmount=1, Prem=11.186
                            11.186
                            $718.00
                        
                    
                        
                            178
                            30850
                            Apply Year of Construction Factor to Prem for CovC
                            Multiply
                              YearBuiltFactor=1, Prem=11.186
                            11.186
                            $718.00
                        
                    
                        
                            179
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=11.186, 1
                            11
                            $718.00
                        
                    
                        
                            180
                            30950
                            Return from Subroutine
                            EndSub
                             
                            11
                            $718.00
                        
                    
                        
                            181
                            10670
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=11, 1
                            11
                            $718.00
                        
                    
                        
                            182
                            10680
                            Hurr Contents Premium
                            AddToBase
                              Prem_Total=11
                            11
                            $729.00
                        
                    
                        
                            183
                            10690
                            Set Replacement Cost Factor  
                            SetVariable
                              .15=0.15
                            0.15
                            $729.00
                        
                    
                        
                            184
                            10700
                            Calc Replacement Cost C Fire Premium
                            Multiply
                              FireCovCBaseRate=45, CovCKeyFactor=0.5, PCConstFactor=1, AgeofRiskFct=0.73, ReplaceCostCFactor=0.15
                            2
                            $729.00
                        
                    
                        
                            185
                            10710
                            Calc Replacement Cost C EC Premium
                            Multiply
                              ECCovCBaseRate=127, CovCKeyFactor=0.5, AgeofRiskFct=0.73, WindstormHailExclFactor=1, ReplaceCostCFactor=0.15
                            7
                            $729.00
                        
                    
                        
                            186
                            10730
                            Sum Replacement Cost C Premium 
                            Add
                              ReplaceCostCFire=2, ReplaceCostCEC=7, ReplaceCostCHurr
                            9
                            $729.00
                        
                    
                        
                            187
                            10740
                            Add Replacement Cost C Premium
                            AddToBase
                              ReplacementCostPrem=9
                            9
                            $738.00
                        
                    
                        
                            188
                            10900
                            Lookup Burglar Alarm Factor
                            LookupRate
                              BurglarAlarmCredit=CENTRAL
                            0.7
                            $738.00
                        
                    
                        
                            189
                            10910
                            Lookup Theft Prem
                            LookupRate
                              TheftCoverage, CountyCode=12031
                            0
                            $738.00
                        
                    
                        
                            190
                            10920
                            Determine Theft Limit (per 1000 of Cov C)
                            Divide
                              ContentsLimit=25000, 1000=0.001
                            25
                            $738.00
                        
                    
                        
                            191
                            10930
                            Multiply Theft Limit by Theft Prem
                            Multiply
                              TheftLimit=25, PremTheft=0
                            0
                            $738.00
                        
                    
                        
                            192
                            10940
                            Add $20 Flat Rate to Theft Prem
                            Add
                              PremTheft=0, 20
                            20
                            $738.00
                        
                    
                        
                            193
                            10950
                            Multiply by Burglar Alarm Factor
                            Multiply
                              BurglarAlarmFactor=0.7, PremTheft=20
                            14
                            $738.00
                        
                    
                        
                            194
                            10960
                            Add Theft Premium to Base
                            AddToBase
                              PremTheft=14
                            14
                            $752.00
                        
                    
                        
                            195
                            11080
                            Add Cov L/M - Pers Liab / Med Pay - Base Limit
                            AddFlatDollar
                              NumberFamilies=2
                            80
                            $832.00
                        
                    
                        
                            196
                            11200
                            Initialize Minimum Premium
                            SetVariable
                              0
                            0
                            $832.00
                        
                    
                        
                            197
                            11210
                            Lookup Minimum Premium
                            LookupRate
                              StateCode=9
                            300
                            $832.00
                        
                    
                        
                            198
                            11240
                            Initialize temp field to indicate minimum premium adj exists
                            SetVariable
                              'N'
                            N
                            $832.00
                        
                    
                        
                            199
                            11260
                            Set field to indicate minimum premium adj exists
                            AssignField
                              TempMinPremAdj=N
                            0
                            $832.00
                        
                    
                        
                            200
                            11280
                            Apply Minimum Premium
                            SetVariable
                              MinPremium=300
                            300
                            $832.00
                        
                    
                        
                            201
                            11300
                            Lookup Wind Mitigation Max Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            89
                            $832.00
                        
                    
                        
                            202
                            11309
                            Calculate Fire Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellFire=153, Prem_CntsFire=12, ReplaceCostCFire=2, OrdinanceLawFire, ACVLossSettlementFire
                            167
                            $832.00
                        
                    
                        
                            203
                            11310
                            Calculate EC Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellEC=400, Prem_CntsEC=38, ReplaceCostCEC=7, ACVLossSettlementEC, Prem_ACVWHLoss
                            445
                            $832.00
                        
                    
                        
                            204
                            11320
                            Calculate Hurricane Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellHurr=115, Prem_CntsHurr=11, ReplaceCostCHurr, ACVLossSettlementHurr, Prem_ScreenEncl
                            126
                            $832.00
                        
                    
                        
                            205
                            11330
                            Lookup Wind Mitigation FBC Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            0.68
                            $832.00
                        
                    
                        
                            206
                            11340
                            Calculate Wind Mitigation FBC Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMFBCDisc=0.68
                            86
                            $832.00
                        
                    
                        
                            207
                            11350
                            Lookup Wind Mitigation Reinforced Concrete Discount for form OIR B1 1655
                            LookupRate
                             
                            0.82
                            $832.00
                        
                    
                        
                            208
                            11360
                            Calculate Wind Mitigation Reinforced Concrete Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMReinforcedDisc=0.82
                            103
                            $832.00
                        
                    
                        
                            209
                            11370
                            Lookup Wind Mitigation Hip Roof Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            0.1
                            $832.00
                        
                    
                        
                            210
                            11380
                            Calculate Wind Mitigation Hip Roof Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofShapeHipDisc=0.1
                            13
                            $832.00
                        
                    
                        
                            211
                            11430
                            Lookup Wind Mitigation Roof Attach B Discount for form OIR B1 1655
                            LookupRate
                             
                            0.09
                            $832.00
                        
                    
                        
                            212
                            11440
                            Calculate Wind Mitigation Roof Attach B Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofAttachBDisc=0.09
                            11
                            $832.00
                        
                    
                        
                            213
                            11450
                            Lookup Wind Mitigation Roof Attach C Discount for form OIR B1 1655
                            LookupRate
                             
                            0.09
                            $832.00
                        
                    
                        
                            214
                            11460
                            Calculate Wind Mitigation Roof Attach C Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofAttachCDisc=0.09
                            11
                            $832.00
                        
                    
                        
                            215
                            11470
                            Lookup Wind Mitigation Roof To Wall Clips Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            216
                            11480
                            Calculate Wind Mitigation Roof To Wall Clips Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallClipsDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            217
                            11490
                            Lookup Wind Mitigation Roof To Wall Single Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            218
                            11500
                            Calculate Wind Mitigation Roof To Wall Single Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallSingleDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            219
                            11510
                            Lookup Wind Mitigation Roof To Wall Double Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            220
                            11520
                            Calculate Wind Mitigation Roof To Wall Double Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallDoubleDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            221
                            11530
                            Lookup Wind Mitigation SWR Discount for form OIR B1 1655
                            LookupRate
                             
                            0.06
                            $832.00
                        
                    
                        
                            222
                            11540
                            Calculate Wind Mitigation SWR Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMSWRDisc=0.06
                            8
                            $832.00
                        
                    
                
            
        
								
							
								
									
            
                
                    
                        Validation Num
                        Validation Pass
                        Validation Mode
                        Validation Action
                        Failed Validations
                        PageIdentifier
                    
                
                
                    
                        
                            14
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,1400,3000,3100,3300
                        
                    
                        
                            13
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,600,700,800,900,1010,1100
                        
                    
                        
                            12
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,500
                        
                    
                        
                            11
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            50,100,200,205,210,215,300
                        
                    
                        
                            10
                            N
                            PageChange
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:2,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,'') AS UserType, ISNULL(V.ValidationModeCode,'') AS ValidationModeCode,     ISNULL(V.ValidationActionCode,'') AS ValidationActionCode, ISNULL(V.ValidationMessage,'') AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,'') AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,'') AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,'') AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,'') AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,'') AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,'') AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,'') = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,'')             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,'') = 'ANY' OR ISNULL(V.UserType,'') = 'internal')    AND (ISNULL(V.ValidationModeCode,'') = 'ANY' OR ISNULL(V.ValidationModeCode,'') = 'PageChange')    AND V.UWQuoteCode IN ('X', ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            50,100,200,205,210,215,300
                        
                    
                        
                            9
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            50,75,76,77,79,2450,2900
                        
                    
                        
                            8
                            Y
                            PostRating
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            
                        
                    
                        
                            7
                            N
                            PostRating
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:6,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,'') AS UserType, ISNULL(V.ValidationModeCode,'') AS ValidationModeCode,     ISNULL(V.ValidationActionCode,'') AS ValidationActionCode, ISNULL(V.ValidationMessage,'') AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,'') AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,'') AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,'') AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,'') AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,'') AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,'') AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,'') = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,'')             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,'') = 'ANY' OR ISNULL(V.UserType,'') = 'internal')    AND (ISNULL(V.ValidationModeCode,'') = 'ANY' OR ISNULL(V.ValidationModeCode,'') = 'PostRating')    AND V.UWQuoteCode IN ('X', ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            
                        
                    
                        
                            6
                            Y
                            PreRating
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            
                        
                    
                        
                            5
                            N
                            PreRating
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:1,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,'') AS UserType, ISNULL(V.ValidationModeCode,'') AS ValidationModeCode,     ISNULL(V.ValidationActionCode,'') AS ValidationActionCode, ISNULL(V.ValidationMessage,'') AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,'') AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,'') AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,'') AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,'') AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,'') AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,'') AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,'') = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,'')             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,'') = 'ANY' OR ISNULL(V.UserType,'') = 'internal')    AND (ISNULL(V.ValidationModeCode,'') = 'ANY' OR ISNULL(V.ValidationModeCode,'') = 'PreRating')    AND V.UWQuoteCode IN ('X', ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            
                        
                    
                
            
            
                function changeRowStyle(id){
                    if(hasClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;)){
                        removeClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;);
                        addClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;);
                    } else if(hasClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;)){
                        removeClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;);
                        addClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;);
                    }
                }
			
        
								
							
								
									


	table.cfdump_wddx,
	table.cfdump_xml,
	table.cfdump_struct,
	table.cfdump_varundefined,
	table.cfdump_array,
	table.cfdump_query,
	table.cfdump_cfc,
	table.cfdump_object,
	table.cfdump_binary,
	table.cfdump_udf,
	table.cfdump_udfbody,
	table.cfdump_udfarguments {
		font-size: xx-small;
		font-family: verdana, arial, helvetica, sans-serif;
	}

	table.cfdump_wddx th,
	table.cfdump_xml th,
	table.cfdump_struct th,
	table.cfdump_varundefined th,
	table.cfdump_array th,
	table.cfdump_query th,
	table.cfdump_cfc th,
	table.cfdump_object th,
	table.cfdump_binary th,
	table.cfdump_udf th,
	table.cfdump_udfbody th,
	table.cfdump_udfarguments th {
		text-align: left;
		color: white;
		padding: 5px;
	}

	table.cfdump_wddx td,
	table.cfdump_xml td,
	table.cfdump_struct td,
	table.cfdump_varundefined  td,
	table.cfdump_array td,
	table.cfdump_query td,
	table.cfdump_cfc td,
	table.cfdump_object td,
	table.cfdump_binary td,
	table.cfdump_udf td,
	table.cfdump_udfbody td,
	table.cfdump_udfarguments td {
		padding: 3px;
		background-color: #ffffff;
		vertical-align : top;
	}

	table.cfdump_wddx {
		background-color: #000000;
	}
	table.cfdump_wddx th.wddx {
		background-color: #444444;
	}


	table.cfdump_xml {
		background-color: #888888;
	}
	table.cfdump_xml th.xml {
		background-color: #aaaaaa;
	}
	table.cfdump_xml td.xml {
		background-color: #dddddd;
	}

	table.cfdump_struct {
		background-color: #0000cc ;
	}
	table.cfdump_struct th.struct {
		background-color: #4444cc ;
	}
	table.cfdump_struct td.struct {
		background-color: #ccddff;
	}

	table.cfdump_varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined th.varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined td.varundefined {
		background-color: #ccddff;
	}

	table.cfdump_array {
		background-color: #006600 ;
	}
	table.cfdump_array th.array {
		background-color: #009900 ;
	}
	table.cfdump_array td.array {
		background-color: #ccffcc ;
	}

	table.cfdump_query {
		background-color: #884488 ;
	}
	table.cfdump_query th.query {
		background-color: #aa66aa ;
	}
	table.cfdump_query td.query {
		background-color: #ffddff ;
	}


	table.cfdump_cfc {
		background-color: #ff0000;
	}
	table.cfdump_cfc th.cfc{
		background-color: #ff4444;
	}
	table.cfdump_cfc td.cfc {
		background-color: #ffcccc;
	}


	table.cfdump_object {
		background-color : #ff0000;
	}
	table.cfdump_object th.object{
		background-color: #ff4444;
	}

	table.cfdump_binary {
		background-color : #eebb00;
	}
	table.cfdump_binary th.binary {
		background-color: #ffcc44;
	}
	table.cfdump_binary td {
		font-size: x-small;
	}
	table.cfdump_udf {
		background-color: #aa4400;
	}
	table.cfdump_udf th.udf {
		background-color: #cc6600;
	}
	table.cfdump_udfarguments {
		background-color: #dddddd;
	}
	table.cfdump_udfarguments th {
		background-color: #eeeeee;
		color: #000000;
	}

 


// for queries we have more than one td element to collapse/expand
	var expand = &quot;open&quot;;

	dump = function( obj ) {
		var out = &quot;&quot; ;
		if ( typeof obj == &quot;object&quot; ) {
			for ( key in obj ) {
				if ( typeof obj[key] != &quot;function&quot; ) out += key + ': ' + obj[key] + '&lt;br>' ;
			}
		}
	}


	cfdump_toggleRow = function(source) {
		//target is the right cell
		if(document.all) target = source.parentElement.cells[1];
		else {
			var element = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>0;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					element = source.parentNode.childNodes[i];
					break;
				}
			}
			if(element == null)
				target = source.parentNode.lastChild;
			else
				target = element;
		}
		//target = source.parentNode.lastChild ;
		cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
	}

	cfdump_toggleXmlDoc = function(source) {

		var caption = source.innerHTML.split( ' [' ) ;

		// toggle source (header)
		if ( source.style.fontStyle == 'italic' ) {
			// closed -> short
			source.style.fontStyle = 'normal' ;
			source.innerHTML = caption[0] + ' [short version]' ;
			source.title = 'click to maximize' ;
			switchLongToState = 'closed' ;
			switchShortToState = 'open' ;
		} else if ( source.innerHTML.indexOf('[short version]') != -1 ) {
			// short -> full
			source.innerHTML = caption[0] + ' [long version]' ;
			source.title = 'click to collapse' ;
			switchLongToState = 'open' ;
			switchShortToState = 'closed' ;
		} else {
			// full -> closed
			source.style.fontStyle = 'italic' ;
			source.title = 'click to expand' ;
			source.innerHTML = caption[0] ;
			switchLongToState = 'closed' ;
			switchShortToState = 'closed' ;
		}

		// Toggle the target (everething below the header row).
		// First two rows are XMLComment and XMLRoot - they are part
		// of the long dump, the rest are direct children - part of the
		// short dump
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				if ( i &lt; 3 ) cfdump_toggleTarget( target, switchLongToState ) ;
				else cfdump_toggleTarget( target, switchShortToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			var row = 1;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if( target.style ) {
					if ( row &lt; 3 ) {
						cfdump_toggleTarget( target, switchLongToState ) ;
					} else {
						cfdump_toggleTarget( target, switchShortToState ) ;
					}
					row++;
				}
			}
		}
	}

	cfdump_toggleTable = function(source) {

		var switchToState = cfdump_toggleSource( source ) ;
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				cfdump_toggleTarget( target, switchToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if(target.style) {
					cfdump_toggleTarget( target, switchToState ) ;
				}
			}
		}
	}

	cfdump_toggleSource = function( source ) {
		if ( source.style.fontStyle == 'italic' || source.style.fontStyle == null) {
			source.style.fontStyle = 'normal' ;
			source.title = 'click to collapse' ;
			return 'open' ;
		} else {
			source.style.fontStyle = 'italic' ;
			source.title = 'click to expand' ;
			return 'closed' ;
		}
	}

	cfdump_toggleTarget = function( target, switchToState ) {
		if ( switchToState == 'open' )	target.style.display = '' ;
		else target.style.display = 'none' ;
	}

	// collapse all td elements for queries
	cfdump_toggleRow_qry = function(source) {
		expand = (source.title == &quot;click to collapse&quot;) ? &quot;closed&quot; : &quot;open&quot;;
		if(document.all) {
			var nbrChildren = source.parentElement.cells.length;
			if(nbrChildren > 1){
				for(i=nbrChildren-1;i>0;i--){
					target = source.parentElement.cells[i];
					cfdump_toggleTarget( target,expand ) ;
					cfdump_toggleSource_qry(source);
				}
			}
			else {
				//target is the right cell
				target = source.parentElement.cells[1];
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
		else{
			var target = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>1;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					target = source.parentNode.childNodes[i];
					cfdump_toggleTarget( target,expand );
					cfdump_toggleSource_qry(source);
				}
			}
			if(target == null){
				//target is the last cell
				target = source.parentNode.lastChild;
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
	}

	cfdump_toggleSource_qry = function(source) {
		if(expand == &quot;closed&quot;){
			source.title = &quot;click to expand&quot;;
			source.style.fontStyle = &quot;italic&quot;;
		}
		else{
			source.title = &quot;click to collapse&quot;;
			source.style.fontStyle = &quot;normal&quot;;
		}
	}

 
			
			struct 
					
					003000
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003001
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003002
					
					false 
					
					
					
					
					003002-ORDER
					
					1 
					
					
					
					
					003002-Parameter1
					
					04/09/2023 
					
					
					
					
					003002_result
					
					2023 
					
					
					
					
					003008
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003009
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003011
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003012
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003013
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003014
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003015
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003016
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003017
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003018
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003019
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003020
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003023
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003024
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003025
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003026
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003039
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003040
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003042
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003047
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003048
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003049
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003050
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003051
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003052
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003053
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003054
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003055
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003056
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003057
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003058
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003060
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003062
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003063
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003064
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003065
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003066
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003067
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003068
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003069
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003073_1
					
					NO 
					
					
					
					
					003073_1-ORDER
					
					7 
					
					
					
					
					003073_1-Parameter1
					
					ExteriorWallCover_1 (CONCRETEBLOCK) 
					
					
					
					
					003073_1-Parameter2-d
					
					ASBESTOS 
					
					
					
					
					003074_1
					
					NO 
					
					
					
					
					003074_1-ORDER
					
					8 
					
					
					
					
					003074_1-Parameter1
					
					RoofConstructionYear_1 (2015) 
					
					
					
					
					003074_1-Parameter2-c
					
					ConstructionYear_1 (2015) 
					
					
					
					
					003075
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003076_1
					
					false 
					
					
					
					
					003076_1-ORDER
					
					2 
					
					
					
					
					003076_1-Parameter1
					
					2023 
					
					
					
					
					003076_1-Parameter2
					
					2015 
					
					
					
					
					003076_1_result
					
					8 
					
					
					
					
					003081
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003082
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003083
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003084
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003085
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003087
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003088
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003089
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003090
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003091
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003092
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003099
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003100
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003127
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003128
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003129
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003130
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003132
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003135
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003139
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003145
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003146
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003147
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003149
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003150
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003152
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003153
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003154
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003155
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003156
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003166
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003168
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003202
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003203
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003204
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003205
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003208
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003222
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003224
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003229
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003230
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003231
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003232
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003233
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003234
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003235
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003236
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003237
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003238
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003239
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003240
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003241
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003242
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003243
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003244
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003245
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003246
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003247
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003248
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003249
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003250
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003251
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003252
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003253
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003254
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003255
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003256
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003257
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003258
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003259
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003260
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003261
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003262
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003263
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003264
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003265
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003266
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003267
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003268
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003269
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003270
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003271
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003272
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003273
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003274
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003275
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003276
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003277
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003278
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003279
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003280
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003281
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003282
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003283
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003284
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003285
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003286
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003287
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003288
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003289
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003290
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003291
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003292
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003293
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003294
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003295
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003296
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003297
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003298
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003299
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003300
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003301
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003302
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003303
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003304
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003305
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003306
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003307
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003308
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003309
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003310
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003311
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003312
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004006
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004009
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004015
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004020
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004023
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004024
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004025
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004026
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004027
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004028
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004029
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004030
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004031
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007665
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007666
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007673_1
					
					false 
					
					
					
					
					31007673_1-ORDER
					
					3 
					
					
					
					
					31007673_1-Parameter1
					
					09/03/2018 
					
					
					
					
					31007673_1_result
					
					2018 
					
					
					
					
					31007674_1
					
					NO 
					
					
					
					
					31007674_1-ORDER
					
					6 
					
					
					
					
					31007674_1-Parameter1
					
					PurchaseYear_1 (2018) 
					
					
					
					
					31007674_1-Parameter2-c
					
					ConstructionYear_1 (2015) 
					
					
					
					
					31007677
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007678
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007679
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007684
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007687
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007704
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007705
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007706
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007707
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007708
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007709
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007710
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007711
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007712
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007713
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007714
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007715
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007716
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007726
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007727
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007728
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007729
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007730
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007731
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007733
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007735
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007736
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007737
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007738
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007740
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007741
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007742
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007756
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007757
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007758
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007782
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007783
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007784
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007785
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007805
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007806
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007807
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007884
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007885
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007899
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007911
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007923
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007925
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007928
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007931
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007938
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007939
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007940
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007941
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007945
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007947
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007948
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007949
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007956
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007957
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007958
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007960
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007961
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007981
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007982
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007990
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007991
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007992
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007993
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007994
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007995
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007996
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007997
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007998
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007999
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008000
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008001
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008002
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008003
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008004
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008005
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008030
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008070
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008071
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008072
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008079
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008080
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008091
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008092
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008093
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008094
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008095
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008096
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008097
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008098
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008099
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008100
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008101
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008102
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008103
					
					NO 
					
					
					
					
					31008103-ORDER
					
					4 
					
					
					
					
					31008103-Parameter1
					
					ConstructionYear_1 (2015) 
					
					
					
					
					31008103-Parameter2-c
					
					EffectiveYear (2023) 
					
					
					
					
					31008104
					
					NO 
					
					
					
					
					31008104-ORDER
					
					5 
					
					
					
					
					31008104-Parameter1
					
					RoofConstructionYear_1 (2015) 
					
					
					
					
					31008104-Parameter2-c
					
					EffectiveYear (2023) 
					
					
					
					
					31008105_1
					
					false 
					
					
					
					
					31008105_1-ORDER
					
					17 
					
					
					
					
					31008105_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter01_2
					
					ROLL 
					
					
					
					
					31008105_1-Parameter02_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter02_2
					
					TIN 
					
					
					
					
					31008105_1-Parameter03_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter03_2
					
					TARGRAVEL 
					
					
					
					
					31008105_1-Parameter04_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter04_2
					
					WOOD 
					
					
					
					
					31008105_1-Parameter05_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter05_2
					
					SOLAR 
					
					
					
					
					31008105_1-Result01
					
					3TAB = ROLL = NO 
					
					
					
					
					31008105_1-Result02
					
					3TAB = TIN = NO 
					
					
					
					
					31008105_1-Result03
					
					3TAB = TARGRAVEL = NO 
					
					
					
					
					31008105_1-Result04
					
					3TAB = WOOD = NO 
					
					
					
					
					31008105_1-Result05
					
					3TAB = SOLAR = NO 
					
					
					
					
					31008106
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008108_1
					
					Skipped - ValidationConditions [ValRoofAge,>,29;|_1|31008108] 
					
					
					
					
					31008108_1-CheckConditions-1
					
					ValRoofAge (8) > 29 = NO 
					
					
					
					
					31008108_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008110_1
					
					false 
					
					
					
					
					31008110_1-ORDER
					
					9 
					
					
					
					
					31008110_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008110_1-Parameter01_2
					
					3TAB 
					
					
					
					
					31008110_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					31008110_1-Parameter02_2
					
					TENANT 
					
					
					
					
					31008110_1-Parameter03_1
					
					ValRoofAge_1 (8) 
					
					
					
					
					31008110_1-Parameter03_2
					
					10 
					
					
					
					
					31008110_1-Parameter04_1
					
					ACVWHLosstoRoofFactor_1 () 
					
					
					
					
					31008110_1-Parameter04_2
					
					N 
					
					
					
					
					31008110_1-Result01
					
					3TAB = 3TAB = YES 
					
					
					
					
					31008110_1-Result02
					
					TENANT = TENANT = YES 
					
					
					
					
					31008110_1-Result03
					
					8 > 10 = NO 
					
					
					
					
					31008110_1-Result04
					
					= N = NO 
					
					
					
					
					31008112
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008113
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008114
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008117
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008118
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008119
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008120
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008121
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008122
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008126
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008126_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204010;OldSystemFlag,&lt;>,Y;AND|_1|31008126] 
					
					
					
					
					31008126_1-CheckConditions-1
					
					CapacityRuleCode () = CR204010 = NO 
					
					
					
					
					31008126_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008127
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204001;OldSystemFlag,&lt;>,Y;AND||31008127] 
					
					
					
					
					31008127-CheckConditions-1
					
					CapacityRuleCode () = CR204001 = NO 
					
					
					
					
					31008127-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008128
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204002;OldSystemFlag,&lt;>,Y;AND||31008128] 
					
					
					
					
					31008128-CheckConditions-1
					
					CapacityRuleCode () = CR204002 = NO 
					
					
					
					
					31008128-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008129
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204003;OldSystemFlag,&lt;>,Y;AND||31008129] 
					
					
					
					
					31008129-CheckConditions-1
					
					CapacityRuleCode () = CR204003 = NO 
					
					
					
					
					31008129-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008130
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204004;OldSystemFlag,&lt;>,Y;AND||31008130] 
					
					
					
					
					31008130-CheckConditions-1
					
					CapacityRuleCode () = CR204004 = NO 
					
					
					
					
					31008130-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008131_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204005;OldSystemFlag,&lt;>,Y;AND|_1|31008131] 
					
					
					
					
					31008131_1-CheckConditions-1
					
					CapacityRuleCode () = CR204005 = NO 
					
					
					
					
					31008131_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008132
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204006;OldSystemFlag,&lt;>,Y;AND||31008132] 
					
					
					
					
					31008132-CheckConditions-1
					
					CapacityRuleCode () = CR204006 = NO 
					
					
					
					
					31008132-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008134
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008134_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204020;OldSystemFlag,&lt;>,Y;AND|_1|31008134] 
					
					
					
					
					31008134_1-CheckConditions-1
					
					CapacityRuleCode () = CR204020 = NO 
					
					
					
					
					31008134_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008135
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008135_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204021;OldSystemFlag,&lt;>,Y;AND|_1|31008135] 
					
					
					
					
					31008135_1-CheckConditions-1
					
					CapacityRuleCode () = CR204021 = NO 
					
					
					
					
					31008135_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					310115
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310116
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310117
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310118
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310119
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310120_1
					
					false 
					
					
					
					
					310120_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 10 = YES 
					
					
					
					
					310120_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310120_1-ORDER
					
					10 
					
					
					
					
					310120_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310120_1-Parameter01_2
					
					3TAB 
					
					
					
					
					310120_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310120_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310120_1-Result01
					
					3TAB = 3TAB = YES 
					
					
					
					
					310120_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310121
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310122_1
					
					false 
					
					
					
					
					310122_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 15 = YES 
					
					
					
					
					310122_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310122_1-ORDER
					
					11 
					
					
					
					
					310122_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310122_1-Parameter01_2
					
					ARCHITECTURAL 
					
					
					
					
					310122_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310122_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310122_1-Result01
					
					3TAB = ARCHITECTURAL = NO 
					
					
					
					
					310122_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310123
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310124_1
					
					false 
					
					
					
					
					310124_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 20 = YES 
					
					
					
					
					310124_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310124_1-ORDER
					
					12 
					
					
					
					
					310124_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310124_1-Parameter01_2
					
					TILE 
					
					
					
					
					310124_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310124_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310124_1-Result01
					
					3TAB = TILE = NO 
					
					
					
					
					310124_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310125
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310126_1
					
					false 
					
					
					
					
					310126_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310126_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310126_1-ORDER
					
					13 
					
					
					
					
					310126_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310126_1-Parameter01_2
					
					FIBERCEMENT 
					
					
					
					
					310126_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310126_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310126_1-Result01
					
					3TAB = FIBERCEMENT = NO 
					
					
					
					
					310126_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310127
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310128_1
					
					false 
					
					
					
					
					310128_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310128_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310128_1-ORDER
					
					14 
					
					
					
					
					310128_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310128_1-Parameter01_2
					
					CORRUGATEDMETAL 
					
					
					
					
					310128_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310128_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310128_1-Result01
					
					3TAB = CORRUGATEDMETAL = NO 
					
					
					
					
					310128_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310129
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310130_1
					
					false 
					
					
					
					
					310130_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310130_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310130_1-ORDER
					
					15 
					
					
					
					
					310130_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310130_1-Parameter01_2
					
					METAL 
					
					
					
					
					310130_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310130_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310130_1-Result01
					
					3TAB = METAL = NO 
					
					
					
					
					310130_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310132_1
					
					false 
					
					
					
					
					310132_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310132_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310132_1-ORDER
					
					16 
					
					
					
					
					310132_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310132_1-Parameter01_2
					
					SLATE 
					
					
					
					
					310132_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310132_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310132_1-Result01
					
					3TAB = SLATE = NO 
					
					
					
					
					310132_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					ActionCode
					
					Continue 
					
					
					
					
					ClientNumber
					
					21 
					
					
					
					
					DebugMessage
					
					[empty string] 
					
					
					
					
					ISRTR
					
					N 
					
					
					
					
					IsError
					
					FALSE 
					
					
					
					
					QuoteNumber
					
					3106516 
					
					
					
					
					RequireUWIDs
					
					[empty string] 
					
					
					
					
					ResultApplicationMessageLink
					
					[empty string] 
					
					
					
					
					ResultGuidedAppMessageLink
					
					[empty string] 
					
					
					
					
					ResultMessage
					
					[empty string] 
					
					
					
					
					ResultPublicAppMessageLink
					
					[empty string] 
					
					
					
					
					ResultQuickQuoteMessageLink
					
					[empty string] 
					
					
					
					
					ResultTasks
					
					[empty string] 
					
					
					
					
					RulesAppliesToList
					
					UA 
					
					
					
					
					RulesDateUsed
					
					04/09/2023 
					
					
					
					
					RulesRecordCount
					
					338 
					
					
					
					
					RulesValidationMode
					
					PageChange 
					
					
					
					
					WDDXMessage
					
					Loaded from Passed in Value 
					
					
					
					
					WDDXPacketChanged
					
					false 
					
					
					
					
					var-EffectiveYear
					
					2023 
					
					
					
					
					var-PurchaseYear_1
					
					2018 
					
					
					
					
					var-ValRoofAge_1
					
					8 
					
					
					
			
		
								
							
							
								
		
			
			
				Quote Number
				Insured
				ManualID
			
			
			
				
					
						3106516
						LEBLANC, KEITH
						2040
					
				
					
						3106517
						SMITH, BRENDA
						2010
					
				
					
						3106479
						GCGJCGJCGCGCGCGCG, KUGKHFHKFGHCGJC
						2010
					
				
					
						3106504
						MCCLAIN, JOSEPHINE
						2020
					
				
					
						3106513
						FRANK, LILLIAN
						2040
					
				
					
						3106515
						RAMIREZ, MIGUEL
						2040
					
				
					
						3106514
						GROS, DEAN
						2040
					
				
					
						3106511
						NGUYEN, AELITA
						2040
					
				
					
						3106512
						BURRELL, DALE
						2040
					
				
					
						3106507
						IRWIN, STEPHANI
						2040
					
				
					
						3106510
						ZERINGUE, DEWAN
						2040
					
				
					
						3106509
						DENNIS, DONALD
						2040
					
				
					
						3106484
						SHINGLES, SARAH
						2040
					
				
					
						3106508
						TEST, COLE
						2040
					
				
					
						3106492
						TEST, COLE
						2020
					
				
					
						3106506
						MCCLURE, TRAVIS
						2040
					
				
					
						3104411
						IRWIN, STEPHANI
						2040
					
				
					
						3106505
						BROWN, BRYAN
						2040
					
				
					
						3106503
						LIRETTE, THOMAS
						2040
					
				
					
						3106502
						MANUAL, MANNI
						2040
					
				
			
		
	
							
							
								
        List of agents in this environment with License and Commission Rates
		
			
			
				Agent Code
				Name
				DBAName
			
			
			
				
					
						7619
						TEXSTAR INSURANCE SERVICES INC
						TEXSTAR INSURANCE SERVICES INC
					
				
					
						43926
						PROGRESSIVE INSURANCE AGCY INC
						PRO AMERICA INSURANCE
					
				
					
						81258
						TMC ENTERPRISES OF SW FL INC
						DBA MONTEAGLE INS SERVICES
					
				
					
						110110
						AUGUSTYNIAK INSURANCE GRP INC
						AUGUSTYNIAK INSURANCE GRP INC
					
				
					
						110139
						FIRST CHOICE INS INTERMED INC
						FIRST CHOICE INS INTERMED INC
					
				
					
						110147
						FIRST BEACHES INSURANCE LLC
						FIRST BEACHES INSURANCE LLC
					
				
					
						110203
						MITCH MITCHELL FIN SVCS INC
						DBA NSURANCE NATION
					
				
					
						156588
						CUELLAR &amp; ASSOC PROP &amp; CAS LLC
						CUELLAR &amp; ASSOC PROP &amp; CAS LLC
					
				
					
						210177
						1ST CAPITAL INSURANCE INC
						1ST CAPITAL INSURANCE INC
					
				
					
						210181
						MOORE-TERIHAY AGENCY INC
						MOORE-TERIHAY AGENCY INC
					
				
					
						210243
						HALBREHDER FAMILY AGENCY LLC
						DBA THE INSURANCE SHOP
					
				
					
						210253
						FGNC INSURANCE AGENCY INC
						FGNC INSURANCE AGENCY INC
					
				
					
						210266
						TANIA VEGA
						TANIA VEGA INSURANCE AGENCY
					
				
					
						210285
						SHELDON PALMES INS OF
						HERNANDO INC
					
				
					
						210299
						HYDE PARK INSURANCE SVCS INC
						HYDE PARK INSURANCE SVCS INC
					
				
					
						210303
						GRYPHON GROUP INC
						GREAT FLORIDA INSURANCE
					
				
					
						240421
						THE MILLER INSURANCE GROUP LLC
						THE MILLER INSURANCE GROUP LLC
					
				
					
						241527
						HUGHES INSURANCE INC
						HUGHES INSURANCE INC
					
				
					
						310178
						INDUVAL INC
						GREAT FLORIDA INSURANCE
					
				
					
						310221
						BREVARD INS &amp; MARKETING INC
						BREVARD INS &amp; MARKETING INC
					
				
					
						310272
						HOFFMAN &amp; ASSOCIATES INS LLC
						HOFFMAN &amp; ASSOCIATES INS LLC
					
				
					
						310279
						AMSLEY INSURANCE SERVICES INC
						AMSLEY INSURANCE SERVICES INC
					
				
					
						310290
						MORNING STAR CONSULTING LLC
						MORNING STAR CONSULTING LLC
					
				
					
						310299
						HERBIG INS &amp; FIN SVCS INC
						DBA HIG INSURANCE GROUP
					
				
					
						310317
						ALLEN INSURANCE ASSOCIATES INC
						ALLEN INSURANCE ASSOCIATES INC
					
				
			
		
	
							
							
								


	table.cfdump_wddx,
	table.cfdump_xml,
	table.cfdump_struct,
	table.cfdump_varundefined,
	table.cfdump_array,
	table.cfdump_query,
	table.cfdump_cfc,
	table.cfdump_object,
	table.cfdump_binary,
	table.cfdump_udf,
	table.cfdump_udfbody,
	table.cfdump_udfarguments {
		font-size: xx-small;
		font-family: verdana, arial, helvetica, sans-serif;
	}

	table.cfdump_wddx th,
	table.cfdump_xml th,
	table.cfdump_struct th,
	table.cfdump_varundefined th,
	table.cfdump_array th,
	table.cfdump_query th,
	table.cfdump_cfc th,
	table.cfdump_object th,
	table.cfdump_binary th,
	table.cfdump_udf th,
	table.cfdump_udfbody th,
	table.cfdump_udfarguments th {
		text-align: left;
		color: white;
		padding: 5px;
	}

	table.cfdump_wddx td,
	table.cfdump_xml td,
	table.cfdump_struct td,
	table.cfdump_varundefined  td,
	table.cfdump_array td,
	table.cfdump_query td,
	table.cfdump_cfc td,
	table.cfdump_object td,
	table.cfdump_binary td,
	table.cfdump_udf td,
	table.cfdump_udfbody td,
	table.cfdump_udfarguments td {
		padding: 3px;
		background-color: #ffffff;
		vertical-align : top;
	}

	table.cfdump_wddx {
		background-color: #000000;
	}
	table.cfdump_wddx th.wddx {
		background-color: #444444;
	}


	table.cfdump_xml {
		background-color: #888888;
	}
	table.cfdump_xml th.xml {
		background-color: #aaaaaa;
	}
	table.cfdump_xml td.xml {
		background-color: #dddddd;
	}

	table.cfdump_struct {
		background-color: #0000cc ;
	}
	table.cfdump_struct th.struct {
		background-color: #4444cc ;
	}
	table.cfdump_struct td.struct {
		background-color: #ccddff;
	}

	table.cfdump_varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined th.varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined td.varundefined {
		background-color: #ccddff;
	}

	table.cfdump_array {
		background-color: #006600 ;
	}
	table.cfdump_array th.array {
		background-color: #009900 ;
	}
	table.cfdump_array td.array {
		background-color: #ccffcc ;
	}

	table.cfdump_query {
		background-color: #884488 ;
	}
	table.cfdump_query th.query {
		background-color: #aa66aa ;
	}
	table.cfdump_query td.query {
		background-color: #ffddff ;
	}


	table.cfdump_cfc {
		background-color: #ff0000;
	}
	table.cfdump_cfc th.cfc{
		background-color: #ff4444;
	}
	table.cfdump_cfc td.cfc {
		background-color: #ffcccc;
	}


	table.cfdump_object {
		background-color : #ff0000;
	}
	table.cfdump_object th.object{
		background-color: #ff4444;
	}

	table.cfdump_binary {
		background-color : #eebb00;
	}
	table.cfdump_binary th.binary {
		background-color: #ffcc44;
	}
	table.cfdump_binary td {
		font-size: x-small;
	}
	table.cfdump_udf {
		background-color: #aa4400;
	}
	table.cfdump_udf th.udf {
		background-color: #cc6600;
	}
	table.cfdump_udfarguments {
		background-color: #dddddd;
	}
	table.cfdump_udfarguments th {
		background-color: #eeeeee;
		color: #000000;
	}

 


// for queries we have more than one td element to collapse/expand
	var expand = &quot;open&quot;;

	dump = function( obj ) {
		var out = &quot;&quot; ;
		if ( typeof obj == &quot;object&quot; ) {
			for ( key in obj ) {
				if ( typeof obj[key] != &quot;function&quot; ) out += key + ': ' + obj[key] + '&lt;br>' ;
			}
		}
	}


	cfdump_toggleRow = function(source) {
		//target is the right cell
		if(document.all) target = source.parentElement.cells[1];
		else {
			var element = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>0;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					element = source.parentNode.childNodes[i];
					break;
				}
			}
			if(element == null)
				target = source.parentNode.lastChild;
			else
				target = element;
		}
		//target = source.parentNode.lastChild ;
		cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
	}

	cfdump_toggleXmlDoc = function(source) {

		var caption = source.innerHTML.split( ' [' ) ;

		// toggle source (header)
		if ( source.style.fontStyle == 'italic' ) {
			// closed -> short
			source.style.fontStyle = 'normal' ;
			source.innerHTML = caption[0] + ' [short version]' ;
			source.title = 'click to maximize' ;
			switchLongToState = 'closed' ;
			switchShortToState = 'open' ;
		} else if ( source.innerHTML.indexOf('[short version]') != -1 ) {
			// short -> full
			source.innerHTML = caption[0] + ' [long version]' ;
			source.title = 'click to collapse' ;
			switchLongToState = 'open' ;
			switchShortToState = 'closed' ;
		} else {
			// full -> closed
			source.style.fontStyle = 'italic' ;
			source.title = 'click to expand' ;
			source.innerHTML = caption[0] ;
			switchLongToState = 'closed' ;
			switchShortToState = 'closed' ;
		}

		// Toggle the target (everething below the header row).
		// First two rows are XMLComment and XMLRoot - they are part
		// of the long dump, the rest are direct children - part of the
		// short dump
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				if ( i &lt; 3 ) cfdump_toggleTarget( target, switchLongToState ) ;
				else cfdump_toggleTarget( target, switchShortToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			var row = 1;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if( target.style ) {
					if ( row &lt; 3 ) {
						cfdump_toggleTarget( target, switchLongToState ) ;
					} else {
						cfdump_toggleTarget( target, switchShortToState ) ;
					}
					row++;
				}
			}
		}
	}

	cfdump_toggleTable = function(source) {

		var switchToState = cfdump_toggleSource( source ) ;
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				cfdump_toggleTarget( target, switchToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if(target.style) {
					cfdump_toggleTarget( target, switchToState ) ;
				}
			}
		}
	}

	cfdump_toggleSource = function( source ) {
		if ( source.style.fontStyle == 'italic' || source.style.fontStyle == null) {
			source.style.fontStyle = 'normal' ;
			source.title = 'click to collapse' ;
			return 'open' ;
		} else {
			source.style.fontStyle = 'italic' ;
			source.title = 'click to expand' ;
			return 'closed' ;
		}
	}

	cfdump_toggleTarget = function( target, switchToState ) {
		if ( switchToState == 'open' )	target.style.display = '' ;
		else target.style.display = 'none' ;
	}

	// collapse all td elements for queries
	cfdump_toggleRow_qry = function(source) {
		expand = (source.title == &quot;click to collapse&quot;) ? &quot;closed&quot; : &quot;open&quot;;
		if(document.all) {
			var nbrChildren = source.parentElement.cells.length;
			if(nbrChildren > 1){
				for(i=nbrChildren-1;i>0;i--){
					target = source.parentElement.cells[i];
					cfdump_toggleTarget( target,expand ) ;
					cfdump_toggleSource_qry(source);
				}
			}
			else {
				//target is the right cell
				target = source.parentElement.cells[1];
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
		else{
			var target = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>1;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					target = source.parentNode.childNodes[i];
					cfdump_toggleTarget( target,expand );
					cfdump_toggleSource_qry(source);
				}
			}
			if(target == null){
				//target is the last cell
				target = source.parentNode.lastChild;
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
	}

	cfdump_toggleSource_qry = function(source) {
		if(expand == &quot;closed&quot;){
			source.title = &quot;click to expand&quot;;
			source.style.fontStyle = &quot;italic&quot;;
		}
		else{
			source.title = &quot;click to collapse&quot;;
			source.style.fontStyle = &quot;normal&quot;;
		}
	}

 No Errors. Good Job!! 
							
						
					
					
						Close
					
				
			
		
		
		
			test
			
		
			
				
				
				
						
							
						
						
							
							
						
						
						
								--Select Layout--
								
									NoBannerLeftMenuOneArea
								
									BannerLeftMenu
								
									TopMenuOneSection
								
									NoBannerRightMenuOneArea
								
									NoMenu
								
									TopMenuTwoSection
								
									NoMenuTwoSection
								
									NoBannerLeftMenuTwoArea
								
									Mobile
								
								
							
						
						
						
								--Change View--
								
										Quick Quote
									
										HO - New Quote
									
										HO - Policy Endorsement
									
										HO - Billing or Interest Endorsement
									
										Quick Quote
									
							
						
						
								Public
								Agent
								Internal
							
						
						
							
								--Change Manual--
								HO - 2020
								HO - 2132
								HOEG - 2133
								PPA - 2510
							
						
						
							
								--Enable Free Menu Navigation--
								Free Menu Navigation - Yes
								Free Menu Navigation - No
							
						
				
			
		
	
		
		
	id(&quot;PriorClaimCount&quot;)</value>
      <webElementGuid>3ef93c12-74d7-4257-9f74-e79e7501cbfe</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>0e38a6ca-7ba8-4c69-adfd-bdad7a7c740e</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/FL DP/Page_/iframe_RTR Quotes_MainIS21test (1)</value>
      <webElementGuid>a66566f7-f64a-4e7d-ab4e-47d9360e9c52</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>8ba58a84-3f6d-4e86-9893-f6c0f10c341d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
		

	
		
		
		
		
		
		




	
		
			
				
				
					 Policy
				
					 Prequalification
				
					 Coverage
				
					 General
				
					 History
				
					 Interests
				
					 Statements
				
					 Billing
				
					 Display Quote
				
					 Bind/Submit Application
				
			
		
	
	
		
					
					&lt; General
                    
					
                
					
					Interests >
                    
					
                
					
					Exit
                    
					
                
					
					Return to Agent
                    
					
                
    

	
		

							
							
						
	

								
								
							Quote Number: 3106516  
	
	
	
		
		
	Effective Date:  
				
			    
				 MCO: 81  HO Form: DP3  
	

	

	

	

								
								
							 
							
							Loss History Information
							
						
								
								
							Number of Paid Losses in the Past 3 Years 
				
				
			 
							
							Loss History Information
							
						
								
								
							
				
				
				
				
				
				
				
				
				

				
					
					
					
						
							
								Please list any losses, whether or not paid by insurance, during the last 3 years, at this or any location 
								
									
										
									
								
							
						
					



					

						
			 
								
								
							Apply credit if policy is inforce for > = 2 years and has 0 claims since inception. 
					
						Yes
						No
					
				 Paid Claim Rating Plan  
				
				
					
								
									0
								
								
								
									1
								
								
								
									2
								
								
								
									3
								
								
								
									4+
								
								
				
				 


	
		
					
					&lt; General
					
					
				
					
					Interests >
					
					
				
					
					Exit
					
					
				
					
					Return to Agent
					
					
				
	

	

		
	

	
	
		
			
				
					
						
						
							×
						
					
					
				

				
					
					
					
				

				
				
					
					
				
					Confirm
				 
					
				
					Close
				
					
				
				
			
		
	

    
        
            
                Loading...
            
            
                Loading...
            
        
	

	
	
	
		
		
			
			
				
				
					
						
						
							×
						
					
					
				

				
				
					
						
						
						
					
	
					
					
						
					
				
					Confirm
				 
					
				
					Close
				
						
					
					
				
				
			
		
	

			
			
			
		
				
				
				
				
			
			
		
				
				
				
				
				
				
				
				
				
				
				
				
			 
			 
		 var jsPublicWebserviceURL = &quot; , &quot;'&quot; , &quot;https://cypresstest.cogisi.com/is/webservices/&quot; , &quot;'&quot; , &quot;;  var GoogleAPIKey = &quot; , &quot;'&quot; , &quot;AIzaSyBg3d6-GolpGx5FzPri1QJtfGu-3hZm63E&quot; , &quot;'&quot; , &quot;;  var jsISAlertUrl = &quot; , &quot;'&quot; , &quot;https://cypresstest.cogisi.com/is/webservices/SharedFunctionLibrary/CoreFunctionLibrary.cfc?EUDATA=rGFQPNOE59wPibquSjz12CWE1gCD4uFN4mizMJREcA24ZriNSHAsXyIwKlSt2llZHlYh2LSwgScB1zjvv05VaLiJEwUXb6TYigIu9u7hI4%2FkYs1VQCwDLSvoXhIVHfZ4GxGHSYJdypewuDkaFVRtLIGVagTsLCJUUBRYFZEwB%2FJRgQP+XZ7oosfNn%2FgU1EAB%2FLEf66dKsywSXWsYyeq1pQ%3D%3D&quot; , &quot;'&quot; , &quot;;  var ISBlockedMOCIsActive = &quot; , &quot;'&quot; , &quot;N&quot; , &quot;'&quot; , &quot;;  
			 
		
		
		
		
		
		
		
		
		 
			
			
			
			
			
				
			
	
		var CurrentUrl = document.getElementById(&quot;CurrentUrl&quot;);
		if(CurrentUrl){
			CurrentUrl.value = window.top.location.origin + window.top.location.pathname;
		} else {
			$(&quot;#mainForm&quot;).prepend(&quot; , &quot;'&quot; , &quot;&lt;input type=&quot;hidden&quot; name=&quot;CurrentUrl&quot; id=&quot;CurrentUrl&quot; value=&quot;&quot; , &quot;'&quot; , &quot; + window.top.location.origin + window.top.location.pathname + &quot; , &quot;'&quot; , &quot;&quot; />&quot; , &quot;'&quot; , &quot;);
		}
		var ISiPublicRootURL = &quot;https://cypresstest.cogisi.com/is/root/&quot;;
		var DisableMessageArray = [];

		var SubPageLoadActions = [];

		var DisableArrayExists = false;
		// Check lenght of the preexixting array
		if(DisableCheckArray &amp;&amp; DisableCheckArray.length > 0){
			DisableArrayExists = true;
			var DisableTempArray = DisableCheckArray;
		}
		
			var DisableCheckArray = new Array(2);
			
				DisableCheckArray[0] = new Array(3);
				DisableCheckArray[0][0] = &quot;LossFreeRenewal&quot;;
				DisableCheckArray[0][1] = &quot;USERTYPE,=,Agent;&quot;;
				DisableCheckArray[0][2] = &quot;&quot;;
			
				DisableCheckArray[1] = new Array(3);
				DisableCheckArray[1][0] = &quot;PaidClaimRatingPlan&quot;;
				DisableCheckArray[1][1] = &quot;USERTYPE,=,Agent;&quot;;
				DisableCheckArray[1][2] = &quot;&quot;;
			
			// If array exists then prepend to the new array created
			if(DisableArrayExists){
				DisableCheckArray = DisableTempArray.concat(DisableCheckArray);
			}
			console.log(DisableCheckArray); 


		var DisableOptionArrayExists = false;
		// Check lenght of the preexixting array
		if(DisableOptionCheckArray &amp;&amp; DisableOptionCheckArray.length > 0){
			DisableOptionArrayExists = true;
			var DisableOptionTempArray = DisableOptionCheckArray;
		}
		
			// if disabled array does not exist then empty it
			if(!DisableOptionArrayExists){
				var DisableOptionCheckArray = [];
			}
		

		/* 
			GlobalCheckDisable();
		 */

		var CalcArrayExists = false;
		// Check lenght of the preexixting array
		if(CalculationArray &amp;&amp; CalculationArray.length > 0){
			CalcArrayExists = true;
			var CalculatedTempArray = CalculationArray;
		}
		
		
			// if required array does not exist then empty it
			if(!CalcArrayExists){
				var CalculationArray = [];
			}
		




		var ReqArrayExists = false;
		// Check lenght of the preexixting array
		if(RequiredArray &amp;&amp; RequiredArray.length > 0){
			ReqArrayExists = true;
			var ReqTempArray = RequiredArray;
		}
		
		
			var RequiredArray = new Array(1);
			
				RequiredArray[0] = &quot;PriorClaimCount&quot;;
			
			// If array exists then prepend to the new array created
			if(ReqArrayExists){
				RequiredArray = ReqTempArray.concat(RequiredArray);
			}
			console.log(RequiredArray); 
		var boolHighlightRequired = false;

		/* Yashik: Run disable checks forcefully eg while adding rules dynamically from JS */
		

		var RequiredCodeArrayExists = false;
		// Check lenght of the preexixting array
		if(RequiredCodeArray &amp;&amp; RequiredCodeArray.length > 0){
			RequiredCodeArrayExists = true;
			var RequiredCodeTempArray = RequiredCodeArray;
		}
		
			// if disabled array does not exist then empty it
			if(!RequiredCodeArrayExists){
				var RequiredCodeArray = [];
			}
		

		
		function ISiAOnPageLoadStart() {
			
					try{
						
						SeedCCData(&quot; , &quot;'&quot; , &quot;applicationlocalrooturl|https://cypresstest.cogisi.com/is/Application/^applicationpublicrooturl|https://cypresstest.cogisi.com/is/Application/&quot; , &quot;'&quot; , &quot;);
					} catch(e){
						alert(&quot;Javascript error from ISiAFooterJavaScriptArray.  Search the source code for:  06E935B3&quot;);
						console.log(e);
					};
				
					try{
						
						if(typeof parent.HideLoading !== &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;){parent.HideLoading();} else if (typeof HideLoading !== &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;){HideLoading();};
					} catch(e){
						alert(&quot;Javascript error from ISiAFooterJavaScriptArray.  Search the source code for:  06E935B4&quot;);
						console.log(e);
					};
				
			$(&quot; , &quot;'&quot; , &quot;[data-toggle=&quot;tooltip&quot;]&quot; , &quot;'&quot; , &quot;).tooltip();
			
				GlobalCheckDisable();
			
		}
	

		
			
				
					
						Debugging information and Tools
				        
				          ×
				        
					
					
						
							Log
							Queries
							Form
							URL Auth Data WDDX Rate Flow Validation Errors Validation
							Other
							Error Log
						
						
							
								
CS-99 - Loaded FORM variable ROOFCONSTRUCTIONYEAR_1 with value: 2015 
CS-99 - Loaded FORM variable USERTYPE with value: internal 
CS-99 - Loaded FORM variable WMROOFGEOMETRY_1 with value: NA 
CS-99 - Loaded FORM variable SUBDIVISION_1 with value:  
CS-99 - Loaded FORM variable ROWHOUSE_1 with value: N 
CS-99 - Loaded FORM variable POLICYTYPECODE with value: DP3 
CS-99 - Loaded FORM variable EXTERIORWALLCOVER_1 with value: CONCRETEBLOCK 
CS-99 - Loaded FORM variable HEATTYPE1_1 with value: OIL 
CS-99 - Loaded FORM variable WMWINDOWPROTECTION_1 with value: HURRICANE 
CS-99 - Loaded FORM variable INTERNALPROTECTIONCLASS_1 with value: 1 
CS-99 - Loaded FORM variable CURRENTPAGE with value: 700 
CS-99 - Loaded FORM variable OCCUPANCY_1 with value: TENANT 
CS-99 - Loaded FORM variable SQUAREFOOTAGE_1 with value: 2546 
CS-99 - Loaded FORM variable RESPONDINGFIRESTATION_1 with value: JACKSONVILLE 
CS-99 - Loaded FORM variable PURCHASEPRICE_1 with value: 305080 
CS-99 - Loaded FORM variable EFFECTIVEDATEMAXIMUM with value: 12/29/2025 
CS-99 - Loaded FORM variable LASTHEATINGUPDATE_1 with value: 2021 
CS-99 - Loaded FORM variable FOUNDATION_1 with value: CLOSED 
CS-99 - Loaded FORM variable ISQUICKQUOTE with value: N 
CS-99 - Loaded FORM variable WINDPOOL_1 with value: N 
CS-99 - Loaded FORM variable FOUNDATIONTYPE_1 with value: BASEMENT 
CS-99 - Loaded FORM variable INITIALEFFECTIVEDATE with value: 04/09/2023 
CS-99 - Loaded FORM variable LASTPAGE with value: 600 
CS-99 - Loaded FORM variable WINDMITPREMIUM_1 with value: 15000 
CS-99 - Loaded FORM variable EFFECTIVEDATE with value: 04/09/2023 
CS-99 - Loaded FORM variable TERRITORYCODE_1 with value: 39 
CS-99 - Loaded FORM variable LASTELECTRICALUPDATE_1 with value: 2018 
CS-99 - Loaded FORM variable UWQUOTECODE with value: A 
CS-99 - Loaded FORM variable NOSAVEPLANNEDSUBDIVISION_1 with value: N 
CS-99 - Loaded FORM variable NUMBERFAMILIES_1 with value: 2 
CS-99 - Loaded FORM variable DWELLINGTYPE_1 with value: DWELLING 
CS-99 - Loaded FORM variable DISTANCEFIREHYDRANT_1 with value: LT1000 
CS-99 - Loaded FORM variable BARRIERISLAND_1 with value: N 
CS-99 - Loaded FORM variable NOSAVEBARRIERISLAND_1 with value: N 
CS-99 - Loaded FORM variable WMROOFCOVERING_1 with value: FBC 
CS-99 - Loaded FORM variable WMROOFANCHORAGE_1 with value: CLIPS 
CS-99 - Loaded FORM variable IBHS_1 with value: PARTIAL 
CS-99 - Loaded FORM variable NOSAVENEARSINKHOLE_1 with value: N 
CS-99 - Loaded FORM variable ROOFCONSTRUCTION_1 with value: 3TAB 
CS-99 - Loaded FORM variable LASTROOFUPDATE_1 with value: 2019 
CS-99 - Loaded FORM variable FIRECODE_1 with value:  
CS-99 - Loaded FORM variable CURRENTPROGRESSPAGE with value: 700 
CS-99 - Loaded FORM variable COMPANYCODE with value: 81 
CS-99 - Loaded FORM variable BCEGS_1 with value: 4 
CS-99 - Loaded FORM variable MARKETVALUE_1 with value: 300000 
CS-99 - Loaded FORM variable NOSAVEROWHOUSE_1 with value: N 
CS-99 - Loaded FORM variable WINDSPEED_1 with value: 110 
CS-99 - Loaded FORM variable NUMSTORIES_1 with value: 1 
CS-99 - Loaded FORM variable ROOFDECKATTACH_1 with value: NA 
CS-99 - Loaded FORM variable TERRAIN_1 with value: B 
CS-99 - Loaded FORM variable CONSTRUCTIONTYPE_1 with value: V 
CS-99 - Loaded FORM variable CONSTRUCTIONYEAR_1 with value: 2015 
CS-99 - Loaded FORM variable ROOFCONDITION_1 with value: ABOVEAVERAGE 
CS-99 - Loaded FORM variable DISTANCEFIRESTATION_1 with value: 1 
CS-99 - Loaded FORM variable EFFECTIVEDATEMINIMUM with value: 01/16/2015 
CS-99 - Loaded FORM variable WBDR_1 with value: N 
CS-99 - Loaded FORM variable NUMROOMS_1 with value: 11 
CS-99 - Loaded FORM variable CURRENTURL with value: https://cypresstest.cogisi.com/is/root/index.cfm 
CS-99 - Loaded FORM variable ACCESSNUMBER with value: 2 
CS-99 - Loaded FORM variable WMWATERRESISTANCE_1 with value: N 
CS-99 - Loaded FORM variable PLANNEDSUBDIVISION_1 with value: N 
CS-99 - Loaded FORM variable LASTPLUMBINGUPDATE_1 with value: 2020 
CS-99 - Loaded FORM variable ROOFLAYERS_1 with value: 1 
CS-99 - Loaded FORM variable AUTHTOKEN with value: a82741540573558027i15151613s3902970422694160i54330 
CS-99 - Loaded FORM variable FAMILYUNITSROW_1 with value: 1 
CS-99 - Loaded FORM variable BUILDINGUNITS_1 with value: 1 
CS-99 - Loaded FORM variable NEARSINKHOLE_1 with value: N 
CS-10 - Loaded BOTH scope(s) with 67 elements 
Custom Scope Load Duration:5 
Auth.setValue: IPAddress = 98.237.120.185 
Current Webservice Address: https://cypresstest.cogisi.com/is/root/ 
Auth.setValue: AuthToken = a82741540573558027i15151613s3902970422694160i54330 
Auth.setValue: AuthPurpose = ISiApp 
Auth.setValue: Verified = true 
Auth.setValue: DataPacket = 2ISiAppJHUGHESQuoteN2040a82741540573558027i15151613s3902970422694160i5433003106516internalTopMenuOneSection60yes04/04/2023 03:18:18PM 
AUT-18 - Successfully Completed &quot; , &quot;'&quot; , &quot;RefreshDataPacket&quot; , &quot;'&quot; , &quot; function 
AUT-05 - Successfully Validated The Requested &quot; , &quot;'&quot; , &quot;AuthToken&quot; , &quot;'&quot; , &quot; 
Auth.Verify Duration : 46 
Client Number: 21 
Auth.setValue: ManualID = 2040 
Ran Query (1)
Auth.setValue: LayoutName = TopMenuOneSection 
Auth.setValue: FreeMenuNav = N 
Including PreProcessing_Main from PreProcessing_Index 
QUO-082 SetValue Quote Data Element: keyname-PrimaryKey 
Loading ClientCode Quote template 
Ran Query (2)
WDX-52 - Successfully deserialized the WDDX Packet 
QUO-082 SetValue Quote Data Element: keyname-QuoteNumber 
WDX-99 - WDDX Set Value - QuoteNumber=3106516 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-ManualID 
WDX-99 - WDDX Set Value - ManualID=2040 Changed=false 
WDX-98 - WDDX Cleared key - PolicyID 
Auth.setValue: ManualID = 2040 
QUO-082 SetValue Quote Data Element: keyname-StateCode 
WDX-99 - WDDX Set Value - StateCode=9 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-PolicyTypeCode 
WDX-99 - WDDX Set Value - PolicyTypeCode=DP3 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWStatusCode 
WDX-99 - WDDX Set Value - UWStatusCode=C Changed=false 
QUO-082 SetValue Quote Data Element: keyname-CompanyCode 
WDX-99 - WDDX Set Value - CompanyCode=81 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWQuoteCode 
WDX-99 - WDDX Set Value - UWQuoteCode=A Changed=false 
QUO-082 SetValue Quote Data Element: keyname-AgentCode 
WDX-99 - WDDX Set Value - AgentCode=10100 Changed=false 
WDX-99 - WDDX Set Value - IsQuickQuote=N Changed=false 
WDX-99 - WDDX Set Value - InterfaceVersion=UA Changed=false 
WDX-98 - WDDX Cleared key - ExpirationDate 
DetermineReadOnly - X 
[DRO01] Quote: 3106516 UWStatusCode: C LoadRelatedQuotes:true 
QUO-082 SetValue Quote Data Element: keyname-UWStatusCode 
WDX-99 - WDDX Set Value - UWStatusCode=C Changed=false 
QUO-083 SetValue keyname-UWStatusCode No Additional Processing 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 0 
QUO-80 - Loading Applicant List 
QUO-80 - Total Number of applicants - 1 
QUO-80 - Current Applicant List -  
QUO-80 - Adding Applicant 1:KEITH ANN LEBLANC JR to applicant list 
QUO-80 - Loading Applicant List Completed 
WDX-99 - WDDX Set Value - MidtermChangeMode=No Changed=false 
WDDX.LoadData Duration : 9 
Loading ClientCode Quote template 
WDX-99 - WDDX Set Value - ViewID=2 Changed=false 
Ran Query (3)
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
Ran Query (4)
PostAdditionalAction: Loading the Last Page Properties:  
SFORM-02 - Starting process of Saving data from SubmittedData to data 
WDX-98 - WDDX Cleared key - FIRECODE_1 
SFORM-99 - Skipping NOSAVEPLANNEDSUBDIVISION_1 
WDX-99 - WDDX Set Value - RESPONDINGFIRESTATION_1=JACKSONVILLE Changed=false 
SFORM-99 - Skipping NOSAVEBARRIERISLAND_1 
WDX-99 - WDDX Set Value - WMWATERRESISTANCE_1=N Changed=false 
WDX-99 - WDDX Set Value - ROOFCONDITION_1=ABOVEAVERAGE Changed=false 
WDX-99 - WDDX Set Value - BUILDINGUNITS_1=1 Changed=false 
WDX-99 - WDDX Set Value - ISQUICKQUOTE=N Changed=false 
WDX-99 - WDDX Set Value - FOUNDATION_1=CLOSED Changed=false 
WDX-99 - WDDX Set Value - CONSTRUCTIONYEAR_1=2015 Changed=false 
WDX-99 - WDDX Set Value - TERRAIN_1=B Changed=false 
WDX-99 - WDDX Set Value - LASTPAGE=600 Changed=true 
WDX-99 - WDDX Set Value - NEARSINKHOLE_1=N Changed=false 
WDX-99 - WDDX Set Value - INTERNALPROTECTIONCLASS_1=1 Changed=true 
WDX-99 - WDDX Set Value - LASTROOFUPDATE_1=2019 Changed=true 
WDX-99 - WDDX Set Value - CONSTRUCTIONTYPE_1=V Changed=false 
WDX-99 - WDDX Set Value - LASTHEATINGUPDATE_1=2021 Changed=true 
WDX-99 - WDDX Set Value - WINDMITPREMIUM_1=15000 Changed=false 
WDX-99 - WDDX Set Value - ACCESSNUMBER=2 Changed=false 
WDX-99 - WDDX Set Value - NUMBERFAMILIES_1=2 Changed=false 
WDX-99 - WDDX Set Value - NUMSTORIES_1=1 Changed=false 
WDX-99 - WDDX Set Value - MARKETVALUE_1=300000 Changed=false 
WDX-99 - WDDX Set Value - ROOFLAYERS_1=1 Changed=false 
WDX-98 - WDDX Cleared key - SUBDIVISION_1 
WDX-99 - WDDX Set Value - ROWHOUSE_1=N Changed=false 
WDX-99 - WDDX Set Value - WMROOFGEOMETRY_1=NA Changed=false 
WDX-99 - WDDX Set Value - ROOFDECKATTACH_1=NA Changed=false 
WDX-99 - WDDX Set Value - NUMROOMS_1=11 Changed=false 
WDX-99 - WDDX Set Value - WBDR_1=N Changed=false 
WDX-99 - WDDX Set Value - DWELLINGTYPE_1=DWELLING Changed=false 
WDX-99 - WDDX Set Value - DISTANCEFIRESTATION_1=1 Changed=false 
SFORM-99 - Skipping NOSAVEROWHOUSE_1 
WDX-99 - WDDX Set Value - LASTELECTRICALUPDATE_1=2018 Changed=true 
WDX-99 - WDDX Set Value - IBHS_1=PARTIAL Changed=false 
WDX-99 - WDDX Set Value - CURRENTPROGRESSPAGE=700 Changed=true 
QUO-082 SetValue Quote Data Element: keyname-COMPANYCODE 
WDX-99 - WDDX Set Value - COMPANYCODE=81 Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATEMAXIMUM=12/29/2025 Changed=false 
WDX-99 - WDDX Set Value - ROOFCONSTRUCTIONYEAR_1=2015 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-POLICYTYPECODE 
WDX-99 - WDDX Set Value - POLICYTYPECODE=DP3 Changed=false 
WDX-99 - WDDX Set Value - LASTPLUMBINGUPDATE_1=2020 Changed=true 
WDX-99 - WDDX Set Value - FOUNDATIONTYPE_1=BASEMENT Changed=false 
WDX-99 - WDDX Set Value - FAMILYUNITSROW_1=1 Changed=false 
WDX-99 - WDDX Set Value - TERRITORYCODE_1=39 Changed=false 
WDX-99 - WDDX Set Value - USERTYPE=internal Changed=false 
SFORM-99 - Skipping NOSAVENEARSINKHOLE_1 
WDX-99 - WDDX Set Value - WMWINDOWPROTECTION_1=HURRICANE Changed=false 
WDX-99 - WDDX Set Value - CURRENTPAGE=700 Changed=true 
WDX-99 - WDDX Set Value - OCCUPANCY_1=TENANT Changed=false 
WDX-99 - WDDX Set Value - BCEGS_1=4 Changed=false 
WDX-99 - WDDX Set Value - WMROOFCOVERING_1=FBC Changed=false 
WDX-99 - WDDX Set Value - SQUAREFOOTAGE_1=2546 Changed=false 
WDX-99 - WDDX Set Value - ROOFCONSTRUCTION_1=3TAB Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATEMINIMUM=01/16/2015 Changed=false 
WDX-99 - WDDX Set Value - WMROOFANCHORAGE_1=CLIPS Changed=false 
WDX-99 - WDDX Set Value - PLANNEDSUBDIVISION_1=N Changed=false 
WDX-99 - WDDX Set Value - DISTANCEFIREHYDRANT_1=LT1000 Changed=false 
WDX-99 - WDDX Set Value - WINDPOOL_1=N Changed=false 
WDX-99 - WDDX Set Value - HEATTYPE1_1=OIL Changed=false 
WDX-99 - WDDX Set Value - BARRIERISLAND_1=N Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATE=04/09/2023 Changed=false 
WDX-99 - WDDX Set Value - EXTERIORWALLCOVER_1=CONCRETEBLOCK Changed=false 
WDX-99 - WDDX Set Value - PURCHASEPRICE_1=305080 Changed=false 
WDX-99 - WDDX Set Value - INITIALEFFECTIVEDATE=04/09/2023 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWQUOTECODE 
WDX-99 - WDDX Set Value - UWQUOTECODE=A Changed=false 
WDX-99 - WDDX Set Value - WINDSPEED_1=110 Changed=false 
SFORM-03 - Completed process of Saving data from SubmittedData to data count:63 
AL100 - Check for Agent or Agent Change 
Ran Query (8)
ValidatePageID: PageID validated ViewID:2 PageID:700 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 0 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (9)
WDDX.SAVE Duration : 26 
Ran Query (10)
SetRatingStatus RatingStatusCode 14:18:18.608 - Desired:V Expected:X Returned:V 
getManualID returns 2040 
Ran Query (11)
Running Validation PageChange with PageIdentifier:sections:51,1400,3000,3100,3300 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (12)
SetRatingStatus RatingStatusCode 14:18:18.735 - Desired:X Expected:V Returned:X 
WDX-98 - WDDX Cleared key - RequireUWIDs 
WDX-98 - WDDX Cleared key - ResultTasks 
Completed Validation - Continue 
Setting Validation equal to prior result: continue 
Ran Query (13)
WDX-99 - WDDX Set Value - ViewID=2 Changed=false 
Ran Query (14)
Loading the current View Properties: TextHeaderClass_1=row ISiMidHeading,NameLabelLocation=Top,UserHelpLeftString=?,DateEntryType=Both,YesNoEntryType=radio,DefaultLayout=TopMenuOneSection,AvailableLayouts=TopMenuOneSection,PageIDOnCCSuccess=92 
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
Loading the current Page Properties:  
Preprocessing - Step 21a - AdditionalAction:  CurrentPage:700 
Auth.setValue: LayoutName = TopMenuOneSection 
DepositSchedule - Start - https://cypresstest.cogisi.com/is/webservices/ISUtilitiesCFC/ISTransfer/ISTransferWS.cfc?quotenumber=3106516&amp;AuthToken=a82741540573558027i15151613s3902970422694160i54330 
DepositSchedule, No change in Bill Control, skipping process: 819DP304/09/2023AApp_A 
WDX-99 - WDDX Set Value - ValidBilling=true Changed=false 
ImpactTotalPremium:  
TotalPremium: 832 
Start HTML : 207 
Index Preprocessing Duration : 214 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [OldSystemFlag,=,Y]() = false 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [OldSystemFlag,=,Y]() = false 
Ran Query (15)
WDX-99 - WDDX Set Value - PageHistory=100,101,200,400,500,600,700 Changed=true 
Prior Page ID: 600 
Next Page ID: 800 
Processing Area: 1 
getManualID returns 2040 
Ran Query (16)
Starting Render Page - CurrentApplicant:1 CurrentRisk:1 CurrentDetail:0 Question Count:15 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: DefaultFieldName to value:USERTYPE 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Load Section Properties: SectionClass=sticky-top border-bottom ISiA-Max25p 
CSET-94 - LoadKeyValueString key: SectionClass to value:sticky-top border-bottom ISiA-Max25p 
Start Widget [0]:hidden Fieldname:USERTYPE 
CSET-94 - LoadKeyValueString key: DefaultFieldName to value:USERTYPE 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:QuoteNumber 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:3106516 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 1 
Start Question [0] - EffectiveDateWidget 
CSET-94 - LoadKeyValueString key: ReadOnlyCondition to value:USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR 
Start Widget [0]:EffectiveDateWidget Fieldname:EffectiveDate 
CSET-94 - LoadKeyValueString key: ReadOnlyCondition to value:USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR 
Starting to look for widget specific file - EffectiveDateWidget -  - suffix: 
QUO-05 - Effective date initialization started 
QUO-05 - Saved user type: internal 
QUO-05 - Current user type: internal 
QUO-07 - Effective date did not initialization as user type logged in is same 
Existing date value used: 04/09/2023 
conditionalOperatorCheck - internal.&lt;>.internal 
conditionalOperatorCheck - internal.=.internal 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR] = true 
Complete Widget Specific File 
End Widget :EffectiveDateWidget with suffix:  
Widget Duration : 3 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:CompanyCode 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:81 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:PolicyTypeCode 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:DP3 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 0 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:UWQuoteCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 0 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:PolicyTypeCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWQuoteCode,&lt;>,A; 
conditionalOperatorCheck - a.&lt;>.a 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UWQuoteCode,&lt;>,A](1) = NO 
Checking Question Conditonals [UWQuoteCode,&lt;>,A;], return:NO 
Did not show this question [0] 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:CompanyCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
CSET-94 - LoadKeyValueString key: DefaultValue to value:N 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND 
conditionalOperatorCheck - a.=.a 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND]1 = false 
Checking Question Conditonals [UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND], return:false 
Did not show this question [0] 
Start Question [0] - ButtonWidget 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: ButtonAppendLoading to value:Y 
CSET-94 - LoadKeyValueString key: ButtonAppendSubmit to value:Y 
CSET-94 - LoadKeyValueString key: ConfirmationHeading to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonDisplayType to value:ConfirmationPopup 
CSET-94 - LoadKeyValueString key: ConfirmationText to value:Are you sure you want to unlock the quote, you may have to resubmit for underwriter approval? 
CSET-94 - LoadKeyValueString key: ButtonText to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonAppendAddAction to value:RESETCANAGENTBIND 
CSET-94 - LoadKeyValueString key: EditCanAgentBind to value:Y 
CSET-94 - LoadKeyValueString key: ButtonClass to value:w-100 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND 
conditionalOperatorCheck - n.=.y 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND]1 = false 
Checking Question Conditonals [CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND], return:false 
Did not show this question [0] 
Start Question [0] - Text 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: RightClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:ReadOnly,=,TRUE; 
conditionalOperatorCheck - false.=.true 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [ReadOnly,=,TRUE](1) = NO 
Checking Question Conditonals [ReadOnly,=,TRUE;], return:NO 
Did not show this question [0] 
Start Question [0] - ButtonWidget 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: ButtonAppendLoading to value:Y 
CSET-94 - LoadKeyValueString key: ButtonAppendSubmit to value:Y 
CSET-94 - LoadKeyValueString key: ConfirmationHeading to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonDisplayType to value:ConfirmationPopup 
CSET-94 - LoadKeyValueString key: ConfirmationText to value:You may have to resubmit for underwiter approval? 
CSET-94 - LoadKeyValueString key: ButtonText to value:Remove Submission 
CSET-94 - LoadKeyValueString key: ButtonAppendAddAction to value:RESETUWSTATUSCODE 
CSET-94 - LoadKeyValueString key: ButtonClass to value:w-100 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND 
conditionalOperatorCheck - c.=.s 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND]1 = false 
Checking Question Conditonals [UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND], return:false 
Did not show this question [0] 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: DefaultValue to value:No 
CSET-94 - LoadKeyValueString key: ForceValue to value:No 
Start Widget [0]:hidden Fieldname:IsQuickQuote 
CSET-94 - LoadKeyValueString key: DefaultValue to value:No 
CSET-94 - LoadKeyValueString key: ForceValue to value:No 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - ErrorDisplay 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
Start Widget [0]:ErrorDisplay Fieldname: 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
Starting to look for widget specific file - ErrorDisplay -  - suffix: 
Complete Widget Specific File 
End Widget :ErrorDisplay with suffix:  
Widget Duration : 1 
Page Duration : 15 
Processing Area: 2 
getManualID returns 2040 
Ran Query (17)
Starting Render Page - CurrentApplicant:1 CurrentRisk:1 CurrentDetail:0 Question Count:4 
Start Question [1500010] - NUMBER 
CSET-94 - LoadKeyValueString key: NumberMaxValue to value:9999 
CSET-94 - LoadKeyValueString key: NumberMinValue to value:0 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1500010]:NUMBER Fieldname:PriorClaimCount 
CSET-94 - LoadKeyValueString key: NumberMaxValue to value:9999 
CSET-94 - LoadKeyValueString key: NumberMinValue to value:0 
Starting to look for widget specific file - NUMBER - Numeric4 - suffix: 
Number Format Mask: _^ 
Complete Widget Specific File 
End Widget :NUMBER with suffix:  
Widget Duration : 1 
Start Question [1600010] - DetailSelection 
CSET-94 - LoadKeyValueString key: DisplayFormat to value:accordion 
CSET-94 - LoadKeyValueString key: TabTitleVariable to value:TypeOfLoss 
CSET-94 - LoadKeyValueString key: DetailVariable to value:NumberClaims 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1600010]:DetailSelection Fieldname:NumberClaims 
CSET-94 - LoadKeyValueString key: DisplayFormat to value:accordion 
CSET-94 - LoadKeyValueString key: TabTitleVariable to value:TypeOfLoss 
CSET-94 - LoadKeyValueString key: DetailVariable to value:NumberClaims 
Starting to look for widget specific file - DetailSelection -  - suffix: 
getManualID returns 2040 
Ran Query (18)
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
CSET-95 - Setting Set Value - ShowEndorsementLinks=no 
Indexes - IndexCounter: CurrentDetail:NumberClaims 
Item to be deleted:  
Starting Accordion Detail Widget 
Complete Widget Specific File 
End Widget :DetailSelection with suffix:  
Widget Duration : 5 
Start Question [1600070] - YesNo 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:select 
CSET-94 - LoadKeyValueString key: Required to value:N 
CSET-94 - LoadKeyValueString key: YesNoType to value:Y/N 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1600070]:YesNo Fieldname:LossFreeRenewal 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:select 
CSET-94 - LoadKeyValueString key: Required to value:N 
CSET-94 - LoadKeyValueString key: YesNoType to value:Y/N 
Starting to look for widget specific file - YesNo - Yes/No - suffix: 
YesNo Type from settings: YES/NO 
Complete Widget Specific File 
conditionalOperatorCheck - internal.=.agent 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UserType,=,Agent]() = NO 
End Widget :YesNo with suffix:  
Widget Duration : 2 
Start Question [1600080] - SelectQry 
CSET-94 - LoadKeyValueString key: Required to value:N 
Start Widget [1600080]:SelectQry Fieldname:PaidClaimRatingPlan 
CSET-94 - LoadKeyValueString key: Required to value:N 
Starting to look for widget specific file - SelectQry - Text - suffix: 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
Ran Query (19)
Multiple options found for select 
Choice selected is 0 
Option 0 added with value 0 
Option 1 added with value 1 
Option 2 added with value 2 
Option 3 added with value 3 
Option 4+ added with value 4 
Complete Widget Specific File 
conditionalOperatorCheck - internal.=.agent 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UserType,=,Agent]() = NO 
End Widget :SelectQry with suffix:  
Widget Duration : 4 
Page Duration : 15 
Start RenderButton [ButtonType: PrimaryButton] 
End RenderButton [ButtonType: PrimaryButton] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: Secondary] 
End RenderButton [ButtonType: Secondary] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: PrimaryButton] 
End RenderButton [ButtonType: PrimaryButton] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: Secondary] 
End RenderButton [ButtonType: Secondary] 
RenderButton Duration (milliseconds): 0 
Ran Query (20)
CSET-03 - No Settings Found for ISBlockedMOC 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 1 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (21)
WDDX.SAVE Duration : 30 
Auth.setValue: DataPacket = 31065162internal0TopMenuOneSectionISiAppa82741540573558027i15151613s3902970422694160i543302040QuoteJHUGHESN60yes04/04/2023 03:18:18PM 
AUT-18 - Successfully Completed &quot; , &quot;'&quot; , &quot;RefreshDataPacket&quot; , &quot;'&quot; , &quot; function 
Auth.setValue: Changed = false 
AUT-07 - &quot; , &quot;'&quot; , &quot;AuthToken:DataPacket&quot; , &quot;'&quot; , &quot; Data Save 
Field Name List: ,USERTYPE,QuoteNumber,EffectiveDate,CompanyCode,PolicyTypeCode,UWQuoteCode,PolicyTypeCode,PolicyNumber,CompanyCode,CypressConversionReadOnlyMessageIsQuickQuote,PriorClaimCount,NumberClaims,LossFreeRenewal,PaidClaimRatingPlan,DateOfLoss,TypeOfLoss,AmountOfLoss,LossDescription,LossLocation,ClaimTierRating 
WDX-99 - WDDX Set Value - OnLastPage=N Changed=true 
							
							
								

1:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? ORDER BY ViewID ASC

1:All Views Query sqlparameters: 2040

1:All Views Query recordcount: 5

1:All Views Query ExecutionTime: 1

2:Get Quote Data SQL: SELECT TOP 1 * FROM WebInfo WITH (NOLOCK) where QuoteNumber = ? 

2:Get Quote Data sqlparameters: 3106516

2:Get Quote Data recordcount: 1

2:Get Quote Data ExecutionTime: 2

3:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? AND ViewID = ? ORDER BY ViewID ASC

3:All Views Query sqlparameters: 2040,2

3:All Views Query recordcount: 1

3:All Views Query ExecutionTime: 1

4:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

4:Pages Query sqlparameters: 2040,2,600

4:Pages Query recordcount: 1

4:Pages Query ExecutionTime: 1

5:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

5:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,

5:QuestionsQry recordcount: 0

5:QuestionsQry ExecutionTime: 1

6:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

6:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,Y

6:QuestionsQry recordcount: 0

6:QuestionsQry ExecutionTime: 1

7:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

7:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,Z

7:QuestionsQry recordcount: 0

7:QuestionsQry ExecutionTime: 1

8:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

8:Pages Query sqlparameters: 2040,2,700

8:Pages Query recordcount: 1

8:Pages Query ExecutionTime: 1

9:Save Quote Data SQL: UPDATE WebInfo SET InfoWDDX = ? , UWQuoteCode = ? , UWStatusCode = ? , AgentCode = ? , EffectiveDate = ? , ManualID = ? , StateCode = ? , CompanyCode = ? ,
						PolicyTypeCode = ? , Underwriter = ? , ApplicantFirst = ? , ApplicantMiddle = ? , ApplicantLast = ? , ApplicantSuffix = ? , ApplicantAddress1 = ? ,
						ApplicantAddress2 = ? , ApplicantCity = ? , ApplicantState = ? , ApplicantZip = ? , ApplicantZip4 = ? , ApplicantHomePhone = ? ,
						ApplicantWorkPhone = ? , ApplicantEmail = ? , ProgramCode = ? , DateUpdated = GETDATE(), UWStatusDate = GETDATE() where QuoteNumber = ? 

9:Save Quote Data sqlparameters: {WDDX Packet},A,C,10100,2023-04-09,2040,9,81,DP3,,KEITH,ANN,LEBLANC,JR,1837 W 19TH ST,,JACKSONVILLE,FL,32209,,717-765-5091,,john.hughes@cornerops.com,,3106516

9:Save Quote Data recordcount: 1

9:Save Quote Data ExecutionTime: 4

10:Save Quote Data ExecutionTime: 1

11:ManualPageSections Query SQL:  SELECT DISTINCT s.SectionID
					FROM ManualPageSections s WITH (NOLOCK)
					WHERE ManualID = ?
					AND PageID = ?
				

11:ManualPageSections Query sqlparameters: 2040,600

11:ManualPageSections Query recordcount: 5

11:ManualPageSections Query ExecutionTime: 1

12:Save Quote Data ExecutionTime: 2

13:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? AND ViewID = ? ORDER BY ViewID ASC

13:All Views Query sqlparameters: 2040,2

13:All Views Query recordcount: 1

13:All Views Query ExecutionTime: 1

14:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

14:Pages Query sqlparameters: 2040,2,700

14:Pages Query recordcount: 1

14:Pages Query ExecutionTime: 1

15:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.ProgressMilestone = &quot; , &quot;'&quot; , &quot;Y&quot; , &quot;'&quot; , &quot;
						ORDER BY m2.PageOrder
					

15:Pages Query sqlparameters: 2040,2

15:Pages Query recordcount: 10

15:Pages Query ExecutionTime: 2

16:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

16:QuestionsQry sqlparameters: 2040,700,1,2022-01-01,2022-01-01,D,B,N,O,DP3

16:QuestionsQry recordcount: 15

16:QuestionsQry ExecutionTime: 3

17:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

17:QuestionsQry sqlparameters: 2040,700,2,2022-01-01,2022-01-01,D,B,N,O,DP3

17:QuestionsQry recordcount: 4

17:QuestionsQry ExecutionTime: 2

18:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

18:QuestionsQry sqlparameters: 2040,701,2,2022-01-01,2022-01-01,D,B,N,O,DP3

18:QuestionsQry recordcount: 6

18:QuestionsQry ExecutionTime: 2

19:Choices Query SQL:  Select ManualChoices.* from ManualChoices
				WHERE ManualID = ?
				AND QuestionNumber = ?
				AND DisableClient = 0
				AND 1=1
				Order By QuestionChoiceNumber

19:Choices Query sqlparameters: 2040,1600080

19:Choices Query recordcount: 5

19:Choices Query ExecutionTime: 0

20:Get Client Setting Data ISBlockedMOC SQL: Select FieldName, SettingValue, SettingConditionals, AgentFlag,
						TestModeFlag, UWQuoteCode
						From ISClientSettings
						WHERE ClientNumber = ? 
						AND SettingName = ? 
						AND (StateCode = ?  or StateCode = 0)
						AND (CompanyCode = ?  or CompanyCode = 0)
						AND (PolicyTypeCode = ?  or PolicyTypeCode = &quot; , &quot;'&quot; , &quot;x&quot; , &quot;'&quot; , &quot; )
						AND (ManualID = ?  or ManualID = 0)
						AND (UWQuoteCode = ?  or UWQuoteCode = &quot; , &quot;'&quot; , &quot;x&quot; , &quot;'&quot; , &quot; )
						AND StartDate &lt;= ? 
						AND (EndDate Is Null or EndDate > ? ) Order By FieldName, SortOrder 

20:Get Client Setting Data ISBlockedMOC sqlparameters: 21,ISBlockedMOC,0,0,x,0,x,2023-04-04,2023-04-04

20:Get Client Setting Data ISBlockedMOC recordcount: 0

20:Get Client Setting Data ISBlockedMOC ExecutionTime: 1

21:Save Quote Data SQL: UPDATE WebInfo SET InfoWDDX = ? , UWQuoteCode = ? , UWStatusCode = ? , AgentCode = ? , EffectiveDate = ? , ManualID = ? , StateCode = ? , CompanyCode = ? ,
						PolicyTypeCode = ? , Underwriter = ? , ApplicantFirst = ? , ApplicantMiddle = ? , ApplicantLast = ? , ApplicantSuffix = ? , ApplicantAddress1 = ? ,
						ApplicantAddress2 = ? , ApplicantCity = ? , ApplicantState = ? , ApplicantZip = ? , ApplicantZip4 = ? , ApplicantHomePhone = ? ,
						ApplicantWorkPhone = ? , ApplicantEmail = ? , ProgramCode = ? , DateUpdated = GETDATE(), UWStatusDate = GETDATE() where QuoteNumber = ? 

21:Save Quote Data sqlparameters: {WDDX Packet},A,C,10100,2023-04-09,2040,9,81,DP3,,KEITH,ANN,LEBLANC,JR,1837 W 19TH ST,,JACKSONVILLE,FL,32209,,717-765-5091,,john.hughes@cornerops.com,,3106516

21:Save Quote Data recordcount: 1

21:Save Quote Data ExecutionTime: 8
							
							
								struct

ACCESSNUMBER: 2
AUTHTOKEN: a82741540573558027i15151613s3902970422694160i54330
BARRIERISLAND_1: N
BCEGS_1: 4
BUILDINGUNITS_1: 1
COMPANYCODE: 81
CONSTRUCTIONTYPE_1: V
CONSTRUCTIONYEAR_1: 2015
CURRENTPAGE: 700
CURRENTPROGRESSPAGE: 700
CURRENTURL: https://cypresstest.cogisi.com/is/root/index.cfm
DISTANCEFIREHYDRANT_1: LT1000
DISTANCEFIRESTATION_1: 1
DWELLINGTYPE_1: DWELLING
EFFECTIVEDATE: 04/09/2023
EFFECTIVEDATEMAXIMUM: 12/29/2025
EFFECTIVEDATEMINIMUM: 01/16/2015
EXTERIORWALLCOVER_1: CONCRETEBLOCK
FAMILYUNITSROW_1: 1
FIELDNAMES: AUTHTOKEN,CURRENTPAGE,LASTPAGE,CURRENTPROGRESSPAGE,CURRENTURL,ACCESSNUMBER,USERTYPE,INITIALEFFECTIVEDATE,EFFECTIVEDATEMINIMUM,EFFECTIVEDATEMAXIMUM,EFFECTIVEDATE,UWQUOTECODE,POLICYTYPECODE,COMPANYCODE,ISQUICKQUOTE,TERRITORYCODE_1,CONSTRUCTIONTYPE_1,CONSTRUCTIONYEAR_1,OCCUPANCY_1,NUMBERFAMILIES_1,ROWHOUSE_1,NOSAVEROWHOUSE_1,DWELLINGTYPE_1,BUILDINGUNITS_1,FAMILYUNITSROW_1,HEATTYPE1_1,SQUAREFOOTAGE_1,PURCHASEPRICE_1,NUMROOMS_1,NUMSTORIES_1,BCEGS_1,WINDPOOL_1,NEARSINKHOLE_1,NOSAVENEARSINKHOLE_1,ROOFLAYERS_1,EXTERIORWALLCOVER_1,ROOFCONSTRUCTIONYEAR_1,ROOFCONSTRUCTION_1,ROOFCONDITION_1,FOUNDATION_1,FOUNDATIONTYPE_1,MARKETVALUE_1,RESPONDINGFIRESTATION_1,FIRECODE_1,INTERNALPROTECTIONCLASS_1,DISTANCEFIRESTATION_1,DISTANCEFIREHYDRANT_1,PLANNEDSUBDIVISION_1,NOSAVEPLANNEDSUBDIVISION_1,SUBDIVISION_1,BARRIERISLAND_1,NOSAVEBARRIERISLAND_1,WINDMITPREMIUM_1,WMWATERRESISTANCE_1,WMROOFCOVERING_1,ROOFDECKATTACH_1,WMROOFANCHORAGE_1,WBDR_1,WMROOFGEOMETRY_1,WMWINDOWPROTECTION_1,IBHS_1,TERRAIN_1,WINDSPEED_1,LASTELECTRICALUPDATE_1,LASTROOFUPDATE_1,LASTPLUMBINGUPDATE_1,LASTHEATINGUPDATE_1
FIRECODE_1: [empty string]
FOUNDATIONTYPE_1: BASEMENT
FOUNDATION_1: CLOSED
HEATTYPE1_1: OIL
IBHS_1: PARTIAL
INITIALEFFECTIVEDATE: 04/09/2023
INTERNALPROTECTIONCLASS_1: 1
ISQUICKQUOTE: N
LASTELECTRICALUPDATE_1: 2018
LASTHEATINGUPDATE_1: 2021
LASTPAGE: 600
LASTPLUMBINGUPDATE_1: 2020
LASTROOFUPDATE_1: 2019
MARKETVALUE_1: 300000
NEARSINKHOLE_1: N
NOSAVEBARRIERISLAND_1: N
NOSAVENEARSINKHOLE_1: N
NOSAVEPLANNEDSUBDIVISION_1: N
NOSAVEROWHOUSE_1: N
NUMBERFAMILIES_1: 2
NUMROOMS_1: 11
NUMSTORIES_1: 1
OCCUPANCY_1: TENANT
PLANNEDSUBDIVISION_1: N
POLICYTYPECODE: DP3
PURCHASEPRICE_1: 305080
RESPONDINGFIRESTATION_1: JACKSONVILLE
ROOFCONDITION_1: ABOVEAVERAGE
ROOFCONSTRUCTIONYEAR_1: 2015
ROOFCONSTRUCTION_1: 3TAB
ROOFDECKATTACH_1: NA
ROOFLAYERS_1: 1
ROWHOUSE_1: N
SQUAREFOOTAGE_1: 2546
SUBDIVISION_1: [empty string]
TERRAIN_1: B
TERRITORYCODE_1: 39
USERTYPE: internal
UWQUOTECODE: A
WBDR_1: N
WINDMITPREMIUM_1: 15000
WINDPOOL_1: N
WINDSPEED_1: 110
WMROOFANCHORAGE_1: CLIPS
WMROOFCOVERING_1: FBC
WMROOFGEOMETRY_1: NA
WMWATERRESISTANCE_1: N
WMWINDOWPROTECTION_1: HURRICANE
 
							
							
								
									struct [empty]

 
								
							
								
									[cfc1] component is.application.includes.class_Auth

PRIMARYKEY: 3106516 
IPADDRESS: 98.237.120.185 
SECONDARYKEY: [empty string] 
VIEWID: 2 
DATAPACKET: 31065162internal0TopMenuOneSectionISiAppa82741540573558027i15151613s3902970422694160i543302040QuoteJHUGHESN60yes04/04/2023 03:18:18PM 
USERTYPE: internal 
VERIFIED: true 
USERLOGINID: 0 
LAYOUTNAME: TopMenuOneSection 
AUTHPURPOSE: ISiApp 
CHANGED: false 
AUTHTOKEN: a82741540573558027i15151613s3902970422694160i54330 
MANUALID: 2040 
WDDXEXTENSIONID: [empty string] 
DATATYPE: Quote 
USERLOGINNAME: JHUGHES 
PAGEID: [empty string] 
FREEMENUNAV: N 
Methods: 
	GETAGENTPROFILEITEM
		[function]
		Arguments: 
			Name: profileItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETPROFILEITEM
		[function]
		Arguments: 
			Name: profileItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETUSERDETAILS
		[function]
		Arguments: 
			Name: UserLoginID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: UserLoginName 
			Required: Required 
			Type: string 
			default: 
		ReturnType: struct 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: UseDefaultOnBlank 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INIT
		[function]
		Arguments: 
			Name: Purpose 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: auth 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	NEWTOKEN
		[function]
		Arguments: none 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	REFRESHDATAPACKET
		[function]
		Arguments: 
			Name: XMLNodeArray 
			Required: Required 
			Type: array 
			default: 
		ReturnType: array 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVE
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATEUSERLOG
		[function]
		Arguments: 
			Name: Process 
			Required: Required 
			Type: string 
			default: 
		 
			Name: ProcessInfo 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	VERIFY
		[function]
		Arguments: 
			Name: token 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	VERIFYSUPPORTINGTOKEN
		[function]
		Arguments: 
			Name: tokenType 
			Required: Required 
			Type: string 
			default: 
		 
			Name: token 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
								
							
								
									[cfc1] component is.application.includes.class_Quote

FIELDSTOTRACKISCHANGED: [empty string] 
WDDXTABLE: DECPAGES 
RATEFLOW: Yes 
COMPANYCODE: 81 
STATUS: Loaded 
WARNUSERONEFFDTCHANGE: No 
AGENTCODE: 10100 
PRIMARYKEY: 3106516 
NUMBEROFAPPLICANTS: 1 
EFFDTCHANGED: false 
POLICYTYPECODE: DP3 
AGENTBACKAPP: No 
FIELDNAMEBLACKLIST: NONE,FIELDNAMES,CurrentUrl,AuthToken,PrimaryKey,SecondaryKey,OVERRIDEMANUALID,OVERRIDEMENUNAVIGATION,OVERRIDEUSERTYPE,OVERRIDEVIEWID,sAuthToken,sAuthTokenType,ErrorMessage,ErrorFieldName,APPRESTART,JSResize,EMAILBODY,EMAILSUBJECT,ParentID,ParentText,TargetManual 
APPLICANTLIST: 1:KEITH ANN LEBLANC JR 
FIELDSFORREASSIGNDRIVER: DriverFlagzzzz,ExcludedDriverzzzz,ApplicantBirthDatezzzz,ApplicantMaritalStatuszzzz,ApplicantSexzzzz,LicenseDatezzzz,DriverYearsLicensedzzzz,LicenseStatuszzzz,LicenseStatezzzz,DriverDefensivezzzz,DefensiveDrivingDatezzzz,DriverYouthTrainingzzzz,DriverMVDIzzzz,DriverUSCitizenzzzz,DriverOOSzzzz,DriverAgezzzz,ApplicantRelationshipzzzz,PercentUsezzzz,LicenseTypezzzz,AVDatezzzz,AVTypeCodezzzz,Ignore_,CompDed_,CollDED_,PrimaryDriver_,RatedDriver_,VehicleVin_,VehicleUse_ 
RATEEFFECTIVEDATE: 1/1/2022 
QUOTENUMBER: 3106516 
DATATYPE: Quote 
APPLICANTNAME: KEITH ANN LEBLANC JR 
UWSTATUSCODE: C 
MANUALID: 2040 
MAXINSUREDID: 0 
CHANGED: true 
UWQUOTECODE: A 
RELATEDQUOTES: 
	[array] 
MIDTERMCHANGEMODE: No 
WDDXPURPOSECODE: NONE 
READONLY: false 
STATECODE: 9 
READONLYMESSAGE: [empty string] 
MAXRISKID: 0 
RELATEDQUOTEUPDATEBLACKLIST: NONE,VIEW,START,PAGE,NEXTPAGE,SEARCHVALUE,ISPUBLICQUOTE,SCROLLTO,RATINGERRORS,BILLCONTROL,CHARGEFEELIST,USECHARGEFEELIST,TAXLIST,FILINGFEES,FOCUSOBJECT,EXCELQUOTE,WORDQUOTE,EMAILQUOTE,PolicyID,ADDPREVIOUSITEM,ADDPREVIOUSITEMNUM,AddPreviousDetailNum,QUOTENUMBER,QCODE,UWSTATUSCODE,UWSTATUSDATE,HASCHANGED,NEEDTORATE,MANUALID,STATECODE,RATELOOP,RATEEFFECTIVEFIELD,RATEEFFECTIVEDATE,RATEEFFECTIVEENDDATE,ManualEffectiveDate,PolicyTypeCode,POLICYTYPELIST,ISCOMPANYRATED,INITIALEFFECTIVEDATE,INITIALCOMPANYCODE,NUMBEROFAPPLICANTS,NUMBEROFRISKS,RISKTODELETE,RISKTOREPLACE,EFFECTIVEDATE,EXPIRATIONDATE,TRANSEFFECTIVEDATE,TransEffectiveDateMinimum,TransEffectiveDateMaximum,EffectiveDateMinimum,EffectiveDateMaximum,QuoteList,EndorseList,UWQuoteCode,GetDetails,AddDetails,DeleteDetails,StartDetailsView,AccessNumber,APPLICANTTODELETE,CopyRiskRating,PrimaryDriver,ValidationSeverityLevel,EffectiveTime,SensitiveDataFields,FILEUPLOAD_TABLE,ADDITIONALINTERESTS,SCHEDULEDPROPERTY,AVCount 
POLICYMODE: false 
LOADED: true 
NUMBEROFRISKS: 1 
QUOTELAUNCHEFFECTIVEDATE: [empty string] 
WDDXEXTENSIONID: [empty string] 
LOADRELATEDQUOTES: true 
CURRENTDETAILFIELD: [empty string] 
Methods: 
	BRIDGE
		[function]
		Arguments: 
			Name: BridgeAction 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKBILLPOLICYFIELDS
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKBINDINGAUTHORITYOPT
		[function]
		Arguments: 
			Name: HideFrom 
			Required: Required 
			Type: string 
			default: 
		 
			Name: Authority 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKHIDEFROMUSER
		[function]
		Arguments: 
			Name: HideCode 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKREASSIGNDRIVERS
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETEAPPLICANT
		[function]
		Arguments: 
			Name: ApplicantToDelete 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETEDETAIL
		[function]
		Arguments: 
			Name: DetailItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DetailSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: QuestionNumber 
			Required: Required 
			Type: string 
			default: 
		 
			Name: SectionID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: FieldName 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETERISK
		[function]
		Arguments: 
			Name: RiskToDelete 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DETERMINEREADONLY
		[function]
		Arguments: 
			Name: CurrentRatingStatusCode 
			Required: Optional 
			Type: string 
			default: X
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GENERATENEWQUOTE
		[function]
		Arguments: none 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETDISPLAYRISKLIST
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETFEE
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: FeeName 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETIDNUMBER
		[function]
		Arguments: 
			Name: ID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: type 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DetailType 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: PrimaryField 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: PrimaryFieldID 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETINSUREDS
		[function]
		Arguments: 
			Name: bIncludeExcluded 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: query 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETKEYS
		[function]
		Arguments: none 
		ReturnType: array 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETMANUALRECORD
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETMANUALSTATUSCODES
		[function]
		Arguments: none 
		ReturnType: Any 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETPRIMARYFIELD
		[function]
		Arguments: 
			Name: keyName 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETRISKDESCRIPTIONLIST
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETRISKSTORATELIST
		[function]
		Arguments: none 
		ReturnType: Any 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETSPECIFICWEBAPPRATINGRESULTSPREMIUM
		[function]
		Arguments: 
			Name: FieldName 
			Required: Optional 
			Type: Any 
			default: 
		 
			Name: type 
			Required: Optional 
			Type: Any 
			default: 
		 
			Name: tempSuffix 
			Required: Optional 
			Type: Any 
			default: 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: UseDefaultOnBlank 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETWEBAPPRATINGRESULTSPREMIUM
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INIT
		[function]
		Arguments: none 
		ReturnType: quote 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INITIALIZEADDITIONALQUOTES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	ISCHANGEDELIMS
		[function]
		Arguments: 
			Name: value 
			Required: Required 
			Type: string 
			default: 
		 
			Name: delim 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADAPPLICANTLIST
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADCLIENTCODE
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADDATA
		[function]
		Arguments: 
			Name: PrimaryKey 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADSUPPLIMENT
		[function]
		Arguments: 
			Name: inPurposeCode 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	MAPIDNUMBER
		[function]
		Arguments: 
			Name: ID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: type 
			Required: Required 
			Type: string 
			default: 
		 
			Name: relatedID 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: DetailFieldName 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: RelatedType 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	POSTSAVEFORMDATA
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	RETURNWDDX
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVE
		[function]
		Arguments: 
			Name: bSetRatingStatus 
			Required: Optional 
			Type: string 
			default: false
		 
			Name: bIgnoreReadOnly 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVERELATEDQUOTES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETEFFECTIVEDATES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bPushThoughChanges 
			Required: Optional 
			Type: boolean 
			default: true
		 
			Name: DoAdditionalProcessing 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SHOWADDRESS
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DataPrefix 
			Required: Optional 
			Type: string 
			default: Applicant
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SHOWPREMIUM
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATENUMBEROF
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATERELATEDQUOTES
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
								
								
									
		
			
			
				Key Name
				Value
			
			
			
				
					
						_1
						N
					
				
					
						ACCESSNUMBER
						2
					
				
					
						ADDRESSCHANGED
						N
					
				
					
						ADDRESSCHANGED_1
						N
					
				
					
						AGENTADDRESS
						15 MAIN ST Suite 101, HOUSTON, TX 77002 1111
					
				
					
						AGENTCANWRITE12099
						Y
					
				
					
						AGENTCANWRITECENTRALFL
						Y
					
				
					
						AGENTCANWRITESWFL
						Y
					
				
					
						AGENTCODE
						10100
					
				
					
						AGENTDATALOADED
						10100
					
				
					
						AGENTDATELOADED
						04/04/2023
					
				
					
						AGENTENOTIFYADDRESS
						test.agency@cornerops.com
					
				
					
						AGENTHASACHSETUP
						no
					
				
					
						AGENTINFO
						TEST AGENCY - 10100
					
				
					
						AGENTMVRCHARGEFLAG
						N
					
				
					
						ALTERNATEREPORTPROTECTIONCLASS_1
						10W/10
					
				
					
						ALTERNATEREPORTPROTECTIONCLASS_1_1
						10W/10
					
				
					
						APPLICANTADDRESS1
						1837 W 19TH ST
					
				
					
						APPLICANTADDRESS1_1
						1837 W 19TH ST
					
				
					
						APPLICANTADDRESSTYPE
						domestic
					
				
					
						APPLICANTADDRESSTYPE_1
						domestic
					
				
					
						APPLICANTAGEZZZZ1
						43
					
				
					
						APPLICANTBIRTHDATEZZZZ1
						02/02/1980
					
				
					
						APPLICANTCITY
						JACKSONVILLE
					
				
					
						APPLICANTCITY_1
						JACKSONVILLE
					
				
					
						APPLICANTEMAILZZZZ1
						john.hughes@cornerops.com
					
				
					
						APPLICANTFIRSTZZZZ1
						KEITH
					
				
					
						APPLICANTHOMEPHONEZZZZ1
						717-765-5091
					
				
					
						APPLICANTLASTZZZZ1
						LEBLANC
					
				
					
						APPLICANTMARITALSTATUSZZZZ1
						S
					
				
					
						APPLICANTMIDDLEZZZZ1
						ANN
					
				
					
						APPLICANTNAME
						KEITH ANN LEBLANC JR
					
				
					
						APPLICANTRELATIONSHIPZZZZ1
						SELF
					
				
					
						APPLICANTSTATE
						FL
					
				
					
						APPLICANTSTATE_1
						FL
					
				
					
						APPLICANTSUFFIXZZZZ1
						JR
					
				
					
						APPLICANTZIP
						32209
					
				
					
						APPLICANTZIP_1
						32209
					
				
					
						APPLICATIONFORECLOSURES_1
						N
					
				
					
						APPLIESTOLIST
						O
					
				
					
						AppProtectionClass_1
						1
					
				
					
						AppReportProtectionClass_1
						
					
				
					
						AreaID
						3
					
				
					
						ARSONCONVICTION_1
						N
					
				
					
						AUTOLATLONGINDICATORLAT
						L
					
				
					
						AUTOUNDERWRITING
						0
					
				
					
						BARRIERISLAND_1
						N
					
				
					
						BCEGS_1
						4
					
				
					
						BCEGS_1_1
						06
					
				
					
						BCEGS_2_1
						03
					
				
					
						BCEGS_3_1
						04
					
				
					
						BCEGS_4_1
						04
					
				
					
						BCEGSYEAR_1
						2012
					
				
					
						BCEGSYEAR_1_1
						1996
					
				
					
						BCEGSYEAR_2_1
						2001
					
				
					
						BCEGSYEAR_3_1
						2008
					
				
					
						BCEGSYEAR_4_1
						2012
					
				
					
						BILLCONTROL
						819DP304/09/2023AApp_A
					
				
					
						BOBCARRIERNAME
						GEICO
					
				
					
						BOBDISCEXPDATE
						03/22/2024
					
				
					
						BOBDISCEXPDAYS_1
						348
					
				
					
						BOBDISCOUNT
						Y
					
				
					
						BOBDISCSTARTDATE
						03/22/2023
					
				
					
						BOBDISCSTARTDAYS_1
						18
					
				
					
						BOBTRANSFER_1
						N
					
				
					
						BUILDERONLY
						N
					
				
					
						BUILDINGUNITS_1
						1
					
				
					
						BURGLARALARMCREDIT_1
						CENTRAL
					
				
					
						CANAGENTBIND
						N
					
				
					
						CANENTERPAYMENTS
						no
					
				
					
						CANWRITECENTRALFL
						Y
					
				
					
						CANWRITEPALMBEACH
						Y
					
				
					
						CANWRITESWFL
						Y
					
				
					
						CCHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						CENSUSBLOCKID_1
						120310029014008
					
				
					
						CHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						CITY
						Jacksonville
					
				
					
						CITY_1
						Jacksonville
					
				
					
						COMPANYCODE
						81
					
				
					
						CONSTRUCTIONTYPE_1
						V
					
				
					
						CONSTRUCTIONYEAR_1
						2015
					
				
					
						CONTENTSLIMIT_1
						25000
					
				
					
						COUNTRYNAME
						US
					
				
					
						COUNTRYNAME_1
						US
					
				
					
						COUNTYCODE_1
						12031
					
				
					
						COUNTYCODE_1_1
						12031
					
				
					
						COUNTYFIPSCODE_1
						12031
					
				
					
						COUNTYFIPSCODE_1_1
						12031
					
				
					
						COUNTYNAME_1
						DUVAL
					
				
					
						COUNTYNAME_1_1
						DUVAL
					
				
					
						COVEREDPORCH_1
						N
					
				
					
						CURRENTDETAILFIELD
						OptionalCoverages_1
					
				
					
						CURRENTPAGE
						700
					
				
					
						CURRENTPROGRESSPAGE
						700
					
				
					
						CYPRESSCONVERSION
						N
					
				
					
						DECTAXLIST
						
					
				
					
						DEDUCTIBLE_1
						5000
					
				
					
						DEFAULTEDTOZIPINDICATORLAT
						N
					
				
					
						DEPBILLCONTROL
						819DP304/09/2023AApp_A
					
				
					
						DEPOSITDATE
						04/04/2023
					
				
					
						DEPOSITUNVERIFIED
						Y
					
				
					
						DISTANCEFIREHYDRANT_1
						LT1000
					
				
					
						DISTANCEFIRESTATION_1
						1
					
				
					
						DISTANCEFIRESTATION_1_1
						01
					
				
					
						DTAC_1
						17.1114
					
				
					
						DUEDATE
						
					
				
					
						DwellingAge_1
						8
					
				
					
						DWELLINGLIMIT_1
						300000.00
					
				
					
						DWELLINGTYPE_1
						DWELLING
					
				
					
						EFFECTIVEDATE
						04/09/2023
					
				
					
						EFFECTIVEDATEMAXIMUM
						12/29/2025
					
				
					
						EFFECTIVEDATEMINIMUM
						01/16/2015
					
				
					
						EFFECTIVEDATESET
						04/04/2023
					
				
					
						EFFECTIVEDATEUSERLOGINNAME
						JHUGHES
					
				
					
						EFFECTIVEDATEUSERTYPE
						internal
					
				
					
						EXOTICPETS_1
						N
					
				
					
						EXTERIORWALLCOVER_1
						CONCRETEBLOCK
					
				
					
						FAIRRENTALADDTLLIVINGLIMIT_1
						20
					
				
					
						FAMILYUNITSROW_1
						1
					
				
					
						FARMORRANCH_1
						N
					
				
					
						FEELOOKUPPROCESS
						App_A
					
				
					
						FIREALARMCREDIT_1
						CENTRAL
					
				
					
						FIREPROTECTIONAREA_1
						JACKSONVILLE
					
				
					
						FIREPROTECTIONAREA_1_1
						JACKSONVILLE
					
				
					
						FIRESTATIONDISTANCEBAND_1
						01
					
				
					
						FIRESTATIONDISTANCEBAND_1_1
						01
					
				
					
						FIRESTATIONDISTANCERANGE_1
						1 MILE OR LESS
					
				
					
						FIRESTATIONDISTANCERANGE_1_1
						1 MILE OR LESS
					
				
					
						FLOODCARRIER_1
						FREE WATER
					
				
					
						FLOODPOLICYNUM_1
						651561651651
					
				
					
						FLOODZONE_1
						A
					
				
					
						FOUNDATION_1
						CLOSED
					
				
					
						FOUNDATIONTYPE_1
						BASEMENT
					
				
					
						GMBLOCK
						4008
					
				
					
						GMBLOCK_1
						4008
					
				
					
						GMBLOCKGROUP
						0
					
				
					
						GMBLOCKGROUP_1
						0
					
				
					
						GMCOUNTY
						031
					
				
					
						GMCOUNTY_1
						031
					
				
					
						GMFIPS_1
						120310029014008
					
				
					
						GMGEOCODEFORMSUBMITALERT_1
						No
					
				
					
						GMGEOCODERESULTID_1
						12962548
					
				
					
						GMLATITUDE
						30.355421
					
				
					
						GMLATITUDE_1
						30.355421
					
				
					
						GMLONGITUDE
						-81.687349
					
				
					
						GMLONGITUDE_1
						-81.687349
					
				
					
						GMMATCHEDADDRESS
						1837 19th St, Jacksonville, FL, 32209
					
				
					
						GMMATCHEDADDRESS_1
						1837 19th St, Jacksonville, FL, 32209
					
				
					
						GMSTATE
						12
					
				
					
						GMSTATE_1
						12
					
				
					
						GMTRACT
						002901
					
				
					
						GMTRACT_1
						002901
					
				
					
						GMUSCBGEOCODINGCOMPLETED_1
						Yes
					
				
					
						GMUSPSVERIFICATIONSUCCESSFUL_1
						Yes
					
				
					
						GQRECVEHICLES_1
						N
					
				
					
						GQRENOVATION_1
						N
					
				
					
						HEATTYPE1_1
						OIL
					
				
					
						HOMELATITUDE_1
						30.355421
					
				
					
						HOMELONGITUDE_1
						-81.687349
					
				
					
						HTMLTEXTAGENTCODE
						DBA TEST AGENCY
					
				
					
						HTMLTEXTAGENTCODEEMAIL
						test.agency@cornerops.com
					
				
					
						HTMLTEXTSUBAGENTCODE
						JOHN HUGHES 564873
					
				
					
						IBHS_1
						PARTIAL
					
				
					
						INITIALEFFECTIVEDATE
						04/09/2023
					
				
					
						INITIALRATEEFFECTIVEDATE
						01/01/2022
					
				
					
						INTERFACEVERSION
						UA
					
				
					
						InternalProtectionClass_1
						1
					
				
					
						ISOProtectionClass_1
						1
					
				
					
						ISQUICKQUOTE
						N
					
				
					
						LASTELECTRICALUPDATE_1
						2018
					
				
					
						LASTHEATINGUPDATE_1
						2021
					
				
					
						LASTPAGE
						600
					
				
					
						LASTPLUMBINGUPDATE_1
						2020
					
				
					
						LASTROOFUPDATE_1
						2019
					
				
					
						LIMITEDWATERDMG_1
						N
					
				
					
						LIVESTOCK_1
						N
					
				
					
						LoadRisk
						1
					
				
					
						LOCATIONZIP_1
						32209
					
				
					
						MandatoryFungi_1
						Y
					
				
					
						MandatoryOrdLaw_1
						Y
					
				
					
						MANUALEFFECTIVEDATE
						01/01/2022
					
				
					
						MANUALID
						2040
					
				
					
						MANUALRENEWALDATE
						01/01/2022
					
				
					
						MARKETVALUE_1
						300000
					
				
					
						MATCHTYPE_1
						A
					
				
					
						MAXPAYMENTAMOUNT
						859
					
				
					
						MEDICALLIMIT_1
						5000
					
				
					
						MIDTERMCHANGEMODE
						No
					
				
					
						MinPremAdj
						N
					
				
					
						MoldFungiLimit_1
						10000
					
				
					
						NAMEDINSUREDFLAGZZZZ1
						Y
					
				
					
						NEARSINKHOLE_1
						N
					
				
					
						NEEDTORATE
						1
					
				
					
						NEXTPAGE
						99
					
				
					
						NOTIFYAGENTFLAG
						Y
					
				
					
						NUMBERFAMILIES_1
						2
					
				
					
						NUMBEROFACRES_1
						N
					
				
					
						NUMBEROFAPPLICANTS
						1
					
				
					
						NUMBEROFRISKS
						1
					
				
					
						NUMROOMS_1
						11
					
				
					
						NUMSTORIES_1
						1
					
				
					
						OCCUPANCY_1
						TENANT
					
				
					
						OCCUPATIONTYPEZZZZ1
						EMPLOYED
					
				
					
						OCCUPIEDDAYCARE_1
						N
					
				
					
						OnLastPage
						N
					
				
					
						OPENWATEREXPOSURE_1
						N
					
				
					
						OPTIONALCOVERAGES_1
						0
					
				
					
						OrdinanceLaw_1
						10
					
				
					
						OTHERSTRUCTURESAMOUNT_1
						2
					
				
					
						OtherStructuresLimit_1
						6000
					
				
					
						OWNERCODE
						O
					
				
					
						PAGEHISTORY
						100,101,200,400,500,600,700
					
				
					
						PageID
						200
					
				
					
						PAPERLESS
						Y
					
				
					
						PASSEDCAPACITYRULES
						Y
					
				
					
						PAYMENTAMOUNTLIST
						
					
				
					
						PAYMENTDATELIST
						
					
				
					
						PERSONALLIABILITYLIMIT_1
						100000
					
				
					
						PIFREQUIREDDEPOSITAMOUNT
						
					
				
					
						PLANNEDSUBDIVISION_1
						N
					
				
					
						POLICYHASACHSET
						N
					
				
					
						POLICYHASRCCSET
						N
					
				
					
						PolicyNumberPartList
						IFD,FLPOLICYNO:7,-00
					
				
					
						POLICYTERM
						12
					
				
					
						POLICYTYPECODE
						DP3
					
				
					
						POLICYTYPELIST
						&quot; , &quot;'&quot; , &quot;DP3&quot; , &quot;'&quot; , &quot;
					
				
					
						PREDIRECTION
						W
					
				
					
						PREDIRECTION_1
						W
					
				
					
						PREVIOUSADDRESS1
						850 Queen St
					
				
					
						PREVIOUSADDRESSTYPE
						domestic
					
				
					
						PREVIOUSCITY
						Harrisburg
					
				
					
						PREVIOUSSTATE
						PA
					
				
					
						PREVIOUSZIP
						17113
					
				
					
						PRIORCARRIER_1
						TRAVELERS
					
				
					
						PRIOREXPDAYS_1
						-21
					
				
					
						PRIOREXPIRATIONDATE_1
						04/30/2023
					
				
					
						PRIORINSURANCE_1
						Y
					
				
					
						PRIORPOLICYNUMBER_1
						2313564897
					
				
					
						ProtectionClass_1
						1
					
				
					
						ProtectionClassList_1
						1
					
				
					
						ProtectionSubscription_1
						
					
				
					
						PURCHASEDATE_1
						09/03/2018
					
				
					
						PURCHASEDAYS_1
						1679
					
				
					
						PURCHASEPRICE_1
						305080
					
				
					
						QUOTENUMBER
						3106516
					
				
					
						RATEEFFECTIVEDATE
						1/1/2022
					
				
					
						RATEEFFECTIVEFIELD
						ManualStart
					
				
					
						RatingCount
						1
					
				
					
						REASSIGNDRIVERS
						Y
					
				
					
						RENTEDLT5DAYS_1
						N
					
				
					
						RENTEDSTUDENT_1
						N
					
				
					
						REPORTPROTECTIONCLASS_1
						1
					
				
					
						REPORTPROTECTIONCLASS_1_1
						1
					
				
					
						REQUIREDDEPOSITAMOUNT
						27
					
				
					
						REQUIREDDEPOSITCODE
						
					
				
					
						RESPONDINGFIRESTATION_1
						JACKSONVILLE
					
				
					
						RESPONDINGFIRESTATION_1_1
						JACKSONVILLE
					
				
					
						RESULTCOUNTAIRHAZARD
						1
					
				
					
						ResultCountBCEGS_1
						4
					
				
					
						RESULTCOUNTCENSUS
						1
					
				
					
						RESULTCOUNTCUSTOM
						1
					
				
					
						RESULTCOUNTLAT
						1
					
				
					
						ResultCountPPC_1
						1
					
				
					
						RESULTCOUNTSINKHOLE
						1
					
				
					
						RESULTCOUNTWINDPOOL
						1
					
				
					
						ReturnSourceBCEGS_1
						ADDRESS
					
				
					
						RETURNSOURCECENSUS
						ADDRESS
					
				
					
						RETURNSOURCECUSTOM
						ADDRESS
					
				
					
						RETURNSOURCELAT
						N/A
					
				
					
						ReturnSourcePPC_1
						ADDRESS
					
				
					
						RETURNSOURCESINKHOLE
						ADDRESS
					
				
					
						RETURNSOURCEWINDPOOL
						ADDRESS
					
				
					
						REVERTFEELIST
						
					
				
					
						RISKAGE_1
						8
					
				
					
						ROOFCONDITION_1
						ABOVEAVERAGE
					
				
					
						ROOFCONSTRUCTION_1
						3TAB
					
				
					
						ROOFCONSTRUCTIONYEAR_1
						2015
					
				
					
						ROOFDECKATTACH_1
						NA
					
				
					
						ROOFLAYERS_1
						1
					
				
					
						ROWHOUSE_1
						N
					
				
					
						SECUREDBUILDINGCREDIT_1
						SINGLEENTRY
					
				
					
						SeniorRetiree_1
						N
					
				
					
						SERVICEFEE
						0
					
				
					
						SINKHOLEAREASCORE_1
						2
					
				
					
						SINKHOLEDEDUCTIBLE_1
						10
					
				
					
						SINKHOLELIMIT_1
						N
					
				
					
						SINKHOLEPLACEMENTTYPE_1
						E
					
				
					
						SINKHOLERISKSCORE_1
						4
					
				
					
						SPRINKLER_1
						PARTIAL
					
				
					
						SQUAREFOOTAGE_1
						2546
					
				
					
						STATECODE
						9
					
				
					
						STATECODE_1
						FL
					
				
					
						STREETNAME
						19th
					
				
					
						STREETNAME_1
						19th
					
				
					
						STREETNUMBER
						1837
					
				
					
						STREETNUMBER_1
						1837
					
				
					
						STREETTYPE
						St
					
				
					
						STREETTYPE_1
						St
					
				
					
						SUBAGENTCODE
						10100_JHUGHES
					
				
					
						SWIMMINGPOOL_1
						N
					
				
					
						TAXLIST
						
					
				
					
						TERRAIN_1
						B
					
				
					
						TERRITORYCODE_1
						39
					
				
					
						TOTALPREMIUM
						832
					
				
					
						TRAMPOLINE_1
						N
					
				
					
						UNREPAIREDDAMAGE_1
						N
					
				
					
						USECHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						USERTYPE
						internal
					
				
					
						USPSCOMPLETEADDRESS-APPLICANT
						1837 W 19TH ST, JACKSONVILLE, FL, 32209
					
				
					
						USPSCOMPLETEADDRESS-APPLICANT_1
						1837 W 19TH ST, JACKSONVILLE, FL, 32209
					
				
					
						USPSCOMPLETEADDRESS-PREVIOUS
						850 Queen St, Harrisburg, PA 17113
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-APPLICANT
						0
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-APPLICANT_1
						0
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-PREVIOUS
						1
					
				
					
						UWQUOTECODE
						A
					
				
					
						UWSTATUSCODE
						C
					
				
					
						VALIDBILLING
						true
					
				
					
						VALIDRATING
						true
					
				
					
						VERINTGADDRESSCHANGED_1
						N
					
				
					
						VERINTGApplicantAddress1_1
						1837 W 19TH ST
					
				
					
						VERINTGApplicantAddress2_1
						
					
				
					
						VERINTGApplicantCity_1
						JACKSONVILLE
					
				
					
						VERINTGApplicantState_1
						FL
					
				
					
						VERINTGApplicantZip_1
						32209
					
				
					
						VERINTGCITY_1
						Jacksonville
					
				
					
						VERINTGCOUNTRYNAME_1
						US
					
				
					
						VERINTGErrorCode_1
						OK
					
				
					
						VERINTGErrorMessage_1
						OK
					
				
					
						VERINTGHitFlag_1
						Y
					
				
					
						VERINTGNumberReorders_1
						1
					
				
					
						VERINTGOrderDate_1
						4/4/2023
					
				
					
						VERINTGOrderMessage_1
						 UWOrderRules - 
					
				
					
						VERINTGOrderReason_1
						2
					
				
					
						VERINTGPREDIRECTION_1
						W
					
				
					
						VERINTGRECORDCOUNTBCEGS_1
						4
					
				
					
						VERINTGRECORDCOUNTPPC_1
						1
					
				
					
						VERINTGReferenceNumber_1
						d468ad2e-54b0-4df9-b780-bfc750b2a1d6
					
				
					
						VERINTGReportStatus
						
					
				
					
						VERINTGReportStatusDate
						
					
				
					
						VERINTGReportStatusMessage
						
					
				
					
						VERINTGResultID_1
						20276226
					
				
					
						VERINTGRETURNSOURCEBCEGS_1
						ADDRESS
					
				
					
						VERINTGRETURNSOURCEPPC_1
						ADDRESS
					
				
					
						VERINTGSTATECODE_1
						FL
					
				
					
						VERINTGStopErrorCode
						
					
				
					
						VERINTGStopErrorMessage
						
					
				
					
						VERINTGSTREETNAME_1
						19th
					
				
					
						VERINTGSTREETNUMBER_1
						1837
					
				
					
						VERINTGSTREETTYPE_1
						St
					
				
					
						VERINTGZIP4CODE_1
						4815
					
				
					
						VERINTGZIPCODE_1
						32209
					
				
					
						VERISKRESULTID
						12962548
					
				
					
						VERISKRESULTID_1
						12962548
					
				
					
						VIEWID
						2
					
				
					
						WBDR_1
						N
					
				
					
						WINDHAILDEDUCTIBLE_1
						5
					
				
					
						WindHailDeductibleAmount_1
						15000
					
				
					
						WINDMITPREMIUM_1
						15000
					
				
					
						WINDPOOL_1
						N
					
				
					
						WINDPOOLINDICATOR_1
						N
					
				
					
						WINDPOOLZONE_1
						-
					
				
					
						WINDSPEED_1
						110
					
				
					
						WLMClass
						NC2
					
				
					
						WMROOFANCHORAGE_1
						CLIPS
					
				
					
						WMROOFCOVERING_1
						FBC
					
				
					
						WMROOFGEOMETRY_1
						NA
					
				
					
						WMWATERRESISTANCE_1
						N
					
				
					
						WMWINDOWPROTECTION_1
						HURRICANE
					
				
					
						ZIP4CODE
						4815
					
				
					
						ZIP4CODE_1
						4815
					
				
					
						ZIPCODE
						32209
					
				
					
						ZIPCODE_1
						32209
					
				
			
		
	
								
							
								
									struct

AdministratorNotificationEmailFromList: [empty string]
AdministratorNotificationEmailList: [empty string]
AdministratorNotificationTestEmailList: [empty string]
AuthorizedIPAddressList: 127.0.0.1,10.211.113.62,10.212.113.62
ClientColorSchema: [empty string]
ClientNumber: 21
ClientVarsDatasource: ClientVarsDB
DecpageEffectiveDateOffsetDays: 0
DefaultHomePage: [empty string]
EbixDataDatasource: EbixdataSQL
ExtraApplicationName: Test
ISArchiveDatasource: ISArchive21TestSQL
ISBackupDatasource: ISBackup
ISCCDataDatasource: ISCCData21TestSQL
ISCLIENTSQRY:  
	[query]
	 
	[Record # 1] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: [empty string] 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: [empty string] 
	CLIENTNAME: Access Home Insurance Company 
	CLIENTNUMBER: 21 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: [empty string] 
	CLIENTZIP: [empty string] 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: [empty string] 
	EBIXFLAG: N 
	IAPATH: accesshome 
	ISITESTURL: https://accesshometest.cogisi.com/is/root/ 
	ISIURL: https://accesshome.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: accesshome 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://accesshome.cogisi.com/ 
	RUNASCLIENT: [empty string] 
	RUNASIS: Y 
	SHORTNAME: Access Home 
	SSLFLAG: Y
	 
	[Record # 2] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: [empty string] 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: [empty string] 
	CLIENTNAME: Cypress Insurance Company 
	CLIENTNUMBER: 20 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: [empty string] 
	CLIENTZIP: [empty string] 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: 84 
	EBIXFLAG: N 
	IAPATH: cypress 
	ISITESTURL: https://cypresstest.cogisi.com/is/root/ 
	ISIURL: https://cypress.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: cypress 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://cypress.cogisi.com/ 
	RUNASCLIENT: 21 
	RUNASIS: Y 
	SHORTNAME: Access Home 
	SSLFLAG: Y
	 
	[Record # 3] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: 425 N. Prince St. 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: Lancaster 
	CLIENTNAME: Cornerstone 
	CLIENTNUMBER: 18 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: PA 
	CLIENTZIP: 17603 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: [empty string] 
	EBIXFLAG: N 
	IAPATH: cornerstone 
	ISITESTURL: https://cornerstonetest.cogisi.com/is/root/ 
	ISIURL: https://cornerstone.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: cornerstone 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://cornerstone.cogisi.com/ 
	RUNASCLIENT: [empty string] 
	RUNASIS: Y 
	SHORTNAME: Cornerstone 
	SSLFLAG: Y
ISClientDatasource: ISClient21TestSQL
ISDataDatasource: ISData21TestSQL
ISISERVERLOCALURL: https://cypresstest.cogisi.com/is/
ISISERVERURL: https://cypresstest.cogisi.com/is/
ISRatingDatasource: ISRating21TestSQL
ISStatDatasource: ISStat21TestSQL
ISToolsDatasource: ISTools
ISiLocalURLRoot: https://cypresstest.cogisi.com/is/root/
ISiPublicURLRoot: https://cypresstest.cogisi.com/is/root/
IsLocal: false
IsTestMode: true
LocalIPAddressList: 10.211.113.0,127.0.0.1,::1,10.211.113.62
MobileAppCFCPathRoot: [empty string]
NavigationIconOrderList: [empty string]
PUBLICWEBSERVICEURL: https://cypresstest.cogisi.com/is/
ParameterEncryptionKey: e4xyugq/Z67nR9wPvRJ53g==
PublicHTTPHostName: [empty string]
ReportServerLocalURLRoot: http://cypresstest.cogisi.com/ReportServer/Pages/
ReportServerPublicURLRoot: http://cypresstest.cogisi.com/ReportServer/Pages/
SQLParameters: ;SERVER=10.212.113.64;Provider=SQLNCLI11;
ServerLocalURLRoot: https://cypresstest.cogisi.com/
ServerPublicURLRoot: https://cypresstest.cogisi.com/
ThisServerHostsMultipleClientNumbers: true
UseChoicePointWebserviceInsteadOfDLL: true
UseEncryptWebserviceInsteadOfDLL: true
UseHTTPSLocal: true
UseISClaimsWebserviceInsteadOfDLL: true
UseISConvertToWebInfoWebserviceInsteadOfDLL: true
UseISDataAdjustWebserviceInsteadOfDLL: true
UseISOSearchWebserviceInsteadOfDLL: true
UseISTransferWebserviceISOPropertyInsteadOfDLL: true
UseISTransferWebserviceInsteadOfDLL: true
UseISTransferWebserviceReverseTransferInsteadOfDLL: true
UseISTransferWebserviceTransferMainInsteadOfDLL: true
UseISiEDTWebserviceInsteadOfDLL: true
UseISiThirdPartyWebserviceInsteadOfDLL: true
VINWebServiceStaticToken: c0a1846b-ab76-446e-af2f-6004503f3769
WebserviceCallTimeoutValue: 60
WebserviceLocalURLRoot: https://cypresstest.cogisi.com/is/webservices/
WebservicePublicURLRoot: https://cypresstest.cogisi.com/is/webservices/
dbPassword: cypressSQLPASS_437eYu8i
dbUsername: CypressSQLUser
 
								
							
								
									
            
                
                    
                        Step
                        Rate Number
                        Description
                        Rate Mode
                        Flow Info
                        Value
                        Premium
                    
                
                
                    
                        
                            1
                            20
                            Set Risk Zip
                            GetRiskZip
                             
                            32209
                            $0.00
                        
                    
                        
                            2
                            80
                            Set Endorsement Factor
                            EndorsementFactor
                             
                            1
                            $0.00
                        
                    
                        
                            3
                            90
                            Initialize Adjust Base Factor
                            EndorsementFactor
                             
                            1
                            $0.00
                        
                    
                        
                            4
                            110
                            Calculate age of house
                            Subtract
                              !PolicyYear=2023, ConstructionYear=2015
                            8
                            $0.00
                        
                    
                        
                            5
                            120
                            Set Term Count/Tenure
                            SetVariable
                              !TermCount=1
                            1
                            $0.00
                        
                    
                        
                            6
                            150
                            Set DwellingAge in structure
                            AssignField
                              AgeofDwelling=8
                            0
                            $0.00
                        
                    
                        
                            7
                            160
                            Load Agent fields based on ISClientSettings LoadAgentExtFields
                            LoadProfile
                             
                            0
                            $0.00
                        
                    
                        
                            8
                            170
                            Initialize Senior/Retiree Field
                            SetVariable
                              SeniorRetiree
                            
                            $0.00
                        
                    
                        
                            9
                            180
                            Initialize Senior/Retiree Field
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;N&quot; , &quot;'&quot; , &quot;
                            N
                            $0.00
                        
                    
                        
                            10
                            240
                            Assign Senior/Retiree Field
                            AssignField
                              TempSeniorRetiree=N
                            0
                            $0.00
                        
                    
                        
                            11
                            270
                            Initialize MandatoryFungi (used for ManualCoverages)
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;Y&quot; , &quot;'&quot; , &quot;
                            Y
                            $0.00
                        
                    
                        
                            12
                            290
                            Set MandatoryFungi
                            AssignField
                              TempMandatoryFungi=Y
                            0
                            $0.00
                        
                    
                        
                            13
                            300
                            Set MoldFungiLimit
                            AssignField
                              &quot; , &quot;'&quot; , &quot;10000&quot; , &quot;'&quot; , &quot;
                            0
                            $0.00
                        
                    
                        
                            14
                            340
                            Initialize MandatoryOrdLaw (used for ManualCoverages)
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;Y&quot; , &quot;'&quot; , &quot;
                            Y
                            $0.00
                        
                    
                        
                            15
                            360
                            Set MandatoryOrdLaw
                            AssignField
                              TempMandatoryOrdLaw=Y
                            0
                            $0.00
                        
                    
                        
                            16
                            361
                            Fire Protection Class and Responding Fire Dept
                            TPR 0010
                              &quot; , &quot;'&quot; , &quot;VeriskPPC&quot; , &quot;'&quot; , &quot;
                            0
                            $0.00
                        
                    
                        
                            17
                            370
                            Set OrdinanceLaw
                            AssignField
                              &quot; , &quot;'&quot; , &quot;10&quot; , &quot;'&quot; , &quot;
                            0
                            $0.00
                        
                    
                        
                            18
                            380
                            Run ISO Location report and Set Protection Class
                            ISOLocation
                            Error ordering ISO Location Report 
                            0
                            $0.00
                        
                    
                        
                            19
                            390
                            Policy Number
                            SetStructure
                              IFD, FLPOLICYNO:7, -00=0
                            IFD,FLPOLICYNO:7,-00
                            $0.00
                        
                    
                        
                            20
                            400
                            Calc WindHailDeductible Amount
                            Multiply
                              DwellingLimit=300000, WindHailDeductible=5
                            1500000
                            $0.00
                        
                    
                        
                            21
                            410
                            Calc WindHailDeductible Amount
                            Divide
                              TempWindHailDeductibleAmount=1500000, 100=0.01
                            15000
                            $0.00
                        
                    
                        
                            22
                            420
                            Set WindHailDeductible Amount
                            AssignField
                              TempWindHailDeductibleAmount=15000
                            15000
                            $0.00
                        
                    
                        
                            23
                            10000
                            Lookup WLMClass for Wind Mit Lookup-New Construction
                            RateSupport5
                              RoofDeckAttach=NA, Terrain=B, WindSpeed=110, IBHS=PARTIAL, WBDR=N
                            NC2
                            $0.00
                        
                    
                        
                            24
                            10030
                            Lookup Wind Mit Factor-New Construction
                            LookupRate
                              WLMClass, WMRoofGeometry=NA, WMWindowProtection=HURRICANE, WMWaterResistance=N
                            0
                            $0.00
                        
                    
                        
                            25
                            10050
                            Calc Wind Mitigation Amount
                            Subtract
                              1, WindMitFactor=0
                            1
                            $0.00
                        
                    
                        
                            26
                            10051
                            Calc EC Wind Mitigation Amount
                            Subtract
                              1, WindMitFactor=0
                            1
                            $0.00
                        
                    
                        
                            27
                            10052
                            Calc EC Wind Mitigation Amount
                            Multiply
                              TempWindMitEC=1, .05=0.05
                            0.05
                            $0.00
                        
                    
                        
                            28
                            10053
                            Calc EC Wind Mitigation Amount
                            Add
                              TempWindMitEC=0.05, .95=0.95
                            1
                            $0.00
                        
                    
                        
                            29
                            10060
                            Set Protection Class to use for Rating
                            SetVariable
                              ProtectionClass=1
                            1
                            $0.00
                        
                    
                        
                            30
                            10071
                            Calc Coverage B Limit

                            Multiply
                              DwellingLimit=300000, OtherStructuresAmount=2
                            600000
                            $0.00
                        
                    
                        
                            31
                            10072
                            Calc Coverage B Limit

                            Divide
                              TempOtherStructuresLimit=600000, 100=0.01
                            6000
                            $0.00
                        
                    
                        
                            32
                            10073
                            Other Structures Limit
                            AssignField
                              TempOtherStructuresLimit=6000
                            6000
                            $0.00
                        
                    
                        
                            33
                            10074
                            Calc Coverage D/E Limit
                            Multiply
                              DwellingLimit=300000, .2=0.2
                            60000
                            $0.00
                        
                    
                        
                            34
                            10075
                            Set Coverage D/E Limit
                            SetVariable
                              TempFairRentalLimit=60000
                            60000
                            $0.00
                        
                    
                        
                            35
                            10080
                            Lookup AOP Deductible Factor 
                            LookupRate
                              Deductible=5000
                            0.86
                            $0.00
                        
                    
                        
                            36
                            10090
                            Lookup Hurricane Deductible Factor 
                            LookupRate
                              WindHailDeductible=5
                            0.94
                            $0.00
                        
                    
                        
                            37
                            10100
                            Lookup PC/Construction Factor 
                            LookupRate
                              RateProtectionClass=1, ConstructionType=V
                            1
                            $0.00
                        
                    
                        
                            38
                            10110
                            Save PC/Construction Factor for OrdLaw, ACV Loss Settlement &amp; PPRC
                            SetVariable
                              ProtectionConstFactor=1
                            1
                            $0.00
                        
                    
                        
                            39
                            10120
                            Lookup Fire Alarm Factor 
                            LookupRate
                              FireAlarmCredit=CENTRAL
                            0.92
                            $0.00
                        
                    
                        
                            40
                            10130
                            Lookup Sprinkler Factor 
                            LookupRate
                              Sprinkler=PARTIAL
                            0.93
                            $0.00
                        
                    
                        
                            41
                            10140
                            Lookup Secured Community Factor
                            LookupRate
                              SecuredBuildingCredit=SINGLEENTRY
                            0.94
                            $0.00
                        
                    
                        
                            42
                            10170
                            Lookup Year of Construction Factor
                            StepRate
                              ConstructionYear=2015
                            1
                            $0.00
                        
                    
                        
                            43
                            10180
                            Lookup Cov B Factor
                            LookupRate
                              OtherStructuresAmount=2
                            1
                            $0.00
                        
                    
                        
                            44
                            10211
                            Set WH Excl Factor to 1, if not excluded, for PPRC
                            SetVariable
                              1
                            1
                            $0.00
                        
                    
                        
                            45
                            10250
                            Calc Cov A Amount of insurance factor (&lt;= 1,000,000)
                            StepInterpolate
                             {Interpolate between 300000 (2.679)  and 310000 (2.768)}  DwellingLimit=300000
                            2.679
                            $0.00
                        
                    
                        
                            46
                            10310
                            Save Cov A Amount of Insurance Factor for ACV Loss Settle &amp; ACV Roof
                            SetVariable
                              AmountOfInsuranceFactor=2.679
                            2.679
                            $0.00
                        
                    
                        
                            47
                            10320
                            Calc Cov C Amount of insurance factor (&lt;= 1,000,000)
                            StepInterpolate
                             {Interpolate between 25000 (0.5)  and 30000 (0.6)}  ContentsLimit=25000
                            0.5
                            $0.00
                        
                    
                        
                            48
                            10380
                            Save Cov C Amount of Insurance Factor for PPRC
                            SetVariable
                              CovCAmountOfInsFactor=0.5
                            0.5
                            $0.00
                        
                    
                        
                            49
                            10390
                            Call Rating Subroutine - Fire Dwelling
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovAFire&quot; , &quot;'&quot; , &quot;=CovAFire
                            0
                            $0.00
                        
                    
                        
                            50
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $0.00
                        
                    
                        
                            51
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $0.00
                        
                    
                        
                            52
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $0.00
                        
                    
                        
                            53
                            30070
                            Lookup Fire Base Rate 
                            LookupRate
                              PerilCode=CovAFire
                            106
                            $0.00
                        
                    
                        
                            54
                            30071
                            Save Fire Cov A Base Rate 
                            SetVariable
                              BaseRate=106
                            106
                            $0.00
                        
                    
                        
                            55
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=106, AmountOfInsuranceFactor=2.679
                            283.974
                            $0.00
                        
                    
                        
                            56
                            30100
                            Apply PC/Construction Factor to Prem
                            Multiply
                              ProtectionConstFactor=1, Prem=283.974
                            284
                            $0.00
                        
                    
                        
                            57
                            30120
                            Apply AOP Deductible Factor to Prem
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=284
                            244.24
                            $0.00
                        
                    
                        
                            58
                            30250
                            Apply Fire Alarm Factor to Prem
                            Multiply
                              ProtectionFireFactor=0.92, Prem=244.24
                            224.7008
                            $0.00
                        
                    
                        
                            59
                            30260
                            Apply Sprinkler Factor to Prem
                            Multiply
                              SprinklerFactor=0.93, Prem=224.7008
                            208.971744
                            $0.00
                        
                    
                        
                            60
                            30290
                            Lookup Row/Townhouse Factor
                            LookupRate
                              FamilyUnitsRow=1, PerilCode=CovAFire
                            1
                            $0.00
                        
                    
                        
                            61
                            30300
                            Apply Row/Townhouse Factor to Prem
                            Multiply
                              RowTownhouseFactor=1, Prem=208.971744
                            208.971744
                            $0.00
                        
                    
                        
                            62
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $0.00
                        
                    
                        
                            63
                            30310
                            Apply Age of Risk Factor to Prem
                            Multiply
                              AgeofRiskFactor=0.73, Prem=208.971744
                            152.54937312
                            $0.00
                        
                    
                        
                            64
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $0.00
                        
                    
                        
                            65
                            30320
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovAFire, Occupancy=TENANT
                            1
                            $0.00
                        
                    
                        
                            66
                            30330
                            Apply Owner Occupancy Credit Factor to Prem
                            Multiply
                              OwnerOccupancyFactor=1, Prem=152.54937312
                            152.54937312
                            $0.00
                        
                    
                        
                            67
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=152.54937312
                            152.54937312
                            $0.00
                        
                    
                        
                            68
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=152.54937312, 1
                            153
                            $0.00
                        
                    
                        
                            69
                            30500
                            Return from Subroutine
                            EndSub
                             
                            153
                            $0.00
                        
                    
                        
                            70
                            10400
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=153, 1
                            153
                            $0.00
                        
                    
                        
                            71
                            10410
                            Fire Dwelling Premium
                            AddToBase
                              Prem_Total=153
                            153
                            $153.00
                        
                    
                        
                            72
                            10420
                            Call Rating Subroutine - Fire Contents
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovCFire&quot; , &quot;'&quot; , &quot;=CovCFire
                            0
                            $153.00
                        
                    
                        
                            73
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $153.00
                        
                    
                        
                            74
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $153.00
                        
                    
                        
                            75
                            30570
                            Lookup Fire Contents Base Rate 
                            LookupRate
                              PerilCode=CovCFire
                            45
                            $153.00
                        
                    
                        
                            76
                            30571
                            Save Fire Contents Base Rate for RC
                            SetVariable
                              BaseRate=45
                            45
                            $153.00
                        
                    
                        
                            77
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=45, CovCAmountOfInsFactor=0.5
                            22.5
                            $153.00
                        
                    
                        
                            78
                            30600
                            Apply PC/Construction Factor to Prem for CovC
                            Multiply
                              ProtectionConstFactor=1, Prem=22.5
                            23
                            $153.00
                        
                    
                        
                            79
                            30620
                            Apply AOP Deductible Factor to Prem for CovC
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=23
                            19.78
                            $153.00
                        
                    
                        
                            80
                            30750
                            Apply Fire Alarm Factor to Prem for CovC
                            Multiply
                              ProtectionFireFactor=0.92, Prem=19.78
                            18.1976
                            $153.00
                        
                    
                        
                            81
                            30760
                            Apply Sprinkler Factor to Prem for CovC
                            Multiply
                              SprinklerFactor=0.93, Prem=18.1976
                            16.923768
                            $153.00
                        
                    
                        
                            82
                            30790
                            Lookup Row/Townhouse Factor for Cov C
                            LookupRate
                              FamilyUnitsRow=1, PerilCode=CovCFire
                            1
                            $153.00
                        
                    
                        
                            83
                            30800
                            Apply Row/Townhouse Factor to Prem for CovC
                            Multiply
                              RowTownhouseFactor=1, Prem=16.923768
                            16.923768
                            $153.00
                        
                    
                        
                            84
                            30809
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $153.00
                        
                    
                        
                            85
                            30810
                            Apply Age of Dwelling Factor to Prem for CovC
                            Multiply
                              AgeofRiskFactor=0.73, Prem=16.923768
                            12.35435064
                            $153.00
                        
                    
                        
                            86
                            30820
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovCFire, Occupancy=TENANT
                            1
                            $153.00
                        
                    
                        
                            87
                            30830
                            Apply Owner Occupancy Credit Factor to Prem for CovC
                            Multiply
                              OwnerOccupancyFactor=1, Prem=12.35435064
                            12.35435064
                            $153.00
                        
                    
                        
                            88
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=12.35435064, 1
                            12
                            $153.00
                        
                    
                        
                            89
                            30950
                            Return from Subroutine
                            EndSub
                             
                            12
                            $153.00
                        
                    
                        
                            90
                            10430
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=12, 1
                            12
                            $153.00
                        
                    
                        
                            91
                            10440
                            Fire Contents Premium
                            AddToBase
                              Prem_Total=12
                            12
                            $165.00
                        
                    
                        
                            92
                            10450
                            Call Rating Subroutine - EC Dwelling
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovAEC&quot; , &quot;'&quot; , &quot;=CovAEC
                            0
                            $165.00
                        
                    
                        
                            93
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $165.00
                        
                    
                        
                            94
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $165.00
                        
                    
                        
                            95
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $165.00
                        
                    
                        
                            96
                            30080
                            Lookup EC / Hurr Dwelling Base Rate 
                            LookupRate
                              PerilCode=CovAEC, TerritoryCode=39
                            253
                            $165.00
                        
                    
                        
                            97
                            30081
                            Save EC Cov A Base Rate 
                            SetVariable
                              BaseRate=253
                            253
                            $165.00
                        
                    
                        
                            98
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=253, AmountOfInsuranceFactor=2.679
                            677.787
                            $165.00
                        
                    
                        
                            99
                            30091
                            Round EC Prem 
                            Multiply
                              Prem=677.787, 1
                            678
                            $165.00
                        
                    
                        
                            100
                            30120
                            Apply AOP Deductible Factor to Prem
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=678
                            583.08
                            $165.00
                        
                    
                        
                            101
                            30270
                            Apply Secured Community Factor to Prem
                            Multiply
                              SecuredCommunityFactor=0.94, Prem=583.08
                            548.0952
                            $165.00
                        
                    
                        
                            102
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $165.00
                        
                    
                        
                            103
                            30310
                            Apply Age of Risk Factor to Prem
                            Multiply
                              AgeofRiskFactor=0.73, Prem=548.0952
                            400.109496
                            $165.00
                        
                    
                        
                            104
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $165.00
                        
                    
                        
                            105
                            30320
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovAEC, Occupancy=TENANT
                            1
                            $165.00
                        
                    
                        
                            106
                            30330
                            Apply Owner Occupancy Credit Factor to Prem
                            Multiply
                              OwnerOccupancyFactor=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            107
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            108
                            30370
                            Calc EC Wind Mit Credit for Cov A
                            Multiply
                              Prem=400.109496, WindMitFactor=0
                            0
                            $165.00
                        
                    
                        
                            109
                            30380
                            Apply EC Wind Mitigation Factor to Prem
                            Multiply
                              ECWindMitAmount=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            110
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=400.109496, 1
                            400
                            $165.00
                        
                    
                        
                            111
                            30500
                            Return from Subroutine
                            EndSub
                             
                            400
                            $165.00
                        
                    
                        
                            112
                            10460
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=400, 1
                            400
                            $165.00
                        
                    
                        
                            113
                            10470
                            EC Dwelling Premium
                            AddToBase
                              Prem_Total=400
                            400
                            $565.00
                        
                    
                        
                            114
                            10480
                            Call Rating Subroutine - EC Contents
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovCEC&quot; , &quot;'&quot; , &quot;=CovCEC
                            0
                            $565.00
                        
                    
                        
                            115
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $565.00
                        
                    
                        
                            116
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $565.00
                        
                    
                        
                            117
                            30580
                            Lookup EC/ Hurr Contents Base Rate 
                            LookupRate
                              PerilCode=CovCEC, TerritoryCode=39
                            127
                            $565.00
                        
                    
                        
                            118
                            30581
                            Save EC Contents Base Rate for RC
                            SetVariable
                              BaseRate=127
                            127
                            $565.00
                        
                    
                        
                            119
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=127, CovCAmountOfInsFactor=0.5
                            63.5
                            $565.00
                        
                    
                        
                            120
                            30591
                            Round EC Prem
                            Multiply
                              Prem=63.5, 1
                            64
                            $565.00
                        
                    
                        
                            121
                            30620
                            Apply AOP Deductible Factor to Prem for CovC
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=64
                            55.04
                            $565.00
                        
                    
                        
                            122
                            30770
                            Apply Secured Community Factor to Prem for CovC
                            Multiply
                              SecuredCommunityFactor=0.94, Prem=55.04
                            51.7376
                            $565.00
                        
                    
                        
                            123
                            30809
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $565.00
                        
                    
                        
                            124
                            30810
                            Apply Age of Dwelling Factor to Prem for CovC
                            Multiply
                              AgeofRiskFactor=0.73, Prem=51.7376
                            37.768448
                            $565.00
                        
                    
                        
                            125
                            30820
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovCEC, Occupancy=TENANT
                            1
                            $565.00
                        
                    
                        
                            126
                            30830
                            Apply Owner Occupancy Credit Factor to Prem for CovC
                            Multiply
                              OwnerOccupancyFactor=1, Prem=37.768448
                            37.768448
                            $565.00
                        
                    
                        
                            127
                            30831
                            Calc EC Wind Mit Credit for Cov C
                            Multiply
                              Prem=37.768448, WindMitFactor=0
                            0
                            $565.00
                        
                    
                        
                            128
                            30839
                            Apply EC Wind Mitigation Factor to Prem for CovC
                            Multiply
                              ECWindMitAmount=1, Prem=37.768448
                            37.768448
                            $565.00
                        
                    
                        
                            129
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=37.768448, 1
                            38
                            $565.00
                        
                    
                        
                            130
                            30950
                            Return from Subroutine
                            EndSub
                             
                            38
                            $565.00
                        
                    
                        
                            131
                            10490
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=38, 1
                            38
                            $565.00
                        
                    
                        
                            132
                            10500
                            EC Contents Premium
                            AddToBase
                              Prem_Total=38
                            38
                            $603.00
                        
                    
                        
                            133
                            10510
                            Lookup Construction Factor 
                            LookupRate
                              ConstructionType=V
                            1
                            $603.00
                        
                    
                        
                            134
                            10520
                            Save Construction Factor for OrdLaw, ACV Loss Settle, Screened Encl &amp; PPRC
                            SetVariable
                              ConstructionFactor=1
                            1
                            $603.00
                        
                    
                        
                            135
                            10630
                            Call Rating Subroutine - Hurr Dwelling
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovAHurr&quot; , &quot;'&quot; , &quot;=CovAHurr
                            0
                            $603.00
                        
                    
                        
                            136
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $603.00
                        
                    
                        
                            137
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $603.00
                        
                    
                        
                            138
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $603.00
                        
                    
                        
                            139
                            30080
                            Lookup EC / Hurr Dwelling Base Rate 
                            LookupRate
                              PerilCode=CovAHurr, TerritoryCode=39
                            456
                            $603.00
                        
                    
                        
                            140
                            30082
                            Save Hurr Cov A Base Rate 
                            SetVariable
                              BaseRate=456
                            456
                            $603.00
                        
                    
                        
                            141
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=456, AmountOfInsuranceFactor=2.679
                            1221.624
                            $603.00
                        
                    
                        
                            142
                            30110
                            Apply Construction Factor to Prem
                            Multiply
                              ConstructionFactor=1, Prem=1221.624
                            1222
                            $603.00
                        
                    
                        
                            143
                            30130
                            Apply Hurricane Deductible Factor to Prem
                            Multiply
                              HurrDeductibleFactor=0.94, Prem=1222
                            1148.68
                            $603.00
                        
                    
                        
                            144
                            30160
                            Lookup BCEG Factor for Cov A
                            LookupRate
                              BCEGS=04, PerilCode=CovAHurr
                            0
                            $603.00
                        
                    
                        
                            145
                            30170
                            Calc BCEG Amount
                            Subtract
                              1, BCEGFactor=0
                            1
                            $603.00
                        
                    
                        
                            146
                            30180
                            BCEG + Wind Mit - uncapped amount
                            Add
                              BCEGAmount=1, WindMitFactor=0
                            1
                            $603.00
                        
                    
                        
                            147
                            30190
                            Set Capped BCEG + Wind Mit Discount Factor
                            SetVariable
                              0.9
                            0.9
                            $603.00
                        
                    
                        
                            148
                            30210
                            Calc Adjustment for BCEG Factor due to cap
                            Subtract
                              UncapBCEGWindMit=1, .9=0.9
                            0.1
                            $603.00
                        
                    
                        
                            149
                            30220
                            Calc Capped BCEG Factor
                            Add
                              BCEGCapAdjust=0.1, BCEGFactor=0
                            0.1
                            $603.00
                        
                    
                        
                            150
                            30230
                            Apply Capped BCEG Factor to Prem
                            Multiply
                              Prem=1148.68, CappedBCEGFactor=0.1
                            114.868
                            $603.00
                        
                    
                        
                            151
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $603.00
                        
                    
                        
                            152
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $603.00
                        
                    
                        
                            153
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            154
                            30371
                            Calc Hurr Wind Mit Credit for Cov A
                            Multiply
                              Prem=114.868, WindMitFactor=0
                            0
                            $603.00
                        
                    
                        
                            155
                            30390
                            Apply Wind Mitigation Factor to Prem
                            Multiply
                              WindMitAmount=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            156
                            30400
                            Apply Year of Construction Factor to Prem
                            Multiply
                              YearBuiltFactor=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            157
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=114.868, 1
                            115
                            $603.00
                        
                    
                        
                            158
                            30500
                            Return from Subroutine
                            EndSub
                             
                            115
                            $603.00
                        
                    
                        
                            159
                            10640
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=115, 1
                            115
                            $603.00
                        
                    
                        
                            160
                            10650
                            Hurr Dwelling Premium
                            AddToBase
                              Prem_Total=115
                            115
                            $718.00
                        
                    
                        
                            161
                            10660
                            Call Rating Subroutine - Hurr Contents
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovCHurr&quot; , &quot;'&quot; , &quot;=CovCHurr
                            0
                            $718.00
                        
                    
                        
                            162
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $718.00
                        
                    
                        
                            163
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $718.00
                        
                    
                        
                            164
                            30580
                            Lookup EC/ Hurr Contents Base Rate 
                            LookupRate
                              PerilCode=CovCHurr, TerritoryCode=39
                            237
                            $718.00
                        
                    
                        
                            165
                            30582
                            Save Hurr Contents Base Rate for RC
                            SetVariable
                              BaseRate=237
                            237
                            $718.00
                        
                    
                        
                            166
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=237, CovCAmountOfInsFactor=0.5
                            118.5
                            $718.00
                        
                    
                        
                            167
                            30610
                            Apply Construction Factor to Prem for CovC
                            Multiply
                              ConstructionFactor=1, Prem=118.5
                            119
                            $718.00
                        
                    
                        
                            168
                            30630
                            Apply Hurricane Deductible Factor to Prem for CovC
                            Multiply
                              HurrDeductibleFactor=0.94, Prem=119
                            111.86
                            $718.00
                        
                    
                        
                            169
                            30651
                            Lookup BCEG Factor for Cov C
                            LookupRate
                              BCEGS=04, PerilCode=CovCHurr
                            0
                            $718.00
                        
                    
                        
                            170
                            30670
                            Calc BCEG Amount
                            Subtract
                              1, BCEGFactor=0
                            1
                            $718.00
                        
                    
                        
                            171
                            30680
                            BCEG + Wind Mit - uncapped amount
                            Add
                              BCEGAmount=1, WindMitFactor=0
                            1
                            $718.00
                        
                    
                        
                            172
                            30690
                            Set Capped BCEG + Wind Mit Discount Factor
                            SetVariable
                              0.9
                            0.9
                            $718.00
                        
                    
                        
                            173
                            30710
                            Calc Adjustment for BCEG Factor due to cap
                            Subtract
                              UncapBCEGWindMit=1, .9=0.9
                            0.1
                            $718.00
                        
                    
                        
                            174
                            30720
                            Calc Capped BCEG Factor
                            Add
                              BCEGCapAdjust=0.1, BCEGFactor=0
                            0.1
                            $718.00
                        
                    
                        
                            175
                            30730
                            Apply Capped BCEG Factor to Prem
                            Multiply
                              Prem=111.86, CappedBCEGFactor=0.1
                            11.186
                            $718.00
                        
                    
                        
                            176
                            30833
                            Calc Hurr Wind Mit Credit for Cov C
                            Multiply
                              Prem=11.186, WindMitFactor=0
                            0
                            $718.00
                        
                    
                        
                            177
                            30840
                            Apply Wind Mitigation Factor to Prem for CovC
                            Multiply
                              WindMitAmount=1, Prem=11.186
                            11.186
                            $718.00
                        
                    
                        
                            178
                            30850
                            Apply Year of Construction Factor to Prem for CovC
                            Multiply
                              YearBuiltFactor=1, Prem=11.186
                            11.186
                            $718.00
                        
                    
                        
                            179
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=11.186, 1
                            11
                            $718.00
                        
                    
                        
                            180
                            30950
                            Return from Subroutine
                            EndSub
                             
                            11
                            $718.00
                        
                    
                        
                            181
                            10670
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=11, 1
                            11
                            $718.00
                        
                    
                        
                            182
                            10680
                            Hurr Contents Premium
                            AddToBase
                              Prem_Total=11
                            11
                            $729.00
                        
                    
                        
                            183
                            10690
                            Set Replacement Cost Factor  
                            SetVariable
                              .15=0.15
                            0.15
                            $729.00
                        
                    
                        
                            184
                            10700
                            Calc Replacement Cost C Fire Premium
                            Multiply
                              FireCovCBaseRate=45, CovCKeyFactor=0.5, PCConstFactor=1, AgeofRiskFct=0.73, ReplaceCostCFactor=0.15
                            2
                            $729.00
                        
                    
                        
                            185
                            10710
                            Calc Replacement Cost C EC Premium
                            Multiply
                              ECCovCBaseRate=127, CovCKeyFactor=0.5, AgeofRiskFct=0.73, WindstormHailExclFactor=1, ReplaceCostCFactor=0.15
                            7
                            $729.00
                        
                    
                        
                            186
                            10730
                            Sum Replacement Cost C Premium 
                            Add
                              ReplaceCostCFire=2, ReplaceCostCEC=7, ReplaceCostCHurr
                            9
                            $729.00
                        
                    
                        
                            187
                            10740
                            Add Replacement Cost C Premium
                            AddToBase
                              ReplacementCostPrem=9
                            9
                            $738.00
                        
                    
                        
                            188
                            10900
                            Lookup Burglar Alarm Factor
                            LookupRate
                              BurglarAlarmCredit=CENTRAL
                            0.7
                            $738.00
                        
                    
                        
                            189
                            10910
                            Lookup Theft Prem
                            LookupRate
                              TheftCoverage, CountyCode=12031
                            0
                            $738.00
                        
                    
                        
                            190
                            10920
                            Determine Theft Limit (per 1000 of Cov C)
                            Divide
                              ContentsLimit=25000, 1000=0.001
                            25
                            $738.00
                        
                    
                        
                            191
                            10930
                            Multiply Theft Limit by Theft Prem
                            Multiply
                              TheftLimit=25, PremTheft=0
                            0
                            $738.00
                        
                    
                        
                            192
                            10940
                            Add $20 Flat Rate to Theft Prem
                            Add
                              PremTheft=0, 20
                            20
                            $738.00
                        
                    
                        
                            193
                            10950
                            Multiply by Burglar Alarm Factor
                            Multiply
                              BurglarAlarmFactor=0.7, PremTheft=20
                            14
                            $738.00
                        
                    
                        
                            194
                            10960
                            Add Theft Premium to Base
                            AddToBase
                              PremTheft=14
                            14
                            $752.00
                        
                    
                        
                            195
                            11080
                            Add Cov L/M - Pers Liab / Med Pay - Base Limit
                            AddFlatDollar
                              NumberFamilies=2
                            80
                            $832.00
                        
                    
                        
                            196
                            11200
                            Initialize Minimum Premium
                            SetVariable
                              0
                            0
                            $832.00
                        
                    
                        
                            197
                            11210
                            Lookup Minimum Premium
                            LookupRate
                              StateCode=9
                            300
                            $832.00
                        
                    
                        
                            198
                            11240
                            Initialize temp field to indicate minimum premium adj exists
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;N&quot; , &quot;'&quot; , &quot;
                            N
                            $832.00
                        
                    
                        
                            199
                            11260
                            Set field to indicate minimum premium adj exists
                            AssignField
                              TempMinPremAdj=N
                            0
                            $832.00
                        
                    
                        
                            200
                            11280
                            Apply Minimum Premium
                            SetVariable
                              MinPremium=300
                            300
                            $832.00
                        
                    
                        
                            201
                            11300
                            Lookup Wind Mitigation Max Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            89
                            $832.00
                        
                    
                        
                            202
                            11309
                            Calculate Fire Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellFire=153, Prem_CntsFire=12, ReplaceCostCFire=2, OrdinanceLawFire, ACVLossSettlementFire
                            167
                            $832.00
                        
                    
                        
                            203
                            11310
                            Calculate EC Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellEC=400, Prem_CntsEC=38, ReplaceCostCEC=7, ACVLossSettlementEC, Prem_ACVWHLoss
                            445
                            $832.00
                        
                    
                        
                            204
                            11320
                            Calculate Hurricane Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellHurr=115, Prem_CntsHurr=11, ReplaceCostCHurr, ACVLossSettlementHurr, Prem_ScreenEncl
                            126
                            $832.00
                        
                    
                        
                            205
                            11330
                            Lookup Wind Mitigation FBC Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            0.68
                            $832.00
                        
                    
                        
                            206
                            11340
                            Calculate Wind Mitigation FBC Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMFBCDisc=0.68
                            86
                            $832.00
                        
                    
                        
                            207
                            11350
                            Lookup Wind Mitigation Reinforced Concrete Discount for form OIR B1 1655
                            LookupRate
                             
                            0.82
                            $832.00
                        
                    
                        
                            208
                            11360
                            Calculate Wind Mitigation Reinforced Concrete Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMReinforcedDisc=0.82
                            103
                            $832.00
                        
                    
                        
                            209
                            11370
                            Lookup Wind Mitigation Hip Roof Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            0.1
                            $832.00
                        
                    
                        
                            210
                            11380
                            Calculate Wind Mitigation Hip Roof Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofShapeHipDisc=0.1
                            13
                            $832.00
                        
                    
                        
                            211
                            11430
                            Lookup Wind Mitigation Roof Attach B Discount for form OIR B1 1655
                            LookupRate
                             
                            0.09
                            $832.00
                        
                    
                        
                            212
                            11440
                            Calculate Wind Mitigation Roof Attach B Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofAttachBDisc=0.09
                            11
                            $832.00
                        
                    
                        
                            213
                            11450
                            Lookup Wind Mitigation Roof Attach C Discount for form OIR B1 1655
                            LookupRate
                             
                            0.09
                            $832.00
                        
                    
                        
                            214
                            11460
                            Calculate Wind Mitigation Roof Attach C Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofAttachCDisc=0.09
                            11
                            $832.00
                        
                    
                        
                            215
                            11470
                            Lookup Wind Mitigation Roof To Wall Clips Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            216
                            11480
                            Calculate Wind Mitigation Roof To Wall Clips Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallClipsDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            217
                            11490
                            Lookup Wind Mitigation Roof To Wall Single Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            218
                            11500
                            Calculate Wind Mitigation Roof To Wall Single Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallSingleDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            219
                            11510
                            Lookup Wind Mitigation Roof To Wall Double Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            220
                            11520
                            Calculate Wind Mitigation Roof To Wall Double Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallDoubleDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            221
                            11530
                            Lookup Wind Mitigation SWR Discount for form OIR B1 1655
                            LookupRate
                             
                            0.06
                            $832.00
                        
                    
                        
                            222
                            11540
                            Calculate Wind Mitigation SWR Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMSWRDisc=0.06
                            8
                            $832.00
                        
                    
                
            
        
								
							
								
									
            
                
                    
                        Validation Num
                        Validation Pass
                        Validation Mode
                        Validation Action
                        Failed Validations
                        PageIdentifier
                    
                
                
                    
                        
                            14
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,1400,3000,3100,3300
                        
                    
                        
                            13
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,600,700,800,900,1010,1100
                        
                    
                        
                            12
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,500
                        
                    
                        
                            11
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            50,100,200,205,210,215,300
                        
                    
                        
                            10
                            N
                            PageChange
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:2,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS UserType, ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationModeCode,     ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationActionCode, ISNULL(V.ValidationMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;internal&quot; , &quot;'&quot; , &quot;)    AND (ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;PageChange&quot; , &quot;'&quot; , &quot;)    AND V.UWQuoteCode IN (&quot; , &quot;'&quot; , &quot;X&quot; , &quot;'&quot; , &quot;, ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            50,100,200,205,210,215,300
                        
                    
                        
                            9
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            50,75,76,77,79,2450,2900
                        
                    
                        
                            8
                            Y
                            PostRating
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            
                        
                    
                        
                            7
                            N
                            PostRating
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:6,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS UserType, ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationModeCode,     ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationActionCode, ISNULL(V.ValidationMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;internal&quot; , &quot;'&quot; , &quot;)    AND (ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;PostRating&quot; , &quot;'&quot; , &quot;)    AND V.UWQuoteCode IN (&quot; , &quot;'&quot; , &quot;X&quot; , &quot;'&quot; , &quot;, ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            
                        
                    
                        
                            6
                            Y
                            PreRating
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            
                        
                    
                        
                            5
                            N
                            PreRating
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:1,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS UserType, ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationModeCode,     ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationActionCode, ISNULL(V.ValidationMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;internal&quot; , &quot;'&quot; , &quot;)    AND (ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;PreRating&quot; , &quot;'&quot; , &quot;)    AND V.UWQuoteCode IN (&quot; , &quot;'&quot; , &quot;X&quot; , &quot;'&quot; , &quot;, ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            
                        
                    
                
            
            
                function changeRowStyle(id){
                    if(hasClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;)){
                        removeClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;);
                        addClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;);
                    } else if(hasClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;)){
                        removeClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;);
                        addClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;);
                    }
                }
			
        
								
							
								
									


	table.cfdump_wddx,
	table.cfdump_xml,
	table.cfdump_struct,
	table.cfdump_varundefined,
	table.cfdump_array,
	table.cfdump_query,
	table.cfdump_cfc,
	table.cfdump_object,
	table.cfdump_binary,
	table.cfdump_udf,
	table.cfdump_udfbody,
	table.cfdump_udfarguments {
		font-size: xx-small;
		font-family: verdana, arial, helvetica, sans-serif;
	}

	table.cfdump_wddx th,
	table.cfdump_xml th,
	table.cfdump_struct th,
	table.cfdump_varundefined th,
	table.cfdump_array th,
	table.cfdump_query th,
	table.cfdump_cfc th,
	table.cfdump_object th,
	table.cfdump_binary th,
	table.cfdump_udf th,
	table.cfdump_udfbody th,
	table.cfdump_udfarguments th {
		text-align: left;
		color: white;
		padding: 5px;
	}

	table.cfdump_wddx td,
	table.cfdump_xml td,
	table.cfdump_struct td,
	table.cfdump_varundefined  td,
	table.cfdump_array td,
	table.cfdump_query td,
	table.cfdump_cfc td,
	table.cfdump_object td,
	table.cfdump_binary td,
	table.cfdump_udf td,
	table.cfdump_udfbody td,
	table.cfdump_udfarguments td {
		padding: 3px;
		background-color: #ffffff;
		vertical-align : top;
	}

	table.cfdump_wddx {
		background-color: #000000;
	}
	table.cfdump_wddx th.wddx {
		background-color: #444444;
	}


	table.cfdump_xml {
		background-color: #888888;
	}
	table.cfdump_xml th.xml {
		background-color: #aaaaaa;
	}
	table.cfdump_xml td.xml {
		background-color: #dddddd;
	}

	table.cfdump_struct {
		background-color: #0000cc ;
	}
	table.cfdump_struct th.struct {
		background-color: #4444cc ;
	}
	table.cfdump_struct td.struct {
		background-color: #ccddff;
	}

	table.cfdump_varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined th.varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined td.varundefined {
		background-color: #ccddff;
	}

	table.cfdump_array {
		background-color: #006600 ;
	}
	table.cfdump_array th.array {
		background-color: #009900 ;
	}
	table.cfdump_array td.array {
		background-color: #ccffcc ;
	}

	table.cfdump_query {
		background-color: #884488 ;
	}
	table.cfdump_query th.query {
		background-color: #aa66aa ;
	}
	table.cfdump_query td.query {
		background-color: #ffddff ;
	}


	table.cfdump_cfc {
		background-color: #ff0000;
	}
	table.cfdump_cfc th.cfc{
		background-color: #ff4444;
	}
	table.cfdump_cfc td.cfc {
		background-color: #ffcccc;
	}


	table.cfdump_object {
		background-color : #ff0000;
	}
	table.cfdump_object th.object{
		background-color: #ff4444;
	}

	table.cfdump_binary {
		background-color : #eebb00;
	}
	table.cfdump_binary th.binary {
		background-color: #ffcc44;
	}
	table.cfdump_binary td {
		font-size: x-small;
	}
	table.cfdump_udf {
		background-color: #aa4400;
	}
	table.cfdump_udf th.udf {
		background-color: #cc6600;
	}
	table.cfdump_udfarguments {
		background-color: #dddddd;
	}
	table.cfdump_udfarguments th {
		background-color: #eeeeee;
		color: #000000;
	}

 


// for queries we have more than one td element to collapse/expand
	var expand = &quot;open&quot;;

	dump = function( obj ) {
		var out = &quot;&quot; ;
		if ( typeof obj == &quot;object&quot; ) {
			for ( key in obj ) {
				if ( typeof obj[key] != &quot;function&quot; ) out += key + &quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot; + obj[key] + &quot; , &quot;'&quot; , &quot;&lt;br>&quot; , &quot;'&quot; , &quot; ;
			}
		}
	}


	cfdump_toggleRow = function(source) {
		//target is the right cell
		if(document.all) target = source.parentElement.cells[1];
		else {
			var element = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>0;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					element = source.parentNode.childNodes[i];
					break;
				}
			}
			if(element == null)
				target = source.parentNode.lastChild;
			else
				target = element;
		}
		//target = source.parentNode.lastChild ;
		cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
	}

	cfdump_toggleXmlDoc = function(source) {

		var caption = source.innerHTML.split( &quot; , &quot;'&quot; , &quot; [&quot; , &quot;'&quot; , &quot; ) ;

		// toggle source (header)
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ) {
			// closed -> short
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [short version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to maximize&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else if ( source.innerHTML.indexOf(&quot; , &quot;'&quot; , &quot;[short version]&quot; , &quot;'&quot; , &quot;) != -1 ) {
			// short -> full
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [long version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		} else {
			// full -> closed
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}

		// Toggle the target (everething below the header row).
		// First two rows are XMLComment and XMLRoot - they are part
		// of the long dump, the rest are direct children - part of the
		// short dump
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				if ( i &lt; 3 ) cfdump_toggleTarget( target, switchLongToState ) ;
				else cfdump_toggleTarget( target, switchShortToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			var row = 1;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if( target.style ) {
					if ( row &lt; 3 ) {
						cfdump_toggleTarget( target, switchLongToState ) ;
					} else {
						cfdump_toggleTarget( target, switchShortToState ) ;
					}
					row++;
				}
			}
		}
	}

	cfdump_toggleTable = function(source) {

		var switchToState = cfdump_toggleSource( source ) ;
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				cfdump_toggleTarget( target, switchToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if(target.style) {
					cfdump_toggleTarget( target, switchToState ) ;
				}
			}
		}
	}

	cfdump_toggleSource = function( source ) {
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; || source.style.fontStyle == null) {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}
	}

	cfdump_toggleTarget = function( target, switchToState ) {
		if ( switchToState == &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; )	target.style.display = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; ;
		else target.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot; ;
	}

	// collapse all td elements for queries
	cfdump_toggleRow_qry = function(source) {
		expand = (source.title == &quot;click to collapse&quot;) ? &quot;closed&quot; : &quot;open&quot;;
		if(document.all) {
			var nbrChildren = source.parentElement.cells.length;
			if(nbrChildren > 1){
				for(i=nbrChildren-1;i>0;i--){
					target = source.parentElement.cells[i];
					cfdump_toggleTarget( target,expand ) ;
					cfdump_toggleSource_qry(source);
				}
			}
			else {
				//target is the right cell
				target = source.parentElement.cells[1];
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
		else{
			var target = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>1;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					target = source.parentNode.childNodes[i];
					cfdump_toggleTarget( target,expand );
					cfdump_toggleSource_qry(source);
				}
			}
			if(target == null){
				//target is the last cell
				target = source.parentNode.lastChild;
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
	}

	cfdump_toggleSource_qry = function(source) {
		if(expand == &quot;closed&quot;){
			source.title = &quot;click to expand&quot;;
			source.style.fontStyle = &quot;italic&quot;;
		}
		else{
			source.title = &quot;click to collapse&quot;;
			source.style.fontStyle = &quot;normal&quot;;
		}
	}

 
			
			struct 
					
					003000
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003001
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003002
					
					false 
					
					
					
					
					003002-ORDER
					
					1 
					
					
					
					
					003002-Parameter1
					
					04/09/2023 
					
					
					
					
					003002_result
					
					2023 
					
					
					
					
					003008
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003009
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003011
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003012
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003013
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003014
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003015
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003016
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003017
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003018
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003019
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003020
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003023
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003024
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003025
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003026
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003039
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003040
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003042
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003047
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003048
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003049
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003050
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003051
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003052
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003053
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003054
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003055
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003056
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003057
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003058
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003060
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003062
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003063
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003064
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003065
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003066
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003067
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003068
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003069
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003073_1
					
					NO 
					
					
					
					
					003073_1-ORDER
					
					7 
					
					
					
					
					003073_1-Parameter1
					
					ExteriorWallCover_1 (CONCRETEBLOCK) 
					
					
					
					
					003073_1-Parameter2-d
					
					ASBESTOS 
					
					
					
					
					003074_1
					
					NO 
					
					
					
					
					003074_1-ORDER
					
					8 
					
					
					
					
					003074_1-Parameter1
					
					RoofConstructionYear_1 (2015) 
					
					
					
					
					003074_1-Parameter2-c
					
					ConstructionYear_1 (2015) 
					
					
					
					
					003075
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003076_1
					
					false 
					
					
					
					
					003076_1-ORDER
					
					2 
					
					
					
					
					003076_1-Parameter1
					
					2023 
					
					
					
					
					003076_1-Parameter2
					
					2015 
					
					
					
					
					003076_1_result
					
					8 
					
					
					
					
					003081
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003082
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003083
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003084
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003085
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003087
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003088
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003089
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003090
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003091
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003092
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003099
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003100
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003127
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003128
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003129
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003130
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003132
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003135
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003139
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003145
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003146
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003147
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003149
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003150
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003152
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003153
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003154
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003155
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003156
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003166
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003168
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003202
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003203
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003204
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003205
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003208
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003222
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003224
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003229
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003230
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003231
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003232
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003233
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003234
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003235
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003236
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003237
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003238
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003239
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003240
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003241
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003242
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003243
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003244
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003245
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003246
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003247
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003248
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003249
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003250
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003251
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003252
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003253
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003254
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003255
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003256
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003257
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003258
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003259
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003260
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003261
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003262
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003263
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003264
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003265
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003266
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003267
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003268
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003269
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003270
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003271
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003272
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003273
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003274
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003275
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003276
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003277
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003278
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003279
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003280
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003281
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003282
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003283
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003284
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003285
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003286
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003287
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003288
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003289
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003290
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003291
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003292
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003293
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003294
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003295
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003296
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003297
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003298
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003299
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003300
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003301
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003302
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003303
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003304
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003305
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003306
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003307
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003308
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003309
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003310
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003311
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003312
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004006
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004009
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004015
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004020
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004023
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004024
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004025
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004026
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004027
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004028
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004029
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004030
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004031
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007665
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007666
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007673_1
					
					false 
					
					
					
					
					31007673_1-ORDER
					
					3 
					
					
					
					
					31007673_1-Parameter1
					
					09/03/2018 
					
					
					
					
					31007673_1_result
					
					2018 
					
					
					
					
					31007674_1
					
					NO 
					
					
					
					
					31007674_1-ORDER
					
					6 
					
					
					
					
					31007674_1-Parameter1
					
					PurchaseYear_1 (2018) 
					
					
					
					
					31007674_1-Parameter2-c
					
					ConstructionYear_1 (2015) 
					
					
					
					
					31007677
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007678
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007679
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007684
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007687
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007704
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007705
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007706
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007707
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007708
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007709
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007710
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007711
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007712
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007713
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007714
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007715
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007716
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007726
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007727
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007728
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007729
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007730
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007731
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007733
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007735
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007736
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007737
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007738
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007740
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007741
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007742
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007756
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007757
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007758
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007782
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007783
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007784
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007785
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007805
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007806
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007807
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007884
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007885
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007899
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007911
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007923
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007925
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007928
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007931
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007938
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007939
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007940
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007941
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007945
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007947
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007948
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007949
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007956
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007957
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007958
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007960
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007961
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007981
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007982
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007990
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007991
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007992
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007993
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007994
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007995
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007996
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007997
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007998
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007999
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008000
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008001
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008002
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008003
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008004
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008005
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008030
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008070
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008071
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008072
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008079
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008080
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008091
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008092
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008093
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008094
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008095
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008096
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008097
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008098
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008099
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008100
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008101
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008102
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008103
					
					NO 
					
					
					
					
					31008103-ORDER
					
					4 
					
					
					
					
					31008103-Parameter1
					
					ConstructionYear_1 (2015) 
					
					
					
					
					31008103-Parameter2-c
					
					EffectiveYear (2023) 
					
					
					
					
					31008104
					
					NO 
					
					
					
					
					31008104-ORDER
					
					5 
					
					
					
					
					31008104-Parameter1
					
					RoofConstructionYear_1 (2015) 
					
					
					
					
					31008104-Parameter2-c
					
					EffectiveYear (2023) 
					
					
					
					
					31008105_1
					
					false 
					
					
					
					
					31008105_1-ORDER
					
					17 
					
					
					
					
					31008105_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter01_2
					
					ROLL 
					
					
					
					
					31008105_1-Parameter02_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter02_2
					
					TIN 
					
					
					
					
					31008105_1-Parameter03_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter03_2
					
					TARGRAVEL 
					
					
					
					
					31008105_1-Parameter04_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter04_2
					
					WOOD 
					
					
					
					
					31008105_1-Parameter05_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter05_2
					
					SOLAR 
					
					
					
					
					31008105_1-Result01
					
					3TAB = ROLL = NO 
					
					
					
					
					31008105_1-Result02
					
					3TAB = TIN = NO 
					
					
					
					
					31008105_1-Result03
					
					3TAB = TARGRAVEL = NO 
					
					
					
					
					31008105_1-Result04
					
					3TAB = WOOD = NO 
					
					
					
					
					31008105_1-Result05
					
					3TAB = SOLAR = NO 
					
					
					
					
					31008106
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008108_1
					
					Skipped - ValidationConditions [ValRoofAge,>,29;|_1|31008108] 
					
					
					
					
					31008108_1-CheckConditions-1
					
					ValRoofAge (8) > 29 = NO 
					
					
					
					
					31008108_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008110_1
					
					false 
					
					
					
					
					31008110_1-ORDER
					
					9 
					
					
					
					
					31008110_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008110_1-Parameter01_2
					
					3TAB 
					
					
					
					
					31008110_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					31008110_1-Parameter02_2
					
					TENANT 
					
					
					
					
					31008110_1-Parameter03_1
					
					ValRoofAge_1 (8) 
					
					
					
					
					31008110_1-Parameter03_2
					
					10 
					
					
					
					
					31008110_1-Parameter04_1
					
					ACVWHLosstoRoofFactor_1 () 
					
					
					
					
					31008110_1-Parameter04_2
					
					N 
					
					
					
					
					31008110_1-Result01
					
					3TAB = 3TAB = YES 
					
					
					
					
					31008110_1-Result02
					
					TENANT = TENANT = YES 
					
					
					
					
					31008110_1-Result03
					
					8 > 10 = NO 
					
					
					
					
					31008110_1-Result04
					
					= N = NO 
					
					
					
					
					31008112
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008113
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008114
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008117
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008118
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008119
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008120
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008121
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008122
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008126
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008126_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204010;OldSystemFlag,&lt;>,Y;AND|_1|31008126] 
					
					
					
					
					31008126_1-CheckConditions-1
					
					CapacityRuleCode () = CR204010 = NO 
					
					
					
					
					31008126_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008127
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204001;OldSystemFlag,&lt;>,Y;AND||31008127] 
					
					
					
					
					31008127-CheckConditions-1
					
					CapacityRuleCode () = CR204001 = NO 
					
					
					
					
					31008127-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008128
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204002;OldSystemFlag,&lt;>,Y;AND||31008128] 
					
					
					
					
					31008128-CheckConditions-1
					
					CapacityRuleCode () = CR204002 = NO 
					
					
					
					
					31008128-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008129
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204003;OldSystemFlag,&lt;>,Y;AND||31008129] 
					
					
					
					
					31008129-CheckConditions-1
					
					CapacityRuleCode () = CR204003 = NO 
					
					
					
					
					31008129-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008130
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204004;OldSystemFlag,&lt;>,Y;AND||31008130] 
					
					
					
					
					31008130-CheckConditions-1
					
					CapacityRuleCode () = CR204004 = NO 
					
					
					
					
					31008130-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008131_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204005;OldSystemFlag,&lt;>,Y;AND|_1|31008131] 
					
					
					
					
					31008131_1-CheckConditions-1
					
					CapacityRuleCode () = CR204005 = NO 
					
					
					
					
					31008131_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008132
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204006;OldSystemFlag,&lt;>,Y;AND||31008132] 
					
					
					
					
					31008132-CheckConditions-1
					
					CapacityRuleCode () = CR204006 = NO 
					
					
					
					
					31008132-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008134
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008134_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204020;OldSystemFlag,&lt;>,Y;AND|_1|31008134] 
					
					
					
					
					31008134_1-CheckConditions-1
					
					CapacityRuleCode () = CR204020 = NO 
					
					
					
					
					31008134_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008135
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008135_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204021;OldSystemFlag,&lt;>,Y;AND|_1|31008135] 
					
					
					
					
					31008135_1-CheckConditions-1
					
					CapacityRuleCode () = CR204021 = NO 
					
					
					
					
					31008135_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					310115
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310116
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310117
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310118
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310119
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310120_1
					
					false 
					
					
					
					
					310120_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 10 = YES 
					
					
					
					
					310120_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310120_1-ORDER
					
					10 
					
					
					
					
					310120_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310120_1-Parameter01_2
					
					3TAB 
					
					
					
					
					310120_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310120_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310120_1-Result01
					
					3TAB = 3TAB = YES 
					
					
					
					
					310120_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310121
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310122_1
					
					false 
					
					
					
					
					310122_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 15 = YES 
					
					
					
					
					310122_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310122_1-ORDER
					
					11 
					
					
					
					
					310122_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310122_1-Parameter01_2
					
					ARCHITECTURAL 
					
					
					
					
					310122_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310122_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310122_1-Result01
					
					3TAB = ARCHITECTURAL = NO 
					
					
					
					
					310122_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310123
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310124_1
					
					false 
					
					
					
					
					310124_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 20 = YES 
					
					
					
					
					310124_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310124_1-ORDER
					
					12 
					
					
					
					
					310124_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310124_1-Parameter01_2
					
					TILE 
					
					
					
					
					310124_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310124_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310124_1-Result01
					
					3TAB = TILE = NO 
					
					
					
					
					310124_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310125
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310126_1
					
					false 
					
					
					
					
					310126_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310126_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310126_1-ORDER
					
					13 
					
					
					
					
					310126_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310126_1-Parameter01_2
					
					FIBERCEMENT 
					
					
					
					
					310126_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310126_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310126_1-Result01
					
					3TAB = FIBERCEMENT = NO 
					
					
					
					
					310126_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310127
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310128_1
					
					false 
					
					
					
					
					310128_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310128_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310128_1-ORDER
					
					14 
					
					
					
					
					310128_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310128_1-Parameter01_2
					
					CORRUGATEDMETAL 
					
					
					
					
					310128_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310128_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310128_1-Result01
					
					3TAB = CORRUGATEDMETAL = NO 
					
					
					
					
					310128_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310129
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310130_1
					
					false 
					
					
					
					
					310130_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310130_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310130_1-ORDER
					
					15 
					
					
					
					
					310130_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310130_1-Parameter01_2
					
					METAL 
					
					
					
					
					310130_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310130_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310130_1-Result01
					
					3TAB = METAL = NO 
					
					
					
					
					310130_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310132_1
					
					false 
					
					
					
					
					310132_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310132_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310132_1-ORDER
					
					16 
					
					
					
					
					310132_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310132_1-Parameter01_2
					
					SLATE 
					
					
					
					
					310132_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310132_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310132_1-Result01
					
					3TAB = SLATE = NO 
					
					
					
					
					310132_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					ActionCode
					
					Continue 
					
					
					
					
					ClientNumber
					
					21 
					
					
					
					
					DebugMessage
					
					[empty string] 
					
					
					
					
					ISRTR
					
					N 
					
					
					
					
					IsError
					
					FALSE 
					
					
					
					
					QuoteNumber
					
					3106516 
					
					
					
					
					RequireUWIDs
					
					[empty string] 
					
					
					
					
					ResultApplicationMessageLink
					
					[empty string] 
					
					
					
					
					ResultGuidedAppMessageLink
					
					[empty string] 
					
					
					
					
					ResultMessage
					
					[empty string] 
					
					
					
					
					ResultPublicAppMessageLink
					
					[empty string] 
					
					
					
					
					ResultQuickQuoteMessageLink
					
					[empty string] 
					
					
					
					
					ResultTasks
					
					[empty string] 
					
					
					
					
					RulesAppliesToList
					
					UA 
					
					
					
					
					RulesDateUsed
					
					04/09/2023 
					
					
					
					
					RulesRecordCount
					
					338 
					
					
					
					
					RulesValidationMode
					
					PageChange 
					
					
					
					
					WDDXMessage
					
					Loaded from Passed in Value 
					
					
					
					
					WDDXPacketChanged
					
					false 
					
					
					
					
					var-EffectiveYear
					
					2023 
					
					
					
					
					var-PurchaseYear_1
					
					2018 
					
					
					
					
					var-ValRoofAge_1
					
					8 
					
					
					
			
		
								
							
							
								
		
			
			
				Quote Number
				Insured
				ManualID
			
			
			
				
					
						3106516
						LEBLANC, KEITH
						2040
					
				
					
						3106517
						SMITH, BRENDA
						2010
					
				
					
						3106479
						GCGJCGJCGCGCGCGCG, KUGKHFHKFGHCGJC
						2010
					
				
					
						3106504
						MCCLAIN, JOSEPHINE
						2020
					
				
					
						3106513
						FRANK, LILLIAN
						2040
					
				
					
						3106515
						RAMIREZ, MIGUEL
						2040
					
				
					
						3106514
						GROS, DEAN
						2040
					
				
					
						3106511
						NGUYEN, AELITA
						2040
					
				
					
						3106512
						BURRELL, DALE
						2040
					
				
					
						3106507
						IRWIN, STEPHANI
						2040
					
				
					
						3106510
						ZERINGUE, DEWAN
						2040
					
				
					
						3106509
						DENNIS, DONALD
						2040
					
				
					
						3106484
						SHINGLES, SARAH
						2040
					
				
					
						3106508
						TEST, COLE
						2040
					
				
					
						3106492
						TEST, COLE
						2020
					
				
					
						3106506
						MCCLURE, TRAVIS
						2040
					
				
					
						3104411
						IRWIN, STEPHANI
						2040
					
				
					
						3106505
						BROWN, BRYAN
						2040
					
				
					
						3106503
						LIRETTE, THOMAS
						2040
					
				
					
						3106502
						MANUAL, MANNI
						2040
					
				
			
		
	
							
							
								
        List of agents in this environment with License and Commission Rates
		
			
			
				Agent Code
				Name
				DBAName
			
			
			
				
					
						7619
						TEXSTAR INSURANCE SERVICES INC
						TEXSTAR INSURANCE SERVICES INC
					
				
					
						43926
						PROGRESSIVE INSURANCE AGCY INC
						PRO AMERICA INSURANCE
					
				
					
						81258
						TMC ENTERPRISES OF SW FL INC
						DBA MONTEAGLE INS SERVICES
					
				
					
						110110
						AUGUSTYNIAK INSURANCE GRP INC
						AUGUSTYNIAK INSURANCE GRP INC
					
				
					
						110139
						FIRST CHOICE INS INTERMED INC
						FIRST CHOICE INS INTERMED INC
					
				
					
						110147
						FIRST BEACHES INSURANCE LLC
						FIRST BEACHES INSURANCE LLC
					
				
					
						110203
						MITCH MITCHELL FIN SVCS INC
						DBA NSURANCE NATION
					
				
					
						156588
						CUELLAR &amp; ASSOC PROP &amp; CAS LLC
						CUELLAR &amp; ASSOC PROP &amp; CAS LLC
					
				
					
						210177
						1ST CAPITAL INSURANCE INC
						1ST CAPITAL INSURANCE INC
					
				
					
						210181
						MOORE-TERIHAY AGENCY INC
						MOORE-TERIHAY AGENCY INC
					
				
					
						210243
						HALBREHDER FAMILY AGENCY LLC
						DBA THE INSURANCE SHOP
					
				
					
						210253
						FGNC INSURANCE AGENCY INC
						FGNC INSURANCE AGENCY INC
					
				
					
						210266
						TANIA VEGA
						TANIA VEGA INSURANCE AGENCY
					
				
					
						210285
						SHELDON PALMES INS OF
						HERNANDO INC
					
				
					
						210299
						HYDE PARK INSURANCE SVCS INC
						HYDE PARK INSURANCE SVCS INC
					
				
					
						210303
						GRYPHON GROUP INC
						GREAT FLORIDA INSURANCE
					
				
					
						240421
						THE MILLER INSURANCE GROUP LLC
						THE MILLER INSURANCE GROUP LLC
					
				
					
						241527
						HUGHES INSURANCE INC
						HUGHES INSURANCE INC
					
				
					
						310178
						INDUVAL INC
						GREAT FLORIDA INSURANCE
					
				
					
						310221
						BREVARD INS &amp; MARKETING INC
						BREVARD INS &amp; MARKETING INC
					
				
					
						310272
						HOFFMAN &amp; ASSOCIATES INS LLC
						HOFFMAN &amp; ASSOCIATES INS LLC
					
				
					
						310279
						AMSLEY INSURANCE SERVICES INC
						AMSLEY INSURANCE SERVICES INC
					
				
					
						310290
						MORNING STAR CONSULTING LLC
						MORNING STAR CONSULTING LLC
					
				
					
						310299
						HERBIG INS &amp; FIN SVCS INC
						DBA HIG INSURANCE GROUP
					
				
					
						310317
						ALLEN INSURANCE ASSOCIATES INC
						ALLEN INSURANCE ASSOCIATES INC
					
				
			
		
	
							
							
								


	table.cfdump_wddx,
	table.cfdump_xml,
	table.cfdump_struct,
	table.cfdump_varundefined,
	table.cfdump_array,
	table.cfdump_query,
	table.cfdump_cfc,
	table.cfdump_object,
	table.cfdump_binary,
	table.cfdump_udf,
	table.cfdump_udfbody,
	table.cfdump_udfarguments {
		font-size: xx-small;
		font-family: verdana, arial, helvetica, sans-serif;
	}

	table.cfdump_wddx th,
	table.cfdump_xml th,
	table.cfdump_struct th,
	table.cfdump_varundefined th,
	table.cfdump_array th,
	table.cfdump_query th,
	table.cfdump_cfc th,
	table.cfdump_object th,
	table.cfdump_binary th,
	table.cfdump_udf th,
	table.cfdump_udfbody th,
	table.cfdump_udfarguments th {
		text-align: left;
		color: white;
		padding: 5px;
	}

	table.cfdump_wddx td,
	table.cfdump_xml td,
	table.cfdump_struct td,
	table.cfdump_varundefined  td,
	table.cfdump_array td,
	table.cfdump_query td,
	table.cfdump_cfc td,
	table.cfdump_object td,
	table.cfdump_binary td,
	table.cfdump_udf td,
	table.cfdump_udfbody td,
	table.cfdump_udfarguments td {
		padding: 3px;
		background-color: #ffffff;
		vertical-align : top;
	}

	table.cfdump_wddx {
		background-color: #000000;
	}
	table.cfdump_wddx th.wddx {
		background-color: #444444;
	}


	table.cfdump_xml {
		background-color: #888888;
	}
	table.cfdump_xml th.xml {
		background-color: #aaaaaa;
	}
	table.cfdump_xml td.xml {
		background-color: #dddddd;
	}

	table.cfdump_struct {
		background-color: #0000cc ;
	}
	table.cfdump_struct th.struct {
		background-color: #4444cc ;
	}
	table.cfdump_struct td.struct {
		background-color: #ccddff;
	}

	table.cfdump_varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined th.varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined td.varundefined {
		background-color: #ccddff;
	}

	table.cfdump_array {
		background-color: #006600 ;
	}
	table.cfdump_array th.array {
		background-color: #009900 ;
	}
	table.cfdump_array td.array {
		background-color: #ccffcc ;
	}

	table.cfdump_query {
		background-color: #884488 ;
	}
	table.cfdump_query th.query {
		background-color: #aa66aa ;
	}
	table.cfdump_query td.query {
		background-color: #ffddff ;
	}


	table.cfdump_cfc {
		background-color: #ff0000;
	}
	table.cfdump_cfc th.cfc{
		background-color: #ff4444;
	}
	table.cfdump_cfc td.cfc {
		background-color: #ffcccc;
	}


	table.cfdump_object {
		background-color : #ff0000;
	}
	table.cfdump_object th.object{
		background-color: #ff4444;
	}

	table.cfdump_binary {
		background-color : #eebb00;
	}
	table.cfdump_binary th.binary {
		background-color: #ffcc44;
	}
	table.cfdump_binary td {
		font-size: x-small;
	}
	table.cfdump_udf {
		background-color: #aa4400;
	}
	table.cfdump_udf th.udf {
		background-color: #cc6600;
	}
	table.cfdump_udfarguments {
		background-color: #dddddd;
	}
	table.cfdump_udfarguments th {
		background-color: #eeeeee;
		color: #000000;
	}

 


// for queries we have more than one td element to collapse/expand
	var expand = &quot;open&quot;;

	dump = function( obj ) {
		var out = &quot;&quot; ;
		if ( typeof obj == &quot;object&quot; ) {
			for ( key in obj ) {
				if ( typeof obj[key] != &quot;function&quot; ) out += key + &quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot; + obj[key] + &quot; , &quot;'&quot; , &quot;&lt;br>&quot; , &quot;'&quot; , &quot; ;
			}
		}
	}


	cfdump_toggleRow = function(source) {
		//target is the right cell
		if(document.all) target = source.parentElement.cells[1];
		else {
			var element = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>0;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					element = source.parentNode.childNodes[i];
					break;
				}
			}
			if(element == null)
				target = source.parentNode.lastChild;
			else
				target = element;
		}
		//target = source.parentNode.lastChild ;
		cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
	}

	cfdump_toggleXmlDoc = function(source) {

		var caption = source.innerHTML.split( &quot; , &quot;'&quot; , &quot; [&quot; , &quot;'&quot; , &quot; ) ;

		// toggle source (header)
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ) {
			// closed -> short
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [short version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to maximize&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else if ( source.innerHTML.indexOf(&quot; , &quot;'&quot; , &quot;[short version]&quot; , &quot;'&quot; , &quot;) != -1 ) {
			// short -> full
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [long version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		} else {
			// full -> closed
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}

		// Toggle the target (everething below the header row).
		// First two rows are XMLComment and XMLRoot - they are part
		// of the long dump, the rest are direct children - part of the
		// short dump
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				if ( i &lt; 3 ) cfdump_toggleTarget( target, switchLongToState ) ;
				else cfdump_toggleTarget( target, switchShortToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			var row = 1;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if( target.style ) {
					if ( row &lt; 3 ) {
						cfdump_toggleTarget( target, switchLongToState ) ;
					} else {
						cfdump_toggleTarget( target, switchShortToState ) ;
					}
					row++;
				}
			}
		}
	}

	cfdump_toggleTable = function(source) {

		var switchToState = cfdump_toggleSource( source ) ;
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				cfdump_toggleTarget( target, switchToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if(target.style) {
					cfdump_toggleTarget( target, switchToState ) ;
				}
			}
		}
	}

	cfdump_toggleSource = function( source ) {
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; || source.style.fontStyle == null) {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}
	}

	cfdump_toggleTarget = function( target, switchToState ) {
		if ( switchToState == &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; )	target.style.display = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; ;
		else target.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot; ;
	}

	// collapse all td elements for queries
	cfdump_toggleRow_qry = function(source) {
		expand = (source.title == &quot;click to collapse&quot;) ? &quot;closed&quot; : &quot;open&quot;;
		if(document.all) {
			var nbrChildren = source.parentElement.cells.length;
			if(nbrChildren > 1){
				for(i=nbrChildren-1;i>0;i--){
					target = source.parentElement.cells[i];
					cfdump_toggleTarget( target,expand ) ;
					cfdump_toggleSource_qry(source);
				}
			}
			else {
				//target is the right cell
				target = source.parentElement.cells[1];
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
		else{
			var target = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>1;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					target = source.parentNode.childNodes[i];
					cfdump_toggleTarget( target,expand );
					cfdump_toggleSource_qry(source);
				}
			}
			if(target == null){
				//target is the last cell
				target = source.parentNode.lastChild;
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
	}

	cfdump_toggleSource_qry = function(source) {
		if(expand == &quot;closed&quot;){
			source.title = &quot;click to expand&quot;;
			source.style.fontStyle = &quot;italic&quot;;
		}
		else{
			source.title = &quot;click to collapse&quot;;
			source.style.fontStyle = &quot;normal&quot;;
		}
	}

 No Errors. Good Job!! 
							
						
					
					
						Close
					
				
			
		
		
		
			test
			
		
			
				
				
				
						
							
						
						
							
							
						
						
						
								--Select Layout--
								
									NoBannerLeftMenuOneArea
								
									BannerLeftMenu
								
									TopMenuOneSection
								
									NoBannerRightMenuOneArea
								
									NoMenu
								
									TopMenuTwoSection
								
									NoMenuTwoSection
								
									NoBannerLeftMenuTwoArea
								
									Mobile
								
								
							
						
						
						
								--Change View--
								
										Quick Quote
									
										HO - New Quote
									
										HO - Policy Endorsement
									
										HO - Billing or Interest Endorsement
									
										Quick Quote
									
							
						
						
								Public
								Agent
								Internal
							
						
						
							
								--Change Manual--
								HO - 2020
								HO - 2132
								HOEG - 2133
								PPA - 2510
							
						
						
							
								--Enable Free Menu Navigation--
								Free Menu Navigation - Yes
								Free Menu Navigation - No
							
						
				
			
		
	
		
		
	id(&quot;PriorClaimCount&quot;)&quot;) or . = concat(&quot;
		

	
		
		
		
		
		
		




	
		
			
				
				
					 Policy
				
					 Prequalification
				
					 Coverage
				
					 General
				
					 History
				
					 Interests
				
					 Statements
				
					 Billing
				
					 Display Quote
				
					 Bind/Submit Application
				
			
		
	
	
		
					
					&lt; General
                    
					
                
					
					Interests >
                    
					
                
					
					Exit
                    
					
                
					
					Return to Agent
                    
					
                
    

	
		

							
							
						
	

								
								
							Quote Number: 3106516  
	
	
	
		
		
	Effective Date:  
				
			    
				 MCO: 81  HO Form: DP3  
	

	

	

	

								
								
							 
							
							Loss History Information
							
						
								
								
							Number of Paid Losses in the Past 3 Years 
				
				
			 
							
							Loss History Information
							
						
								
								
							
				
				
				
				
				
				
				
				
				

				
					
					
					
						
							
								Please list any losses, whether or not paid by insurance, during the last 3 years, at this or any location 
								
									
										
									
								
							
						
					



					

						
			 
								
								
							Apply credit if policy is inforce for > = 2 years and has 0 claims since inception. 
					
						Yes
						No
					
				 Paid Claim Rating Plan  
				
				
					
								
									0
								
								
								
									1
								
								
								
									2
								
								
								
									3
								
								
								
									4+
								
								
				
				 


	
		
					
					&lt; General
					
					
				
					
					Interests >
					
					
				
					
					Exit
					
					
				
					
					Return to Agent
					
					
				
	

	

		
	

	
	
		
			
				
					
						
						
							×
						
					
					
				

				
					
					
					
				

				
				
					
					
				
					Confirm
				 
					
				
					Close
				
					
				
				
			
		
	

    
        
            
                Loading...
            
            
                Loading...
            
        
	

	
	
	
		
		
			
			
				
				
					
						
						
							×
						
					
					
				

				
				
					
						
						
						
					
	
					
					
						
					
				
					Confirm
				 
					
				
					Close
				
						
					
					
				
				
			
		
	

			
			
			
		
				
				
				
				
			
			
		
				
				
				
				
				
				
				
				
				
				
				
				
			 
			 
		 var jsPublicWebserviceURL = &quot; , &quot;'&quot; , &quot;https://cypresstest.cogisi.com/is/webservices/&quot; , &quot;'&quot; , &quot;;  var GoogleAPIKey = &quot; , &quot;'&quot; , &quot;AIzaSyBg3d6-GolpGx5FzPri1QJtfGu-3hZm63E&quot; , &quot;'&quot; , &quot;;  var jsISAlertUrl = &quot; , &quot;'&quot; , &quot;https://cypresstest.cogisi.com/is/webservices/SharedFunctionLibrary/CoreFunctionLibrary.cfc?EUDATA=rGFQPNOE59wPibquSjz12CWE1gCD4uFN4mizMJREcA24ZriNSHAsXyIwKlSt2llZHlYh2LSwgScB1zjvv05VaLiJEwUXb6TYigIu9u7hI4%2FkYs1VQCwDLSvoXhIVHfZ4GxGHSYJdypewuDkaFVRtLIGVagTsLCJUUBRYFZEwB%2FJRgQP+XZ7oosfNn%2FgU1EAB%2FLEf66dKsywSXWsYyeq1pQ%3D%3D&quot; , &quot;'&quot; , &quot;;  var ISBlockedMOCIsActive = &quot; , &quot;'&quot; , &quot;N&quot; , &quot;'&quot; , &quot;;  
			 
		
		
		
		
		
		
		
		
		 
			
			
			
			
			
				
			
	
		var CurrentUrl = document.getElementById(&quot;CurrentUrl&quot;);
		if(CurrentUrl){
			CurrentUrl.value = window.top.location.origin + window.top.location.pathname;
		} else {
			$(&quot;#mainForm&quot;).prepend(&quot; , &quot;'&quot; , &quot;&lt;input type=&quot;hidden&quot; name=&quot;CurrentUrl&quot; id=&quot;CurrentUrl&quot; value=&quot;&quot; , &quot;'&quot; , &quot; + window.top.location.origin + window.top.location.pathname + &quot; , &quot;'&quot; , &quot;&quot; />&quot; , &quot;'&quot; , &quot;);
		}
		var ISiPublicRootURL = &quot;https://cypresstest.cogisi.com/is/root/&quot;;
		var DisableMessageArray = [];

		var SubPageLoadActions = [];

		var DisableArrayExists = false;
		// Check lenght of the preexixting array
		if(DisableCheckArray &amp;&amp; DisableCheckArray.length > 0){
			DisableArrayExists = true;
			var DisableTempArray = DisableCheckArray;
		}
		
			var DisableCheckArray = new Array(2);
			
				DisableCheckArray[0] = new Array(3);
				DisableCheckArray[0][0] = &quot;LossFreeRenewal&quot;;
				DisableCheckArray[0][1] = &quot;USERTYPE,=,Agent;&quot;;
				DisableCheckArray[0][2] = &quot;&quot;;
			
				DisableCheckArray[1] = new Array(3);
				DisableCheckArray[1][0] = &quot;PaidClaimRatingPlan&quot;;
				DisableCheckArray[1][1] = &quot;USERTYPE,=,Agent;&quot;;
				DisableCheckArray[1][2] = &quot;&quot;;
			
			// If array exists then prepend to the new array created
			if(DisableArrayExists){
				DisableCheckArray = DisableTempArray.concat(DisableCheckArray);
			}
			console.log(DisableCheckArray); 


		var DisableOptionArrayExists = false;
		// Check lenght of the preexixting array
		if(DisableOptionCheckArray &amp;&amp; DisableOptionCheckArray.length > 0){
			DisableOptionArrayExists = true;
			var DisableOptionTempArray = DisableOptionCheckArray;
		}
		
			// if disabled array does not exist then empty it
			if(!DisableOptionArrayExists){
				var DisableOptionCheckArray = [];
			}
		

		/* 
			GlobalCheckDisable();
		 */

		var CalcArrayExists = false;
		// Check lenght of the preexixting array
		if(CalculationArray &amp;&amp; CalculationArray.length > 0){
			CalcArrayExists = true;
			var CalculatedTempArray = CalculationArray;
		}
		
		
			// if required array does not exist then empty it
			if(!CalcArrayExists){
				var CalculationArray = [];
			}
		




		var ReqArrayExists = false;
		// Check lenght of the preexixting array
		if(RequiredArray &amp;&amp; RequiredArray.length > 0){
			ReqArrayExists = true;
			var ReqTempArray = RequiredArray;
		}
		
		
			var RequiredArray = new Array(1);
			
				RequiredArray[0] = &quot;PriorClaimCount&quot;;
			
			// If array exists then prepend to the new array created
			if(ReqArrayExists){
				RequiredArray = ReqTempArray.concat(RequiredArray);
			}
			console.log(RequiredArray); 
		var boolHighlightRequired = false;

		/* Yashik: Run disable checks forcefully eg while adding rules dynamically from JS */
		

		var RequiredCodeArrayExists = false;
		// Check lenght of the preexixting array
		if(RequiredCodeArray &amp;&amp; RequiredCodeArray.length > 0){
			RequiredCodeArrayExists = true;
			var RequiredCodeTempArray = RequiredCodeArray;
		}
		
			// if disabled array does not exist then empty it
			if(!RequiredCodeArrayExists){
				var RequiredCodeArray = [];
			}
		

		
		function ISiAOnPageLoadStart() {
			
					try{
						
						SeedCCData(&quot; , &quot;'&quot; , &quot;applicationlocalrooturl|https://cypresstest.cogisi.com/is/Application/^applicationpublicrooturl|https://cypresstest.cogisi.com/is/Application/&quot; , &quot;'&quot; , &quot;);
					} catch(e){
						alert(&quot;Javascript error from ISiAFooterJavaScriptArray.  Search the source code for:  06E935B3&quot;);
						console.log(e);
					};
				
					try{
						
						if(typeof parent.HideLoading !== &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;){parent.HideLoading();} else if (typeof HideLoading !== &quot; , &quot;'&quot; , &quot;undefined&quot; , &quot;'&quot; , &quot;){HideLoading();};
					} catch(e){
						alert(&quot;Javascript error from ISiAFooterJavaScriptArray.  Search the source code for:  06E935B4&quot;);
						console.log(e);
					};
				
			$(&quot; , &quot;'&quot; , &quot;[data-toggle=&quot;tooltip&quot;]&quot; , &quot;'&quot; , &quot;).tooltip();
			
				GlobalCheckDisable();
			
		}
	

		
			
				
					
						Debugging information and Tools
				        
				          ×
				        
					
					
						
							Log
							Queries
							Form
							URL Auth Data WDDX Rate Flow Validation Errors Validation
							Other
							Error Log
						
						
							
								
CS-99 - Loaded FORM variable ROOFCONSTRUCTIONYEAR_1 with value: 2015 
CS-99 - Loaded FORM variable USERTYPE with value: internal 
CS-99 - Loaded FORM variable WMROOFGEOMETRY_1 with value: NA 
CS-99 - Loaded FORM variable SUBDIVISION_1 with value:  
CS-99 - Loaded FORM variable ROWHOUSE_1 with value: N 
CS-99 - Loaded FORM variable POLICYTYPECODE with value: DP3 
CS-99 - Loaded FORM variable EXTERIORWALLCOVER_1 with value: CONCRETEBLOCK 
CS-99 - Loaded FORM variable HEATTYPE1_1 with value: OIL 
CS-99 - Loaded FORM variable WMWINDOWPROTECTION_1 with value: HURRICANE 
CS-99 - Loaded FORM variable INTERNALPROTECTIONCLASS_1 with value: 1 
CS-99 - Loaded FORM variable CURRENTPAGE with value: 700 
CS-99 - Loaded FORM variable OCCUPANCY_1 with value: TENANT 
CS-99 - Loaded FORM variable SQUAREFOOTAGE_1 with value: 2546 
CS-99 - Loaded FORM variable RESPONDINGFIRESTATION_1 with value: JACKSONVILLE 
CS-99 - Loaded FORM variable PURCHASEPRICE_1 with value: 305080 
CS-99 - Loaded FORM variable EFFECTIVEDATEMAXIMUM with value: 12/29/2025 
CS-99 - Loaded FORM variable LASTHEATINGUPDATE_1 with value: 2021 
CS-99 - Loaded FORM variable FOUNDATION_1 with value: CLOSED 
CS-99 - Loaded FORM variable ISQUICKQUOTE with value: N 
CS-99 - Loaded FORM variable WINDPOOL_1 with value: N 
CS-99 - Loaded FORM variable FOUNDATIONTYPE_1 with value: BASEMENT 
CS-99 - Loaded FORM variable INITIALEFFECTIVEDATE with value: 04/09/2023 
CS-99 - Loaded FORM variable LASTPAGE with value: 600 
CS-99 - Loaded FORM variable WINDMITPREMIUM_1 with value: 15000 
CS-99 - Loaded FORM variable EFFECTIVEDATE with value: 04/09/2023 
CS-99 - Loaded FORM variable TERRITORYCODE_1 with value: 39 
CS-99 - Loaded FORM variable LASTELECTRICALUPDATE_1 with value: 2018 
CS-99 - Loaded FORM variable UWQUOTECODE with value: A 
CS-99 - Loaded FORM variable NOSAVEPLANNEDSUBDIVISION_1 with value: N 
CS-99 - Loaded FORM variable NUMBERFAMILIES_1 with value: 2 
CS-99 - Loaded FORM variable DWELLINGTYPE_1 with value: DWELLING 
CS-99 - Loaded FORM variable DISTANCEFIREHYDRANT_1 with value: LT1000 
CS-99 - Loaded FORM variable BARRIERISLAND_1 with value: N 
CS-99 - Loaded FORM variable NOSAVEBARRIERISLAND_1 with value: N 
CS-99 - Loaded FORM variable WMROOFCOVERING_1 with value: FBC 
CS-99 - Loaded FORM variable WMROOFANCHORAGE_1 with value: CLIPS 
CS-99 - Loaded FORM variable IBHS_1 with value: PARTIAL 
CS-99 - Loaded FORM variable NOSAVENEARSINKHOLE_1 with value: N 
CS-99 - Loaded FORM variable ROOFCONSTRUCTION_1 with value: 3TAB 
CS-99 - Loaded FORM variable LASTROOFUPDATE_1 with value: 2019 
CS-99 - Loaded FORM variable FIRECODE_1 with value:  
CS-99 - Loaded FORM variable CURRENTPROGRESSPAGE with value: 700 
CS-99 - Loaded FORM variable COMPANYCODE with value: 81 
CS-99 - Loaded FORM variable BCEGS_1 with value: 4 
CS-99 - Loaded FORM variable MARKETVALUE_1 with value: 300000 
CS-99 - Loaded FORM variable NOSAVEROWHOUSE_1 with value: N 
CS-99 - Loaded FORM variable WINDSPEED_1 with value: 110 
CS-99 - Loaded FORM variable NUMSTORIES_1 with value: 1 
CS-99 - Loaded FORM variable ROOFDECKATTACH_1 with value: NA 
CS-99 - Loaded FORM variable TERRAIN_1 with value: B 
CS-99 - Loaded FORM variable CONSTRUCTIONTYPE_1 with value: V 
CS-99 - Loaded FORM variable CONSTRUCTIONYEAR_1 with value: 2015 
CS-99 - Loaded FORM variable ROOFCONDITION_1 with value: ABOVEAVERAGE 
CS-99 - Loaded FORM variable DISTANCEFIRESTATION_1 with value: 1 
CS-99 - Loaded FORM variable EFFECTIVEDATEMINIMUM with value: 01/16/2015 
CS-99 - Loaded FORM variable WBDR_1 with value: N 
CS-99 - Loaded FORM variable NUMROOMS_1 with value: 11 
CS-99 - Loaded FORM variable CURRENTURL with value: https://cypresstest.cogisi.com/is/root/index.cfm 
CS-99 - Loaded FORM variable ACCESSNUMBER with value: 2 
CS-99 - Loaded FORM variable WMWATERRESISTANCE_1 with value: N 
CS-99 - Loaded FORM variable PLANNEDSUBDIVISION_1 with value: N 
CS-99 - Loaded FORM variable LASTPLUMBINGUPDATE_1 with value: 2020 
CS-99 - Loaded FORM variable ROOFLAYERS_1 with value: 1 
CS-99 - Loaded FORM variable AUTHTOKEN with value: a82741540573558027i15151613s3902970422694160i54330 
CS-99 - Loaded FORM variable FAMILYUNITSROW_1 with value: 1 
CS-99 - Loaded FORM variable BUILDINGUNITS_1 with value: 1 
CS-99 - Loaded FORM variable NEARSINKHOLE_1 with value: N 
CS-10 - Loaded BOTH scope(s) with 67 elements 
Custom Scope Load Duration:5 
Auth.setValue: IPAddress = 98.237.120.185 
Current Webservice Address: https://cypresstest.cogisi.com/is/root/ 
Auth.setValue: AuthToken = a82741540573558027i15151613s3902970422694160i54330 
Auth.setValue: AuthPurpose = ISiApp 
Auth.setValue: Verified = true 
Auth.setValue: DataPacket = 2ISiAppJHUGHESQuoteN2040a82741540573558027i15151613s3902970422694160i5433003106516internalTopMenuOneSection60yes04/04/2023 03:18:18PM 
AUT-18 - Successfully Completed &quot; , &quot;'&quot; , &quot;RefreshDataPacket&quot; , &quot;'&quot; , &quot; function 
AUT-05 - Successfully Validated The Requested &quot; , &quot;'&quot; , &quot;AuthToken&quot; , &quot;'&quot; , &quot; 
Auth.Verify Duration : 46 
Client Number: 21 
Auth.setValue: ManualID = 2040 
Ran Query (1)
Auth.setValue: LayoutName = TopMenuOneSection 
Auth.setValue: FreeMenuNav = N 
Including PreProcessing_Main from PreProcessing_Index 
QUO-082 SetValue Quote Data Element: keyname-PrimaryKey 
Loading ClientCode Quote template 
Ran Query (2)
WDX-52 - Successfully deserialized the WDDX Packet 
QUO-082 SetValue Quote Data Element: keyname-QuoteNumber 
WDX-99 - WDDX Set Value - QuoteNumber=3106516 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-ManualID 
WDX-99 - WDDX Set Value - ManualID=2040 Changed=false 
WDX-98 - WDDX Cleared key - PolicyID 
Auth.setValue: ManualID = 2040 
QUO-082 SetValue Quote Data Element: keyname-StateCode 
WDX-99 - WDDX Set Value - StateCode=9 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-PolicyTypeCode 
WDX-99 - WDDX Set Value - PolicyTypeCode=DP3 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWStatusCode 
WDX-99 - WDDX Set Value - UWStatusCode=C Changed=false 
QUO-082 SetValue Quote Data Element: keyname-CompanyCode 
WDX-99 - WDDX Set Value - CompanyCode=81 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWQuoteCode 
WDX-99 - WDDX Set Value - UWQuoteCode=A Changed=false 
QUO-082 SetValue Quote Data Element: keyname-AgentCode 
WDX-99 - WDDX Set Value - AgentCode=10100 Changed=false 
WDX-99 - WDDX Set Value - IsQuickQuote=N Changed=false 
WDX-99 - WDDX Set Value - InterfaceVersion=UA Changed=false 
WDX-98 - WDDX Cleared key - ExpirationDate 
DetermineReadOnly - X 
[DRO01] Quote: 3106516 UWStatusCode: C LoadRelatedQuotes:true 
QUO-082 SetValue Quote Data Element: keyname-UWStatusCode 
WDX-99 - WDDX Set Value - UWStatusCode=C Changed=false 
QUO-083 SetValue keyname-UWStatusCode No Additional Processing 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 0 
QUO-80 - Loading Applicant List 
QUO-80 - Total Number of applicants - 1 
QUO-80 - Current Applicant List -  
QUO-80 - Adding Applicant 1:KEITH ANN LEBLANC JR to applicant list 
QUO-80 - Loading Applicant List Completed 
WDX-99 - WDDX Set Value - MidtermChangeMode=No Changed=false 
WDDX.LoadData Duration : 9 
Loading ClientCode Quote template 
WDX-99 - WDDX Set Value - ViewID=2 Changed=false 
Ran Query (3)
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
Ran Query (4)
PostAdditionalAction: Loading the Last Page Properties:  
SFORM-02 - Starting process of Saving data from SubmittedData to data 
WDX-98 - WDDX Cleared key - FIRECODE_1 
SFORM-99 - Skipping NOSAVEPLANNEDSUBDIVISION_1 
WDX-99 - WDDX Set Value - RESPONDINGFIRESTATION_1=JACKSONVILLE Changed=false 
SFORM-99 - Skipping NOSAVEBARRIERISLAND_1 
WDX-99 - WDDX Set Value - WMWATERRESISTANCE_1=N Changed=false 
WDX-99 - WDDX Set Value - ROOFCONDITION_1=ABOVEAVERAGE Changed=false 
WDX-99 - WDDX Set Value - BUILDINGUNITS_1=1 Changed=false 
WDX-99 - WDDX Set Value - ISQUICKQUOTE=N Changed=false 
WDX-99 - WDDX Set Value - FOUNDATION_1=CLOSED Changed=false 
WDX-99 - WDDX Set Value - CONSTRUCTIONYEAR_1=2015 Changed=false 
WDX-99 - WDDX Set Value - TERRAIN_1=B Changed=false 
WDX-99 - WDDX Set Value - LASTPAGE=600 Changed=true 
WDX-99 - WDDX Set Value - NEARSINKHOLE_1=N Changed=false 
WDX-99 - WDDX Set Value - INTERNALPROTECTIONCLASS_1=1 Changed=true 
WDX-99 - WDDX Set Value - LASTROOFUPDATE_1=2019 Changed=true 
WDX-99 - WDDX Set Value - CONSTRUCTIONTYPE_1=V Changed=false 
WDX-99 - WDDX Set Value - LASTHEATINGUPDATE_1=2021 Changed=true 
WDX-99 - WDDX Set Value - WINDMITPREMIUM_1=15000 Changed=false 
WDX-99 - WDDX Set Value - ACCESSNUMBER=2 Changed=false 
WDX-99 - WDDX Set Value - NUMBERFAMILIES_1=2 Changed=false 
WDX-99 - WDDX Set Value - NUMSTORIES_1=1 Changed=false 
WDX-99 - WDDX Set Value - MARKETVALUE_1=300000 Changed=false 
WDX-99 - WDDX Set Value - ROOFLAYERS_1=1 Changed=false 
WDX-98 - WDDX Cleared key - SUBDIVISION_1 
WDX-99 - WDDX Set Value - ROWHOUSE_1=N Changed=false 
WDX-99 - WDDX Set Value - WMROOFGEOMETRY_1=NA Changed=false 
WDX-99 - WDDX Set Value - ROOFDECKATTACH_1=NA Changed=false 
WDX-99 - WDDX Set Value - NUMROOMS_1=11 Changed=false 
WDX-99 - WDDX Set Value - WBDR_1=N Changed=false 
WDX-99 - WDDX Set Value - DWELLINGTYPE_1=DWELLING Changed=false 
WDX-99 - WDDX Set Value - DISTANCEFIRESTATION_1=1 Changed=false 
SFORM-99 - Skipping NOSAVEROWHOUSE_1 
WDX-99 - WDDX Set Value - LASTELECTRICALUPDATE_1=2018 Changed=true 
WDX-99 - WDDX Set Value - IBHS_1=PARTIAL Changed=false 
WDX-99 - WDDX Set Value - CURRENTPROGRESSPAGE=700 Changed=true 
QUO-082 SetValue Quote Data Element: keyname-COMPANYCODE 
WDX-99 - WDDX Set Value - COMPANYCODE=81 Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATEMAXIMUM=12/29/2025 Changed=false 
WDX-99 - WDDX Set Value - ROOFCONSTRUCTIONYEAR_1=2015 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-POLICYTYPECODE 
WDX-99 - WDDX Set Value - POLICYTYPECODE=DP3 Changed=false 
WDX-99 - WDDX Set Value - LASTPLUMBINGUPDATE_1=2020 Changed=true 
WDX-99 - WDDX Set Value - FOUNDATIONTYPE_1=BASEMENT Changed=false 
WDX-99 - WDDX Set Value - FAMILYUNITSROW_1=1 Changed=false 
WDX-99 - WDDX Set Value - TERRITORYCODE_1=39 Changed=false 
WDX-99 - WDDX Set Value - USERTYPE=internal Changed=false 
SFORM-99 - Skipping NOSAVENEARSINKHOLE_1 
WDX-99 - WDDX Set Value - WMWINDOWPROTECTION_1=HURRICANE Changed=false 
WDX-99 - WDDX Set Value - CURRENTPAGE=700 Changed=true 
WDX-99 - WDDX Set Value - OCCUPANCY_1=TENANT Changed=false 
WDX-99 - WDDX Set Value - BCEGS_1=4 Changed=false 
WDX-99 - WDDX Set Value - WMROOFCOVERING_1=FBC Changed=false 
WDX-99 - WDDX Set Value - SQUAREFOOTAGE_1=2546 Changed=false 
WDX-99 - WDDX Set Value - ROOFCONSTRUCTION_1=3TAB Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATEMINIMUM=01/16/2015 Changed=false 
WDX-99 - WDDX Set Value - WMROOFANCHORAGE_1=CLIPS Changed=false 
WDX-99 - WDDX Set Value - PLANNEDSUBDIVISION_1=N Changed=false 
WDX-99 - WDDX Set Value - DISTANCEFIREHYDRANT_1=LT1000 Changed=false 
WDX-99 - WDDX Set Value - WINDPOOL_1=N Changed=false 
WDX-99 - WDDX Set Value - HEATTYPE1_1=OIL Changed=false 
WDX-99 - WDDX Set Value - BARRIERISLAND_1=N Changed=false 
WDX-99 - WDDX Set Value - EFFECTIVEDATE=04/09/2023 Changed=false 
WDX-99 - WDDX Set Value - EXTERIORWALLCOVER_1=CONCRETEBLOCK Changed=false 
WDX-99 - WDDX Set Value - PURCHASEPRICE_1=305080 Changed=false 
WDX-99 - WDDX Set Value - INITIALEFFECTIVEDATE=04/09/2023 Changed=false 
QUO-082 SetValue Quote Data Element: keyname-UWQUOTECODE 
WDX-99 - WDDX Set Value - UWQUOTECODE=A Changed=false 
WDX-99 - WDDX Set Value - WINDSPEED_1=110 Changed=false 
SFORM-03 - Completed process of Saving data from SubmittedData to data count:63 
AL100 - Check for Agent or Agent Change 
Ran Query (8)
ValidatePageID: PageID validated ViewID:2 PageID:700 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 0 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (9)
WDDX.SAVE Duration : 26 
Ran Query (10)
SetRatingStatus RatingStatusCode 14:18:18.608 - Desired:V Expected:X Returned:V 
getManualID returns 2040 
Ran Query (11)
Running Validation PageChange with PageIdentifier:sections:51,1400,3000,3100,3300 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (12)
SetRatingStatus RatingStatusCode 14:18:18.735 - Desired:X Expected:V Returned:X 
WDX-98 - WDDX Cleared key - RequireUWIDs 
WDX-98 - WDDX Cleared key - ResultTasks 
Completed Validation - Continue 
Setting Validation equal to prior result: continue 
Ran Query (13)
WDX-99 - WDDX Set Value - ViewID=2 Changed=false 
Ran Query (14)
Loading the current View Properties: TextHeaderClass_1=row ISiMidHeading,NameLabelLocation=Top,UserHelpLeftString=?,DateEntryType=Both,YesNoEntryType=radio,DefaultLayout=TopMenuOneSection,AvailableLayouts=TopMenuOneSection,PageIDOnCCSuccess=92 
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
Loading the current Page Properties:  
Preprocessing - Step 21a - AdditionalAction:  CurrentPage:700 
Auth.setValue: LayoutName = TopMenuOneSection 
DepositSchedule - Start - https://cypresstest.cogisi.com/is/webservices/ISUtilitiesCFC/ISTransfer/ISTransferWS.cfc?quotenumber=3106516&amp;AuthToken=a82741540573558027i15151613s3902970422694160i54330 
DepositSchedule, No change in Bill Control, skipping process: 819DP304/09/2023AApp_A 
WDX-99 - WDDX Set Value - ValidBilling=true Changed=false 
ImpactTotalPremium:  
TotalPremium: 832 
Start HTML : 207 
Index Preprocessing Duration : 214 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [OldSystemFlag,=,Y]() = false 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [OldSystemFlag,=,Y]() = false 
Ran Query (15)
WDX-99 - WDDX Set Value - PageHistory=100,101,200,400,500,600,700 Changed=true 
Prior Page ID: 600 
Next Page ID: 800 
Processing Area: 1 
getManualID returns 2040 
Ran Query (16)
Starting Render Page - CurrentApplicant:1 CurrentRisk:1 CurrentDetail:0 Question Count:15 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: DefaultFieldName to value:USERTYPE 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Load Section Properties: SectionClass=sticky-top border-bottom ISiA-Max25p 
CSET-94 - LoadKeyValueString key: SectionClass to value:sticky-top border-bottom ISiA-Max25p 
Start Widget [0]:hidden Fieldname:USERTYPE 
CSET-94 - LoadKeyValueString key: DefaultFieldName to value:USERTYPE 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:QuoteNumber 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:3106516 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 1 
Start Question [0] - EffectiveDateWidget 
CSET-94 - LoadKeyValueString key: ReadOnlyCondition to value:USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR 
Start Widget [0]:EffectiveDateWidget Fieldname:EffectiveDate 
CSET-94 - LoadKeyValueString key: ReadOnlyCondition to value:USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR 
Starting to look for widget specific file - EffectiveDateWidget -  - suffix: 
QUO-05 - Effective date initialization started 
QUO-05 - Saved user type: internal 
QUO-05 - Current user type: internal 
QUO-07 - Effective date did not initialization as user type logged in is same 
Existing date value used: 04/09/2023 
conditionalOperatorCheck - internal.&lt;>.internal 
conditionalOperatorCheck - internal.=.internal 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [USERTYPE,&lt;>,INTERNAL;USERTYPE,=,INTERNAL;OR] = true 
Complete Widget Specific File 
End Widget :EffectiveDateWidget with suffix:  
Widget Duration : 3 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:CompanyCode 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:81 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
Start Widget [0]:Text Fieldname:PolicyTypeCode 
Starting to look for widget specific file - Text -  - suffix: 
Text Value:DP3 RightCols:0 DisableText: 
Complete Widget Specific File 
End Widget :Text with suffix:  
Widget Duration : 0 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:UWQuoteCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 0 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:PolicyTypeCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - Text 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWQuoteCode,&lt;>,A; 
conditionalOperatorCheck - a.&lt;>.a 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UWQuoteCode,&lt;>,A](1) = NO 
Checking Question Conditonals [UWQuoteCode,&lt;>,A;], return:NO 
Did not show this question [0] 
Start Question [0] - hidden 
Start Widget [0]:hidden Fieldname:CompanyCode 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: ForceDefaultValue to value:Y 
CSET-94 - LoadKeyValueString key: DefaultValue to value:N 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND 
conditionalOperatorCheck - a.=.a 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND]1 = false 
Checking Question Conditonals [UWQuoteCode,=,A;OldSystemFlag,&lt;>,Y;AND], return:false 
Did not show this question [0] 
Start Question [0] - ButtonWidget 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: ButtonAppendLoading to value:Y 
CSET-94 - LoadKeyValueString key: ButtonAppendSubmit to value:Y 
CSET-94 - LoadKeyValueString key: ConfirmationHeading to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonDisplayType to value:ConfirmationPopup 
CSET-94 - LoadKeyValueString key: ConfirmationText to value:Are you sure you want to unlock the quote, you may have to resubmit for underwriter approval? 
CSET-94 - LoadKeyValueString key: ButtonText to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonAppendAddAction to value:RESETCANAGENTBIND 
CSET-94 - LoadKeyValueString key: EditCanAgentBind to value:Y 
CSET-94 - LoadKeyValueString key: ButtonClass to value:w-100 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND 
conditionalOperatorCheck - n.=.y 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND]1 = false 
Checking Question Conditonals [CanAgentBind,=,Y;USERTYPE,&lt;>,INTERNAL;AND], return:false 
Did not show this question [0] 
Start Question [0] - Text 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: RightClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:ReadOnly,=,TRUE; 
conditionalOperatorCheck - false.=.true 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [ReadOnly,=,TRUE](1) = NO 
Checking Question Conditonals [ReadOnly,=,TRUE;], return:NO 
Did not show this question [0] 
Start Question [0] - ButtonWidget 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
CSET-94 - LoadKeyValueString key: ButtonAppendLoading to value:Y 
CSET-94 - LoadKeyValueString key: ButtonAppendSubmit to value:Y 
CSET-94 - LoadKeyValueString key: ConfirmationHeading to value:Unlock 
CSET-94 - LoadKeyValueString key: ButtonDisplayType to value:ConfirmationPopup 
CSET-94 - LoadKeyValueString key: ConfirmationText to value:You may have to resubmit for underwiter approval? 
CSET-94 - LoadKeyValueString key: ButtonText to value:Remove Submission 
CSET-94 - LoadKeyValueString key: ButtonAppendAddAction to value:RESETUWSTATUSCODE 
CSET-94 - LoadKeyValueString key: ButtonClass to value:w-100 
CSET-94 - LoadKeyValueString key: QuestionConditional to value:UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND 
conditionalOperatorCheck - c.=.s 
FR-005 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND]1 = false 
Checking Question Conditonals [UWStatusCode,=,S;USERTYPE,&lt;>,INTERNAL;AND], return:false 
Did not show this question [0] 
Start Question [0] - hidden 
CSET-94 - LoadKeyValueString key: DefaultValue to value:No 
CSET-94 - LoadKeyValueString key: ForceValue to value:No 
Start Widget [0]:hidden Fieldname:IsQuickQuote 
CSET-94 - LoadKeyValueString key: DefaultValue to value:No 
CSET-94 - LoadKeyValueString key: ForceValue to value:No 
Starting to look for widget specific file - hidden -  - suffix: 
Complete Widget Specific File 
End Widget :hidden with suffix:  
Widget Duration : 1 
Start Question [0] - ErrorDisplay 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
Start Widget [0]:ErrorDisplay Fieldname: 
CSET-94 - LoadKeyValueString key: LeftClass to value:ISiA-RedText 
Starting to look for widget specific file - ErrorDisplay -  - suffix: 
Complete Widget Specific File 
End Widget :ErrorDisplay with suffix:  
Widget Duration : 1 
Page Duration : 15 
Processing Area: 2 
getManualID returns 2040 
Ran Query (17)
Starting Render Page - CurrentApplicant:1 CurrentRisk:1 CurrentDetail:0 Question Count:4 
Start Question [1500010] - NUMBER 
CSET-94 - LoadKeyValueString key: NumberMaxValue to value:9999 
CSET-94 - LoadKeyValueString key: NumberMinValue to value:0 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1500010]:NUMBER Fieldname:PriorClaimCount 
CSET-94 - LoadKeyValueString key: NumberMaxValue to value:9999 
CSET-94 - LoadKeyValueString key: NumberMinValue to value:0 
Starting to look for widget specific file - NUMBER - Numeric4 - suffix: 
Number Format Mask: _^ 
Complete Widget Specific File 
End Widget :NUMBER with suffix:  
Widget Duration : 1 
Start Question [1600010] - DetailSelection 
CSET-94 - LoadKeyValueString key: DisplayFormat to value:accordion 
CSET-94 - LoadKeyValueString key: TabTitleVariable to value:TypeOfLoss 
CSET-94 - LoadKeyValueString key: DetailVariable to value:NumberClaims 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1600010]:DetailSelection Fieldname:NumberClaims 
CSET-94 - LoadKeyValueString key: DisplayFormat to value:accordion 
CSET-94 - LoadKeyValueString key: TabTitleVariable to value:TypeOfLoss 
CSET-94 - LoadKeyValueString key: DetailVariable to value:NumberClaims 
Starting to look for widget specific file - DetailSelection -  - suffix: 
getManualID returns 2040 
Ran Query (18)
CSET-94 - LoadKeyValueString key: DefaultLayout to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: UserHelpLeftString to value:? 
CSET-94 - LoadKeyValueString key: PageIDOnCCSuccess to value:92 
CSET-94 - LoadKeyValueString key: NameLabelLocation to value:Top 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:radio 
CSET-94 - LoadKeyValueString key: AvailableLayouts to value:TopMenuOneSection 
CSET-94 - LoadKeyValueString key: DateEntryType to value:Both 
CSET-94 - LoadKeyValueString key: TextHeaderClass_1 to value:row ISiMidHeading 
CSET-95 - Setting Set Value - ShowEndorsementLinks=no 
Indexes - IndexCounter: CurrentDetail:NumberClaims 
Item to be deleted:  
Starting Accordion Detail Widget 
Complete Widget Specific File 
End Widget :DetailSelection with suffix:  
Widget Duration : 5 
Start Question [1600070] - YesNo 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:select 
CSET-94 - LoadKeyValueString key: Required to value:N 
CSET-94 - LoadKeyValueString key: YesNoType to value:Y/N 
CSET-95 - Preload Setting: DefaultLayout to value:TopMenuOneSection 
CSET-95 - Preload Setting: UserHelpLeftString to value:? 
CSET-95 - Preload Setting: PageIDOnCCSuccess to value:92 
CSET-95 - Preload Setting: NameLabelLocation to value:Top 
CSET-95 - Preload Setting: YesNoEntryType to value:radio 
CSET-95 - Preload Setting: AvailableLayouts to value:TopMenuOneSection 
CSET-95 - Preload Setting: DateEntryType to value:Both 
CSET-95 - Preload Setting: TextHeaderClass_1 to value:row ISiMidHeading 
Added existing settings - 8 
Start Widget [1600070]:YesNo Fieldname:LossFreeRenewal 
CSET-94 - LoadKeyValueString key: YesNoEntryType to value:select 
CSET-94 - LoadKeyValueString key: Required to value:N 
CSET-94 - LoadKeyValueString key: YesNoType to value:Y/N 
Starting to look for widget specific file - YesNo - Yes/No - suffix: 
YesNo Type from settings: YES/NO 
Complete Widget Specific File 
conditionalOperatorCheck - internal.=.agent 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UserType,=,Agent]() = NO 
End Widget :YesNo with suffix:  
Widget Duration : 2 
Start Question [1600080] - SelectQry 
CSET-94 - LoadKeyValueString key: Required to value:N 
Start Widget [1600080]:SelectQry Fieldname:PaidClaimRatingPlan 
CSET-94 - LoadKeyValueString key: Required to value:N 
Starting to look for widget specific file - SelectQry - Text - suffix: 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
CheckHideFromUser  Code: Show Question:YES 
Ran Query (19)
Multiple options found for select 
Choice selected is 0 
Option 0 added with value 0 
Option 1 added with value 1 
Option 2 added with value 2 
Option 3 added with value 3 
Option 4+ added with value 4 
Complete Widget Specific File 
conditionalOperatorCheck - internal.=.agent 
FR-012 &quot; , &quot;'&quot; , &quot;ConditionalOperatorsCheck&quot; , &quot;'&quot; , &quot; Complete - [UserType,=,Agent]() = NO 
End Widget :SelectQry with suffix:  
Widget Duration : 4 
Page Duration : 15 
Start RenderButton [ButtonType: PrimaryButton] 
End RenderButton [ButtonType: PrimaryButton] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: Secondary] 
End RenderButton [ButtonType: Secondary] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: PrimaryButton] 
End RenderButton [ButtonType: PrimaryButton] 
RenderButton Duration (milliseconds): 0 
Start RenderButton [ButtonType: Secondary] 
End RenderButton [ButtonType: Secondary] 
RenderButton Duration (milliseconds): 0 
Ran Query (20)
CSET-03 - No Settings Found for ISBlockedMOC 
Running: UpdateNumberOf NumberOfRisks:1 NumberOfApplicants:1 Quote:3106516 
UpdateNumberOf Duration (milliseconds): 1 
WDX-51 - Successfully serialized the WDDX Packet 
Ran Query (21)
WDDX.SAVE Duration : 30 
Auth.setValue: DataPacket = 31065162internal0TopMenuOneSectionISiAppa82741540573558027i15151613s3902970422694160i543302040QuoteJHUGHESN60yes04/04/2023 03:18:18PM 
AUT-18 - Successfully Completed &quot; , &quot;'&quot; , &quot;RefreshDataPacket&quot; , &quot;'&quot; , &quot; function 
Auth.setValue: Changed = false 
AUT-07 - &quot; , &quot;'&quot; , &quot;AuthToken:DataPacket&quot; , &quot;'&quot; , &quot; Data Save 
Field Name List: ,USERTYPE,QuoteNumber,EffectiveDate,CompanyCode,PolicyTypeCode,UWQuoteCode,PolicyTypeCode,PolicyNumber,CompanyCode,CypressConversionReadOnlyMessageIsQuickQuote,PriorClaimCount,NumberClaims,LossFreeRenewal,PaidClaimRatingPlan,DateOfLoss,TypeOfLoss,AmountOfLoss,LossDescription,LossLocation,ClaimTierRating 
WDX-99 - WDDX Set Value - OnLastPage=N Changed=true 
							
							
								

1:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? ORDER BY ViewID ASC

1:All Views Query sqlparameters: 2040

1:All Views Query recordcount: 5

1:All Views Query ExecutionTime: 1

2:Get Quote Data SQL: SELECT TOP 1 * FROM WebInfo WITH (NOLOCK) where QuoteNumber = ? 

2:Get Quote Data sqlparameters: 3106516

2:Get Quote Data recordcount: 1

2:Get Quote Data ExecutionTime: 2

3:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? AND ViewID = ? ORDER BY ViewID ASC

3:All Views Query sqlparameters: 2040,2

3:All Views Query recordcount: 1

3:All Views Query ExecutionTime: 1

4:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

4:Pages Query sqlparameters: 2040,2,600

4:Pages Query recordcount: 1

4:Pages Query ExecutionTime: 1

5:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

5:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,

5:QuestionsQry recordcount: 0

5:QuestionsQry ExecutionTime: 1

6:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

6:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,Y

6:QuestionsQry recordcount: 0

6:QuestionsQry ExecutionTime: 1

7:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
								AND ISNULL(RiskSpecific, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = ?
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

7:QuestionsQry sqlparameters: 2040,0,2022-01-01,2022-01-01,D,B,N,O,DP3,Z

7:QuestionsQry recordcount: 0

7:QuestionsQry ExecutionTime: 1

8:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

8:Pages Query sqlparameters: 2040,2,700

8:Pages Query recordcount: 1

8:Pages Query ExecutionTime: 1

9:Save Quote Data SQL: UPDATE WebInfo SET InfoWDDX = ? , UWQuoteCode = ? , UWStatusCode = ? , AgentCode = ? , EffectiveDate = ? , ManualID = ? , StateCode = ? , CompanyCode = ? ,
						PolicyTypeCode = ? , Underwriter = ? , ApplicantFirst = ? , ApplicantMiddle = ? , ApplicantLast = ? , ApplicantSuffix = ? , ApplicantAddress1 = ? ,
						ApplicantAddress2 = ? , ApplicantCity = ? , ApplicantState = ? , ApplicantZip = ? , ApplicantZip4 = ? , ApplicantHomePhone = ? ,
						ApplicantWorkPhone = ? , ApplicantEmail = ? , ProgramCode = ? , DateUpdated = GETDATE(), UWStatusDate = GETDATE() where QuoteNumber = ? 

9:Save Quote Data sqlparameters: {WDDX Packet},A,C,10100,2023-04-09,2040,9,81,DP3,,KEITH,ANN,LEBLANC,JR,1837 W 19TH ST,,JACKSONVILLE,FL,32209,,717-765-5091,,john.hughes@cornerops.com,,3106516

9:Save Quote Data recordcount: 1

9:Save Quote Data ExecutionTime: 4

10:Save Quote Data ExecutionTime: 1

11:ManualPageSections Query SQL:  SELECT DISTINCT s.SectionID
					FROM ManualPageSections s WITH (NOLOCK)
					WHERE ManualID = ?
					AND PageID = ?
				

11:ManualPageSections Query sqlparameters: 2040,600

11:ManualPageSections Query recordcount: 5

11:ManualPageSections Query ExecutionTime: 1

12:Save Quote Data ExecutionTime: 2

13:All Views Query SQL: SELECT * FROM ManualViews WHERE ManualID = ? AND ViewID = ? ORDER BY ViewID ASC

13:All Views Query sqlparameters: 2040,2

13:All Views Query recordcount: 1

13:All Views Query ExecutionTime: 1

14:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.PageID = ?
					

14:Pages Query sqlparameters: 2040,2,700

14:Pages Query recordcount: 1

14:Pages Query ExecutionTime: 1

15:Pages Query SQL:  SELECT DISTINCT m2.*,
							m3.PageName, m3.PageHeading, m3.PageSubHeading, m3.PlatformCode, m3.PageProperties, m3.PageNavigation,
							m3.PageDisableCode, m3.PageSettingNameList, m2.PageOrder, m3.PageID, ISNULL(m2.Manual2ID, m2.ManualID) AS ManualIDToUse
						FROM ManualViewPages m2 WITH (NOLOCK)
							INNER JOIN ManualPages m3 ON m3.ManualID = ISNULL(m2.Manual2ID, m2.ManualID)
								AND m3.PageID = m2.PageID
						WHERE m2.ManualID = ?
						AND m2.ViewID = ?
						AND m2.ProgressMilestone = &quot; , &quot;'&quot; , &quot;Y&quot; , &quot;'&quot; , &quot;
						ORDER BY m2.PageOrder
					

15:Pages Query sqlparameters: 2040,2

15:Pages Query recordcount: 10

15:Pages Query ExecutionTime: 2

16:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

16:QuestionsQry sqlparameters: 2040,700,1,2022-01-01,2022-01-01,D,B,N,O,DP3

16:QuestionsQry recordcount: 15

16:QuestionsQry ExecutionTime: 3

17:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

17:QuestionsQry sqlparameters: 2040,700,2,2022-01-01,2022-01-01,D,B,N,O,DP3

17:QuestionsQry recordcount: 4

17:QuestionsQry ExecutionTime: 2

18:QuestionsQry SQL:  SELECT * FROM vManualQuestions WITH (NOLOCK)
							WHERE ManualID = ?
								AND PageID = ?
								AND AreaNum = ?
								AND (QuestionStartDate IS NULL OR QuestionStartDate &lt;= ?)
								AND (QuestionEndDate IS NULL OR QuestionEndDate > ?)
								AND (AppliesTo IS NULL OR AppliesTo IN (?,?,?,?))
								AND QuestionTypeCode not in (&quot; , &quot;'&quot; , &quot;NONE&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;RATING&quot; , &quot;'&quot; , &quot;)
								AND (ISNULL(PolicyTypeCode, &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; OR PolicyTypeCode IN (?))
							ORDER BY AreaNum, SectionOrder, QuestionOrder
						

18:QuestionsQry sqlparameters: 2040,701,2,2022-01-01,2022-01-01,D,B,N,O,DP3

18:QuestionsQry recordcount: 6

18:QuestionsQry ExecutionTime: 2

19:Choices Query SQL:  Select ManualChoices.* from ManualChoices
				WHERE ManualID = ?
				AND QuestionNumber = ?
				AND DisableClient = 0
				AND 1=1
				Order By QuestionChoiceNumber

19:Choices Query sqlparameters: 2040,1600080

19:Choices Query recordcount: 5

19:Choices Query ExecutionTime: 0

20:Get Client Setting Data ISBlockedMOC SQL: Select FieldName, SettingValue, SettingConditionals, AgentFlag,
						TestModeFlag, UWQuoteCode
						From ISClientSettings
						WHERE ClientNumber = ? 
						AND SettingName = ? 
						AND (StateCode = ?  or StateCode = 0)
						AND (CompanyCode = ?  or CompanyCode = 0)
						AND (PolicyTypeCode = ?  or PolicyTypeCode = &quot; , &quot;'&quot; , &quot;x&quot; , &quot;'&quot; , &quot; )
						AND (ManualID = ?  or ManualID = 0)
						AND (UWQuoteCode = ?  or UWQuoteCode = &quot; , &quot;'&quot; , &quot;x&quot; , &quot;'&quot; , &quot; )
						AND StartDate &lt;= ? 
						AND (EndDate Is Null or EndDate > ? ) Order By FieldName, SortOrder 

20:Get Client Setting Data ISBlockedMOC sqlparameters: 21,ISBlockedMOC,0,0,x,0,x,2023-04-04,2023-04-04

20:Get Client Setting Data ISBlockedMOC recordcount: 0

20:Get Client Setting Data ISBlockedMOC ExecutionTime: 1

21:Save Quote Data SQL: UPDATE WebInfo SET InfoWDDX = ? , UWQuoteCode = ? , UWStatusCode = ? , AgentCode = ? , EffectiveDate = ? , ManualID = ? , StateCode = ? , CompanyCode = ? ,
						PolicyTypeCode = ? , Underwriter = ? , ApplicantFirst = ? , ApplicantMiddle = ? , ApplicantLast = ? , ApplicantSuffix = ? , ApplicantAddress1 = ? ,
						ApplicantAddress2 = ? , ApplicantCity = ? , ApplicantState = ? , ApplicantZip = ? , ApplicantZip4 = ? , ApplicantHomePhone = ? ,
						ApplicantWorkPhone = ? , ApplicantEmail = ? , ProgramCode = ? , DateUpdated = GETDATE(), UWStatusDate = GETDATE() where QuoteNumber = ? 

21:Save Quote Data sqlparameters: {WDDX Packet},A,C,10100,2023-04-09,2040,9,81,DP3,,KEITH,ANN,LEBLANC,JR,1837 W 19TH ST,,JACKSONVILLE,FL,32209,,717-765-5091,,john.hughes@cornerops.com,,3106516

21:Save Quote Data recordcount: 1

21:Save Quote Data ExecutionTime: 8
							
							
								struct

ACCESSNUMBER: 2
AUTHTOKEN: a82741540573558027i15151613s3902970422694160i54330
BARRIERISLAND_1: N
BCEGS_1: 4
BUILDINGUNITS_1: 1
COMPANYCODE: 81
CONSTRUCTIONTYPE_1: V
CONSTRUCTIONYEAR_1: 2015
CURRENTPAGE: 700
CURRENTPROGRESSPAGE: 700
CURRENTURL: https://cypresstest.cogisi.com/is/root/index.cfm
DISTANCEFIREHYDRANT_1: LT1000
DISTANCEFIRESTATION_1: 1
DWELLINGTYPE_1: DWELLING
EFFECTIVEDATE: 04/09/2023
EFFECTIVEDATEMAXIMUM: 12/29/2025
EFFECTIVEDATEMINIMUM: 01/16/2015
EXTERIORWALLCOVER_1: CONCRETEBLOCK
FAMILYUNITSROW_1: 1
FIELDNAMES: AUTHTOKEN,CURRENTPAGE,LASTPAGE,CURRENTPROGRESSPAGE,CURRENTURL,ACCESSNUMBER,USERTYPE,INITIALEFFECTIVEDATE,EFFECTIVEDATEMINIMUM,EFFECTIVEDATEMAXIMUM,EFFECTIVEDATE,UWQUOTECODE,POLICYTYPECODE,COMPANYCODE,ISQUICKQUOTE,TERRITORYCODE_1,CONSTRUCTIONTYPE_1,CONSTRUCTIONYEAR_1,OCCUPANCY_1,NUMBERFAMILIES_1,ROWHOUSE_1,NOSAVEROWHOUSE_1,DWELLINGTYPE_1,BUILDINGUNITS_1,FAMILYUNITSROW_1,HEATTYPE1_1,SQUAREFOOTAGE_1,PURCHASEPRICE_1,NUMROOMS_1,NUMSTORIES_1,BCEGS_1,WINDPOOL_1,NEARSINKHOLE_1,NOSAVENEARSINKHOLE_1,ROOFLAYERS_1,EXTERIORWALLCOVER_1,ROOFCONSTRUCTIONYEAR_1,ROOFCONSTRUCTION_1,ROOFCONDITION_1,FOUNDATION_1,FOUNDATIONTYPE_1,MARKETVALUE_1,RESPONDINGFIRESTATION_1,FIRECODE_1,INTERNALPROTECTIONCLASS_1,DISTANCEFIRESTATION_1,DISTANCEFIREHYDRANT_1,PLANNEDSUBDIVISION_1,NOSAVEPLANNEDSUBDIVISION_1,SUBDIVISION_1,BARRIERISLAND_1,NOSAVEBARRIERISLAND_1,WINDMITPREMIUM_1,WMWATERRESISTANCE_1,WMROOFCOVERING_1,ROOFDECKATTACH_1,WMROOFANCHORAGE_1,WBDR_1,WMROOFGEOMETRY_1,WMWINDOWPROTECTION_1,IBHS_1,TERRAIN_1,WINDSPEED_1,LASTELECTRICALUPDATE_1,LASTROOFUPDATE_1,LASTPLUMBINGUPDATE_1,LASTHEATINGUPDATE_1
FIRECODE_1: [empty string]
FOUNDATIONTYPE_1: BASEMENT
FOUNDATION_1: CLOSED
HEATTYPE1_1: OIL
IBHS_1: PARTIAL
INITIALEFFECTIVEDATE: 04/09/2023
INTERNALPROTECTIONCLASS_1: 1
ISQUICKQUOTE: N
LASTELECTRICALUPDATE_1: 2018
LASTHEATINGUPDATE_1: 2021
LASTPAGE: 600
LASTPLUMBINGUPDATE_1: 2020
LASTROOFUPDATE_1: 2019
MARKETVALUE_1: 300000
NEARSINKHOLE_1: N
NOSAVEBARRIERISLAND_1: N
NOSAVENEARSINKHOLE_1: N
NOSAVEPLANNEDSUBDIVISION_1: N
NOSAVEROWHOUSE_1: N
NUMBERFAMILIES_1: 2
NUMROOMS_1: 11
NUMSTORIES_1: 1
OCCUPANCY_1: TENANT
PLANNEDSUBDIVISION_1: N
POLICYTYPECODE: DP3
PURCHASEPRICE_1: 305080
RESPONDINGFIRESTATION_1: JACKSONVILLE
ROOFCONDITION_1: ABOVEAVERAGE
ROOFCONSTRUCTIONYEAR_1: 2015
ROOFCONSTRUCTION_1: 3TAB
ROOFDECKATTACH_1: NA
ROOFLAYERS_1: 1
ROWHOUSE_1: N
SQUAREFOOTAGE_1: 2546
SUBDIVISION_1: [empty string]
TERRAIN_1: B
TERRITORYCODE_1: 39
USERTYPE: internal
UWQUOTECODE: A
WBDR_1: N
WINDMITPREMIUM_1: 15000
WINDPOOL_1: N
WINDSPEED_1: 110
WMROOFANCHORAGE_1: CLIPS
WMROOFCOVERING_1: FBC
WMROOFGEOMETRY_1: NA
WMWATERRESISTANCE_1: N
WMWINDOWPROTECTION_1: HURRICANE
 
							
							
								
									struct [empty]

 
								
							
								
									[cfc1] component is.application.includes.class_Auth

PRIMARYKEY: 3106516 
IPADDRESS: 98.237.120.185 
SECONDARYKEY: [empty string] 
VIEWID: 2 
DATAPACKET: 31065162internal0TopMenuOneSectionISiAppa82741540573558027i15151613s3902970422694160i543302040QuoteJHUGHESN60yes04/04/2023 03:18:18PM 
USERTYPE: internal 
VERIFIED: true 
USERLOGINID: 0 
LAYOUTNAME: TopMenuOneSection 
AUTHPURPOSE: ISiApp 
CHANGED: false 
AUTHTOKEN: a82741540573558027i15151613s3902970422694160i54330 
MANUALID: 2040 
WDDXEXTENSIONID: [empty string] 
DATATYPE: Quote 
USERLOGINNAME: JHUGHES 
PAGEID: [empty string] 
FREEMENUNAV: N 
Methods: 
	GETAGENTPROFILEITEM
		[function]
		Arguments: 
			Name: profileItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETPROFILEITEM
		[function]
		Arguments: 
			Name: profileItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETUSERDETAILS
		[function]
		Arguments: 
			Name: UserLoginID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: UserLoginName 
			Required: Required 
			Type: string 
			default: 
		ReturnType: struct 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: UseDefaultOnBlank 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INIT
		[function]
		Arguments: 
			Name: Purpose 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: auth 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	NEWTOKEN
		[function]
		Arguments: none 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	REFRESHDATAPACKET
		[function]
		Arguments: 
			Name: XMLNodeArray 
			Required: Required 
			Type: array 
			default: 
		ReturnType: array 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVE
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATEUSERLOG
		[function]
		Arguments: 
			Name: Process 
			Required: Required 
			Type: string 
			default: 
		 
			Name: ProcessInfo 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	VERIFY
		[function]
		Arguments: 
			Name: token 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	VERIFYSUPPORTINGTOKEN
		[function]
		Arguments: 
			Name: tokenType 
			Required: Required 
			Type: string 
			default: 
		 
			Name: token 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
								
							
								
									[cfc1] component is.application.includes.class_Quote

FIELDSTOTRACKISCHANGED: [empty string] 
WDDXTABLE: DECPAGES 
RATEFLOW: Yes 
COMPANYCODE: 81 
STATUS: Loaded 
WARNUSERONEFFDTCHANGE: No 
AGENTCODE: 10100 
PRIMARYKEY: 3106516 
NUMBEROFAPPLICANTS: 1 
EFFDTCHANGED: false 
POLICYTYPECODE: DP3 
AGENTBACKAPP: No 
FIELDNAMEBLACKLIST: NONE,FIELDNAMES,CurrentUrl,AuthToken,PrimaryKey,SecondaryKey,OVERRIDEMANUALID,OVERRIDEMENUNAVIGATION,OVERRIDEUSERTYPE,OVERRIDEVIEWID,sAuthToken,sAuthTokenType,ErrorMessage,ErrorFieldName,APPRESTART,JSResize,EMAILBODY,EMAILSUBJECT,ParentID,ParentText,TargetManual 
APPLICANTLIST: 1:KEITH ANN LEBLANC JR 
FIELDSFORREASSIGNDRIVER: DriverFlagzzzz,ExcludedDriverzzzz,ApplicantBirthDatezzzz,ApplicantMaritalStatuszzzz,ApplicantSexzzzz,LicenseDatezzzz,DriverYearsLicensedzzzz,LicenseStatuszzzz,LicenseStatezzzz,DriverDefensivezzzz,DefensiveDrivingDatezzzz,DriverYouthTrainingzzzz,DriverMVDIzzzz,DriverUSCitizenzzzz,DriverOOSzzzz,DriverAgezzzz,ApplicantRelationshipzzzz,PercentUsezzzz,LicenseTypezzzz,AVDatezzzz,AVTypeCodezzzz,Ignore_,CompDed_,CollDED_,PrimaryDriver_,RatedDriver_,VehicleVin_,VehicleUse_ 
RATEEFFECTIVEDATE: 1/1/2022 
QUOTENUMBER: 3106516 
DATATYPE: Quote 
APPLICANTNAME: KEITH ANN LEBLANC JR 
UWSTATUSCODE: C 
MANUALID: 2040 
MAXINSUREDID: 0 
CHANGED: true 
UWQUOTECODE: A 
RELATEDQUOTES: 
	[array] 
MIDTERMCHANGEMODE: No 
WDDXPURPOSECODE: NONE 
READONLY: false 
STATECODE: 9 
READONLYMESSAGE: [empty string] 
MAXRISKID: 0 
RELATEDQUOTEUPDATEBLACKLIST: NONE,VIEW,START,PAGE,NEXTPAGE,SEARCHVALUE,ISPUBLICQUOTE,SCROLLTO,RATINGERRORS,BILLCONTROL,CHARGEFEELIST,USECHARGEFEELIST,TAXLIST,FILINGFEES,FOCUSOBJECT,EXCELQUOTE,WORDQUOTE,EMAILQUOTE,PolicyID,ADDPREVIOUSITEM,ADDPREVIOUSITEMNUM,AddPreviousDetailNum,QUOTENUMBER,QCODE,UWSTATUSCODE,UWSTATUSDATE,HASCHANGED,NEEDTORATE,MANUALID,STATECODE,RATELOOP,RATEEFFECTIVEFIELD,RATEEFFECTIVEDATE,RATEEFFECTIVEENDDATE,ManualEffectiveDate,PolicyTypeCode,POLICYTYPELIST,ISCOMPANYRATED,INITIALEFFECTIVEDATE,INITIALCOMPANYCODE,NUMBEROFAPPLICANTS,NUMBEROFRISKS,RISKTODELETE,RISKTOREPLACE,EFFECTIVEDATE,EXPIRATIONDATE,TRANSEFFECTIVEDATE,TransEffectiveDateMinimum,TransEffectiveDateMaximum,EffectiveDateMinimum,EffectiveDateMaximum,QuoteList,EndorseList,UWQuoteCode,GetDetails,AddDetails,DeleteDetails,StartDetailsView,AccessNumber,APPLICANTTODELETE,CopyRiskRating,PrimaryDriver,ValidationSeverityLevel,EffectiveTime,SensitiveDataFields,FILEUPLOAD_TABLE,ADDITIONALINTERESTS,SCHEDULEDPROPERTY,AVCount 
POLICYMODE: false 
LOADED: true 
NUMBEROFRISKS: 1 
QUOTELAUNCHEFFECTIVEDATE: [empty string] 
WDDXEXTENSIONID: [empty string] 
LOADRELATEDQUOTES: true 
CURRENTDETAILFIELD: [empty string] 
Methods: 
	BRIDGE
		[function]
		Arguments: 
			Name: BridgeAction 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKBILLPOLICYFIELDS
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKBINDINGAUTHORITYOPT
		[function]
		Arguments: 
			Name: HideFrom 
			Required: Required 
			Type: string 
			default: 
		 
			Name: Authority 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKHIDEFROMUSER
		[function]
		Arguments: 
			Name: HideCode 
			Required: Required 
			Type: string 
			default: 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	CHECKREASSIGNDRIVERS
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETEAPPLICANT
		[function]
		Arguments: 
			Name: ApplicantToDelete 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETEDETAIL
		[function]
		Arguments: 
			Name: DetailItem 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DetailSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: QuestionNumber 
			Required: Required 
			Type: string 
			default: 
		 
			Name: SectionID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: FieldName 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DELETERISK
		[function]
		Arguments: 
			Name: RiskToDelete 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bDecrementCounter 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	DETERMINEREADONLY
		[function]
		Arguments: 
			Name: CurrentRatingStatusCode 
			Required: Optional 
			Type: string 
			default: X
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GENERATENEWQUOTE
		[function]
		Arguments: none 
		ReturnType: boolean 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETDISPLAYRISKLIST
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETFEE
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: FeeName 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETIDNUMBER
		[function]
		Arguments: 
			Name: ID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: type 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DetailType 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: PrimaryField 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: PrimaryFieldID 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETINSUREDS
		[function]
		Arguments: 
			Name: bIncludeExcluded 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: query 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETKEYS
		[function]
		Arguments: none 
		ReturnType: array 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETMANUALRECORD
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETMANUALSTATUSCODES
		[function]
		Arguments: none 
		ReturnType: Any 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETPRIMARYFIELD
		[function]
		Arguments: 
			Name: keyName 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETRISKDESCRIPTIONLIST
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETRISKSTORATELIST
		[function]
		Arguments: none 
		ReturnType: Any 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETSPECIFICWEBAPPRATINGRESULTSPREMIUM
		[function]
		Arguments: 
			Name: FieldName 
			Required: Optional 
			Type: Any 
			default: 
		 
			Name: type 
			Required: Optional 
			Type: Any 
			default: 
		 
			Name: tempSuffix 
			Required: Optional 
			Type: Any 
			default: 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: defaultValue 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: UseDefaultOnBlank 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	GETWEBAPPRATINGRESULTSPREMIUM
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INIT
		[function]
		Arguments: none 
		ReturnType: quote 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	INITIALIZEADDITIONALQUOTES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	ISCHANGEDELIMS
		[function]
		Arguments: 
			Name: value 
			Required: Required 
			Type: string 
			default: 
		 
			Name: delim 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADAPPLICANTLIST
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADCLIENTCODE
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADDATA
		[function]
		Arguments: 
			Name: PrimaryKey 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	LOADSUPPLIMENT
		[function]
		Arguments: 
			Name: inPurposeCode 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	MAPIDNUMBER
		[function]
		Arguments: 
			Name: ID 
			Required: Required 
			Type: string 
			default: 
		 
			Name: type 
			Required: Required 
			Type: string 
			default: 
		 
			Name: relatedID 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: DetailFieldName 
			Required: Optional 
			Type: string 
			default: [empty string]
		 
			Name: RelatedType 
			Required: Optional 
			Type: string 
			default: [empty string]
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	POSTSAVEFORMDATA
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	RETURNWDDX
		[function]
		Arguments: none 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVE
		[function]
		Arguments: 
			Name: bSetRatingStatus 
			Required: Optional 
			Type: string 
			default: false
		 
			Name: bIgnoreReadOnly 
			Required: Optional 
			Type: boolean 
			default: false
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SAVERELATEDQUOTES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETEFFECTIVEDATES
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SETVALUE
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		 
			Name: bPushThoughChanges 
			Required: Optional 
			Type: boolean 
			default: true
		 
			Name: DoAdditionalProcessing 
			Required: Optional 
			Type: boolean 
			default: true
		ReturnType: void 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SHOWADDRESS
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		 
			Name: DataPrefix 
			Required: Optional 
			Type: string 
			default: Applicant
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	SHOWPREMIUM
		[function]
		Arguments: 
			Name: DataSuffix 
			Required: Required 
			Type: string 
			default: 
		ReturnType: string 
		Roles:  
		Access: public 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATENUMBEROF
		[function]
		Arguments: none 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
	UPDATERELATEDQUOTES
		[function]
		Arguments: 
			Name: keyname 
			Required: Required 
			Type: string 
			default: 
		 
			Name: keyvalue 
			Required: Required 
			Type: string 
			default: 
		ReturnType: void 
		Roles:  
		Access: private 
		Output:   
		DisplayName:  
		Hint:  
		Description:  
 
								
								
									
		
			
			
				Key Name
				Value
			
			
			
				
					
						_1
						N
					
				
					
						ACCESSNUMBER
						2
					
				
					
						ADDRESSCHANGED
						N
					
				
					
						ADDRESSCHANGED_1
						N
					
				
					
						AGENTADDRESS
						15 MAIN ST Suite 101, HOUSTON, TX 77002 1111
					
				
					
						AGENTCANWRITE12099
						Y
					
				
					
						AGENTCANWRITECENTRALFL
						Y
					
				
					
						AGENTCANWRITESWFL
						Y
					
				
					
						AGENTCODE
						10100
					
				
					
						AGENTDATALOADED
						10100
					
				
					
						AGENTDATELOADED
						04/04/2023
					
				
					
						AGENTENOTIFYADDRESS
						test.agency@cornerops.com
					
				
					
						AGENTHASACHSETUP
						no
					
				
					
						AGENTINFO
						TEST AGENCY - 10100
					
				
					
						AGENTMVRCHARGEFLAG
						N
					
				
					
						ALTERNATEREPORTPROTECTIONCLASS_1
						10W/10
					
				
					
						ALTERNATEREPORTPROTECTIONCLASS_1_1
						10W/10
					
				
					
						APPLICANTADDRESS1
						1837 W 19TH ST
					
				
					
						APPLICANTADDRESS1_1
						1837 W 19TH ST
					
				
					
						APPLICANTADDRESSTYPE
						domestic
					
				
					
						APPLICANTADDRESSTYPE_1
						domestic
					
				
					
						APPLICANTAGEZZZZ1
						43
					
				
					
						APPLICANTBIRTHDATEZZZZ1
						02/02/1980
					
				
					
						APPLICANTCITY
						JACKSONVILLE
					
				
					
						APPLICANTCITY_1
						JACKSONVILLE
					
				
					
						APPLICANTEMAILZZZZ1
						john.hughes@cornerops.com
					
				
					
						APPLICANTFIRSTZZZZ1
						KEITH
					
				
					
						APPLICANTHOMEPHONEZZZZ1
						717-765-5091
					
				
					
						APPLICANTLASTZZZZ1
						LEBLANC
					
				
					
						APPLICANTMARITALSTATUSZZZZ1
						S
					
				
					
						APPLICANTMIDDLEZZZZ1
						ANN
					
				
					
						APPLICANTNAME
						KEITH ANN LEBLANC JR
					
				
					
						APPLICANTRELATIONSHIPZZZZ1
						SELF
					
				
					
						APPLICANTSTATE
						FL
					
				
					
						APPLICANTSTATE_1
						FL
					
				
					
						APPLICANTSUFFIXZZZZ1
						JR
					
				
					
						APPLICANTZIP
						32209
					
				
					
						APPLICANTZIP_1
						32209
					
				
					
						APPLICATIONFORECLOSURES_1
						N
					
				
					
						APPLIESTOLIST
						O
					
				
					
						AppProtectionClass_1
						1
					
				
					
						AppReportProtectionClass_1
						
					
				
					
						AreaID
						3
					
				
					
						ARSONCONVICTION_1
						N
					
				
					
						AUTOLATLONGINDICATORLAT
						L
					
				
					
						AUTOUNDERWRITING
						0
					
				
					
						BARRIERISLAND_1
						N
					
				
					
						BCEGS_1
						4
					
				
					
						BCEGS_1_1
						06
					
				
					
						BCEGS_2_1
						03
					
				
					
						BCEGS_3_1
						04
					
				
					
						BCEGS_4_1
						04
					
				
					
						BCEGSYEAR_1
						2012
					
				
					
						BCEGSYEAR_1_1
						1996
					
				
					
						BCEGSYEAR_2_1
						2001
					
				
					
						BCEGSYEAR_3_1
						2008
					
				
					
						BCEGSYEAR_4_1
						2012
					
				
					
						BILLCONTROL
						819DP304/09/2023AApp_A
					
				
					
						BOBCARRIERNAME
						GEICO
					
				
					
						BOBDISCEXPDATE
						03/22/2024
					
				
					
						BOBDISCEXPDAYS_1
						348
					
				
					
						BOBDISCOUNT
						Y
					
				
					
						BOBDISCSTARTDATE
						03/22/2023
					
				
					
						BOBDISCSTARTDAYS_1
						18
					
				
					
						BOBTRANSFER_1
						N
					
				
					
						BUILDERONLY
						N
					
				
					
						BUILDINGUNITS_1
						1
					
				
					
						BURGLARALARMCREDIT_1
						CENTRAL
					
				
					
						CANAGENTBIND
						N
					
				
					
						CANENTERPAYMENTS
						no
					
				
					
						CANWRITECENTRALFL
						Y
					
				
					
						CANWRITEPALMBEACH
						Y
					
				
					
						CANWRITESWFL
						Y
					
				
					
						CCHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						CENSUSBLOCKID_1
						120310029014008
					
				
					
						CHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						CITY
						Jacksonville
					
				
					
						CITY_1
						Jacksonville
					
				
					
						COMPANYCODE
						81
					
				
					
						CONSTRUCTIONTYPE_1
						V
					
				
					
						CONSTRUCTIONYEAR_1
						2015
					
				
					
						CONTENTSLIMIT_1
						25000
					
				
					
						COUNTRYNAME
						US
					
				
					
						COUNTRYNAME_1
						US
					
				
					
						COUNTYCODE_1
						12031
					
				
					
						COUNTYCODE_1_1
						12031
					
				
					
						COUNTYFIPSCODE_1
						12031
					
				
					
						COUNTYFIPSCODE_1_1
						12031
					
				
					
						COUNTYNAME_1
						DUVAL
					
				
					
						COUNTYNAME_1_1
						DUVAL
					
				
					
						COVEREDPORCH_1
						N
					
				
					
						CURRENTDETAILFIELD
						OptionalCoverages_1
					
				
					
						CURRENTPAGE
						700
					
				
					
						CURRENTPROGRESSPAGE
						700
					
				
					
						CYPRESSCONVERSION
						N
					
				
					
						DECTAXLIST
						
					
				
					
						DEDUCTIBLE_1
						5000
					
				
					
						DEFAULTEDTOZIPINDICATORLAT
						N
					
				
					
						DEPBILLCONTROL
						819DP304/09/2023AApp_A
					
				
					
						DEPOSITDATE
						04/04/2023
					
				
					
						DEPOSITUNVERIFIED
						Y
					
				
					
						DISTANCEFIREHYDRANT_1
						LT1000
					
				
					
						DISTANCEFIRESTATION_1
						1
					
				
					
						DISTANCEFIRESTATION_1_1
						01
					
				
					
						DTAC_1
						17.1114
					
				
					
						DUEDATE
						
					
				
					
						DwellingAge_1
						8
					
				
					
						DWELLINGLIMIT_1
						300000.00
					
				
					
						DWELLINGTYPE_1
						DWELLING
					
				
					
						EFFECTIVEDATE
						04/09/2023
					
				
					
						EFFECTIVEDATEMAXIMUM
						12/29/2025
					
				
					
						EFFECTIVEDATEMINIMUM
						01/16/2015
					
				
					
						EFFECTIVEDATESET
						04/04/2023
					
				
					
						EFFECTIVEDATEUSERLOGINNAME
						JHUGHES
					
				
					
						EFFECTIVEDATEUSERTYPE
						internal
					
				
					
						EXOTICPETS_1
						N
					
				
					
						EXTERIORWALLCOVER_1
						CONCRETEBLOCK
					
				
					
						FAIRRENTALADDTLLIVINGLIMIT_1
						20
					
				
					
						FAMILYUNITSROW_1
						1
					
				
					
						FARMORRANCH_1
						N
					
				
					
						FEELOOKUPPROCESS
						App_A
					
				
					
						FIREALARMCREDIT_1
						CENTRAL
					
				
					
						FIREPROTECTIONAREA_1
						JACKSONVILLE
					
				
					
						FIREPROTECTIONAREA_1_1
						JACKSONVILLE
					
				
					
						FIRESTATIONDISTANCEBAND_1
						01
					
				
					
						FIRESTATIONDISTANCEBAND_1_1
						01
					
				
					
						FIRESTATIONDISTANCERANGE_1
						1 MILE OR LESS
					
				
					
						FIRESTATIONDISTANCERANGE_1_1
						1 MILE OR LESS
					
				
					
						FLOODCARRIER_1
						FREE WATER
					
				
					
						FLOODPOLICYNUM_1
						651561651651
					
				
					
						FLOODZONE_1
						A
					
				
					
						FOUNDATION_1
						CLOSED
					
				
					
						FOUNDATIONTYPE_1
						BASEMENT
					
				
					
						GMBLOCK
						4008
					
				
					
						GMBLOCK_1
						4008
					
				
					
						GMBLOCKGROUP
						0
					
				
					
						GMBLOCKGROUP_1
						0
					
				
					
						GMCOUNTY
						031
					
				
					
						GMCOUNTY_1
						031
					
				
					
						GMFIPS_1
						120310029014008
					
				
					
						GMGEOCODEFORMSUBMITALERT_1
						No
					
				
					
						GMGEOCODERESULTID_1
						12962548
					
				
					
						GMLATITUDE
						30.355421
					
				
					
						GMLATITUDE_1
						30.355421
					
				
					
						GMLONGITUDE
						-81.687349
					
				
					
						GMLONGITUDE_1
						-81.687349
					
				
					
						GMMATCHEDADDRESS
						1837 19th St, Jacksonville, FL, 32209
					
				
					
						GMMATCHEDADDRESS_1
						1837 19th St, Jacksonville, FL, 32209
					
				
					
						GMSTATE
						12
					
				
					
						GMSTATE_1
						12
					
				
					
						GMTRACT
						002901
					
				
					
						GMTRACT_1
						002901
					
				
					
						GMUSCBGEOCODINGCOMPLETED_1
						Yes
					
				
					
						GMUSPSVERIFICATIONSUCCESSFUL_1
						Yes
					
				
					
						GQRECVEHICLES_1
						N
					
				
					
						GQRENOVATION_1
						N
					
				
					
						HEATTYPE1_1
						OIL
					
				
					
						HOMELATITUDE_1
						30.355421
					
				
					
						HOMELONGITUDE_1
						-81.687349
					
				
					
						HTMLTEXTAGENTCODE
						DBA TEST AGENCY
					
				
					
						HTMLTEXTAGENTCODEEMAIL
						test.agency@cornerops.com
					
				
					
						HTMLTEXTSUBAGENTCODE
						JOHN HUGHES 564873
					
				
					
						IBHS_1
						PARTIAL
					
				
					
						INITIALEFFECTIVEDATE
						04/09/2023
					
				
					
						INITIALRATEEFFECTIVEDATE
						01/01/2022
					
				
					
						INTERFACEVERSION
						UA
					
				
					
						InternalProtectionClass_1
						1
					
				
					
						ISOProtectionClass_1
						1
					
				
					
						ISQUICKQUOTE
						N
					
				
					
						LASTELECTRICALUPDATE_1
						2018
					
				
					
						LASTHEATINGUPDATE_1
						2021
					
				
					
						LASTPAGE
						600
					
				
					
						LASTPLUMBINGUPDATE_1
						2020
					
				
					
						LASTROOFUPDATE_1
						2019
					
				
					
						LIMITEDWATERDMG_1
						N
					
				
					
						LIVESTOCK_1
						N
					
				
					
						LoadRisk
						1
					
				
					
						LOCATIONZIP_1
						32209
					
				
					
						MandatoryFungi_1
						Y
					
				
					
						MandatoryOrdLaw_1
						Y
					
				
					
						MANUALEFFECTIVEDATE
						01/01/2022
					
				
					
						MANUALID
						2040
					
				
					
						MANUALRENEWALDATE
						01/01/2022
					
				
					
						MARKETVALUE_1
						300000
					
				
					
						MATCHTYPE_1
						A
					
				
					
						MAXPAYMENTAMOUNT
						859
					
				
					
						MEDICALLIMIT_1
						5000
					
				
					
						MIDTERMCHANGEMODE
						No
					
				
					
						MinPremAdj
						N
					
				
					
						MoldFungiLimit_1
						10000
					
				
					
						NAMEDINSUREDFLAGZZZZ1
						Y
					
				
					
						NEARSINKHOLE_1
						N
					
				
					
						NEEDTORATE
						1
					
				
					
						NEXTPAGE
						99
					
				
					
						NOTIFYAGENTFLAG
						Y
					
				
					
						NUMBERFAMILIES_1
						2
					
				
					
						NUMBEROFACRES_1
						N
					
				
					
						NUMBEROFAPPLICANTS
						1
					
				
					
						NUMBEROFRISKS
						1
					
				
					
						NUMROOMS_1
						11
					
				
					
						NUMSTORIES_1
						1
					
				
					
						OCCUPANCY_1
						TENANT
					
				
					
						OCCUPATIONTYPEZZZZ1
						EMPLOYED
					
				
					
						OCCUPIEDDAYCARE_1
						N
					
				
					
						OnLastPage
						N
					
				
					
						OPENWATEREXPOSURE_1
						N
					
				
					
						OPTIONALCOVERAGES_1
						0
					
				
					
						OrdinanceLaw_1
						10
					
				
					
						OTHERSTRUCTURESAMOUNT_1
						2
					
				
					
						OtherStructuresLimit_1
						6000
					
				
					
						OWNERCODE
						O
					
				
					
						PAGEHISTORY
						100,101,200,400,500,600,700
					
				
					
						PageID
						200
					
				
					
						PAPERLESS
						Y
					
				
					
						PASSEDCAPACITYRULES
						Y
					
				
					
						PAYMENTAMOUNTLIST
						
					
				
					
						PAYMENTDATELIST
						
					
				
					
						PERSONALLIABILITYLIMIT_1
						100000
					
				
					
						PIFREQUIREDDEPOSITAMOUNT
						
					
				
					
						PLANNEDSUBDIVISION_1
						N
					
				
					
						POLICYHASACHSET
						N
					
				
					
						POLICYHASRCCSET
						N
					
				
					
						PolicyNumberPartList
						IFD,FLPOLICYNO:7,-00
					
				
					
						POLICYTERM
						12
					
				
					
						POLICYTYPECODE
						DP3
					
				
					
						POLICYTYPELIST
						&quot; , &quot;'&quot; , &quot;DP3&quot; , &quot;'&quot; , &quot;
					
				
					
						PREDIRECTION
						W
					
				
					
						PREDIRECTION_1
						W
					
				
					
						PREVIOUSADDRESS1
						850 Queen St
					
				
					
						PREVIOUSADDRESSTYPE
						domestic
					
				
					
						PREVIOUSCITY
						Harrisburg
					
				
					
						PREVIOUSSTATE
						PA
					
				
					
						PREVIOUSZIP
						17113
					
				
					
						PRIORCARRIER_1
						TRAVELERS
					
				
					
						PRIOREXPDAYS_1
						-21
					
				
					
						PRIOREXPIRATIONDATE_1
						04/30/2023
					
				
					
						PRIORINSURANCE_1
						Y
					
				
					
						PRIORPOLICYNUMBER_1
						2313564897
					
				
					
						ProtectionClass_1
						1
					
				
					
						ProtectionClassList_1
						1
					
				
					
						ProtectionSubscription_1
						
					
				
					
						PURCHASEDATE_1
						09/03/2018
					
				
					
						PURCHASEDAYS_1
						1679
					
				
					
						PURCHASEPRICE_1
						305080
					
				
					
						QUOTENUMBER
						3106516
					
				
					
						RATEEFFECTIVEDATE
						1/1/2022
					
				
					
						RATEEFFECTIVEFIELD
						ManualStart
					
				
					
						RatingCount
						1
					
				
					
						REASSIGNDRIVERS
						Y
					
				
					
						RENTEDLT5DAYS_1
						N
					
				
					
						RENTEDSTUDENT_1
						N
					
				
					
						REPORTPROTECTIONCLASS_1
						1
					
				
					
						REPORTPROTECTIONCLASS_1_1
						1
					
				
					
						REQUIREDDEPOSITAMOUNT
						27
					
				
					
						REQUIREDDEPOSITCODE
						
					
				
					
						RESPONDINGFIRESTATION_1
						JACKSONVILLE
					
				
					
						RESPONDINGFIRESTATION_1_1
						JACKSONVILLE
					
				
					
						RESULTCOUNTAIRHAZARD
						1
					
				
					
						ResultCountBCEGS_1
						4
					
				
					
						RESULTCOUNTCENSUS
						1
					
				
					
						RESULTCOUNTCUSTOM
						1
					
				
					
						RESULTCOUNTLAT
						1
					
				
					
						ResultCountPPC_1
						1
					
				
					
						RESULTCOUNTSINKHOLE
						1
					
				
					
						RESULTCOUNTWINDPOOL
						1
					
				
					
						ReturnSourceBCEGS_1
						ADDRESS
					
				
					
						RETURNSOURCECENSUS
						ADDRESS
					
				
					
						RETURNSOURCECUSTOM
						ADDRESS
					
				
					
						RETURNSOURCELAT
						N/A
					
				
					
						ReturnSourcePPC_1
						ADDRESS
					
				
					
						RETURNSOURCESINKHOLE
						ADDRESS
					
				
					
						RETURNSOURCEWINDPOOL
						ADDRESS
					
				
					
						REVERTFEELIST
						
					
				
					
						RISKAGE_1
						8
					
				
					
						ROOFCONDITION_1
						ABOVEAVERAGE
					
				
					
						ROOFCONSTRUCTION_1
						3TAB
					
				
					
						ROOFCONSTRUCTIONYEAR_1
						2015
					
				
					
						ROOFDECKATTACH_1
						NA
					
				
					
						ROOFLAYERS_1
						1
					
				
					
						ROWHOUSE_1
						N
					
				
					
						SECUREDBUILDINGCREDIT_1
						SINGLEENTRY
					
				
					
						SeniorRetiree_1
						N
					
				
					
						SERVICEFEE
						0
					
				
					
						SINKHOLEAREASCORE_1
						2
					
				
					
						SINKHOLEDEDUCTIBLE_1
						10
					
				
					
						SINKHOLELIMIT_1
						N
					
				
					
						SINKHOLEPLACEMENTTYPE_1
						E
					
				
					
						SINKHOLERISKSCORE_1
						4
					
				
					
						SPRINKLER_1
						PARTIAL
					
				
					
						SQUAREFOOTAGE_1
						2546
					
				
					
						STATECODE
						9
					
				
					
						STATECODE_1
						FL
					
				
					
						STREETNAME
						19th
					
				
					
						STREETNAME_1
						19th
					
				
					
						STREETNUMBER
						1837
					
				
					
						STREETNUMBER_1
						1837
					
				
					
						STREETTYPE
						St
					
				
					
						STREETTYPE_1
						St
					
				
					
						SUBAGENTCODE
						10100_JHUGHES
					
				
					
						SWIMMINGPOOL_1
						N
					
				
					
						TAXLIST
						
					
				
					
						TERRAIN_1
						B
					
				
					
						TERRITORYCODE_1
						39
					
				
					
						TOTALPREMIUM
						832
					
				
					
						TRAMPOLINE_1
						N
					
				
					
						UNREPAIREDDAMAGE_1
						N
					
				
					
						USECHARGEFEELIST
						EMPA;Emergency Management Trust Fund Surcharge;2,MGA;MGA Fee;25
					
				
					
						USERTYPE
						internal
					
				
					
						USPSCOMPLETEADDRESS-APPLICANT
						1837 W 19TH ST, JACKSONVILLE, FL, 32209
					
				
					
						USPSCOMPLETEADDRESS-APPLICANT_1
						1837 W 19TH ST, JACKSONVILLE, FL, 32209
					
				
					
						USPSCOMPLETEADDRESS-PREVIOUS
						850 Queen St, Harrisburg, PA 17113
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-APPLICANT
						0
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-APPLICANT_1
						0
					
				
					
						USPSCOMPLETEADDRESSCHECKEDONCE-PREVIOUS
						1
					
				
					
						UWQUOTECODE
						A
					
				
					
						UWSTATUSCODE
						C
					
				
					
						VALIDBILLING
						true
					
				
					
						VALIDRATING
						true
					
				
					
						VERINTGADDRESSCHANGED_1
						N
					
				
					
						VERINTGApplicantAddress1_1
						1837 W 19TH ST
					
				
					
						VERINTGApplicantAddress2_1
						
					
				
					
						VERINTGApplicantCity_1
						JACKSONVILLE
					
				
					
						VERINTGApplicantState_1
						FL
					
				
					
						VERINTGApplicantZip_1
						32209
					
				
					
						VERINTGCITY_1
						Jacksonville
					
				
					
						VERINTGCOUNTRYNAME_1
						US
					
				
					
						VERINTGErrorCode_1
						OK
					
				
					
						VERINTGErrorMessage_1
						OK
					
				
					
						VERINTGHitFlag_1
						Y
					
				
					
						VERINTGNumberReorders_1
						1
					
				
					
						VERINTGOrderDate_1
						4/4/2023
					
				
					
						VERINTGOrderMessage_1
						 UWOrderRules - 
					
				
					
						VERINTGOrderReason_1
						2
					
				
					
						VERINTGPREDIRECTION_1
						W
					
				
					
						VERINTGRECORDCOUNTBCEGS_1
						4
					
				
					
						VERINTGRECORDCOUNTPPC_1
						1
					
				
					
						VERINTGReferenceNumber_1
						d468ad2e-54b0-4df9-b780-bfc750b2a1d6
					
				
					
						VERINTGReportStatus
						
					
				
					
						VERINTGReportStatusDate
						
					
				
					
						VERINTGReportStatusMessage
						
					
				
					
						VERINTGResultID_1
						20276226
					
				
					
						VERINTGRETURNSOURCEBCEGS_1
						ADDRESS
					
				
					
						VERINTGRETURNSOURCEPPC_1
						ADDRESS
					
				
					
						VERINTGSTATECODE_1
						FL
					
				
					
						VERINTGStopErrorCode
						
					
				
					
						VERINTGStopErrorMessage
						
					
				
					
						VERINTGSTREETNAME_1
						19th
					
				
					
						VERINTGSTREETNUMBER_1
						1837
					
				
					
						VERINTGSTREETTYPE_1
						St
					
				
					
						VERINTGZIP4CODE_1
						4815
					
				
					
						VERINTGZIPCODE_1
						32209
					
				
					
						VERISKRESULTID
						12962548
					
				
					
						VERISKRESULTID_1
						12962548
					
				
					
						VIEWID
						2
					
				
					
						WBDR_1
						N
					
				
					
						WINDHAILDEDUCTIBLE_1
						5
					
				
					
						WindHailDeductibleAmount_1
						15000
					
				
					
						WINDMITPREMIUM_1
						15000
					
				
					
						WINDPOOL_1
						N
					
				
					
						WINDPOOLINDICATOR_1
						N
					
				
					
						WINDPOOLZONE_1
						-
					
				
					
						WINDSPEED_1
						110
					
				
					
						WLMClass
						NC2
					
				
					
						WMROOFANCHORAGE_1
						CLIPS
					
				
					
						WMROOFCOVERING_1
						FBC
					
				
					
						WMROOFGEOMETRY_1
						NA
					
				
					
						WMWATERRESISTANCE_1
						N
					
				
					
						WMWINDOWPROTECTION_1
						HURRICANE
					
				
					
						ZIP4CODE
						4815
					
				
					
						ZIP4CODE_1
						4815
					
				
					
						ZIPCODE
						32209
					
				
					
						ZIPCODE_1
						32209
					
				
			
		
	
								
							
								
									struct

AdministratorNotificationEmailFromList: [empty string]
AdministratorNotificationEmailList: [empty string]
AdministratorNotificationTestEmailList: [empty string]
AuthorizedIPAddressList: 127.0.0.1,10.211.113.62,10.212.113.62
ClientColorSchema: [empty string]
ClientNumber: 21
ClientVarsDatasource: ClientVarsDB
DecpageEffectiveDateOffsetDays: 0
DefaultHomePage: [empty string]
EbixDataDatasource: EbixdataSQL
ExtraApplicationName: Test
ISArchiveDatasource: ISArchive21TestSQL
ISBackupDatasource: ISBackup
ISCCDataDatasource: ISCCData21TestSQL
ISCLIENTSQRY:  
	[query]
	 
	[Record # 1] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: [empty string] 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: [empty string] 
	CLIENTNAME: Access Home Insurance Company 
	CLIENTNUMBER: 21 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: [empty string] 
	CLIENTZIP: [empty string] 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: [empty string] 
	EBIXFLAG: N 
	IAPATH: accesshome 
	ISITESTURL: https://accesshometest.cogisi.com/is/root/ 
	ISIURL: https://accesshome.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: accesshome 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://accesshome.cogisi.com/ 
	RUNASCLIENT: [empty string] 
	RUNASIS: Y 
	SHORTNAME: Access Home 
	SSLFLAG: Y
	 
	[Record # 2] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: [empty string] 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: [empty string] 
	CLIENTNAME: Cypress Insurance Company 
	CLIENTNUMBER: 20 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: [empty string] 
	CLIENTZIP: [empty string] 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: 84 
	EBIXFLAG: N 
	IAPATH: cypress 
	ISITESTURL: https://cypresstest.cogisi.com/is/root/ 
	ISIURL: https://cypress.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: cypress 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://cypress.cogisi.com/ 
	RUNASCLIENT: 21 
	RUNASIS: Y 
	SHORTNAME: Access Home 
	SSLFLAG: Y
	 
	[Record # 3] 
	CLIENTACTIVE: Y 
	CLIENTADDRESS1: 425 N. Prince St. 
	CLIENTADDRESS2: [empty string] 
	CLIENTCITY: Lancaster 
	CLIENTNAME: Cornerstone 
	CLIENTNUMBER: 18 
	CLIENTPHONE: [empty string] 
	CLIENTSTATE: PA 
	CLIENTZIP: 17603 
	CLIENTZIP4: [empty string] 
	DEFAULTCOMPANYCODE: [empty string] 
	EBIXFLAG: N 
	IAPATH: cornerstone 
	ISITESTURL: https://cornerstonetest.cogisi.com/is/root/ 
	ISIURL: https://cornerstone.cogisi.com/is/root/ 
	ISOVINFLAG: N 
	LOCALPATH: cornerstone 
	MULTISITEENABLED: 1 
	PUBLICSITE: https://cornerstone.cogisi.com/ 
	RUNASCLIENT: [empty string] 
	RUNASIS: Y 
	SHORTNAME: Cornerstone 
	SSLFLAG: Y
ISClientDatasource: ISClient21TestSQL
ISDataDatasource: ISData21TestSQL
ISISERVERLOCALURL: https://cypresstest.cogisi.com/is/
ISISERVERURL: https://cypresstest.cogisi.com/is/
ISRatingDatasource: ISRating21TestSQL
ISStatDatasource: ISStat21TestSQL
ISToolsDatasource: ISTools
ISiLocalURLRoot: https://cypresstest.cogisi.com/is/root/
ISiPublicURLRoot: https://cypresstest.cogisi.com/is/root/
IsLocal: false
IsTestMode: true
LocalIPAddressList: 10.211.113.0,127.0.0.1,::1,10.211.113.62
MobileAppCFCPathRoot: [empty string]
NavigationIconOrderList: [empty string]
PUBLICWEBSERVICEURL: https://cypresstest.cogisi.com/is/
ParameterEncryptionKey: e4xyugq/Z67nR9wPvRJ53g==
PublicHTTPHostName: [empty string]
ReportServerLocalURLRoot: http://cypresstest.cogisi.com/ReportServer/Pages/
ReportServerPublicURLRoot: http://cypresstest.cogisi.com/ReportServer/Pages/
SQLParameters: ;SERVER=10.212.113.64;Provider=SQLNCLI11;
ServerLocalURLRoot: https://cypresstest.cogisi.com/
ServerPublicURLRoot: https://cypresstest.cogisi.com/
ThisServerHostsMultipleClientNumbers: true
UseChoicePointWebserviceInsteadOfDLL: true
UseEncryptWebserviceInsteadOfDLL: true
UseHTTPSLocal: true
UseISClaimsWebserviceInsteadOfDLL: true
UseISConvertToWebInfoWebserviceInsteadOfDLL: true
UseISDataAdjustWebserviceInsteadOfDLL: true
UseISOSearchWebserviceInsteadOfDLL: true
UseISTransferWebserviceISOPropertyInsteadOfDLL: true
UseISTransferWebserviceInsteadOfDLL: true
UseISTransferWebserviceReverseTransferInsteadOfDLL: true
UseISTransferWebserviceTransferMainInsteadOfDLL: true
UseISiEDTWebserviceInsteadOfDLL: true
UseISiThirdPartyWebserviceInsteadOfDLL: true
VINWebServiceStaticToken: c0a1846b-ab76-446e-af2f-6004503f3769
WebserviceCallTimeoutValue: 60
WebserviceLocalURLRoot: https://cypresstest.cogisi.com/is/webservices/
WebservicePublicURLRoot: https://cypresstest.cogisi.com/is/webservices/
dbPassword: cypressSQLPASS_437eYu8i
dbUsername: CypressSQLUser
 
								
							
								
									
            
                
                    
                        Step
                        Rate Number
                        Description
                        Rate Mode
                        Flow Info
                        Value
                        Premium
                    
                
                
                    
                        
                            1
                            20
                            Set Risk Zip
                            GetRiskZip
                             
                            32209
                            $0.00
                        
                    
                        
                            2
                            80
                            Set Endorsement Factor
                            EndorsementFactor
                             
                            1
                            $0.00
                        
                    
                        
                            3
                            90
                            Initialize Adjust Base Factor
                            EndorsementFactor
                             
                            1
                            $0.00
                        
                    
                        
                            4
                            110
                            Calculate age of house
                            Subtract
                              !PolicyYear=2023, ConstructionYear=2015
                            8
                            $0.00
                        
                    
                        
                            5
                            120
                            Set Term Count/Tenure
                            SetVariable
                              !TermCount=1
                            1
                            $0.00
                        
                    
                        
                            6
                            150
                            Set DwellingAge in structure
                            AssignField
                              AgeofDwelling=8
                            0
                            $0.00
                        
                    
                        
                            7
                            160
                            Load Agent fields based on ISClientSettings LoadAgentExtFields
                            LoadProfile
                             
                            0
                            $0.00
                        
                    
                        
                            8
                            170
                            Initialize Senior/Retiree Field
                            SetVariable
                              SeniorRetiree
                            
                            $0.00
                        
                    
                        
                            9
                            180
                            Initialize Senior/Retiree Field
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;N&quot; , &quot;'&quot; , &quot;
                            N
                            $0.00
                        
                    
                        
                            10
                            240
                            Assign Senior/Retiree Field
                            AssignField
                              TempSeniorRetiree=N
                            0
                            $0.00
                        
                    
                        
                            11
                            270
                            Initialize MandatoryFungi (used for ManualCoverages)
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;Y&quot; , &quot;'&quot; , &quot;
                            Y
                            $0.00
                        
                    
                        
                            12
                            290
                            Set MandatoryFungi
                            AssignField
                              TempMandatoryFungi=Y
                            0
                            $0.00
                        
                    
                        
                            13
                            300
                            Set MoldFungiLimit
                            AssignField
                              &quot; , &quot;'&quot; , &quot;10000&quot; , &quot;'&quot; , &quot;
                            0
                            $0.00
                        
                    
                        
                            14
                            340
                            Initialize MandatoryOrdLaw (used for ManualCoverages)
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;Y&quot; , &quot;'&quot; , &quot;
                            Y
                            $0.00
                        
                    
                        
                            15
                            360
                            Set MandatoryOrdLaw
                            AssignField
                              TempMandatoryOrdLaw=Y
                            0
                            $0.00
                        
                    
                        
                            16
                            361
                            Fire Protection Class and Responding Fire Dept
                            TPR 0010
                              &quot; , &quot;'&quot; , &quot;VeriskPPC&quot; , &quot;'&quot; , &quot;
                            0
                            $0.00
                        
                    
                        
                            17
                            370
                            Set OrdinanceLaw
                            AssignField
                              &quot; , &quot;'&quot; , &quot;10&quot; , &quot;'&quot; , &quot;
                            0
                            $0.00
                        
                    
                        
                            18
                            380
                            Run ISO Location report and Set Protection Class
                            ISOLocation
                            Error ordering ISO Location Report 
                            0
                            $0.00
                        
                    
                        
                            19
                            390
                            Policy Number
                            SetStructure
                              IFD, FLPOLICYNO:7, -00=0
                            IFD,FLPOLICYNO:7,-00
                            $0.00
                        
                    
                        
                            20
                            400
                            Calc WindHailDeductible Amount
                            Multiply
                              DwellingLimit=300000, WindHailDeductible=5
                            1500000
                            $0.00
                        
                    
                        
                            21
                            410
                            Calc WindHailDeductible Amount
                            Divide
                              TempWindHailDeductibleAmount=1500000, 100=0.01
                            15000
                            $0.00
                        
                    
                        
                            22
                            420
                            Set WindHailDeductible Amount
                            AssignField
                              TempWindHailDeductibleAmount=15000
                            15000
                            $0.00
                        
                    
                        
                            23
                            10000
                            Lookup WLMClass for Wind Mit Lookup-New Construction
                            RateSupport5
                              RoofDeckAttach=NA, Terrain=B, WindSpeed=110, IBHS=PARTIAL, WBDR=N
                            NC2
                            $0.00
                        
                    
                        
                            24
                            10030
                            Lookup Wind Mit Factor-New Construction
                            LookupRate
                              WLMClass, WMRoofGeometry=NA, WMWindowProtection=HURRICANE, WMWaterResistance=N
                            0
                            $0.00
                        
                    
                        
                            25
                            10050
                            Calc Wind Mitigation Amount
                            Subtract
                              1, WindMitFactor=0
                            1
                            $0.00
                        
                    
                        
                            26
                            10051
                            Calc EC Wind Mitigation Amount
                            Subtract
                              1, WindMitFactor=0
                            1
                            $0.00
                        
                    
                        
                            27
                            10052
                            Calc EC Wind Mitigation Amount
                            Multiply
                              TempWindMitEC=1, .05=0.05
                            0.05
                            $0.00
                        
                    
                        
                            28
                            10053
                            Calc EC Wind Mitigation Amount
                            Add
                              TempWindMitEC=0.05, .95=0.95
                            1
                            $0.00
                        
                    
                        
                            29
                            10060
                            Set Protection Class to use for Rating
                            SetVariable
                              ProtectionClass=1
                            1
                            $0.00
                        
                    
                        
                            30
                            10071
                            Calc Coverage B Limit

                            Multiply
                              DwellingLimit=300000, OtherStructuresAmount=2
                            600000
                            $0.00
                        
                    
                        
                            31
                            10072
                            Calc Coverage B Limit

                            Divide
                              TempOtherStructuresLimit=600000, 100=0.01
                            6000
                            $0.00
                        
                    
                        
                            32
                            10073
                            Other Structures Limit
                            AssignField
                              TempOtherStructuresLimit=6000
                            6000
                            $0.00
                        
                    
                        
                            33
                            10074
                            Calc Coverage D/E Limit
                            Multiply
                              DwellingLimit=300000, .2=0.2
                            60000
                            $0.00
                        
                    
                        
                            34
                            10075
                            Set Coverage D/E Limit
                            SetVariable
                              TempFairRentalLimit=60000
                            60000
                            $0.00
                        
                    
                        
                            35
                            10080
                            Lookup AOP Deductible Factor 
                            LookupRate
                              Deductible=5000
                            0.86
                            $0.00
                        
                    
                        
                            36
                            10090
                            Lookup Hurricane Deductible Factor 
                            LookupRate
                              WindHailDeductible=5
                            0.94
                            $0.00
                        
                    
                        
                            37
                            10100
                            Lookup PC/Construction Factor 
                            LookupRate
                              RateProtectionClass=1, ConstructionType=V
                            1
                            $0.00
                        
                    
                        
                            38
                            10110
                            Save PC/Construction Factor for OrdLaw, ACV Loss Settlement &amp; PPRC
                            SetVariable
                              ProtectionConstFactor=1
                            1
                            $0.00
                        
                    
                        
                            39
                            10120
                            Lookup Fire Alarm Factor 
                            LookupRate
                              FireAlarmCredit=CENTRAL
                            0.92
                            $0.00
                        
                    
                        
                            40
                            10130
                            Lookup Sprinkler Factor 
                            LookupRate
                              Sprinkler=PARTIAL
                            0.93
                            $0.00
                        
                    
                        
                            41
                            10140
                            Lookup Secured Community Factor
                            LookupRate
                              SecuredBuildingCredit=SINGLEENTRY
                            0.94
                            $0.00
                        
                    
                        
                            42
                            10170
                            Lookup Year of Construction Factor
                            StepRate
                              ConstructionYear=2015
                            1
                            $0.00
                        
                    
                        
                            43
                            10180
                            Lookup Cov B Factor
                            LookupRate
                              OtherStructuresAmount=2
                            1
                            $0.00
                        
                    
                        
                            44
                            10211
                            Set WH Excl Factor to 1, if not excluded, for PPRC
                            SetVariable
                              1
                            1
                            $0.00
                        
                    
                        
                            45
                            10250
                            Calc Cov A Amount of insurance factor (&lt;= 1,000,000)
                            StepInterpolate
                             {Interpolate between 300000 (2.679)  and 310000 (2.768)}  DwellingLimit=300000
                            2.679
                            $0.00
                        
                    
                        
                            46
                            10310
                            Save Cov A Amount of Insurance Factor for ACV Loss Settle &amp; ACV Roof
                            SetVariable
                              AmountOfInsuranceFactor=2.679
                            2.679
                            $0.00
                        
                    
                        
                            47
                            10320
                            Calc Cov C Amount of insurance factor (&lt;= 1,000,000)
                            StepInterpolate
                             {Interpolate between 25000 (0.5)  and 30000 (0.6)}  ContentsLimit=25000
                            0.5
                            $0.00
                        
                    
                        
                            48
                            10380
                            Save Cov C Amount of Insurance Factor for PPRC
                            SetVariable
                              CovCAmountOfInsFactor=0.5
                            0.5
                            $0.00
                        
                    
                        
                            49
                            10390
                            Call Rating Subroutine - Fire Dwelling
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovAFire&quot; , &quot;'&quot; , &quot;=CovAFire
                            0
                            $0.00
                        
                    
                        
                            50
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $0.00
                        
                    
                        
                            51
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $0.00
                        
                    
                        
                            52
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $0.00
                        
                    
                        
                            53
                            30070
                            Lookup Fire Base Rate 
                            LookupRate
                              PerilCode=CovAFire
                            106
                            $0.00
                        
                    
                        
                            54
                            30071
                            Save Fire Cov A Base Rate 
                            SetVariable
                              BaseRate=106
                            106
                            $0.00
                        
                    
                        
                            55
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=106, AmountOfInsuranceFactor=2.679
                            283.974
                            $0.00
                        
                    
                        
                            56
                            30100
                            Apply PC/Construction Factor to Prem
                            Multiply
                              ProtectionConstFactor=1, Prem=283.974
                            284
                            $0.00
                        
                    
                        
                            57
                            30120
                            Apply AOP Deductible Factor to Prem
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=284
                            244.24
                            $0.00
                        
                    
                        
                            58
                            30250
                            Apply Fire Alarm Factor to Prem
                            Multiply
                              ProtectionFireFactor=0.92, Prem=244.24
                            224.7008
                            $0.00
                        
                    
                        
                            59
                            30260
                            Apply Sprinkler Factor to Prem
                            Multiply
                              SprinklerFactor=0.93, Prem=224.7008
                            208.971744
                            $0.00
                        
                    
                        
                            60
                            30290
                            Lookup Row/Townhouse Factor
                            LookupRate
                              FamilyUnitsRow=1, PerilCode=CovAFire
                            1
                            $0.00
                        
                    
                        
                            61
                            30300
                            Apply Row/Townhouse Factor to Prem
                            Multiply
                              RowTownhouseFactor=1, Prem=208.971744
                            208.971744
                            $0.00
                        
                    
                        
                            62
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $0.00
                        
                    
                        
                            63
                            30310
                            Apply Age of Risk Factor to Prem
                            Multiply
                              AgeofRiskFactor=0.73, Prem=208.971744
                            152.54937312
                            $0.00
                        
                    
                        
                            64
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $0.00
                        
                    
                        
                            65
                            30320
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovAFire, Occupancy=TENANT
                            1
                            $0.00
                        
                    
                        
                            66
                            30330
                            Apply Owner Occupancy Credit Factor to Prem
                            Multiply
                              OwnerOccupancyFactor=1, Prem=152.54937312
                            152.54937312
                            $0.00
                        
                    
                        
                            67
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=152.54937312
                            152.54937312
                            $0.00
                        
                    
                        
                            68
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=152.54937312, 1
                            153
                            $0.00
                        
                    
                        
                            69
                            30500
                            Return from Subroutine
                            EndSub
                             
                            153
                            $0.00
                        
                    
                        
                            70
                            10400
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=153, 1
                            153
                            $0.00
                        
                    
                        
                            71
                            10410
                            Fire Dwelling Premium
                            AddToBase
                              Prem_Total=153
                            153
                            $153.00
                        
                    
                        
                            72
                            10420
                            Call Rating Subroutine - Fire Contents
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovCFire&quot; , &quot;'&quot; , &quot;=CovCFire
                            0
                            $153.00
                        
                    
                        
                            73
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $153.00
                        
                    
                        
                            74
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $153.00
                        
                    
                        
                            75
                            30570
                            Lookup Fire Contents Base Rate 
                            LookupRate
                              PerilCode=CovCFire
                            45
                            $153.00
                        
                    
                        
                            76
                            30571
                            Save Fire Contents Base Rate for RC
                            SetVariable
                              BaseRate=45
                            45
                            $153.00
                        
                    
                        
                            77
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=45, CovCAmountOfInsFactor=0.5
                            22.5
                            $153.00
                        
                    
                        
                            78
                            30600
                            Apply PC/Construction Factor to Prem for CovC
                            Multiply
                              ProtectionConstFactor=1, Prem=22.5
                            23
                            $153.00
                        
                    
                        
                            79
                            30620
                            Apply AOP Deductible Factor to Prem for CovC
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=23
                            19.78
                            $153.00
                        
                    
                        
                            80
                            30750
                            Apply Fire Alarm Factor to Prem for CovC
                            Multiply
                              ProtectionFireFactor=0.92, Prem=19.78
                            18.1976
                            $153.00
                        
                    
                        
                            81
                            30760
                            Apply Sprinkler Factor to Prem for CovC
                            Multiply
                              SprinklerFactor=0.93, Prem=18.1976
                            16.923768
                            $153.00
                        
                    
                        
                            82
                            30790
                            Lookup Row/Townhouse Factor for Cov C
                            LookupRate
                              FamilyUnitsRow=1, PerilCode=CovCFire
                            1
                            $153.00
                        
                    
                        
                            83
                            30800
                            Apply Row/Townhouse Factor to Prem for CovC
                            Multiply
                              RowTownhouseFactor=1, Prem=16.923768
                            16.923768
                            $153.00
                        
                    
                        
                            84
                            30809
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $153.00
                        
                    
                        
                            85
                            30810
                            Apply Age of Dwelling Factor to Prem for CovC
                            Multiply
                              AgeofRiskFactor=0.73, Prem=16.923768
                            12.35435064
                            $153.00
                        
                    
                        
                            86
                            30820
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovCFire, Occupancy=TENANT
                            1
                            $153.00
                        
                    
                        
                            87
                            30830
                            Apply Owner Occupancy Credit Factor to Prem for CovC
                            Multiply
                              OwnerOccupancyFactor=1, Prem=12.35435064
                            12.35435064
                            $153.00
                        
                    
                        
                            88
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=12.35435064, 1
                            12
                            $153.00
                        
                    
                        
                            89
                            30950
                            Return from Subroutine
                            EndSub
                             
                            12
                            $153.00
                        
                    
                        
                            90
                            10430
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=12, 1
                            12
                            $153.00
                        
                    
                        
                            91
                            10440
                            Fire Contents Premium
                            AddToBase
                              Prem_Total=12
                            12
                            $165.00
                        
                    
                        
                            92
                            10450
                            Call Rating Subroutine - EC Dwelling
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovAEC&quot; , &quot;'&quot; , &quot;=CovAEC
                            0
                            $165.00
                        
                    
                        
                            93
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $165.00
                        
                    
                        
                            94
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $165.00
                        
                    
                        
                            95
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $165.00
                        
                    
                        
                            96
                            30080
                            Lookup EC / Hurr Dwelling Base Rate 
                            LookupRate
                              PerilCode=CovAEC, TerritoryCode=39
                            253
                            $165.00
                        
                    
                        
                            97
                            30081
                            Save EC Cov A Base Rate 
                            SetVariable
                              BaseRate=253
                            253
                            $165.00
                        
                    
                        
                            98
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=253, AmountOfInsuranceFactor=2.679
                            677.787
                            $165.00
                        
                    
                        
                            99
                            30091
                            Round EC Prem 
                            Multiply
                              Prem=677.787, 1
                            678
                            $165.00
                        
                    
                        
                            100
                            30120
                            Apply AOP Deductible Factor to Prem
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=678
                            583.08
                            $165.00
                        
                    
                        
                            101
                            30270
                            Apply Secured Community Factor to Prem
                            Multiply
                              SecuredCommunityFactor=0.94, Prem=583.08
                            548.0952
                            $165.00
                        
                    
                        
                            102
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $165.00
                        
                    
                        
                            103
                            30310
                            Apply Age of Risk Factor to Prem
                            Multiply
                              AgeofRiskFactor=0.73, Prem=548.0952
                            400.109496
                            $165.00
                        
                    
                        
                            104
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $165.00
                        
                    
                        
                            105
                            30320
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovAEC, Occupancy=TENANT
                            1
                            $165.00
                        
                    
                        
                            106
                            30330
                            Apply Owner Occupancy Credit Factor to Prem
                            Multiply
                              OwnerOccupancyFactor=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            107
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            108
                            30370
                            Calc EC Wind Mit Credit for Cov A
                            Multiply
                              Prem=400.109496, WindMitFactor=0
                            0
                            $165.00
                        
                    
                        
                            109
                            30380
                            Apply EC Wind Mitigation Factor to Prem
                            Multiply
                              ECWindMitAmount=1, Prem=400.109496
                            400.109496
                            $165.00
                        
                    
                        
                            110
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=400.109496, 1
                            400
                            $165.00
                        
                    
                        
                            111
                            30500
                            Return from Subroutine
                            EndSub
                             
                            400
                            $165.00
                        
                    
                        
                            112
                            10460
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=400, 1
                            400
                            $165.00
                        
                    
                        
                            113
                            10470
                            EC Dwelling Premium
                            AddToBase
                              Prem_Total=400
                            400
                            $565.00
                        
                    
                        
                            114
                            10480
                            Call Rating Subroutine - EC Contents
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovCEC&quot; , &quot;'&quot; , &quot;=CovCEC
                            0
                            $565.00
                        
                    
                        
                            115
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $565.00
                        
                    
                        
                            116
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $565.00
                        
                    
                        
                            117
                            30580
                            Lookup EC/ Hurr Contents Base Rate 
                            LookupRate
                              PerilCode=CovCEC, TerritoryCode=39
                            127
                            $565.00
                        
                    
                        
                            118
                            30581
                            Save EC Contents Base Rate for RC
                            SetVariable
                              BaseRate=127
                            127
                            $565.00
                        
                    
                        
                            119
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=127, CovCAmountOfInsFactor=0.5
                            63.5
                            $565.00
                        
                    
                        
                            120
                            30591
                            Round EC Prem
                            Multiply
                              Prem=63.5, 1
                            64
                            $565.00
                        
                    
                        
                            121
                            30620
                            Apply AOP Deductible Factor to Prem for CovC
                            Multiply
                              AOPDeductibleFactor=0.86, Prem=64
                            55.04
                            $565.00
                        
                    
                        
                            122
                            30770
                            Apply Secured Community Factor to Prem for CovC
                            Multiply
                              SecuredCommunityFactor=0.94, Prem=55.04
                            51.7376
                            $565.00
                        
                    
                        
                            123
                            30809
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $565.00
                        
                    
                        
                            124
                            30810
                            Apply Age of Dwelling Factor to Prem for CovC
                            Multiply
                              AgeofRiskFactor=0.73, Prem=51.7376
                            37.768448
                            $565.00
                        
                    
                        
                            125
                            30820
                            Lookup Owner Occupancy Credit Factor 
                            LookupRate
                              PerilCode=CovCEC, Occupancy=TENANT
                            1
                            $565.00
                        
                    
                        
                            126
                            30830
                            Apply Owner Occupancy Credit Factor to Prem for CovC
                            Multiply
                              OwnerOccupancyFactor=1, Prem=37.768448
                            37.768448
                            $565.00
                        
                    
                        
                            127
                            30831
                            Calc EC Wind Mit Credit for Cov C
                            Multiply
                              Prem=37.768448, WindMitFactor=0
                            0
                            $565.00
                        
                    
                        
                            128
                            30839
                            Apply EC Wind Mitigation Factor to Prem for CovC
                            Multiply
                              ECWindMitAmount=1, Prem=37.768448
                            37.768448
                            $565.00
                        
                    
                        
                            129
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=37.768448, 1
                            38
                            $565.00
                        
                    
                        
                            130
                            30950
                            Return from Subroutine
                            EndSub
                             
                            38
                            $565.00
                        
                    
                        
                            131
                            10490
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=38, 1
                            38
                            $565.00
                        
                    
                        
                            132
                            10500
                            EC Contents Premium
                            AddToBase
                              Prem_Total=38
                            38
                            $603.00
                        
                    
                        
                            133
                            10510
                            Lookup Construction Factor 
                            LookupRate
                              ConstructionType=V
                            1
                            $603.00
                        
                    
                        
                            134
                            10520
                            Save Construction Factor for OrdLaw, ACV Loss Settle, Screened Encl &amp; PPRC
                            SetVariable
                              ConstructionFactor=1
                            1
                            $603.00
                        
                    
                        
                            135
                            10630
                            Call Rating Subroutine - Hurr Dwelling
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovAHurr&quot; , &quot;'&quot; , &quot;=CovAHurr
                            0
                            $603.00
                        
                    
                        
                            136
                            30020
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $603.00
                        
                    
                        
                            137
                            30050
                            Initialize premium
                            SetVariable
                              0
                            0
                            $603.00
                        
                    
                        
                            138
                            30060
                            Set Var for Uncapped Discount Factor
                            SetVariable
                              1
                            1
                            $603.00
                        
                    
                        
                            139
                            30080
                            Lookup EC / Hurr Dwelling Base Rate 
                            LookupRate
                              PerilCode=CovAHurr, TerritoryCode=39
                            456
                            $603.00
                        
                    
                        
                            140
                            30082
                            Save Hurr Cov A Base Rate 
                            SetVariable
                              BaseRate=456
                            456
                            $603.00
                        
                    
                        
                            141
                            30090
                            Apply Cov A Key Factor to Prem
                            Multiply
                              BaseRate=456, AmountOfInsuranceFactor=2.679
                            1221.624
                            $603.00
                        
                    
                        
                            142
                            30110
                            Apply Construction Factor to Prem
                            Multiply
                              ConstructionFactor=1, Prem=1221.624
                            1222
                            $603.00
                        
                    
                        
                            143
                            30130
                            Apply Hurricane Deductible Factor to Prem
                            Multiply
                              HurrDeductibleFactor=0.94, Prem=1222
                            1148.68
                            $603.00
                        
                    
                        
                            144
                            30160
                            Lookup BCEG Factor for Cov A
                            LookupRate
                              BCEGS=04, PerilCode=CovAHurr
                            0
                            $603.00
                        
                    
                        
                            145
                            30170
                            Calc BCEG Amount
                            Subtract
                              1, BCEGFactor=0
                            1
                            $603.00
                        
                    
                        
                            146
                            30180
                            BCEG + Wind Mit - uncapped amount
                            Add
                              BCEGAmount=1, WindMitFactor=0
                            1
                            $603.00
                        
                    
                        
                            147
                            30190
                            Set Capped BCEG + Wind Mit Discount Factor
                            SetVariable
                              0.9
                            0.9
                            $603.00
                        
                    
                        
                            148
                            30210
                            Calc Adjustment for BCEG Factor due to cap
                            Subtract
                              UncapBCEGWindMit=1, .9=0.9
                            0.1
                            $603.00
                        
                    
                        
                            149
                            30220
                            Calc Capped BCEG Factor
                            Add
                              BCEGCapAdjust=0.1, BCEGFactor=0
                            0.1
                            $603.00
                        
                    
                        
                            150
                            30230
                            Apply Capped BCEG Factor to Prem
                            Multiply
                              Prem=1148.68, CappedBCEGFactor=0.1
                            114.868
                            $603.00
                        
                    
                        
                            151
                            30309
                            Lookup Age of Risk Factor 
                            StepRateZero
                              DwellingAge=8
                            0.73
                            $603.00
                        
                    
                        
                            152
                            30311
                            Save Age of Risk Factor for ACV
                            SetVariable
                              AgeofRiskFactor=0.73
                            0.73
                            $603.00
                        
                    
                        
                            153
                            30360
                            Apply Cov B Factor to Prem
                            Multiply
                              CovBFactor=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            154
                            30371
                            Calc Hurr Wind Mit Credit for Cov A
                            Multiply
                              Prem=114.868, WindMitFactor=0
                            0
                            $603.00
                        
                    
                        
                            155
                            30390
                            Apply Wind Mitigation Factor to Prem
                            Multiply
                              WindMitAmount=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            156
                            30400
                            Apply Year of Construction Factor to Prem
                            Multiply
                              YearBuiltFactor=1, Prem=114.868
                            114.868
                            $603.00
                        
                    
                        
                            157
                            30491
                            Set Prem_Total
                            Multiply
                              Prem=114.868, 1
                            115
                            $603.00
                        
                    
                        
                            158
                            30500
                            Return from Subroutine
                            EndSub
                             
                            115
                            $603.00
                        
                    
                        
                            159
                            10640
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=115, 1
                            115
                            $603.00
                        
                    
                        
                            160
                            10650
                            Hurr Dwelling Premium
                            AddToBase
                              Prem_Total=115
                            115
                            $718.00
                        
                    
                        
                            161
                            10660
                            Call Rating Subroutine - Hurr Contents
                            CallSub
                              PerilCode=&quot; , &quot;'&quot; , &quot;CovCHurr&quot; , &quot;'&quot; , &quot;=CovCHurr
                            0
                            $718.00
                        
                    
                        
                            162
                            30560
                            Initialize premium
                            SetVariable
                              0
                            0
                            $718.00
                        
                    
                        
                            163
                            30560
                            Initialize Age of Risk Factor
                            SetVariable
                              0
                            0
                            $718.00
                        
                    
                        
                            164
                            30580
                            Lookup EC/ Hurr Contents Base Rate 
                            LookupRate
                              PerilCode=CovCHurr, TerritoryCode=39
                            237
                            $718.00
                        
                    
                        
                            165
                            30582
                            Save Hurr Contents Base Rate for RC
                            SetVariable
                              BaseRate=237
                            237
                            $718.00
                        
                    
                        
                            166
                            30590
                            Apply Cov C Key Factor to Prem for CovC
                            Multiply
                              BaseRate=237, CovCAmountOfInsFactor=0.5
                            118.5
                            $718.00
                        
                    
                        
                            167
                            30610
                            Apply Construction Factor to Prem for CovC
                            Multiply
                              ConstructionFactor=1, Prem=118.5
                            119
                            $718.00
                        
                    
                        
                            168
                            30630
                            Apply Hurricane Deductible Factor to Prem for CovC
                            Multiply
                              HurrDeductibleFactor=0.94, Prem=119
                            111.86
                            $718.00
                        
                    
                        
                            169
                            30651
                            Lookup BCEG Factor for Cov C
                            LookupRate
                              BCEGS=04, PerilCode=CovCHurr
                            0
                            $718.00
                        
                    
                        
                            170
                            30670
                            Calc BCEG Amount
                            Subtract
                              1, BCEGFactor=0
                            1
                            $718.00
                        
                    
                        
                            171
                            30680
                            BCEG + Wind Mit - uncapped amount
                            Add
                              BCEGAmount=1, WindMitFactor=0
                            1
                            $718.00
                        
                    
                        
                            172
                            30690
                            Set Capped BCEG + Wind Mit Discount Factor
                            SetVariable
                              0.9
                            0.9
                            $718.00
                        
                    
                        
                            173
                            30710
                            Calc Adjustment for BCEG Factor due to cap
                            Subtract
                              UncapBCEGWindMit=1, .9=0.9
                            0.1
                            $718.00
                        
                    
                        
                            174
                            30720
                            Calc Capped BCEG Factor
                            Add
                              BCEGCapAdjust=0.1, BCEGFactor=0
                            0.1
                            $718.00
                        
                    
                        
                            175
                            30730
                            Apply Capped BCEG Factor to Prem
                            Multiply
                              Prem=111.86, CappedBCEGFactor=0.1
                            11.186
                            $718.00
                        
                    
                        
                            176
                            30833
                            Calc Hurr Wind Mit Credit for Cov C
                            Multiply
                              Prem=11.186, WindMitFactor=0
                            0
                            $718.00
                        
                    
                        
                            177
                            30840
                            Apply Wind Mitigation Factor to Prem for CovC
                            Multiply
                              WindMitAmount=1, Prem=11.186
                            11.186
                            $718.00
                        
                    
                        
                            178
                            30850
                            Apply Year of Construction Factor to Prem for CovC
                            Multiply
                              YearBuiltFactor=1, Prem=11.186
                            11.186
                            $718.00
                        
                    
                        
                            179
                            30941
                            Set Prem_Total
                            Multiply
                              Prem=11.186, 1
                            11
                            $718.00
                        
                    
                        
                            180
                            30950
                            Return from Subroutine
                            EndSub
                             
                            11
                            $718.00
                        
                    
                        
                            181
                            10670
                            Set Peril Premium for later calculations
                            Multiply
                              Prem_Total=11, 1
                            11
                            $718.00
                        
                    
                        
                            182
                            10680
                            Hurr Contents Premium
                            AddToBase
                              Prem_Total=11
                            11
                            $729.00
                        
                    
                        
                            183
                            10690
                            Set Replacement Cost Factor  
                            SetVariable
                              .15=0.15
                            0.15
                            $729.00
                        
                    
                        
                            184
                            10700
                            Calc Replacement Cost C Fire Premium
                            Multiply
                              FireCovCBaseRate=45, CovCKeyFactor=0.5, PCConstFactor=1, AgeofRiskFct=0.73, ReplaceCostCFactor=0.15
                            2
                            $729.00
                        
                    
                        
                            185
                            10710
                            Calc Replacement Cost C EC Premium
                            Multiply
                              ECCovCBaseRate=127, CovCKeyFactor=0.5, AgeofRiskFct=0.73, WindstormHailExclFactor=1, ReplaceCostCFactor=0.15
                            7
                            $729.00
                        
                    
                        
                            186
                            10730
                            Sum Replacement Cost C Premium 
                            Add
                              ReplaceCostCFire=2, ReplaceCostCEC=7, ReplaceCostCHurr
                            9
                            $729.00
                        
                    
                        
                            187
                            10740
                            Add Replacement Cost C Premium
                            AddToBase
                              ReplacementCostPrem=9
                            9
                            $738.00
                        
                    
                        
                            188
                            10900
                            Lookup Burglar Alarm Factor
                            LookupRate
                              BurglarAlarmCredit=CENTRAL
                            0.7
                            $738.00
                        
                    
                        
                            189
                            10910
                            Lookup Theft Prem
                            LookupRate
                              TheftCoverage, CountyCode=12031
                            0
                            $738.00
                        
                    
                        
                            190
                            10920
                            Determine Theft Limit (per 1000 of Cov C)
                            Divide
                              ContentsLimit=25000, 1000=0.001
                            25
                            $738.00
                        
                    
                        
                            191
                            10930
                            Multiply Theft Limit by Theft Prem
                            Multiply
                              TheftLimit=25, PremTheft=0
                            0
                            $738.00
                        
                    
                        
                            192
                            10940
                            Add $20 Flat Rate to Theft Prem
                            Add
                              PremTheft=0, 20
                            20
                            $738.00
                        
                    
                        
                            193
                            10950
                            Multiply by Burglar Alarm Factor
                            Multiply
                              BurglarAlarmFactor=0.7, PremTheft=20
                            14
                            $738.00
                        
                    
                        
                            194
                            10960
                            Add Theft Premium to Base
                            AddToBase
                              PremTheft=14
                            14
                            $752.00
                        
                    
                        
                            195
                            11080
                            Add Cov L/M - Pers Liab / Med Pay - Base Limit
                            AddFlatDollar
                              NumberFamilies=2
                            80
                            $832.00
                        
                    
                        
                            196
                            11200
                            Initialize Minimum Premium
                            SetVariable
                              0
                            0
                            $832.00
                        
                    
                        
                            197
                            11210
                            Lookup Minimum Premium
                            LookupRate
                              StateCode=9
                            300
                            $832.00
                        
                    
                        
                            198
                            11240
                            Initialize temp field to indicate minimum premium adj exists
                            SetVariable
                              &quot; , &quot;'&quot; , &quot;N&quot; , &quot;'&quot; , &quot;
                            N
                            $832.00
                        
                    
                        
                            199
                            11260
                            Set field to indicate minimum premium adj exists
                            AssignField
                              TempMinPremAdj=N
                            0
                            $832.00
                        
                    
                        
                            200
                            11280
                            Apply Minimum Premium
                            SetVariable
                              MinPremium=300
                            300
                            $832.00
                        
                    
                        
                            201
                            11300
                            Lookup Wind Mitigation Max Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            89
                            $832.00
                        
                    
                        
                            202
                            11309
                            Calculate Fire Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellFire=153, Prem_CntsFire=12, ReplaceCostCFire=2, OrdinanceLawFire, ACVLossSettlementFire
                            167
                            $832.00
                        
                    
                        
                            203
                            11310
                            Calculate EC Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellEC=400, Prem_CntsEC=38, ReplaceCostCEC=7, ACVLossSettlementEC, Prem_ACVWHLoss
                            445
                            $832.00
                        
                    
                        
                            204
                            11320
                            Calculate Hurricane Wind Premium for form OIR B1 1655
                            Add
                              Prem_DwellHurr=115, Prem_CntsHurr=11, ReplaceCostCHurr, ACVLossSettlementHurr, Prem_ScreenEncl
                            126
                            $832.00
                        
                    
                        
                            205
                            11330
                            Lookup Wind Mitigation FBC Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            0.68
                            $832.00
                        
                    
                        
                            206
                            11340
                            Calculate Wind Mitigation FBC Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMFBCDisc=0.68
                            86
                            $832.00
                        
                    
                        
                            207
                            11350
                            Lookup Wind Mitigation Reinforced Concrete Discount for form OIR B1 1655
                            LookupRate
                             
                            0.82
                            $832.00
                        
                    
                        
                            208
                            11360
                            Calculate Wind Mitigation Reinforced Concrete Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMReinforcedDisc=0.82
                            103
                            $832.00
                        
                    
                        
                            209
                            11370
                            Lookup Wind Mitigation Hip Roof Discount for form OIR B1 1655
                            StepRate
                              ConstructionYear=2015
                            0.1
                            $832.00
                        
                    
                        
                            210
                            11380
                            Calculate Wind Mitigation Hip Roof Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofShapeHipDisc=0.1
                            13
                            $832.00
                        
                    
                        
                            211
                            11430
                            Lookup Wind Mitigation Roof Attach B Discount for form OIR B1 1655
                            LookupRate
                             
                            0.09
                            $832.00
                        
                    
                        
                            212
                            11440
                            Calculate Wind Mitigation Roof Attach B Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofAttachBDisc=0.09
                            11
                            $832.00
                        
                    
                        
                            213
                            11450
                            Lookup Wind Mitigation Roof Attach C Discount for form OIR B1 1655
                            LookupRate
                             
                            0.09
                            $832.00
                        
                    
                        
                            214
                            11460
                            Calculate Wind Mitigation Roof Attach C Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofAttachCDisc=0.09
                            11
                            $832.00
                        
                    
                        
                            215
                            11470
                            Lookup Wind Mitigation Roof To Wall Clips Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            216
                            11480
                            Calculate Wind Mitigation Roof To Wall Clips Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallClipsDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            217
                            11490
                            Lookup Wind Mitigation Roof To Wall Single Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            218
                            11500
                            Calculate Wind Mitigation Roof To Wall Single Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallSingleDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            219
                            11510
                            Lookup Wind Mitigation Roof To Wall Double Discount for form OIR B1 1655
                            LookupRate
                             
                            0.35
                            $832.00
                        
                    
                        
                            220
                            11520
                            Calculate Wind Mitigation Roof To Wall Double Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMRoofToWallDoubleDisc=0.35
                            44
                            $832.00
                        
                    
                        
                            221
                            11530
                            Lookup Wind Mitigation SWR Discount for form OIR B1 1655
                            LookupRate
                             
                            0.06
                            $832.00
                        
                    
                        
                            222
                            11540
                            Calculate Wind Mitigation SWR Premium for form OIR B1 1655
                            Multiply
                              Hurr_WindPrem=126, WMSWRDisc=0.06
                            8
                            $832.00
                        
                    
                
            
        
								
							
								
									
            
                
                    
                        Validation Num
                        Validation Pass
                        Validation Mode
                        Validation Action
                        Failed Validations
                        PageIdentifier
                    
                
                
                    
                        
                            14
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,1400,3000,3100,3300
                        
                    
                        
                            13
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,600,700,800,900,1010,1100
                        
                    
                        
                            12
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            51,500
                        
                    
                        
                            11
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            50,100,200,205,210,215,300
                        
                    
                        
                            10
                            N
                            PageChange
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:2,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS UserType, ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationModeCode,     ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationActionCode, ISNULL(V.ValidationMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;internal&quot; , &quot;'&quot; , &quot;)    AND (ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;PageChange&quot; , &quot;'&quot; , &quot;)    AND V.UWQuoteCode IN (&quot; , &quot;'&quot; , &quot;X&quot; , &quot;'&quot; , &quot;, ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            50,100,200,205,210,215,300
                        
                    
                        
                            9
                            Y
                            PageChange
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            50,75,76,77,79,2450,2900
                        
                    
                        
                            8
                            Y
                            PostRating
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            
                        
                    
                        
                            7
                            N
                            PostRating
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:6,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS UserType, ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationModeCode,     ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationActionCode, ISNULL(V.ValidationMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;internal&quot; , &quot;'&quot; , &quot;)    AND (ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;PostRating&quot; , &quot;'&quot; , &quot;)    AND V.UWQuoteCode IN (&quot; , &quot;'&quot; , &quot;X&quot; , &quot;'&quot; , &quot;, ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            
                        
                    
                        
                            6
                            Y
                            PreRating
                            Continue
                            
                                
                                    Validation Request Summary: No reportable anomalies were found
                                
                                
                            
                            
                        
                    
                        
                            5
                            N
                            PreRating
                            Continue
                            
                                
                                    Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEME
                                
                                
                                    
                                        Actions table data procurement was unsuccessful; Serialized SQL data: {&quot;COLUMNLIST&quot;:&quot;APPLICATIONMESSAGELINK,CLIENTNUMBER,DESCRIPTION,GROUPMESSAGE,GUIDEDAPPMESSAGELINK,PUBLICAPPMESSAGELINK,QUICKQUOTEMESSAGELINK,SEVERITYORDER,USERTYPE,VALIDATIONACTIONCODE,VALIDATIONACTIONNUM,VALIDATIONGROUPID,VALIDATIONID,VALIDATIONMESSAGE,VALIDATIONMODECODE&quot;,&quot;EXECUTIONTIME&quot;:1,&quot;CACHED&quot;:false,&quot;RECORDCOUNT&quot;:0,&quot;SQL&quot;:&quot;    SELECT V.ClientNumber, V.ValidationID, V.ValidationActionNum, ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS UserType, ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationModeCode,     ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationActionCode, ISNULL(V.ValidationMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ValidationMessage,     ISNULL(V.GuidedAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GuidedAppMessageLink, ISNULL(V.PublicAppMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS PublicAppMessageLink,     ISNULL(V.ApplicationMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS ApplicationMessageLink, ISNULL(V.QuickQuoteMessageLink,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS QuickQuoteMessageLink,     ISNULL(V.ValidationGroupID,0) AS ValidationGroupID,     ISNULL(L.Description,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS Description, L.SeverityOrder, ISNULL(G.GroupMessage,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) AS GroupMessage    FROM ValidationActions V     INNER JOIN lkValidationAction L ON ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = L.ValidationActionCode      AND L.ClientNumber = (             SELECT MAX(L3.ClientNumber)             FROM lkValidationAction L3 WITH (NOLOCK)             WHERE L3.ValidationActionCode = ISNULL(V.ValidationActionCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;)             AND L3.ClientNumber IN (0,?)            )     LEFT JOIN ValidationGroups G ON ISNULL(V.ValidationGroupID,0) = ISNULL(G.ValidationGroupID,0)      AND G.ClientNumber = (             SELECT MAX(G3.ClientNumber)             FROM ValidationGroups G3 WITH (NOLOCK)             WHERE G3.ValidationGroupID = ISNULL(V.ValidationGroupID,0)             AND G3.ClientNumber IN (0,?)            )    WHERE V.ValidationID IN (003156,003208)    AND (ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.UserType,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;internal&quot; , &quot;'&quot; , &quot;)    AND (ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;ANY&quot; , &quot;'&quot; , &quot; OR ISNULL(V.ValidationModeCode,&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) = &quot; , &quot;'&quot; , &quot;PreRating&quot; , &quot;'&quot; , &quot;)    AND V.UWQuoteCode IN (&quot; , &quot;'&quot; , &quot;X&quot; , &quot;'&quot; , &quot;, ?)   &quot;,&quot;SQLPARAMETERS&quot;:[21,21,&quot;A&quot;]}
                                    
                                
                            
                            
                        
                    
                
            
            
                function changeRowStyle(id){
                    if(hasClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;)){
                        removeClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;);
                        addClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;);
                    } else if(hasClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;)){
                        removeClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-upCaret&quot;);
                        addClass($(&quot;#&quot; + id + &quot; span&quot;), &quot;ISiA-downCaret&quot;);
                    }
                }
			
        
								
							
								
									


	table.cfdump_wddx,
	table.cfdump_xml,
	table.cfdump_struct,
	table.cfdump_varundefined,
	table.cfdump_array,
	table.cfdump_query,
	table.cfdump_cfc,
	table.cfdump_object,
	table.cfdump_binary,
	table.cfdump_udf,
	table.cfdump_udfbody,
	table.cfdump_udfarguments {
		font-size: xx-small;
		font-family: verdana, arial, helvetica, sans-serif;
	}

	table.cfdump_wddx th,
	table.cfdump_xml th,
	table.cfdump_struct th,
	table.cfdump_varundefined th,
	table.cfdump_array th,
	table.cfdump_query th,
	table.cfdump_cfc th,
	table.cfdump_object th,
	table.cfdump_binary th,
	table.cfdump_udf th,
	table.cfdump_udfbody th,
	table.cfdump_udfarguments th {
		text-align: left;
		color: white;
		padding: 5px;
	}

	table.cfdump_wddx td,
	table.cfdump_xml td,
	table.cfdump_struct td,
	table.cfdump_varundefined  td,
	table.cfdump_array td,
	table.cfdump_query td,
	table.cfdump_cfc td,
	table.cfdump_object td,
	table.cfdump_binary td,
	table.cfdump_udf td,
	table.cfdump_udfbody td,
	table.cfdump_udfarguments td {
		padding: 3px;
		background-color: #ffffff;
		vertical-align : top;
	}

	table.cfdump_wddx {
		background-color: #000000;
	}
	table.cfdump_wddx th.wddx {
		background-color: #444444;
	}


	table.cfdump_xml {
		background-color: #888888;
	}
	table.cfdump_xml th.xml {
		background-color: #aaaaaa;
	}
	table.cfdump_xml td.xml {
		background-color: #dddddd;
	}

	table.cfdump_struct {
		background-color: #0000cc ;
	}
	table.cfdump_struct th.struct {
		background-color: #4444cc ;
	}
	table.cfdump_struct td.struct {
		background-color: #ccddff;
	}

	table.cfdump_varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined th.varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined td.varundefined {
		background-color: #ccddff;
	}

	table.cfdump_array {
		background-color: #006600 ;
	}
	table.cfdump_array th.array {
		background-color: #009900 ;
	}
	table.cfdump_array td.array {
		background-color: #ccffcc ;
	}

	table.cfdump_query {
		background-color: #884488 ;
	}
	table.cfdump_query th.query {
		background-color: #aa66aa ;
	}
	table.cfdump_query td.query {
		background-color: #ffddff ;
	}


	table.cfdump_cfc {
		background-color: #ff0000;
	}
	table.cfdump_cfc th.cfc{
		background-color: #ff4444;
	}
	table.cfdump_cfc td.cfc {
		background-color: #ffcccc;
	}


	table.cfdump_object {
		background-color : #ff0000;
	}
	table.cfdump_object th.object{
		background-color: #ff4444;
	}

	table.cfdump_binary {
		background-color : #eebb00;
	}
	table.cfdump_binary th.binary {
		background-color: #ffcc44;
	}
	table.cfdump_binary td {
		font-size: x-small;
	}
	table.cfdump_udf {
		background-color: #aa4400;
	}
	table.cfdump_udf th.udf {
		background-color: #cc6600;
	}
	table.cfdump_udfarguments {
		background-color: #dddddd;
	}
	table.cfdump_udfarguments th {
		background-color: #eeeeee;
		color: #000000;
	}

 


// for queries we have more than one td element to collapse/expand
	var expand = &quot;open&quot;;

	dump = function( obj ) {
		var out = &quot;&quot; ;
		if ( typeof obj == &quot;object&quot; ) {
			for ( key in obj ) {
				if ( typeof obj[key] != &quot;function&quot; ) out += key + &quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot; + obj[key] + &quot; , &quot;'&quot; , &quot;&lt;br>&quot; , &quot;'&quot; , &quot; ;
			}
		}
	}


	cfdump_toggleRow = function(source) {
		//target is the right cell
		if(document.all) target = source.parentElement.cells[1];
		else {
			var element = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>0;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					element = source.parentNode.childNodes[i];
					break;
				}
			}
			if(element == null)
				target = source.parentNode.lastChild;
			else
				target = element;
		}
		//target = source.parentNode.lastChild ;
		cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
	}

	cfdump_toggleXmlDoc = function(source) {

		var caption = source.innerHTML.split( &quot; , &quot;'&quot; , &quot; [&quot; , &quot;'&quot; , &quot; ) ;

		// toggle source (header)
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ) {
			// closed -> short
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [short version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to maximize&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else if ( source.innerHTML.indexOf(&quot; , &quot;'&quot; , &quot;[short version]&quot; , &quot;'&quot; , &quot;) != -1 ) {
			// short -> full
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [long version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		} else {
			// full -> closed
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}

		// Toggle the target (everething below the header row).
		// First two rows are XMLComment and XMLRoot - they are part
		// of the long dump, the rest are direct children - part of the
		// short dump
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				if ( i &lt; 3 ) cfdump_toggleTarget( target, switchLongToState ) ;
				else cfdump_toggleTarget( target, switchShortToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			var row = 1;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if( target.style ) {
					if ( row &lt; 3 ) {
						cfdump_toggleTarget( target, switchLongToState ) ;
					} else {
						cfdump_toggleTarget( target, switchShortToState ) ;
					}
					row++;
				}
			}
		}
	}

	cfdump_toggleTable = function(source) {

		var switchToState = cfdump_toggleSource( source ) ;
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				cfdump_toggleTarget( target, switchToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if(target.style) {
					cfdump_toggleTarget( target, switchToState ) ;
				}
			}
		}
	}

	cfdump_toggleSource = function( source ) {
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; || source.style.fontStyle == null) {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}
	}

	cfdump_toggleTarget = function( target, switchToState ) {
		if ( switchToState == &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; )	target.style.display = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; ;
		else target.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot; ;
	}

	// collapse all td elements for queries
	cfdump_toggleRow_qry = function(source) {
		expand = (source.title == &quot;click to collapse&quot;) ? &quot;closed&quot; : &quot;open&quot;;
		if(document.all) {
			var nbrChildren = source.parentElement.cells.length;
			if(nbrChildren > 1){
				for(i=nbrChildren-1;i>0;i--){
					target = source.parentElement.cells[i];
					cfdump_toggleTarget( target,expand ) ;
					cfdump_toggleSource_qry(source);
				}
			}
			else {
				//target is the right cell
				target = source.parentElement.cells[1];
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
		else{
			var target = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>1;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					target = source.parentNode.childNodes[i];
					cfdump_toggleTarget( target,expand );
					cfdump_toggleSource_qry(source);
				}
			}
			if(target == null){
				//target is the last cell
				target = source.parentNode.lastChild;
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
	}

	cfdump_toggleSource_qry = function(source) {
		if(expand == &quot;closed&quot;){
			source.title = &quot;click to expand&quot;;
			source.style.fontStyle = &quot;italic&quot;;
		}
		else{
			source.title = &quot;click to collapse&quot;;
			source.style.fontStyle = &quot;normal&quot;;
		}
	}

 
			
			struct 
					
					003000
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003001
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003002
					
					false 
					
					
					
					
					003002-ORDER
					
					1 
					
					
					
					
					003002-Parameter1
					
					04/09/2023 
					
					
					
					
					003002_result
					
					2023 
					
					
					
					
					003008
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003009
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003011
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003012
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003013
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003014
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003015
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003016
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003017
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003018
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003019
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003020
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003023
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003024
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003025
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003026
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003039
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003040
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003042
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003047
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003048
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003049
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003050
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003051
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003052
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003053
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003054
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003055
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003056
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003057
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003058
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003060
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003062
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003063
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003064
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003065
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003066
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003067
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003068
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003069
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003073_1
					
					NO 
					
					
					
					
					003073_1-ORDER
					
					7 
					
					
					
					
					003073_1-Parameter1
					
					ExteriorWallCover_1 (CONCRETEBLOCK) 
					
					
					
					
					003073_1-Parameter2-d
					
					ASBESTOS 
					
					
					
					
					003074_1
					
					NO 
					
					
					
					
					003074_1-ORDER
					
					8 
					
					
					
					
					003074_1-Parameter1
					
					RoofConstructionYear_1 (2015) 
					
					
					
					
					003074_1-Parameter2-c
					
					ConstructionYear_1 (2015) 
					
					
					
					
					003075
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003076_1
					
					false 
					
					
					
					
					003076_1-ORDER
					
					2 
					
					
					
					
					003076_1-Parameter1
					
					2023 
					
					
					
					
					003076_1-Parameter2
					
					2015 
					
					
					
					
					003076_1_result
					
					8 
					
					
					
					
					003081
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003082
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003083
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003084
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003085
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003087
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003088
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003089
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003090
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003091
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003092
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003099
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003100
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003127
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003128
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003129
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003130
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003132
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003135
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003139
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003145
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003146
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003147
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003149
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003150
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003152
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003153
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003154
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003155
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003156
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003166
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003168
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003202
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003203
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003204
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003205
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003208
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003222
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003224
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003229
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003230
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003231
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003232
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003233
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003234
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003235
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003236
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003237
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003238
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003239
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003240
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003241
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003242
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003243
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003244
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003245
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003246
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003247
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003248
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003249
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003250
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003251
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003252
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003253
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003254
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003255
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003256
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003257
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003258
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003259
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003260
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003261
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003262
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003263
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003264
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003265
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003266
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003267
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003268
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003269
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003270
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003271
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003272
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003273
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003274
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003275
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003276
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003277
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003278
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003279
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003280
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003281
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003282
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003283
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003284
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003285
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003286
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003287
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003288
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003289
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003290
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003291
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003292
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003293
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003294
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003295
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003296
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003297
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003298
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003299
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003300
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003301
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003302
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003303
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003304
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003305
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003306
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003307
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003308
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003309
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003310
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003311
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					003312
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004006
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004009
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004015
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004020
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004023
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004024
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004025
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004026
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004027
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004028
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004029
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004030
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					004031
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007665
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007666
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007673_1
					
					false 
					
					
					
					
					31007673_1-ORDER
					
					3 
					
					
					
					
					31007673_1-Parameter1
					
					09/03/2018 
					
					
					
					
					31007673_1_result
					
					2018 
					
					
					
					
					31007674_1
					
					NO 
					
					
					
					
					31007674_1-ORDER
					
					6 
					
					
					
					
					31007674_1-Parameter1
					
					PurchaseYear_1 (2018) 
					
					
					
					
					31007674_1-Parameter2-c
					
					ConstructionYear_1 (2015) 
					
					
					
					
					31007677
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007678
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007679
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007684
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007687
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007704
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007705
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007706
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007707
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007708
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007709
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007710
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007711
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007712
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007713
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007714
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007715
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007716
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007726
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007727
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007728
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007729
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007730
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007731
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007733
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007735
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007736
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007737
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007738
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007740
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007741
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007742
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007756
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007757
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007758
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007782
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007783
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007784
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007785
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007805
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007806
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007807
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007884
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007885
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007899
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007911
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007923
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007925
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007928
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007931
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007938
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007939
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007940
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007941
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007945
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007947
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007948
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007949
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007956
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007957
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007958
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007960
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007961
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007981
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007982
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007990
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007991
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007992
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007993
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007994
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007995
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007996
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007997
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007998
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31007999
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008000
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008001
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008002
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008003
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008004
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008005
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008030
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008070
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008071
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008072
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008079
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008080
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008091
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008092
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008093
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008094
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008095
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008096
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008097
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008098
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008099
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008100
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008101
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008102
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008103
					
					NO 
					
					
					
					
					31008103-ORDER
					
					4 
					
					
					
					
					31008103-Parameter1
					
					ConstructionYear_1 (2015) 
					
					
					
					
					31008103-Parameter2-c
					
					EffectiveYear (2023) 
					
					
					
					
					31008104
					
					NO 
					
					
					
					
					31008104-ORDER
					
					5 
					
					
					
					
					31008104-Parameter1
					
					RoofConstructionYear_1 (2015) 
					
					
					
					
					31008104-Parameter2-c
					
					EffectiveYear (2023) 
					
					
					
					
					31008105_1
					
					false 
					
					
					
					
					31008105_1-ORDER
					
					17 
					
					
					
					
					31008105_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter01_2
					
					ROLL 
					
					
					
					
					31008105_1-Parameter02_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter02_2
					
					TIN 
					
					
					
					
					31008105_1-Parameter03_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter03_2
					
					TARGRAVEL 
					
					
					
					
					31008105_1-Parameter04_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter04_2
					
					WOOD 
					
					
					
					
					31008105_1-Parameter05_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008105_1-Parameter05_2
					
					SOLAR 
					
					
					
					
					31008105_1-Result01
					
					3TAB = ROLL = NO 
					
					
					
					
					31008105_1-Result02
					
					3TAB = TIN = NO 
					
					
					
					
					31008105_1-Result03
					
					3TAB = TARGRAVEL = NO 
					
					
					
					
					31008105_1-Result04
					
					3TAB = WOOD = NO 
					
					
					
					
					31008105_1-Result05
					
					3TAB = SOLAR = NO 
					
					
					
					
					31008106
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008108_1
					
					Skipped - ValidationConditions [ValRoofAge,>,29;|_1|31008108] 
					
					
					
					
					31008108_1-CheckConditions-1
					
					ValRoofAge (8) > 29 = NO 
					
					
					
					
					31008108_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008110_1
					
					false 
					
					
					
					
					31008110_1-ORDER
					
					9 
					
					
					
					
					31008110_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					31008110_1-Parameter01_2
					
					3TAB 
					
					
					
					
					31008110_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					31008110_1-Parameter02_2
					
					TENANT 
					
					
					
					
					31008110_1-Parameter03_1
					
					ValRoofAge_1 (8) 
					
					
					
					
					31008110_1-Parameter03_2
					
					10 
					
					
					
					
					31008110_1-Parameter04_1
					
					ACVWHLosstoRoofFactor_1 () 
					
					
					
					
					31008110_1-Parameter04_2
					
					N 
					
					
					
					
					31008110_1-Result01
					
					3TAB = 3TAB = YES 
					
					
					
					
					31008110_1-Result02
					
					TENANT = TENANT = YES 
					
					
					
					
					31008110_1-Result03
					
					8 > 10 = NO 
					
					
					
					
					31008110_1-Result04
					
					= N = NO 
					
					
					
					
					31008112
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008113
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008114
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008117
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008118
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008119
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008120
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008121
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008122
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008126
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008126_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204010;OldSystemFlag,&lt;>,Y;AND|_1|31008126] 
					
					
					
					
					31008126_1-CheckConditions-1
					
					CapacityRuleCode () = CR204010 = NO 
					
					
					
					
					31008126_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008127
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204001;OldSystemFlag,&lt;>,Y;AND||31008127] 
					
					
					
					
					31008127-CheckConditions-1
					
					CapacityRuleCode () = CR204001 = NO 
					
					
					
					
					31008127-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008128
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204002;OldSystemFlag,&lt;>,Y;AND||31008128] 
					
					
					
					
					31008128-CheckConditions-1
					
					CapacityRuleCode () = CR204002 = NO 
					
					
					
					
					31008128-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008129
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204003;OldSystemFlag,&lt;>,Y;AND||31008129] 
					
					
					
					
					31008129-CheckConditions-1
					
					CapacityRuleCode () = CR204003 = NO 
					
					
					
					
					31008129-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008130
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204004;OldSystemFlag,&lt;>,Y;AND||31008130] 
					
					
					
					
					31008130-CheckConditions-1
					
					CapacityRuleCode () = CR204004 = NO 
					
					
					
					
					31008130-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008131_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204005;OldSystemFlag,&lt;>,Y;AND|_1|31008131] 
					
					
					
					
					31008131_1-CheckConditions-1
					
					CapacityRuleCode () = CR204005 = NO 
					
					
					
					
					31008131_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008132
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204006;OldSystemFlag,&lt;>,Y;AND||31008132] 
					
					
					
					
					31008132-CheckConditions-1
					
					CapacityRuleCode () = CR204006 = NO 
					
					
					
					
					31008132-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008134
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008134_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204020;OldSystemFlag,&lt;>,Y;AND|_1|31008134] 
					
					
					
					
					31008134_1-CheckConditions-1
					
					CapacityRuleCode () = CR204020 = NO 
					
					
					
					
					31008134_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					31008135
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					31008135_1
					
					Skipped - ValidationConditions [CapacityRuleCode,=,CR204021;OldSystemFlag,&lt;>,Y;AND|_1|31008135] 
					
					
					
					
					31008135_1-CheckConditions-1
					
					CapacityRuleCode () = CR204021 = NO 
					
					
					
					
					31008135_1-CheckConditionsResult-1
					
					false 
					
					
					
					
					310115
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310116
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310117
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310118
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310119
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310120_1
					
					false 
					
					
					
					
					310120_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 10 = YES 
					
					
					
					
					310120_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310120_1-ORDER
					
					10 
					
					
					
					
					310120_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310120_1-Parameter01_2
					
					3TAB 
					
					
					
					
					310120_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310120_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310120_1-Result01
					
					3TAB = 3TAB = YES 
					
					
					
					
					310120_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310121
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310122_1
					
					false 
					
					
					
					
					310122_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 15 = YES 
					
					
					
					
					310122_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310122_1-ORDER
					
					11 
					
					
					
					
					310122_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310122_1-Parameter01_2
					
					ARCHITECTURAL 
					
					
					
					
					310122_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310122_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310122_1-Result01
					
					3TAB = ARCHITECTURAL = NO 
					
					
					
					
					310122_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310123
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310124_1
					
					false 
					
					
					
					
					310124_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 20 = YES 
					
					
					
					
					310124_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310124_1-ORDER
					
					12 
					
					
					
					
					310124_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310124_1-Parameter01_2
					
					TILE 
					
					
					
					
					310124_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310124_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310124_1-Result01
					
					3TAB = TILE = NO 
					
					
					
					
					310124_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310125
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310126_1
					
					false 
					
					
					
					
					310126_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310126_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310126_1-ORDER
					
					13 
					
					
					
					
					310126_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310126_1-Parameter01_2
					
					FIBERCEMENT 
					
					
					
					
					310126_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310126_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310126_1-Result01
					
					3TAB = FIBERCEMENT = NO 
					
					
					
					
					310126_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310127
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310128_1
					
					false 
					
					
					
					
					310128_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310128_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310128_1-ORDER
					
					14 
					
					
					
					
					310128_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310128_1-Parameter01_2
					
					CORRUGATEDMETAL 
					
					
					
					
					310128_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310128_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310128_1-Result01
					
					3TAB = CORRUGATEDMETAL = NO 
					
					
					
					
					310128_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310129
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310130_1
					
					false 
					
					
					
					
					310130_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310130_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310130_1-ORDER
					
					15 
					
					
					
					
					310130_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310130_1-Parameter01_2
					
					METAL 
					
					
					
					
					310130_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310130_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310130_1-Result01
					
					3TAB = METAL = NO 
					
					
					
					
					310130_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					310131
					
					Skipped, failed CheckRuleApplies 
					
					
					
					
					310132_1
					
					false 
					
					
					
					
					310132_1-CheckConditions-1
					
					ValRoofAge (8) &lt;= 30 = YES 
					
					
					
					
					310132_1-CheckConditionsResult-1
					
					true 
					
					
					
					
					310132_1-ORDER
					
					16 
					
					
					
					
					310132_1-Parameter01_1
					
					RoofConstruction_1 (3TAB) 
					
					
					
					
					310132_1-Parameter01_2
					
					SLATE 
					
					
					
					
					310132_1-Parameter02_1
					
					Occupancy_1 (TENANT) 
					
					
					
					
					310132_1-Parameter02_2
					
					OWNER 
					
					
					
					
					310132_1-Result01
					
					3TAB = SLATE = NO 
					
					
					
					
					310132_1-Result02
					
					TENANT = OWNER = NO 
					
					
					
					
					ActionCode
					
					Continue 
					
					
					
					
					ClientNumber
					
					21 
					
					
					
					
					DebugMessage
					
					[empty string] 
					
					
					
					
					ISRTR
					
					N 
					
					
					
					
					IsError
					
					FALSE 
					
					
					
					
					QuoteNumber
					
					3106516 
					
					
					
					
					RequireUWIDs
					
					[empty string] 
					
					
					
					
					ResultApplicationMessageLink
					
					[empty string] 
					
					
					
					
					ResultGuidedAppMessageLink
					
					[empty string] 
					
					
					
					
					ResultMessage
					
					[empty string] 
					
					
					
					
					ResultPublicAppMessageLink
					
					[empty string] 
					
					
					
					
					ResultQuickQuoteMessageLink
					
					[empty string] 
					
					
					
					
					ResultTasks
					
					[empty string] 
					
					
					
					
					RulesAppliesToList
					
					UA 
					
					
					
					
					RulesDateUsed
					
					04/09/2023 
					
					
					
					
					RulesRecordCount
					
					338 
					
					
					
					
					RulesValidationMode
					
					PageChange 
					
					
					
					
					WDDXMessage
					
					Loaded from Passed in Value 
					
					
					
					
					WDDXPacketChanged
					
					false 
					
					
					
					
					var-EffectiveYear
					
					2023 
					
					
					
					
					var-PurchaseYear_1
					
					2018 
					
					
					
					
					var-ValRoofAge_1
					
					8 
					
					
					
			
		
								
							
							
								
		
			
			
				Quote Number
				Insured
				ManualID
			
			
			
				
					
						3106516
						LEBLANC, KEITH
						2040
					
				
					
						3106517
						SMITH, BRENDA
						2010
					
				
					
						3106479
						GCGJCGJCGCGCGCGCG, KUGKHFHKFGHCGJC
						2010
					
				
					
						3106504
						MCCLAIN, JOSEPHINE
						2020
					
				
					
						3106513
						FRANK, LILLIAN
						2040
					
				
					
						3106515
						RAMIREZ, MIGUEL
						2040
					
				
					
						3106514
						GROS, DEAN
						2040
					
				
					
						3106511
						NGUYEN, AELITA
						2040
					
				
					
						3106512
						BURRELL, DALE
						2040
					
				
					
						3106507
						IRWIN, STEPHANI
						2040
					
				
					
						3106510
						ZERINGUE, DEWAN
						2040
					
				
					
						3106509
						DENNIS, DONALD
						2040
					
				
					
						3106484
						SHINGLES, SARAH
						2040
					
				
					
						3106508
						TEST, COLE
						2040
					
				
					
						3106492
						TEST, COLE
						2020
					
				
					
						3106506
						MCCLURE, TRAVIS
						2040
					
				
					
						3104411
						IRWIN, STEPHANI
						2040
					
				
					
						3106505
						BROWN, BRYAN
						2040
					
				
					
						3106503
						LIRETTE, THOMAS
						2040
					
				
					
						3106502
						MANUAL, MANNI
						2040
					
				
			
		
	
							
							
								
        List of agents in this environment with License and Commission Rates
		
			
			
				Agent Code
				Name
				DBAName
			
			
			
				
					
						7619
						TEXSTAR INSURANCE SERVICES INC
						TEXSTAR INSURANCE SERVICES INC
					
				
					
						43926
						PROGRESSIVE INSURANCE AGCY INC
						PRO AMERICA INSURANCE
					
				
					
						81258
						TMC ENTERPRISES OF SW FL INC
						DBA MONTEAGLE INS SERVICES
					
				
					
						110110
						AUGUSTYNIAK INSURANCE GRP INC
						AUGUSTYNIAK INSURANCE GRP INC
					
				
					
						110139
						FIRST CHOICE INS INTERMED INC
						FIRST CHOICE INS INTERMED INC
					
				
					
						110147
						FIRST BEACHES INSURANCE LLC
						FIRST BEACHES INSURANCE LLC
					
				
					
						110203
						MITCH MITCHELL FIN SVCS INC
						DBA NSURANCE NATION
					
				
					
						156588
						CUELLAR &amp; ASSOC PROP &amp; CAS LLC
						CUELLAR &amp; ASSOC PROP &amp; CAS LLC
					
				
					
						210177
						1ST CAPITAL INSURANCE INC
						1ST CAPITAL INSURANCE INC
					
				
					
						210181
						MOORE-TERIHAY AGENCY INC
						MOORE-TERIHAY AGENCY INC
					
				
					
						210243
						HALBREHDER FAMILY AGENCY LLC
						DBA THE INSURANCE SHOP
					
				
					
						210253
						FGNC INSURANCE AGENCY INC
						FGNC INSURANCE AGENCY INC
					
				
					
						210266
						TANIA VEGA
						TANIA VEGA INSURANCE AGENCY
					
				
					
						210285
						SHELDON PALMES INS OF
						HERNANDO INC
					
				
					
						210299
						HYDE PARK INSURANCE SVCS INC
						HYDE PARK INSURANCE SVCS INC
					
				
					
						210303
						GRYPHON GROUP INC
						GREAT FLORIDA INSURANCE
					
				
					
						240421
						THE MILLER INSURANCE GROUP LLC
						THE MILLER INSURANCE GROUP LLC
					
				
					
						241527
						HUGHES INSURANCE INC
						HUGHES INSURANCE INC
					
				
					
						310178
						INDUVAL INC
						GREAT FLORIDA INSURANCE
					
				
					
						310221
						BREVARD INS &amp; MARKETING INC
						BREVARD INS &amp; MARKETING INC
					
				
					
						310272
						HOFFMAN &amp; ASSOCIATES INS LLC
						HOFFMAN &amp; ASSOCIATES INS LLC
					
				
					
						310279
						AMSLEY INSURANCE SERVICES INC
						AMSLEY INSURANCE SERVICES INC
					
				
					
						310290
						MORNING STAR CONSULTING LLC
						MORNING STAR CONSULTING LLC
					
				
					
						310299
						HERBIG INS &amp; FIN SVCS INC
						DBA HIG INSURANCE GROUP
					
				
					
						310317
						ALLEN INSURANCE ASSOCIATES INC
						ALLEN INSURANCE ASSOCIATES INC
					
				
			
		
	
							
							
								


	table.cfdump_wddx,
	table.cfdump_xml,
	table.cfdump_struct,
	table.cfdump_varundefined,
	table.cfdump_array,
	table.cfdump_query,
	table.cfdump_cfc,
	table.cfdump_object,
	table.cfdump_binary,
	table.cfdump_udf,
	table.cfdump_udfbody,
	table.cfdump_udfarguments {
		font-size: xx-small;
		font-family: verdana, arial, helvetica, sans-serif;
	}

	table.cfdump_wddx th,
	table.cfdump_xml th,
	table.cfdump_struct th,
	table.cfdump_varundefined th,
	table.cfdump_array th,
	table.cfdump_query th,
	table.cfdump_cfc th,
	table.cfdump_object th,
	table.cfdump_binary th,
	table.cfdump_udf th,
	table.cfdump_udfbody th,
	table.cfdump_udfarguments th {
		text-align: left;
		color: white;
		padding: 5px;
	}

	table.cfdump_wddx td,
	table.cfdump_xml td,
	table.cfdump_struct td,
	table.cfdump_varundefined  td,
	table.cfdump_array td,
	table.cfdump_query td,
	table.cfdump_cfc td,
	table.cfdump_object td,
	table.cfdump_binary td,
	table.cfdump_udf td,
	table.cfdump_udfbody td,
	table.cfdump_udfarguments td {
		padding: 3px;
		background-color: #ffffff;
		vertical-align : top;
	}

	table.cfdump_wddx {
		background-color: #000000;
	}
	table.cfdump_wddx th.wddx {
		background-color: #444444;
	}


	table.cfdump_xml {
		background-color: #888888;
	}
	table.cfdump_xml th.xml {
		background-color: #aaaaaa;
	}
	table.cfdump_xml td.xml {
		background-color: #dddddd;
	}

	table.cfdump_struct {
		background-color: #0000cc ;
	}
	table.cfdump_struct th.struct {
		background-color: #4444cc ;
	}
	table.cfdump_struct td.struct {
		background-color: #ccddff;
	}

	table.cfdump_varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined th.varundefined {
		background-color: #CC3300 ;
	}
	table.cfdump_varundefined td.varundefined {
		background-color: #ccddff;
	}

	table.cfdump_array {
		background-color: #006600 ;
	}
	table.cfdump_array th.array {
		background-color: #009900 ;
	}
	table.cfdump_array td.array {
		background-color: #ccffcc ;
	}

	table.cfdump_query {
		background-color: #884488 ;
	}
	table.cfdump_query th.query {
		background-color: #aa66aa ;
	}
	table.cfdump_query td.query {
		background-color: #ffddff ;
	}


	table.cfdump_cfc {
		background-color: #ff0000;
	}
	table.cfdump_cfc th.cfc{
		background-color: #ff4444;
	}
	table.cfdump_cfc td.cfc {
		background-color: #ffcccc;
	}


	table.cfdump_object {
		background-color : #ff0000;
	}
	table.cfdump_object th.object{
		background-color: #ff4444;
	}

	table.cfdump_binary {
		background-color : #eebb00;
	}
	table.cfdump_binary th.binary {
		background-color: #ffcc44;
	}
	table.cfdump_binary td {
		font-size: x-small;
	}
	table.cfdump_udf {
		background-color: #aa4400;
	}
	table.cfdump_udf th.udf {
		background-color: #cc6600;
	}
	table.cfdump_udfarguments {
		background-color: #dddddd;
	}
	table.cfdump_udfarguments th {
		background-color: #eeeeee;
		color: #000000;
	}

 


// for queries we have more than one td element to collapse/expand
	var expand = &quot;open&quot;;

	dump = function( obj ) {
		var out = &quot;&quot; ;
		if ( typeof obj == &quot;object&quot; ) {
			for ( key in obj ) {
				if ( typeof obj[key] != &quot;function&quot; ) out += key + &quot; , &quot;'&quot; , &quot;: &quot; , &quot;'&quot; , &quot; + obj[key] + &quot; , &quot;'&quot; , &quot;&lt;br>&quot; , &quot;'&quot; , &quot; ;
			}
		}
	}


	cfdump_toggleRow = function(source) {
		//target is the right cell
		if(document.all) target = source.parentElement.cells[1];
		else {
			var element = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>0;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					element = source.parentNode.childNodes[i];
					break;
				}
			}
			if(element == null)
				target = source.parentNode.lastChild;
			else
				target = element;
		}
		//target = source.parentNode.lastChild ;
		cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
	}

	cfdump_toggleXmlDoc = function(source) {

		var caption = source.innerHTML.split( &quot; , &quot;'&quot; , &quot; [&quot; , &quot;'&quot; , &quot; ) ;

		// toggle source (header)
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ) {
			// closed -> short
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [short version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to maximize&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else if ( source.innerHTML.indexOf(&quot; , &quot;'&quot; , &quot;[short version]&quot; , &quot;'&quot; , &quot;) != -1 ) {
			// short -> full
			source.innerHTML = caption[0] + &quot; , &quot;'&quot; , &quot; [long version]&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		} else {
			// full -> closed
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			source.innerHTML = caption[0] ;
			switchLongToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
			switchShortToState = &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}

		// Toggle the target (everething below the header row).
		// First two rows are XMLComment and XMLRoot - they are part
		// of the long dump, the rest are direct children - part of the
		// short dump
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				if ( i &lt; 3 ) cfdump_toggleTarget( target, switchLongToState ) ;
				else cfdump_toggleTarget( target, switchShortToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			var row = 1;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if( target.style ) {
					if ( row &lt; 3 ) {
						cfdump_toggleTarget( target, switchLongToState ) ;
					} else {
						cfdump_toggleTarget( target, switchShortToState ) ;
					}
					row++;
				}
			}
		}
	}

	cfdump_toggleTable = function(source) {

		var switchToState = cfdump_toggleSource( source ) ;
		if(document.all) {
			var table = source.parentElement.parentElement ;
			for ( var i = 1; i &lt; table.rows.length; i++ ) {
				target = table.rows[i] ;
				cfdump_toggleTarget( target, switchToState ) ;
			}
		}
		else {
			var table = source.parentNode.parentNode ;
			for ( var i = 1; i &lt; table.childNodes.length; i++ ) {
				target = table.childNodes[i] ;
				if(target.style) {
					cfdump_toggleTarget( target, switchToState ) ;
				}
			}
		}
	}

	cfdump_toggleSource = function( source ) {
		if ( source.style.fontStyle == &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; || source.style.fontStyle == null) {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;normal&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to collapse&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; ;
		} else {
			source.style.fontStyle = &quot; , &quot;'&quot; , &quot;italic&quot; , &quot;'&quot; , &quot; ;
			source.title = &quot; , &quot;'&quot; , &quot;click to expand&quot; , &quot;'&quot; , &quot; ;
			return &quot; , &quot;'&quot; , &quot;closed&quot; , &quot;'&quot; , &quot; ;
		}
	}

	cfdump_toggleTarget = function( target, switchToState ) {
		if ( switchToState == &quot; , &quot;'&quot; , &quot;open&quot; , &quot;'&quot; , &quot; )	target.style.display = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot; ;
		else target.style.display = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot; ;
	}

	// collapse all td elements for queries
	cfdump_toggleRow_qry = function(source) {
		expand = (source.title == &quot;click to collapse&quot;) ? &quot;closed&quot; : &quot;open&quot;;
		if(document.all) {
			var nbrChildren = source.parentElement.cells.length;
			if(nbrChildren > 1){
				for(i=nbrChildren-1;i>0;i--){
					target = source.parentElement.cells[i];
					cfdump_toggleTarget( target,expand ) ;
					cfdump_toggleSource_qry(source);
				}
			}
			else {
				//target is the right cell
				target = source.parentElement.cells[1];
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
		else{
			var target = null;
			var vLen = source.parentNode.childNodes.length;
			for(var i=vLen-1;i>1;i--){
				if(source.parentNode.childNodes[i].nodeType == 1){
					target = source.parentNode.childNodes[i];
					cfdump_toggleTarget( target,expand );
					cfdump_toggleSource_qry(source);
				}
			}
			if(target == null){
				//target is the last cell
				target = source.parentNode.lastChild;
				cfdump_toggleTarget( target, cfdump_toggleSource( source ) ) ;
			}
		}
	}

	cfdump_toggleSource_qry = function(source) {
		if(expand == &quot;closed&quot;){
			source.title = &quot;click to expand&quot;;
			source.style.fontStyle = &quot;italic&quot;;
		}
		else{
			source.title = &quot;click to collapse&quot;;
			source.style.fontStyle = &quot;normal&quot;;
		}
	}

 No Errors. Good Job!! 
							
						
					
					
						Close
					
				
			
		
		
		
			test
			
		
			
				
				
				
						
							
						
						
							
							
						
						
						
								--Select Layout--
								
									NoBannerLeftMenuOneArea
								
									BannerLeftMenu
								
									TopMenuOneSection
								
									NoBannerRightMenuOneArea
								
									NoMenu
								
									TopMenuTwoSection
								
									NoMenuTwoSection
								
									NoBannerLeftMenuTwoArea
								
									Mobile
								
								
							
						
						
						
								--Change View--
								
										Quick Quote
									
										HO - New Quote
									
										HO - Policy Endorsement
									
										HO - Billing or Interest Endorsement
									
										Quick Quote
									
							
						
						
								Public
								Agent
								Internal
							
						
						
							
								--Change Manual--
								HO - 2020
								HO - 2132
								HOEG - 2133
								PPA - 2510
							
						
						
							
								--Enable Free Menu Navigation--
								Free Menu Navigation - Yes
								Free Menu Navigation - No
							
						
				
			
		
	
		
		
	id(&quot;PriorClaimCount&quot;)&quot;))]</value>
      <webElementGuid>459c7a5a-102e-4b44-b839-04a1358b4501</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
