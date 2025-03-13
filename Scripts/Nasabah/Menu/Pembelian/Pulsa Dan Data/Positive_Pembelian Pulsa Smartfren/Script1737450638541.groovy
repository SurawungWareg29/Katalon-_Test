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

WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : corpid, ('userId') : username, ('password') : password
        , ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)

//Halaman Awal

WebUI.click(findTestObject('IBB Nasabah/Pembelian Menu/dropdown_pembelian'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembelian Menu/menu_pulsaDanData'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanAwal_button_Selanjutnya'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanAwal_field_nomorTelepon'), NomorTelepon, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanAwal_button_denom_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanAwal_button_Selanjutnya'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanAwal_button_Selanjutnya'), FailureHandling.STOP_ON_FAILURE)

//Halaman Konfirmasi

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanKonfirmasi_buttonSelanjutnya'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanKonfirmasi_buttonBatal'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/halamanKonfirmasi_buttonSelanjutnya'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_1'), '1')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_2'), '2')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_3'), '3')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_4'), '4')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_5'), '5')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_6'), '6')

//Halaman Resi

WebUI.verifyTextPresent('Transaksi Anda Berhasil', false)

WebUI.verifyTextPresent('Resi Transaksi', false)

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/resi_button_Unduh Resi'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/resi_button_Transaksi Baru'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/resi_button_Tutup'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('IBB Nasabah/Pembelian Menu/Pulsa Dan Data/Pulsa/resi_button_Tutup'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Nasabah/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()