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

WebUI.callTestCase(findTestCase('Sourcedemo/AddtoCart/UserAddtoCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sourcedemo/Product/btn Checkout'))

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Checkout Information/title Checkout Information'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/title Checkout Information'), 0)

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/btn Cancel'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Checkout Information/btn Cancel'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/btn Continue'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Checkout Information/btn Continue'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/Input Firstname'), 0)

WebUI.setText(findTestObject('Sourcedemo/Checkout Information/Input Firstname'), 'Nami')

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Checkout Information/Input Firstname'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/input Lastname'), 0)

WebUI.setText(findTestObject('Sourcedemo/Checkout Information/input Lastname'), 'yuro')

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/input ZipPostalcode'), 0)

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Checkout Information/input ZipPostalcode'))

WebUI.setText(findTestObject('Sourcedemo/Checkout Information/input ZipPostalcode'), '12345')

WebUI.click(findTestObject('Sourcedemo/Checkout Information/btn Continue'))

