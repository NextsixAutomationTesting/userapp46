<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Saerch by property Master (Mongo)</name>
   <tag></tag>
   <elementGuidId>4ee0b823-29c2-4c63-a233-edb9fefb9a32</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n     \&quot;dataSource\&quot;: \&quot;ClusterSIT\&quot;,\n     \&quot;database\&quot;: \&quot;trrappdb\&quot;,\n     \&quot;collection\&quot;: \&quot;realestates\&quot;,\n     \&quot;pipeline\&quot;:[\n\n         {\&quot;$match\&quot;:{\&quot;for\&quot;:\&quot;Rent\&quot;,\&quot;propertyListing\&quot;:\&quot;Subsale\&quot;,\&quot;active\&quot;:true,\&quot;categoryListing\&quot;:\&quot;Residential\&quot;,\&quot;masterName\&quot;:\&quot;kuchai East\&quot;}},\n{\n    \&quot;$lookup\&quot;:{\n      \n    \n  \&quot;from\&quot;: \&quot;agents\&quot;,\n  \&quot;localField\&quot;: \&quot;agent\&quot;,\n  \&quot;foreignField\&quot;: \&quot;_id\&quot;,\n  \&quot;as\&quot;: \&quot;status\&quot;\n\n\n    }\n},\n   \n  {\&quot;$match\&quot;:{\&quot;status\&quot;:{\&quot;$elemMatch\&quot;:{\&quot;active\&quot;:\&quot;In Service\&quot;}}}},\n\n  {\&quot;$sort\&quot;:{\&quot;updated\&quot;:-1}}\n      ]\n     \n }&quot;,
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
      <webElementGuid>a448fac9-b0b6-4a31-9f35-5846a12412a6</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>api-key</name>
      <type>Main</type>
      <value>AKAFnW5WgyyOq3F3S2lVPcRhZr12qxZTTPjz0Llu1myg9jUSNjaVaGih51BZ8n60</value>
      <webElementGuid>2ff2c59f-96ce-4061-86d6-6dba87a37474</webElementGuid>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
