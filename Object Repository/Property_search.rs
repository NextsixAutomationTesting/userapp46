<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Property_search</name>
   <tag></tag>
   <elementGuidId>99becde1-ffa4-4178-9c09-215f52b8a8de</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n     \&quot;dataSource\&quot;: \&quot;ClusterSIT\&quot;,\n     \&quot;database\&quot;: \&quot;trrappdb\&quot;,\n     \&quot;collection\&quot;: \&quot;realestates\&quot;,\n     \&quot;pipeline\&quot;:[\n\n         {\&quot;$match\&quot;:{\&quot;for\&quot;:\&quot;Rent\&quot;,\&quot;propertyListing\&quot;:\&quot;Subsale\&quot;,\&quot;active\&quot;:true,\&quot;categoryListing\&quot;:{\&quot;$in\&quot;:[\&quot;Residential\&quot;,\&quot;Commercial\&quot;]},\&quot;address.area\&quot;:\&quot;Kuchai Lama\&quot;}},\n{\n    \&quot;$lookup\&quot;:{\n      \n    \n  \&quot;from\&quot;: \&quot;agents\&quot;,\n  \&quot;localField\&quot;: \&quot;agent\&quot;,\n  \&quot;foreignField\&quot;: \&quot;_id\&quot;,\n  \&quot;as\&quot;: \&quot;status\&quot;\n\n\n    }\n},\n   \n\n  {\&quot;$match\&quot;:{\&quot;status\&quot;:{\&quot;$elemMatch\&quot;:{\&quot;active\&quot;:\&quot;In Service\&quot;}}}},\n\n  {\&quot;$sort\&quot;:{\&quot;updated\&quot;:-1}}\n      ]\n     \n }&quot;,
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
      <webElementGuid>db9cbc6f-e73c-4ff2-b038-f9a1766da3b6</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>api-key</name>
      <type>Main</type>
      <value>AKAFnW5WgyyOq3F3S2lVPcRhZr12qxZTTPjz0Llu1myg9jUSNjaVaGih51BZ8n60</value>
      <webElementGuid>647da32b-fbdc-42a1-ac9c-3d8b66e2ee0c</webElementGuid>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
for(int i = 0; i&lt;5; i++) {
        
WS.verifyElementPropertyValue(response, 'documents'+[i]+'.for', &quot;Rent&quot;)
//WS.verifyElementPropertyValue(response, 'documents'+[i]+'.name', &quot;kuchai East&quot;)
println(i);
}



</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
