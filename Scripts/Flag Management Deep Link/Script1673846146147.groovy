import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.UserappAPK, true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

response = WS.sendRequest(findTestObject('Flag management Deep Link'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

KeywordUtil.logInfo(result)

Mobile.startExistingApplication('com.google.android.keep', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/mobile/flag management deep link/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('mobile/flag management deep link/android.widget.EditText - Note'), result, 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/deeplink'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/flag management deep link/android.widget.TextView - Open'), 0)

WebUI.delay(3)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/flag management deep link/android.widget.TextView - Labu'), 
    'Labu')
