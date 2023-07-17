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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startApplication(GlobalVariable.UserappAPK, true, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 2'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - forgot password'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Forgot'), 'Forgot')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Password'), 'Password')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Dont worry we got you covered, just enter your registered email'), 
    'Don\'t worry we got you covered, just enter your registered email.')

Mobile.setText(findTestObject('Object Repository/forgot password/android.widget.EditText - Email'), 'fnextsix@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - Send'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Reset'), 'Reset')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Password (1)'), 'Password')

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - An email with instructions to reset your password has been sent to your email account'), 
    'An email with instructions to reset your password has been sent to your email account.')

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - Ok'), 0)

Mobile.delay(25, FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.google.android.gm', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.EditText - Search in mail'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Search in mail (2)'), 'nextsix', 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Search for nextsix in mail'), 0)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - Reset your password'), 0)

Mobile.swipe(200, 1800, 200, 900)
Mobile.swipe(200, 1800, 200, 900)
Mobile.swipe(200, 1800, 200, 900)
Mobile.swipe(200, 1800, 200, 900)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.TextView - Visit this link to reset your password'), 
    0)

String name = RandomStringUtils.randomAlphabetic(6)

password = name

println(password)

Mobile.setText(findTestObject('Object Repository/forgot password/android.widget.EditText'), password, 0)

Mobile.setText(findTestObject('Object Repository/forgot password/android.widget.EditText (1)'), password, 0)

Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.Button - Submit'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/forgot password/android.widget.TextView - Successfully change password, please login via app'), 
    'Successfully change password, please login via app.')

Mobile.tap(findTestObject('forgot password/android.widget.ImageButton'), 0)

//Mobile.tap(findTestObject('Object Repository/forgot password/android.widget.ImageButton (2)'), 0)
Mobile.startExistingApplication('com.nextsix.property', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Password'), password, 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('forgot password/android.widget.TextView - fnextsix'), 'fnextsix@gmail.com')

Mobile.closeApplication()

