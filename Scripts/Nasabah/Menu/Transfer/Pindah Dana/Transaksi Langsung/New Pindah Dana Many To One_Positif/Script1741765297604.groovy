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

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/div_Transfer'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/div_Pindah Dana'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/button_Many to One'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_Many to Many_PrivateSwitchBase-input _928ef4'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_Many to Many_PrivateSwitchBase-input _928ef4_1'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_Many to Many_PrivateSwitchBase-input _928ef4_1_2'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_Many to Many_nominal'), 
    '19.919')

// Definisikan objek
TestObject nominalInput = findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_Many to Many_nominal')

// Validasi input field dan set nilai jika ditemukan
if (WebUI.verifyElementPresent(nominalInput, 0)) {
	WebUI.setText(nominalInput, '0')
	WebUI.comment("Nominal berhasil diinputkan.")
} else {
	WebUI.comment("Input field tidak ditemukan.")
}

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/div_'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/textarea_t'), 'Test120325')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/p_Rp 39.838,00'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/button_Selanjutnya_1'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_bale bisnis_inputStyle'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3'), 
    '4')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4'), 
    '5')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5'), 
    '6')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/div_ARFIAN HARJA KUSUMA1401 3 816 9ARFIAN H_70b0c2'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/p_Rp 19.919,00'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/p_Rp 19.919,00_1'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/New Pindah Dana Many To One_Positif/Page_bale bisnis/button_Tutup'))

