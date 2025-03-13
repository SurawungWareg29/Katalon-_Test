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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebElement as Keys

WebElement element

'4. Positive_Nasabah memilih kategori pengajuan KUR pada halaman Pengajuan'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_pengajuanKUR'))

'4.1 verify Judul Tnc'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/Verify Label Kategori/lbl_tittleTnc'), 
    'Syarat & Ketentuan Pengajuan Kredit Usaha Rakyat')

'5. Kembali kehalaman Pilihan Kategori'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_kembaliTnc'))

'5.1 verify judul "Pilih Kategori"'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/Verify Label Kategori/lbl_tittleKategori'), 
    'Pilih Kategori')

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_pengajuanKUR'))

'6. nasabah scroll halaman TnC'
WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/tittle_tncKreditUsahaRakyat'), 
    0)

'6.1 verify checkbox enable'
WebUI.verifyElementChecked(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/cbox_tnc'), 0)

'7. Nasabah click Checkbox'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/cbox_tnc'))

'7.1 verify button selanjutnya dapat di klik'
WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_selanjutnyaTnc'))

'8. Nasabah klik button selanjutnya'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_selanjutnyaTnc'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/rbtn_KUR'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/fld_jumlahPinjaman'), 
    findTestData('KUR').getValue('nominal_rp', 1))

WebUI.executeJavaScript('document.body.style.zoom=\'100%\'', null)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/slct_JangkaWaktuAngsuran'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

element = WebUiCommonHelper.findWebElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/slctValue'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/txt_alasanPengajuan'), 
    1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/slct_tujuanPengajuan'))

WebUI.delay(2)

element = WebUiCommonHelper.findWebElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/slctValue_modalKerja'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

alasanPengajuan = 'Test pengajuan KUR SIT test 1234'

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/txt_alasanPengajuan'), 
    alasanPengajuan)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pengajuan Produk/btn_next'))

