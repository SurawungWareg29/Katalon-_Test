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

//Halaman Pinjaman BTN Awal

WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : GlobalVariable.corpId, ('userId') : GlobalVariable.userId
        , ('password') : GlobalVariable.password, ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Transfer', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/div_Pembayaran'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/div_Pinjaman BTN'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/field__NomorPinjaman'), NomorPembayaran, FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/namaRekeningSumberdana_linePertama'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/noRekSumberdana_linePertama'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/button_Selanjutnya_HalamanPinjamanBTN'), FailureHandling.STOP_ON_FAILURE)

//Halaman Pinjaman BTN sesi 2

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/dropdown_Tagihan'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/dropdown_1_tagihan'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/dropdown_2_denda'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/dropdown_3_tagihanDanDenda'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/dropdown_1_tagihan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/button_Selanjutnya_HalamanPinjamanBTN_2'), FailureHandling.STOP_ON_FAILURE)

//Halaman Konfirmasi

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NamaPeminjam_HalamanKonfirmasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/namaRekeningSumberdana_linePertama_HalamanKonfirmasi'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NominalDenda_HalamanKonfirmasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NominalTagihan_HalamanKonfirmasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NoPinjaman_HalamanKonfirmasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/noRekSumberdana_linePertama_HalamanKonfirmasi'),
	FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/Total_HalamanKonfirmasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/button_Selanjutnya_HalamanKonfirmasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_1'),
	'1')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_2'),
	'2')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_3'),
	'3')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_4'),
	'4')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_5'),
	'5')

WebUI.sendKeys(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/Pinjaman BTN/input_QR_6'),
	'6')

//Halaman Resi

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NamaPeminjam_resi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NominalDenda_resi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NominalTagihan_resi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/NoPinjaman_resi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/noRekSumberdana_linePertama_resi'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/Total_resi'), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyTextPresent('Transaksi Anda Berhasil', false)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Pinjaman BTN/button_Tutup'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Nasabah/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()