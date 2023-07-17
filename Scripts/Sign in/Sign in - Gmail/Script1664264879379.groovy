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

Mobile.startApplication(GlobalVariable.UserappAPK, true, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Lets Get Started'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Skip'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 3'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('sign in with gmail/android.widget.TextView - Sign In with Google'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('sign in with gmail/android.widget.TextView - Qhru Tarmizi (1)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('sign in with gmail/android.widget.TextView - qhru00gmail.com (1)'), 'qhru00@gmail.com', 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('sign in with gmail/android.widget.TextView - Qhru Tarmizi'), 'Qhru Tarmizi', FailureHandling.STOP_ON_FAILURE)

'Sign out button\r\n'
Mobile.tap(findTestObject('sign in with gmail/sign out 1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('mobile/Profile 3'), 0)

Mobile.verifyElementText(findTestObject('mobile/android.widget.TextView - Sign In'), 'Sign In')

//Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Submit'), 0)
Mobile.closeApplication()

