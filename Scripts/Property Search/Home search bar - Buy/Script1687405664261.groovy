import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.NumberFormat as NumberFormat
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

def area = 'Seremban'

def state = 'Negeri Sembilan'

response = WS.sendRequest(findTestObject('Object Repository/homesearchbar - Buy', [('area') : area, ('state') : state]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def TOTALPROP = result.summary.records

def FIRSTPROP = result.data[0].name

def LASTPROP = result.data[(TOTALPROP - 1)].name

def FIRSTPRICE = result.data[0].buy.price

def LASTPRICE = result.data[(TOTALPROP - 1)].buy.price

String FIRSTPRICEAFTERFORMAT = 'RM ' + NumberFormat.getIntegerInstance().format(FIRSTPRICE)

String LASTPRICEAFTERFORMAT = 'RM ' + NumberFormat.getIntegerInstance().format(LASTPRICE)

FIRSTPRICEAFTERFORMAT1 = (FIRSTPRICEAFTERFORMAT + '.00')

LASTPRICEAFTERFORMAT1 = (LASTPRICEAFTERFORMAT + '.00')

def value = result.data.size()

KeywordUtil.logInfo((((('totalprop: ' + TOTALPROP) + ' FIRSTPROP: ') + FIRSTPROP) + 'LASTPROP: ') + LASTPROP)

'Validation on API'
for (int i = 0; i < value; i++) {
    WS.verifyElementPropertyValue(response, ('data' + [i]) + '.for', 'Buy')

    WS.verifyElementPropertyValue(response, ('data' + [i]) + '.agent.active', 'In Service')

    //WS.verifyElementPropertyValue(response, 'data'+[i]+'.propertyListing', "Projects")
    WS.verifyElementPropertyValue(response, ('data' + [i]) + '.categoryListing', 'Residential')

    WS.verifyElementPropertyValue(response, ('data' + [i]) + '.active', true)

    WS.verifyElementPropertyValue(response, ('data' + [i]) + '.address.area', area)
}

Mobile.startApplication(GlobalVariable.UserappAPK, true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView - Buy'), 0)
//
//Mobile.tap(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView - Rent'), 0)
Mobile.tap(findTestObject('Object Repository/mobile/Home search bar/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/Home search bar/android.widget.EditText - Search locationproperty here'), 
    area, 0)

Mobile.delay(5)

Mobile.tap(findTestObject('mobile/Home search bar/android.widget.TextView - Seremban - AreaState11', [('area') : area]), 
    0)

//Mobile.tap(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView -'), 0)
Mobile.verifyElementText(findTestObject('mobile/Home search bar/android.widget.TextView - Bungalow labu', [('FIRSTPROP') : FIRSTPROP]), 
    FIRSTPROP)

Mobile.verifyElementText(findTestObject('mobile/Home search bar/android.widget.TextView - RM 4,500,000', [('FIRSTPRICEAFTERFORMAT') : FIRSTPRICEAFTERFORMAT]), 
    FIRSTPRICEAFTERFORMAT)

def max_swipes1 = 25

def swipecount1 = 0

while (swipecount1 < max_swipes1) {
    Mobile.swipe(700, 1770, 40, 1770)

    swipecount1++
}

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView - Labu Apartment One 08.02-14.00.33', 
        [('LASTPROP') : LASTPROP]), LASTPROP)

Mobile.verifyElementText(findTestObject('mobile/Home search bar/android.widget.TextView - RM 69,499', [('LASTPRICEAFTERFORMAT') : LASTPRICEAFTERFORMAT]), 
    LASTPRICEAFTERFORMAT)

Mobile.swipe(489, 1666, 800, 489)

//Mobile.verifyElementText(findTestObject('mobile/Home search bar/android.widget.TextView - RM 4,500,000.00', [('LASTPRICEAFTERFORMAT1') : LASTPRICEAFTERFORMAT1]), 
//    LASTPRICEAFTERFORMAT1)
Mobile.verifyElementText(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView - Bungalow labu (1)', 
        [('FIRSTPROP') : FIRSTPROP]), FIRSTPROP)

Mobile.verifyElementText(findTestObject('mobile/Home search bar/android.widget.TextView - RM 4,500,000', [('FIRSTPRICEAFTERFORMAT') : FIRSTPRICEAFTERFORMAT1]), 
    FIRSTPRICEAFTERFORMAT1)

def max_swipes = 30

def swipecount = 0

while (swipecount < max_swipes) {
    Mobile.swipe(489, 1666, 800, 489)

    swipecount++
}

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView - RM 69,499.00', 
        [('LASTPRICEAFTERFORMAT1') : LASTPRICEAFTERFORMAT1]), LASTPRICEAFTERFORMAT1)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Home search bar/android.widget.TextView - Labu Apartment One 08.02-14.00.33 (1)', 
        [('LASTPROP') : LASTPROP]), LASTPROP)

Mobile.closeApplication()

