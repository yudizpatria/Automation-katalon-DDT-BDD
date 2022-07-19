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

WebUI.callTestCase(findTestCase('Web UI Test/Pages/Login or Register Page/The Login page is loaded Successfully'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('User/HomePage/Image/Logo_PSE'), GlobalVariable.element_timeout)

WebUI.callTestCase(findTestCase('Web UI Test/Pages/Login or Register Page/login without Username'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web UI Test/Pages/Login or Register Page/Login without Password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('User/Sign in/Label/input__username'), email)

WebUI.delay(2)

WebUI.setText(findTestObject('User/Sign in/Label/input__password'), password)

WebUI.delay(2)

WebUI.click(findTestObject('User/Sign in/Button/button_Log in'))

WebUI.waitForElementVisible(findTestObject('User/HomePage/Image/Logo_PSE'), GlobalVariable.element_timeout)

WebUI.verifyTextPresent('DASHBOARD', false)

