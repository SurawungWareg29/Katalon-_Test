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

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/btn_bankLain'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/rdBtn_rekeningSumberDana'))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/lbll_pilihTipeTransfer'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/slct_tipeTransfer'))

WebUI.delay(5)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/value_tipeTransferOnline'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/fld_nominalTransaksi'), '100000')

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/txtArea_berita'), 'test 1-1 transfer')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/btn_oneToOne'), 0)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/fld_rekTujuan'), '1401880012264')

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/btn_tambahRekening'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/btn_selanjutnya'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Transfer/Bank Lain/Online/One to One/btn_selanjutnyaHalamanKonfirmasi'))

WebUI.callTestCase(findTestCase('Nasabah/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

