<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Search property by name - Buy</name>
   <tag></tag>
   <elementGuidId>308f1898-bd02-4d9e-af64-c95047b85870</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n     \&quot;dataSource\&quot;: \&quot;ClusterSIT\&quot;,\n     \&quot;database\&quot;: \&quot;trrappdb\&quot;,\n     \&quot;collection\&quot;: \&quot;realestates\&quot;,\n     \&quot;pipeline\&quot;:[\n\n         {\&quot;$match\&quot;:{\&quot;for\&quot;:\&quot;Rent\&quot;,\&quot;propertyListing\&quot;:\&quot;Subsale\&quot;,\&quot;active\&quot;:true,\&quot;categoryListing\&quot;:\&quot;Residential\&quot;,\&quot;name\&quot;:\&quot;Jalan tiara sendayan\&quot;}},\n{\n    \&quot;$lookup\&quot;:{\n      \n    \n  \&quot;from\&quot;: \&quot;agents\&quot;,\n  \&quot;localField\&quot;: \&quot;agent\&quot;,\n  \&quot;foreignField\&quot;: \&quot;_id\&quot;,\n  \&quot;as\&quot;: \&quot;status\&quot;\n\n\n    }\n},\n   \n  {\&quot;$match\&quot;:{\&quot;status\&quot;:{\&quot;$elemMatch\&quot;:{\&quot;active\&quot;:\&quot;In Service\&quot;}}}},\n\n  {\&quot;$sort\&quot;:{\&quot;updated\&quot;:-1}}\n      ]\n     \n }&quot;,
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
      <webElementGuid>2612b92b-3499-4fb8-9cb4-dddb3cea81dc</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>api-key</name>
      <type>Main</type>
      <value>AKAFnW5WgyyOq3F3S2lVPcRhZr12qxZTTPjz0Llu1myg9jUSNjaVaGih51BZ8n60</value>
      <webElementGuid>2e819153-127a-4599-bd24-ff50d78760e7</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://data.mongodb-api.com/app/data-nnnyp/endpoint/data/beta/action/aggregate</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
WS.verifyElementPropertyValue(response, 'documents[0].name', &quot;Jalan tiara sendayan&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
