import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
//Generate Random Alphanumerical

//WebUI.setText(findTestObject(null), 'RandomStringUtils.randomNumeric(10))')
//String randommail = RandomStringUtils.randomAlphabetic(10) + '@mymail.com'
//WebUI.setText(findTestObject('Object Repository/api/Page_The Next Six Agent (SIT)/input_User Name_username'), randommail)
//println('...value is :' + randommail)
//fakedata = WS.sendRequest(findTestObject('api/Get user fake data', [('fakename') : GlobalVariable.fakename, ('fakephone') : GlobalVariable.fakephone]))

// this is to extract api response from specific locator 
//response = WS.sendRequest(findTestObject('api/Get otp'))
//def slurper = new groovy.json.JsonSlurper()
//def result = slurper.parseText(fakedata.getResponseBodyContent())
//def value = result.address.Full_Name //address.full.Name is the specific jsonpath of the api
//def value1= result.address.Telephone
//println('...value extracted is :' + value) 
//println('...value extracted is :' + value1)
//GlobalVariable.fakename = value
//GlobalVariable.fakephone = value1
//println('...Global Variable now is :' + GlobalVariable.fakename)
//println('...Global Variable now is :' + GlobalVariable.fakephone)
////////////////////////////////////////////////////////////////////////////

//This is to use apache common lang 
//First use - import org.apache.commons.lang.RandomStringUtils as RandomStringUtils 
String randommail = RandomStringUtils.randomAlphabetic(10) + '@gmail.com'
String name = RandomStringUtils.randomAlphabetic(6)

println name


/*How to apply Regex
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String phone = '+60189843848'

Pattern regexPat = Pattern.compile('[^+60]+')

Matcher mat = regexPat.matcher(phone)

if (mat.find()) {
    String result = mat.group()

    GlobalVariable.fakephone = result

    println(GlobalVariable.fakephone) // pattern found:subpage/
} else {
    KeywordUtil.markFailed('Substring not found.')
}

import junit.framework.Assert

if (GlobalVariable.fakephone.length() < 10)
{
     
}
else
{
	println('...Global Variable now is more than 9')
}
*/

/*How to close mobile app if check forgot password steps 
	
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
Mobile.startExistingApplication(‘com.dencreak.dlcalculator’)
driver = MobileDriverFactory.getDriver()
driver.resetApp()
*/