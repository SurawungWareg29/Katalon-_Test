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

WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : corpId, ('userId') : userId, ('password') : password
        , ('url') : url], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Accont Sweeping/btn_accountSweeping'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/btn_accountSweepOut'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/rdbtn_nominal'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/btn_pilihRekening'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/span_1801500001036'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/p_5701500031241'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/button_Simpan'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/cbox_rekeningTujuan'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/fld_nominalDiterima'), '100000')

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/btn_selanjutnya2'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Out/btn_selanjutnya3'))

