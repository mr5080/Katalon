<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>tr_ISi Login                               _684404</name>
   <tag></tag>
   <elementGuidId>f128083d-02c3-410c-87e9-8a21bca6e04d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='LogonForm']/table/tbody/tr[3]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>tr</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                    
                        ISi Login:
                        
                        
                        
                        
                            AGENT CODE:
							
                            
                            USERNAME:
							
                            
                            PASSWORD:
							
                            
                            
                           
                        
                    
                    
                    	
                    		Internet Solutions for Insurance
                    	
	                   	
								
								
									
 									
								
								
									function ResetButtonPress(){
										// location.href='index.cfm?isPwdRest=1'
										$('#LogonForm').attr('onsubmit', 'return true');
										$('#LogonForm').attr('action', &quot;index.cfm?isPwdRest=1&quot;).submit();
									}
								
							
								
								
									
 									
								
							
            
        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;LogonForm&quot;)/table[1]/tbody[1]/tr[3]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='LogonForm']/table/tbody/tr[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='(3)You have entered an invalid Password, ID or Username.'])[1]/following::tr[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//tr[3]</value>
   </webElementXpaths>
</WebElementEntity>
