package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.apache.commons.lang.RandomStringUtils as RandStr

public class random {

	/**
	 * Create  random text, insert number & alphabet
	 */
	@Keyword
	def randString(no) {
		String randomString = RandStr.randomAlphabetic(no)
		return randomString
	}

	@Keyword
	def randNumeric(no) {
		String randomString = RandStr.randomNumeric(no)
		return randomString
	}

	@Keyword
	def randomNumber(TestObject to, int minimum, int maximum) {
		def randomNumber = ThreadLocalRandom.current().nextInt(minimum, maximum + 1)
		WebUI.findWebElement(to).sendKeys(String.valueOf(randomNumber))
	}
}
