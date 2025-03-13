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

WebUI.callTestCase(findTestCase('Nasabah/Menu/Kredit Usaha Rakyat (Akun SS dan ST)/Formulir Pengajuan/Halaman Utama'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Nasabah/Menu/Kredit Usaha Rakyat (Akun SS dan ST)/Formulir Pengajuan/Kategori'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_namaBadanUsaha'))

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_namaBadanUsaha'), 
    Keys.chord(Keys.CONTROL, 'a'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_namaBadanUsaha'), 
    Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_namaBadanUsaha'), 
    findTestData('KUR').getValue('company_name', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_npwp'), findTestData(
        'KUR').getValue('npwp', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_tempatPendirianBadanUsaha'), 
    findTestData('KUR').getValue('city', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_hp'), findTestData(
        'KUR').getValue('phone_number', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/txtarea_alamatDomisiliUsaha'), 
    findTestData('KUR').getValue('address', 1))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/date_tanggalPendiriBadanUsaha'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Date/btn_prevMonth'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Date/btn_year'))

WebUI.delay(3)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Date/btn_valueOfyear'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Date/slct_datePicker'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Provinsi/slct_provinsi'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Provinsi/slct_aceh'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Kabupaten/slct_kabupaten'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Kabupaten/slct_acehBarat'))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Provinsi/slct_provinsi'), 
    1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Kecamatan/slct_kecamatan'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Kecamatan/slct_aronganLambalek'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Kelurahan/slct_kelurahan'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Select Kelurahan/slct_aloeBagok'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_rt'), findTestData(
        'KUR').getValue('rt', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/fld_rw'), findTestData(
        'KUR').getValue('rw', 1))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_namaPenanggungJawab'))

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_namaPenanggungJawab'), 
    Keys.chord(Keys.CONTROL, 'a'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_namaPenanggungJawab'), 
    Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_namaPenanggungJawab'), 
    findTestData('KUR').getValue('name', 1))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_nik'))

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_nik'), 
    Keys.chord(Keys.CONTROL, 'a'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_nik'), 
    Keys.chord(Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_nik'), 
    findTestData('KUR').getValue('nik', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_kotaKelahiran'), 
    findTestData('KUR').getValue('city', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/fld_hp'), 
    findTestData('KUR').getValue('phone_number', 1))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/Select Date/slct_partnerDateBirth'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/Select Date/btn_prevMonth'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/Select Date/btn_year'))

WebUI.delay(3)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/Select Date/btn_valueOfyear'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/Akun ST/Data Penanggung Jawab/Select Date/slct_datePicker'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Pribadi/btn_selanjutnya'))

WebUI.callTestCase(findTestCase('Nasabah/Menu/Kredit Usaha Rakyat (Akun SS dan ST)/Formulir Pengajuan/Informasi Usaha'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Nasabah/Menu/Kredit Usaha Rakyat (Akun SS dan ST)/Formulir Pengajuan/Unggah Dokumen'), 
    [:], FailureHandling.STOP_ON_FAILURE)

