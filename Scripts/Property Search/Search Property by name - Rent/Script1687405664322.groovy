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

response = WS.sendRequest(findTestObject('Search property by name - Buy'), FailureHandling.CONTINUE_ON_FAILURE)

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

def name = result.documents[0].name

println(name)

Mobile.startApplication(GlobalVariable.UserappAPK, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Get Agent Nearby'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Property'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Rent'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/mobile/Property search by area/android.widget.EditText - Search property here'), 
    'jalan tiara ', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Property search by area/android.widget.TextView - Jalan tiara sendayan - Bungalow - 1'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

//Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - Jalan tiara sendayan - Bungalow 22'), 
//   name)
Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Jalan tiara sendayan (2)'), 
    name, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - 1 Property Nearby'), 
    '1 Property Nearby', FailureHandling.CONTINUE_ON_FAILURE)

