import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

response = WS.sendRequest(findTestObject('Search property by name - Buy'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def name = result.documents[0].name

println(name)

Mobile.startApplication(GlobalVariable.UserappAPK, true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Get Agent Nearby'), 
    0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Property'), 0)

Mobile.tap(findTestObject('mobile/Property search by area/android.widget.TextView - Buy'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/Property search by area/android.widget.EditText - Search property here'), 
    'Gardenview Residence', 0)

Mobile.tap(findTestObject('mobile/Property search by area/android.widget.TextView - Gardenview Residence - Apartment'), 
    0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.view.View'), 0)

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - 4 Properties in Gardenview Residence'), 
    '4 Properties in Gardenview Residence')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Gardenview Residence (9D) 1'), 
    'Gardenview Residence (9D)')

Mobile.swipe(835, 2023, 39, 2023)

Mobile.swipe(835, 2023, 39, 2023)

Mobile.swipe(835, 2023, 39, 2023)

Mobile.swipe(835, 2023, 39, 2023)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Gardenview Residence (1B)'), 
    'Gardenview Residence (1B)')

Mobile.swipe(489, 1651, 489, 289)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Gardenview Residence (9D) (1)'), 
    'Gardenview Residence (9D)')

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.swipe(51, 1651, 462, 289)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Gardenview Residence (1B) (1)'), 
    'Gardenview Residence (1B)')

Mobile.closeApplication()

