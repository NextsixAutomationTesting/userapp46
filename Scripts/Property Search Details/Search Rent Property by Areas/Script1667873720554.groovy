import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.startApplication(GlobalVariable.UserappAPK, true)

response = WS.sendRequest(findTestObject('mobile/Search by area (userapp API)', [('SITAPI') : GlobalVariable.SITAPI, ('page') : '']))

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

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - 18 Properties Nearby', 
        [('total') : totalprop]), totalprop + ' Properties Nearby')

Mobile.swipe(489, 1651, 489, 289)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Default'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Date (New to Old)'), 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Apply'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(489, 293, 489, 1700)

println(firstprop)

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - kuchai East 999', [('prop') : firstprop]), 
    firstprop)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

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

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - Kuchai East 17 (Rent)', 
        [('LASTPROPERTY') : lastprop]), lastprop)

Mobile.closeApplication()

