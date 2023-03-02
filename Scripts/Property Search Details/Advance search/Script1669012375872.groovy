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

Mobile.startApplication('C:\\Users\\user\\Downloads\\TesterSearchAdvanced.apk', true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Get Agent Nearby (3)'), 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Property (3)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Buy (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - (9)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - (10)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - (11)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Select (2)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Search property here (1)'), 
    0)

Mobile.setText(findTestObject('Object Repository/mobile/Property search by area/android.widget.EditText - Search locationproperty here (2)'), 
    'Kuchai lama', 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai Lama - AreaState (3)'), 
    0)

Mobile.swipe(477, 2100, 477, 1500)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Search (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - 3 Properties Nearby'), 
    '3 Properties Nearby')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Spring Avenue'), 
    'Spring Avenue')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - new east kuchai'), 
    'new east kuchai ')

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - (12)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai Lama'), 
    'Kuchai Lama')

Mobile.swipe(477, 2100, 477, 1500)

Mobile.closeApplication()

