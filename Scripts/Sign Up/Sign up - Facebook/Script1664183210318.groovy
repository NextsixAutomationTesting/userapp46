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

Mobile.startApplication(GlobalVariable.UserappAPK, true, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In with Facebook'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

VERIFYPROFILEWORDING = Mobile.verifyElementText(findTestObject('mobile/Profile sdk44'), 'Profile', FailureHandling.OPTIONAL)

VERIFYELEMENTPREFEREDSTATE = Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - Select Your Preferred State'), 
    'Select Your Preferred State', FailureHandling.OPTIONAL)

println(VERIFYPROFILEWORDING)

println(VERIFYELEMENTPREFEREDSTATE)

if (VERIFYPROFILEWORDING == true) {
    WS.sendRequest(findTestObject('api/Delete Facebook user record'), FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('mobile/Tap home'), 0)

    Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('mobile/account deleted'), 'Account Deleted')

    Mobile.checkElement(findTestObject('mobile/android.widget.TextView - OK (3)'), 0)

    WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In with Facebook'), 1, FailureHandling.CONTINUE_ON_FAILURE //Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Delete Account'), 0, FailureHandling.STOP_ON_FAILURE)
        //Mobile.tap(findTestObject('mobile/Profile 2'), 0, FailureHandling.STOP_ON_FAILURE)
        )
} else if (VERIFYELEMENTPREFEREDSTATE == true) {
    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Putrajaya'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Labuan'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Selangor'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next (1)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Agricultural Land'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - FactoryWarehouse'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next (1)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('mobile/budget q3 - xpath'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (6)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (3)'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - stevecarel46gmail.com'), 
        'stevecarel46@gmail.com', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Steve Carel'), 'Steve Carel', 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('mobile/tap- signout button 1'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (2)'), 'Sign In', 
        FailureHandling.STOP_ON_FAILURE)

    WS.sendRequest(findTestObject('api/Delete Facebook user record'), FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - stevecarel46gmail.com'), 
        'stevecarel46@gmail.com', FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Steve Carel'), 'Steve Carel', 
        FailureHandling.STOP_ON_FAILURE)

    WS.sendRequest(findTestObject('api/Delete Facebook user record'), FailureHandling.STOP_ON_FAILURE)
}

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - 60 Phone Number'), '179756473', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (3)'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Get OTP'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText (1)'), GlobalVariable.otp, 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (4)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - Your phone number has been verified'), 'Your phone number has been verified.', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Ok (2)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Putrajaya'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Wilayah Persekutuan Labuan'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Selangor'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Agricultural Land'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - FactoryWarehouse'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Next (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/budget q3 - xpath'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Submit (6)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.ImageView (3)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - stevecarel46gmail.com'), 'stevecarel46@gmail.com', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Steve Carel'), 'Steve Carel', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/tap- signout button 1'), 0)

Mobile.tap(findTestObject('mobile/Profile 3'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile1/Profile 3'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (2)'), 'Sign In', FailureHandling.STOP_ON_FAILURE)

WS.sendRequest(findTestObject('api/Delete Facebook user record'), FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

