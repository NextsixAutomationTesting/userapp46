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

WS.sendRequest(findTestObject('Delete user - Copy'))

Mobile.startApplication(GlobalVariable.UserappAPK, true, FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat'('', '', '', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 2'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('sign in with gmail/android.widget.TextView - Sign In with Google'), 0, FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Tap cpntinue as qhru'), 0)

Mobile.tap(findTestObject('sign in with gmail/android.widget.TextView - Calvin Kurt (1)'), 0)

/*def status = */
Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - 60 Phone Number'), '179756473', 0, FailureHandling.CONTINUE_ON_FAILURE)

/*if (status == null) {
    WS.sendRequest(findTestObject('Delete user - Copy'))
}
else*/
Mobile.tap(findTestObject('mobile/android.widget.TextView - Submit new'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Get OTP'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText (1)'), GlobalVariable.otp, 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/android.widget.TextView - Submit new'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - Your phone number has been verified'), 'Your phone number has been verified.', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Ok (2)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Putrajaya'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Labuan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Selangor'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Agricultural Land'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - FactoryWarehouse'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next (1)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.view.ViewGroup (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (6)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (3)'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 2'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('sign in with gmail/android.widget.TextView - kurtcalvin9gmail.com'), 'kurtcalvin9@gmail.com', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('sign in with gmail/android.widget.TextView - Calvin Kurt (1)'), 'Calvin Kurt', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Delete Account'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Delete My Account'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 2'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (2)'), 'Sign In', FailureHandling.STOP_ON_FAILURE)

