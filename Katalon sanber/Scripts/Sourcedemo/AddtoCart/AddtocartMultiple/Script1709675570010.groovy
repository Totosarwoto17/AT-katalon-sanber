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

String params = 'sauce-labs-backpack'

String params2 = 'sauce-labs-bike-light'



WebUI.callTestCase(findTestCase('Sourcedemo/Loginscenario/LoginSourceDemo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/txtproduct'), 0)

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Product/txtproduct'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/iconCart'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Product/addtocart', [('params') : params]), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Sourcedemo/Product/addtocart', [('params') : params]))

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Product/addtocart', [('params') : params2]), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sourcedemo/Product/addtocart', [('params') : params2]))

WebUI.click(findTestObject('Sourcedemo/Product/iconCart'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/TitileYourCart'), 0)

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Product/txt Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/txt Description'), 0)

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Product/txt QTY'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/txt QTY'), 0)

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/btn continue shopping'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Product/btn continue shopping'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/btnRemove'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Product/btn Checkout'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Product/btnRemove'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Product/btnRemove'))

