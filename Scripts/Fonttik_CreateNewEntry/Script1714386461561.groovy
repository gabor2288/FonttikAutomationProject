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

WebUI.openBrowser('https://www.google.com/')

WebUI.navigateToUrl('https://stage.fonttik.ea.com/login')

WebUI.setText(findTestObject('Fonttik_Login/Box_UserEmail'), 'gpetras@ea.com')

WebUI.setEncryptedText(findTestObject('Fonttik_Login/Box_UserPassword'), 'MW35mGHAMPWwZ4LFKGYUoEtLzh8e2091')

WebUI.click(findTestObject('Fonttik_Login/Button_Login'))

WebUI.verifyTextPresent('Home', false)

WebUI.click(findTestObject('Fonttik_CreateNewEntry/Button_Add Request'))

WebUI.verifyTextPresent('Create New Request', false)

WebUI.setText(findTestObject('Fonttik_CreateNewEntry/Box_AddRequest Name'), 'Gabor\'s Auto Request')

WebUI.click(findTestObject('Fonttik_CreateNewEntry/Button_SelectorcreateTitle'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dropdown_2K'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Fonttik_CreateNewEntry/button_UserRestrictions'))

WebUI.click(findTestObject('Fonttik_CreateNewEntry/Dropdown_Only Me (Private)'))

WebUI.click(findTestObject('Fonttik_CreateNewEntry/Button_EnableResultsTable'))

WebUI.uploadFile(findTestObject('mightbetheone'), file)

WebUI.click(findTestObject('Fonttik_CreateNewEntry/Button_Submit'))

WebUI.acceptAlert()

