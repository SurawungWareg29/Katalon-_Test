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

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/btn_transfer'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/btn_sesamaBtn'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/btn_manyToOne'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/rdBtn_rekeningSumberDana1'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/rdBtn_rekeningSumberDana2'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/fld_rekTujuan'), '1401880012264')

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/btn_tambahRekening'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/fld_nominalTransaksi'), 
    '50000')

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/txtArea_berita'), 'test test test test 1234')

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Transaksi Berulang/tgl_berulang'))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Transaksi Berulang/fld_startDate'),
	0)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Transaksi Berulang/fld_startDate'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Transaksi Berulang/dateValue_startDate'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Transaksi Berulang/fld_endDate'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Transaksi Berulang/dateValue_endDate'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/btn_selanjutnya'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Sesama BTN/Sesama BTN Many to One/btn_selanjutnyaHalamanKonfirmasi'))

