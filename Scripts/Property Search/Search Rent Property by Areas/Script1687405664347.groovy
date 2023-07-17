import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

Mobile.startApplication(GlobalVariable.UserappAPK, true)

response = WS.sendRequestAndVerify(findTestObject('mobile/Search by area (userapp API)', [('SITAPI') : GlobalVariable.SITAPI, ('page') : '']))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def totalprop = result.summary.records

println(totalprop)

def firstprop = result.data[0].name

def lastprop = result.data[(totalprop - 1)].name

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Get Agent Nearby'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Property'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Property search by area/android.widget.TextView - Rent (1)'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/Property search by area/android.widget.EditText - Search property here'), 
    'Kuchai Lama', 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai Lama - AreaState'), 
    0)	
KeywordUtil.logInfo(totalprop + ' Properties Nearby')

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - 18 Properties Nearby', 
        [('total') : totalprop]), totalprop + ' Properties Nearby')


Mobile.swipe(489, 1651, 489, 289)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Default'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Date (New to Old)'), 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Apply'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(489, 293, 490, 1300)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
Mobile.swipe(489, 1600, 489, 1650)
KeywordUtil.logInfo(firstprop)

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - kuchai East 999', [('prop') : firstprop]), 
    firstprop)


Mobile.swipe(835, 1850, 39, 1850)

Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)
Mobile.swipe(835, 1850, 39, 1850)


println(lastprop)

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - Kuchai East 17 (Rent)', 
        [('LASTPROPERTY') : lastprop]), lastprop)

Mobile.swipe(489, 1651, 489, 289)

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - Kuchai East 17 (Rent) (2)', 
        [('1stprop') : firstprop]), firstprop)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)
Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)


Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - Kuchai East 17 (Rent)', 
        [('LASTPROPERTY') : lastprop]), lastprop)

Mobile.closeApplication()

