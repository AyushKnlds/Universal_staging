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

WebUI.callTestCase(findTestCase('users/TC_1'), [('username') : 'newuser55444@outlook.com', ('password') : 'User123@'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.navigateToUrl('https://universal.3tlstaging.com/manage-account/point-history')

WebUI.verifyElementText(findTestObject('Object Repository/verify points (1000)/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-cell_You earned points for submitting a_6ccf1f'), 
    'You earned points for submitting an approved receipt.')

WebUI.verifyElementText(findTestObject('demo plus sign'), '+')

WebUI.verifyElementPresent(findTestObject('verify points (1000)/Page_Universal All-Access Rewards  Get Rewa_700d57/mat-cell_1000'), 
    0)

