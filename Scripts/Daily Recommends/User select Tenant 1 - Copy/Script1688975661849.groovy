import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI	

Mobile.startApplication('C:\\Users\\user\\Downloads\\newAPK (1).apk', true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

////test
Mobile.tap(findTestObject('Object Repository/Daily Recommend/Daily recommend'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/Daily Recommend/android.widget.EditText - Email'), 'peter@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Daily Recommend/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Sign In (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/Daily recommend'), 0)
Mobile.tap(findTestObject('Object Repository/Daily Recommend/tenant_buyer2'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Next'), 0)
Mobile.tap(findTestObject('Object Repository/Daily Recommend/new_buyer'), 0)
Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - State'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Negeri Sembilan'), 0)
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Area'), 0)
Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
Mobile.scrollToText('Sri Petaling')

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Labu'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Property Type'), 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/select_all_landed'), 0)

Mobile.pressBack()
	
Mobile.tapAtPosition(800, 300)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Next (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Daily Recommend/android.widget.EditText - Min'), '2000', 0)

Mobile.setText(findTestObject('Object Repository/Daily Recommend/android.widget.EditText - Max'), '4500', 0)

Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Match Now'), 0)

long startTime = System.currentTimeMillis()

response = WS.sendRequest(findTestObject('Daily Recommend/daily_recommend'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())
 
for (int i = 0; i < 5; i++) {
    def AIMATCHING = result.documents[0].properties[i]

    response2 = WS.sendRequestAndVerify(findTestObject('Daily Recommend/find_property_details', [('id') : AIMATCHING]))

    def findproperty = slurper.parseText(response2.getResponseBodyContent())

    println(AIMATCHING)

    def monthlyRental = findproperty.documents[0].rent.monthlyRental

    if (monthlyRental <= 2000) {
        KeywordUtil.markFailed('Step failed because condition was not met')
    }
    
    if (monthlyRental > 4500) {
        KeywordUtil.markFailed('Step failed because condition was not met')
    }
    
    println(monthlyRental)
}

//Mobile.tap(findTestObject('Object Repository/Daily Recommend/android.widget.TextView -'), 0)
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(400, 100, 400, 900)

GETPNNOTI = Mobile.getText(findTestObject('Object Repository/Daily Recommend/android.widget.TextView - Weve found you more properties you might be interested in (2)'), 
    300000)

println GETPNNOTI

long endTime = System.currentTimeMillis()

long totalTime = endTime - startTime

//Mobile.swipe(400, 800, 400, 200)
KeywordUtil.logInfo(('Time taken to appear: ' + (totalTime / 1000)) + ' seconds')


Mobile.tap(findTestObject('Object Repository/Daily Recommend/Weve found you more properties you might be interested in (1)'), 0)
Mobile.scrollToText('Exit')
//Mobile.tap(findTestObject('Daily Recommend/android.widget.TextView - Exit'), 0)



Mobile.swipe(400, 800, 400, 200)

Mobile.closeApplication()

