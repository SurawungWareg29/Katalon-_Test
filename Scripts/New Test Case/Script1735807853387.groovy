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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ibbisnis-uat.btn.co.id/login')

WebUI.doubleClick(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/input_corporateID'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/input_corporateID'), 
    'SS******ks')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/svg_MuiSvgIcon-root MuiSvgIcon-fontSizeMedi_cbaf43'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/input_userID'), 
    'SS******ks')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/button_MuiButtonBase-root MuiIconButton-roo_5028ca'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/form_ID Perusahaan ID Pengguna Kata Sandi  _536fb3'))

WebUI.setEncryptedText(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/input_password'), 
    'r+U5AUJs204JBTbaU3Nocg==')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/button_Masuk'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/div_Transfer'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/div_Bank Lain'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_Online'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_Online'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_SKN'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_Online'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_RTGS'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_Online'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Transfer/test/Page_bale bisnis/p_BI-FAST'))

