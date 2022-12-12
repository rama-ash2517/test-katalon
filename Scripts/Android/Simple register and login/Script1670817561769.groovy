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

Mobile.startApplication('/Users/ramadhanash/Documents/Learn/Selenium/Katalon2/test-katalon.git/Apps/Android-NativeDemoApp-0.4.0.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Sign up'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Email'), 'rama-test@testing.com', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Password'), '12345678', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Confirm password'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup'), 0)

String msg = Mobile.getText(findTestObject('Object Repository/Android/android.widget.TextView - You successfully signed up'), 
    0)

Mobile.verifyElementText(findTestObject('Android/android.widget.TextView - You successfully signed up'), msg)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - rama-testtesting.com'), 'rama-test@testing.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText -'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup (1)'), 0)

String loginMsg = Mobile.getText(findTestObject('Object Repository/Android/android.widget.TextView - You are logged in'), 
    0)

Mobile.verifyElementText(findTestObject('Android/android.widget.TextView - You are logged in'), loginMsg)

Mobile.tap(findTestObject('Android/android.widget.Button - OK'), 0)

Mobile.closeApplication()

