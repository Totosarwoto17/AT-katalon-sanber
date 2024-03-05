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

WebUI.callTestCase(findTestCase('Sourcedemo/Checkout/User view Total'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sourcedemo/Checkout Information/btn finish'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/Checkout complete'), 0)

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Checkout Information/img success'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/img success'), 0)

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/notif succes'), 0)

WebUI.verifyElementVisible(findTestObject('Sourcedemo/Checkout Information/notif succes'))

WebUI.verifyElementPresent(findTestObject('Sourcedemo/Checkout Information/btn backtoProduct'), 0)

WebUI.verifyElementClickable(findTestObject('Sourcedemo/Checkout Information/btn backtoProduct'))

