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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.keka.com/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/keka/Page_Keka Login/input_Login_Email'), 'ayush.kumar@knoldus.com')

WebUI.click(findTestObject('Object Repository/keka/Page_Keka Login/button_Login'))

WebUI.click(findTestObject('Object Repository/keka/Page_Log in/button_Login with Google'))

WebUI.click(findTestObject('Object Repository/keka/Page_Sign in  Google accounts/div_Terms of Service_VfPpkd-RLmnJb'))

WebUI.setEncryptedText(findTestObject('Object Repository/keka/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    '+G4AUJiLNsq0ecXEBpqR8Q==')

WebUI.click(findTestObject('Object Repository/keka/Page_Sign in  Google accounts/span_Next'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/keka/Page_Home  Dashboard/a_Me'))

WebUI.click(findTestObject('Object Repository/keka/Page_Me  Leave  Summary/a_Attendance'))

WebUI.click(findTestObject('Object Repository/keka/Page_Me  Attendance  Logs/span_Dec 28, Tue_ic-options icon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/keka/Page_Me  Attendance  Logs/a_Regularize'), 0)

WebUI.closeBrowser()

