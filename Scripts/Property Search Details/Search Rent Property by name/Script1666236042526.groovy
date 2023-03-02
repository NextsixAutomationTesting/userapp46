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

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Get Agent Nearby'), 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Property'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Rent'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/Property search by area/android.widget.EditText - Search property here'), 
    'Kuchai Lama', 0)

Mobile.tap(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai Lama - AreaState'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - 18 Properties Nearby'), 
    '18 Properties Nearby')

'first property'
Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai Avenue'), 
    'Kuchai Avenue')

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.swipe(835, 1765, 39, 1765)

Mobile.verifyElementText(findTestObject('mobile/Property search by area/android.widget.TextView - Zyablikovo Villa (1)'), 
    'Zyablikovo Villa ')

Mobile.swipe(489, 1651, 489, 289)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Kuchai Avenue (1)'), 
    'Kuchai Avenue')

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.swipe(0, 1745, 0, 289)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Property search by area/android.widget.TextView - Zyablikovo Villa (1)'), 
    'Zyablikovo Villa ')

Mobile.closeApplication()

for (def index : (0..0)) {
}

WS.sendRequest(findTestObject('mobile/Search by area (userapp API)', [('SITAPI') : GlobalVariable.SITAPI, ('page') : '']))

