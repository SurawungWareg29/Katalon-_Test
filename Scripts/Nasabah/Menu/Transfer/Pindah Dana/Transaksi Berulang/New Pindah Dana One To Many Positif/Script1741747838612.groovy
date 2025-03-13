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

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/div_Transfer'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/div_Pindah Dana'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/button_One to Many'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_Many to Many_PrivateSwitchBase-input _928ef4'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_Many to Many_PrivateSwitchBase-input _928ef4_1'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_Many to Many_PrivateSwitchBase-input _928ef4_1_2'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_Many to Many_nominal'), 
    '90.900')

// Ambil nilai dari input field
String actualValue = WebUI.getAttribute(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_Many to Many_nominal'), 'value');

// Nilai yang diharapkan
String expectedValue = "90.900";

// Validasi nilai yang diinputkan
if (actualValue.equals(expectedValue)) {
    WebUI.comment("Validasi Berhasil: Nilai sesuai dengan yang diharapkan.");
} else {
    WebUI.comment("Validasi Gagal: Nilai yang diinputkan tidak sesuai. Diharapkan: " + expectedValue + ", tetapi ditemukan: " + actualValue);
}
WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/textarea_T'), 'Test120325')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input__PrivateSwitchBase-input MuiSwitch-in_430f27'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/path'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/div_13'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/svg__MuiSvgIcon-root MuiSvgIcon-fontSizeMed_975200'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/div_14'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/p_Rp 181.800,00'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/button_Selanjutnya_1'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_bale bisnis_inputStyle'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3'), 
    '4')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4'), 
    '5')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5'), 
    '6')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/p_Rp 90.900,00'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/p_Rp 90.900,00_1'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana One To Many Positif/Page_bale bisnis/button_Tutup'))

