<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>homesearchbar - Buy</name>
   <tag></tag>
   <elementGuidId>84956544-ce64-4762-bb73-38098755237a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;area\&quot;: \&quot;${area}\&quot;,\n\&quot;auction\&quot;: {\n\&quot;from\&quot;: \&quot;\&quot;,\n\&quot;to\&quot;: \&quot;\&quot;\n},\n\&quot;baths\&quot;: \&quot;\&quot;,\n\&quot;beds\&quot;: \&quot;\&quot;,\n\&quot;carParks\&quot;: \&quot;\&quot;,\n\&quot;categoryListing\&quot;: \&quot;Residential\&quot;,\n\&quot;for\&quot;: \&quot;Buy\&quot;,\n\&quot;furnishing\&quot;: \&quot;\&quot;,\n\&quot;propertyListing\&quot;: \&quot;Subsale\&quot;,\n\&quot;search\&quot;: \&quot;\&quot;,\n\&quot;state\&quot;: \&quot;${state}\&quot;,\n\&quot;target\&quot;: \&quot;Buy\&quot;,\n\&quot;tenure\&quot;: \&quot;\&quot;,\n\&quot;type\&quot;: \&quot;\&quot;,\n\&quot;selectedQuickSearch\&quot;: {\n\&quot;quickSearchProperty\&quot;: \&quot;\&quot;,\n\&quot;quickSearchState\&quot;: \&quot;${state}\&quot;,\n\&quot;quickSearchArea\&quot;: \&quot;${area}\&quot;\n},\n\&quot;paging\&quot;: {\n\&quot;page\&quot;: 1,\n\&quot;size\&quot;: 50\n},\n\&quot;sorting\&quot;: null\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>eeab5bd4-c379-4a96-93f4-d21881219805</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://apps.nextsix.com/properties/search</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'Subang Jaya'</defaultValue>
      <description></description>
      <id>8cc52eb6-00aa-4137-bea5-007f468dfeb1</id>
      <masked>false</masked>
      <name>area</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable


ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
def slurper = new JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

	
def value = result.data.size()

println value

for(int i = 0; i&lt;value; i++) {

WS.verifyElementPropertyValue(response, 'data'+[i]+'.for', &quot;Rent&quot;)
WS.verifyElementPropertyValue(response, 'data'+[i]+'.agent.active', &quot;In Service&quot;)

//WS.verifyElementPropertyValue(response, 'data'+[i]+'.propertyListing', &quot;Projects&quot;)


WS.verifyElementPropertyValue(response, 'data'+[i]+'.categoryListing', &quot;Residential&quot;)
WS.verifyElementPropertyValue(response, 'data'+[i]+'.active', true)
WS.verifyElementPropertyValue(response, 'data'+[i]+'.address.area', GlobalVariable.area)

}











</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
