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

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_namaUsaha'), Keys.chord(
        Keys.CONTROL, 'a'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_namaUsaha'), Keys.chord(
        Keys.BACK_SPACE), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_namaUsaha'), findTestData(
        'KUR').getValue('name', 2))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_namaUsaha'), 1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Usaha/slct_sektorUsaha'))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Usaha/btn_valueSektorUsaha'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_omsetUsaha'), findTestData(
        'KUR').getValue('nominal_rp', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_lamaUsaha'), findTestData(
        'KUR').getValue('year', 1))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Status Tempat Usaha/slct_statusTempatUsaha'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Status Tempat Usaha/btn_valueStatusTempatUsaha'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_alamatUsaha'), findTestData(
        'KUR').getValue('address', 2))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Provinsi/slct_provinsi'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Provinsi/slct_valueProvinsi'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kabupaten/slct_kabupaten'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kabupaten/slct_valueKabupaten'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kecamatan/slct_kecamatan'), 
    0)

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kecamatan/slct_kecamatan'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kecamatan/slct_valueKecamatan'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kelurahan/slct_kelurahan'))

WebUI.delay(1)

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/Select Kelurahan/slct_valueKelurahan'))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_rt'), findTestData('KUR').getValue(
        'rt', 1))

WebUI.setText(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/fld_rw'), findTestData('KUR').getValue(
        'rw', 1))

WebUI.click(findTestObject('IBB Nasabah/Dashboard Menu/Pengajuan Product/Informasi Usaha/btn_selanjutnya'))

