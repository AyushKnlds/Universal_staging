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

WebUI.navigateToUrl('https://universal.3tlstaging.com/upload-receipt')

WebUI.click(findTestObject('Object Repository/movie descrip upload page/Page_Universal All-Access Rewards  Get Rewa_700d57/img_Click here to see the full list_movies-image'))

WebUI.verifyElementText(findTestObject('Object Repository/movie descrip upload page/Page_Universal All-Access Rewards  Get Rewa_700d57/p_Daniel Craig returns one last time as Jam_22cb0d'), 
    'Daniel Craig returns one last time as James Bond, starring alongside Oscar® winner Rami Malek in No Time To Die. Bond has left active service and is enjoying a tranquil life in Jamaica. His peace is short-lived when his old friend Felix Leiter from the CIA turns up asking for help. The mission to rescue a kidnapped scientist turns out to be far more treacherous than expected, leading Bond onto the trail of a mysterious villain armed with dangerous new technology.')

WebUI.click(findTestObject('Object Repository/movie descrip upload page/Page_Universal All-Access Rewards  Get Rewa_700d57/span_close'))

WebUI.click(findTestObject('Object Repository/movie descrip upload page/Page_Universal All-Access Rewards  Get Rewa_700d57/img_Click here to see the full list_movies-image_1'))

WebUI.verifyElementText(findTestObject('Object Repository/movie descrip upload page/Page_Universal All-Access Rewards  Get Rewa_700d57/p_Screaming through the Nevada desert in a _99b3d6'), 
    'Screaming through the Nevada desert in a bullet-ridden Crown Vic, wily con artist Teddy Murretto (Frank Grillo) hatches a desperate plan to hide out from lethal hitman Bob Viddick (Gerard Butler): He sucker-punches rookie officer Valerie Young (Alexis Louder) to get himself arrested and locked up in a small-town police station. But jail can\'t protect Murretto for long. Viddick schemes his own way into detention, biding his time in a nearby cell until he can complete his mission. When the arrival of a competing assassin (Toby Huss) ignites all-out mayhem, mounting threats force Viddick to get creative if he wants to finish the job and escape the explosive situation.')

WebUI.closeBrowser()

