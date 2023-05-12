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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startApplication(GlobalVariable.UserappAPK, true)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('mobile/Profile 2'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Create Account'), 0)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Get fake name and phone'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Name (2)'), 'gorden', null)
//WebUI.setText(findTestObject('mobile/android.widget.EditText - Name (1)'), 'gorden')
Mobile.setText(findTestObject('mobile/android.widget.EditText - Name'), GlobalVariable.fakename, 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Email (2)'), GlobalVariable.fakeemail + 
    '@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Mobile Number'), GlobalVariable.fakephone, 
    0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Password (1)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Confirm Password'), '1', 0)

Mobile.tap(findTestObject('mobile/android.widget.TextView - Sign Up'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Please key in your phone number for verification'), 
    'Please key in your phone number for verification.')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Get OTP'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText'), GlobalVariable.otp, 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Your phone number has been verified'), 
    'Your phone number has been verified.')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Kuala Lumpur'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Johor'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Kedah'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - AparmentFlat'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - CondoServiced Residence'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Suites'), 0)

Mobile.tap(findTestObject('mobile/android.widget.TextView - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (2)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (8)'), 0)

Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - Profile Name'), GlobalVariable.fakename)

Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - email profile'), GlobalVariable.fakeemail + '@gmail.com')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (9)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('mobile/Profile 2'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (4)'), 'Sign In')

