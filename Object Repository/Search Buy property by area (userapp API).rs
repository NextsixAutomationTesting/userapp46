<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Search Buy property by area (userapp API)</name>
   <tag></tag>
   <elementGuidId>ab590322-79bd-4362-8aed-10e3e9825605</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot; {\n    \&quot;propertyListing\&quot;:\&quot;\&quot;,\n    \&quot;for\&quot;:\&quot;Buy\&quot;, \n    \&quot;area\&quot;:\&quot;Labu\&quot;,\n    \&quot;state\&quot;:\&quot;Negeri Sembilan\&quot;,\n    \&quot;categoryListing\&quot;:\&quot;Residential\&quot;,\n  \&quot;paging\&quot;:{ \&quot;page\&quot;:1,\n    \&quot;size\&quot;:100},\n  \&quot;sorting\&quot;:\&quot;sort1\&quot;\n  }&quot;,
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
      <webElementGuid>57473240-d2cc-476f-b7ee-d5311bd1b0db</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${SITAPI}/properties/search</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.SITAPI</defaultValue>
      <description></description>
      <id>d725daca-cad0-4dbb-9e99-811e41997c60</id>
      <masked>false</masked>
      <name>SITAPI</name>
   </variables>
   <variables>
      <defaultValue>6</defaultValue>
      <description></description>
      <id>6f2f8765-dc27-480a-949c-7a6af6250f66</id>
      <masked>false</masked>
      <name>page</name>
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

WS.verifyElementPropertyValue(response, 'data'+[i]+'.for', &quot;Buy&quot;)
WS.verifyElementPropertyValue(response, 'data'+[i]+'.agent.active', &quot;In Service&quot;)

//WS.verifyElementPropertyValue(response, 'data'+[i]+'.propertyListing', &quot;Projects&quot;)


WS.verifyElementPropertyValue(response, 'data'+[i]+'.categoryListing', &quot;Residential&quot;)
WS.verifyElementPropertyValue(response, 'data'+[i]+'.active', true)
WS.verifyElementPropertyValue(response, 'data'+[i]+'.address.area', &quot;Labu&quot;)

}










</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
