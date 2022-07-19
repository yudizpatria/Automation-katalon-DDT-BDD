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

WebUI.callTestCase(findTestCase('Web UI Test/Pages/Login or Register Page/The Register page is loaded Successfully'), [:], 
    FailureHandling.STOP_ON_FAILURE)

randStr = CustomKeywords.'common.random.randString'(4)

randNmc = CustomKeywords.'common.random.randNumeric'(2)

email_dummy = (((randStr + '_') + randNmc) + domain)

WebUI.waitForElementVisible(findTestObject('User/HomePage/Image/Logo_PSE'), GlobalVariable.element_timeout)

WebUI.verifyTextPresent('LOGIN', false)

WebUI.selectOptionByIndex(findTestObject('User/Sign Up/Select/Select_Favorite_genre'), '1')

WebUI.verifyTextPresent('Action', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('User/Sign Up/Select/Select_favorite_console'), '2')

WebUI.verifyTextPresent('XBox', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('User/Sign Up/Select/Select_hobby_interest'), '3')

WebUI.verifyTextPresent('Gadgets & Technology', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User/Sign Up/Radio Button/input_Female'))

WebUI.verifyElementChecked(findTestObject('User/Sign Up/Radio Button/input_Female'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('User/Sign Up/Label/input_email'), email_dummy)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('User/Sign Up/Label/input_password'), password)

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('User/Sign Up/Label/input_confirm_password'), password, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('User/Sign Up/Button/button_Register'))

WebUI.verifyTextPresent('Thank you for registering. Your account has to be activated before you can login. Please check your email.', 
    false)

