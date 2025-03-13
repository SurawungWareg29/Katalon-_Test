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

WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : GlobalVariable.corpId, ('userId') : GlobalVariable.userId
        , ('password') : GlobalVariable.password, ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Dashboard Menu/Accont Sweeping/btn_accountSweeping'))

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/btn_SweepExcessFund'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/btn_presentasiDisisakan'))

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.delay(10)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/fld_persentasiTersisa'), '99')

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/btn_simpanPersentasi'))

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.delay(10)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/btn_pilihRekening'))

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.delay(10)

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/button_Simpan'))

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/rdbutton_rekTujuan'))

WebUI.executeJavaScript('document.body.style.zoom=\'90%\'', null)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/fld_persenNominalTerima'), '1')

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/btn_selanjutnya2'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Accont Sweeping/Sweep Excess Fund/btn_selanjutnya3'))


