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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileBy as MobileBy
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.ios.IOSDriver as IOSDriver
import java.io.IOException as IOException
import java.net.URL as URL
import org.junit.Test as Test
import org.junit.runner.RunWith as RunWith
import org.junit.runners.JUnit4 as JUnit4
import org.openqa.selenium.By as By
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

Mobile.startApplication(GlobalVariable.UserappAPK, true)

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

response = WS.sendRequest(findTestObject('Flag management Deep Link'))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(response.getResponseBodyContent())

print(result)

Mobile.startExistingApplication('com.google.android.keep', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/mobile/flag management deep link/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('mobile/flag management deep link/android.widget.EditText - Note'), 'https://sit-apps.nextsix.com/f/623814fe2c5d690032939973', 
    0)

Mobile.tap(findTestObject('Object Repository/mobile/flag management deep link/android.widget.ViewSwitcher'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/flag management deep link/android.widget.TextView - Open'), 0)

WebUI.delay(2)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/flag management deep link/android.widget.TextView - Labu'), 
    'Labu')

