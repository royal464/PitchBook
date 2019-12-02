import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys


class Login {

	@Given("User open browser and navigate to okta login page")
	def openbrowserandnavigatetourl() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://retail-qa-app.advantagesolutions.net/pitchbook')
		WebUI.delay(5)
	}

	@When("user Enters (.*) and (.*)")
	def enterlogincredentials( String Username,String Password) {
		WebUI.setText(findTestObject('Object Repository/Login to Pitchbook/Page_InfoMagnus-dev-682180 - Sign In/input_Username_username'),
				Username)
		WebUI.delay(5)

		WebUI.setEncryptedText(findTestObject('Object Repository/Login to Pitchbook/Page_InfoMagnus-dev-682180 - Sign In/input_Password_password'),
				Password)
		WebUI.delay(5)
	}
	@And("Click on signin button")
	def clickonsigin(){
		WebUI.click(findTestObject('Object Repository/Login to Pitchbook/Page_InfoMagnus-dev-682180 - Sign In/input_Remember me_okta-signin-submit'))
		WebUI.delay(5)
	}

	@Then("User navigates to the homepage of the pitch book")
	def navigatestopitchbook() {
		WebUI.click(findTestObject('Object Repository/Login to Pitchbook/Page_PitchBook/span_PitchBook'))
		WebUI.delay(5)
		WebUI.closeBrowser()
	}
}