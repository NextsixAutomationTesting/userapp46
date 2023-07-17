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

WebUI.callTestCase(findTestCase('Others and Knowledgebase/Quick walkthrough'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Get Agent'), 'Get Agent')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Property'), 'Property')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - My Likes'), 'My Likes')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Home Pro'), 'Home Pro')

xcoord = Mobile.getAttribute(findTestObject('mobile/Shortcut/android.widget.TextView - Home Pro1'), 'x', 0)

ycoord = Mobile.getAttribute(findTestObject('mobile/Shortcut/android.widget.TextView - Home Pro1'), 'y', 0)

int ycoord = ((ycoord) as Integer)
int xcoord = ((xcoord) as Integer)
println(xcoord)

println(ycoord)

'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(799, ycoord, 300, ycoord)

Mobile.swipe(799, ycoord, 300, ycoord)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Home Mall (1)'), 'Home Mall')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Calculator (1)'), 'Calculator')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Zero Deposit - Copy'), 
    'Zero Deposit')

//////// END verification ///////// ////
//def attr = Mobile.getElementHeight(findTestObject('android.widget.TextView - Zero Deposit'), 0)
//println(attr)
//'Get Device Height and Store in device_height variable'
//device_Height = Mobile.getDeviceHeight()
//println(device_Height)
//'Get Device Width and Store in device_Width variable'
//device_Width = Mobile.getDeviceWidth()
//println(device_Width)
//'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
//int startY = 828
//'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
//int endY = startY
//'Storing the startX value'
//int startX = device_Width * 0.74
//'Storing the endX value'
//int endX = device_Width * 0.30
//Mobile.swipe(startX, startY, endX, endY)
//Mobile.swipe(692, 800, 450, 800)
//'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(799, ycoord, 300, ycoord)

/*'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
int startY = 828

'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
int endY = startY

'Storing the startX value'
int startX = device_Width * 0.30

'Storing the endX value'
int endX = device_Width * 0.74*/
WebUI.delay(2)

//'Here Y constant for Swipe Vertical right to left'
//Mobile.swipe(400, ycoord, 692, ycoord)
//'Here Y constant for Swipe Vertical right to left'
//Mobile.swipe(799, ycoord, 300, ycoord)
Mobile.swipe(300, ycoord, 799, ycoord)

Mobile.swipe(300, ycoord, 799, ycoord)

Mobile.tap(findTestObject('mobile/Shortcut/android.widget.TextView - Get Agent (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Kuchai Lama (1)'), 
    'Kuchai Lama')

Mobile.getText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - 15 Agents Nearby (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Property (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - 50 Properties Nearby (1)'), 
    '50+ Properties Nearby')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - My Likes (1)'), 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In'), 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Email'), 'parker@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/mobile/android.widget.EditText - Password'), '1', 0)

Mobile.tap(findTestObject('Object Repository/mobile/android.widget.TextView - Sign In (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - My Likes (2)'), 'My Likes')

//xcoor = Mobile.getAttribute(findTestObject('mobile/Shortcut/android.widget.TextView - My Likes (2)'), 'x', 0)
//
//ycoor = Mobile.getAttribute(findTestObject('mobile/Shortcut/android.widget.TextView - My Likes (2)'), 'y', 0)
//
//println(xcoor)
//
//println(ycoor)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (2)'), 0)


Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Home Pro (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - HomePro'), 'HomePro')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Banker'), 'Banker')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Lawyer'), 'Lawyer')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (4)'), 0)

WebUI.delay(6)

Mobile.swipe(799, ycoord, 300, ycoord)

Mobile.swipe(799, ycoord, 300, ycoord)

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Calculator (1)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('mobile/Shortcut/android.widget.TextView - Mortgage Loan Calculator (1)'), 'Mortgage Loan Calculator')

Mobile.tap(findTestObject('mobile/Shortcut/back button mortagage'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - Calculator (1)'), 'Calculator')


Mobile.tap(findTestObject('mobile/Shortcut/android.widget.TextView - Zero Deposit - Copy'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - BlueDuck Registration'), 
    'BlueDuck Registration')

Mobile.verifyElementText(findTestObject('Object Repository/mobile/Shortcut/android.widget.EditText - 883999-39-9393'), '950522-87-5015')

Mobile.tap(findTestObject('Object Repository/mobile/Shortcut/android.widget.TextView - (3)'), 0)


//Mobile.swipe(startX, startY, endX, endY)
'Here Y constant for Swipe Vertical Left to Right'
Mobile.swipe(799, ycoord, 300, ycoord)

Mobile.swipe(799, ycoord, 300, ycoord)

