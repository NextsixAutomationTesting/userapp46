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
//address.full.Name is the specific jsonpath of the api
//println('...value extracted is :' + value)
//println('...value extracted is :' + value1)
//println('...Global Variable now is :' + GlobalVariable.fakename)
//println('...Global Variable now is :' + GlobalVariable.fakephone)
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import junit.framework.Assert as Assert

fakedata = WS.sendRequest(findTestObject('api/Get user fake data', [('fakename') : GlobalVariable.fakename, ('fakephone') : GlobalVariable.fakephone]))

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(fakedata.getResponseBodyContent())

def value = result.address.Full_Name

def value1 = result.address.Telephone

GlobalVariable.fakename = value

GlobalVariable.fakephone = value1

String phone = GlobalVariable.fakephone
String fakename = GlobalVariable.fakename

fakenametrim = fakename.replaceAll("\\s","").toLowerCase()
GlobalVariable.fakeemail = fakenametrim
println GlobalVariable.fakename
println GlobalVariable.fakeemail

Pattern regexPat = Pattern.compile('.{0,11}$' //
    )

Matcher mat = regexPat.matcher(phone)

if (mat.find()) {
    String res = mat.group()

    res2 = res.replaceAll(~('\\s') , '')

    GlobalVariable.fakephone = res2

 // println GlobalVariable.fakephone+1

    if (GlobalVariable.fakephone.length() == 9) {
        println('...Number is good')
		println(GlobalVariable.fakephone) 
		if (GlobalVariable.fakephone.startsWith("11")) {String res3 = GlobalVariable.fakephone+1 
			GlobalVariable.fakephone = res3
			println GlobalVariable.fakephone}
		
    }else {	
		String res3 = GlobalVariable.fakephone+1
		GlobalVariable.fakephone = res3
        println GlobalVariable.fakephone
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        