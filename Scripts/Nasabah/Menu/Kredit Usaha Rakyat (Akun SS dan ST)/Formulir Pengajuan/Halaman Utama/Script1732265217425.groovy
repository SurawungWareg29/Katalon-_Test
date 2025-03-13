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

WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_pengajuanProduk'))

WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

'1. Positive_Nasabah Berada di halaman utama pengajuan KUR'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_kreditUsahaRakyat'))

WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

WebUI.delay(1)

'1.1 verify judul "Pengajuan Kredit Usaha"'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_tittle'), 
    'Pengajuan Kredit Usaha')

'1.2 verify button ajukan enable'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_ajukan'), 0)

'1.3 verify field pencarian enable'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/fld_pencarian'), 0)

'1.4 verify dropdown pilihan jenis kredit'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/slct_jenisKredit'), 0)

'1.5 verify button terapkan enable'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_terapkan'), 0)

'1.6 verify tabel dengan kolom sebagai berikut'

''

'1.6a verify tanggal pengajuan'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_tanggalPengajuan'), 
    'Tanggal Pengajuan')

'1.6b verify Nomor Referensi'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_noReff'), 
    'Nomor Referensi')

'1.6c verify Jenis Kredit'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_jenisKredit'), 
    'Jenis Kredit')

'1.6d verify Jumlah Pengajuan'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_jumlahPengajuan'), 
    'Jumlah Pengajuan')

'1.6e verify Cabang'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_cabang'), 
    'Cabang')

'1.6f verify Informasi Pemohon'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_informasiPemohon'), 
    'Informasi Pemohon')

'1.6g verify Status'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_status'), 
    'Status')

'2. Positive_Nasabah klik button "Ajukan" pada halaman pengajuan kredit usaha'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_ajukan'))

WebUI.executeJavaScript('document.body.style.zoom=\'70%\'', null)

'2.1 verify Judul "Pilih Kategori"'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/Verify Label Kategori/lbl_tittleKategori'), 
    'Pilih Kategori')

'3. Positive_Nasabah klik button kembali pada halaman kategori'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_kembali'))

'3.1 verify judul "Pengajuan Kredit Usaha"'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_tittle'), 
    'Pengajuan Kredit Usaha')

'3.2 verify button ajukan enable'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_ajukan'), 0)

'3.3 verify field pencarian enable'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/fld_pencarian'), 0)

'3.4 verify dropdown pilihan jenis kredit'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/slct_jenisKredit'), 0)

'3.5 verify button terapkan enable'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_terapkan'), 0)

'3.6 tabel dengan kolom sebagai berikut'

'3.6a verify tanggal pengajuan'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_tanggalPengajuan'), 
    'Tanggal Pengajuan')

'3.6b verify Nomor Referensi'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_noReff'), 
    'Nomor Referensi')

'3.6c verify Jenis Kredit'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_jenisKredit'), 
    'Jenis Kredit')

'3.6d verify Jumlah Pengajuan'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_jumlahPengajuan'), 
    'Jumlah Pengajuan')

'3.6e verify Cabang'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_cabang'), 
    'Cabang')

'3.6f verify Informasi Pemohon'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_informasiPemohon'), 
    'Informasi Pemohon')

'3.6g verify Status'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_status'), 
    'Status')

'4. Positive_Nasabah klik button "Ajukan" pada halaman pengajuan kredit usaha'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/btn_ajukan'))

'4.1 verify judul "Pilih Kategori"'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/Verify Label Kategori/lbl_tittleKategori'), 
    'Pilih Kategori')

'4.2 verify button kembali'
WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_kembali'), 0)

'5. nasabah klik button kembali'
WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Kategori/btn_kembali'), 0)

'5.1 verify Nasabah Kembali kehalaman utama'
WebUI.verifyElementText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Verify Label Halaman Utama/lbl_tittle'), 
    'Pengajuan Kredit Usaha')

