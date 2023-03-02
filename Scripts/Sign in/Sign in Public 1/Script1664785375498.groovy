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

Mobile.startApplication(GlobalVariable.UserappAPK, true)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/android.widget.TextView - Lets Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip (1)'), 0)

Mobile.tap(findTestObject('mobile/Profile 3'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Email'), 'peter@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Password'), '2', 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - The email or password you entered is incorrect'), 
    'The email or password you entered is incorrect.')

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Try Again'), 0)

Mobile.clearText(findTestObject('Object Repository/mobile/android.widget.EditText -'), 0)

Mobile.setText(findTestObject('mobile/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('mobile/android.widget.TextView - Sign In (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Peter'), 'Peter')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - petergmail.com'), 'peter@gmail.com')

'Sign out button\r\n'
Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('mobile/Profile 3'), 0)

Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - Sign In'), 'Sign In')

