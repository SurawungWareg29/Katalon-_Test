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

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/div_Pembayaran'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/div_Penerimaan Negara'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/button_Reprint Advice'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_Reprint Advice_referenceNum'), 
    'IBB543600944')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input__bilCode2'), '9191 0099 1827 830             ')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4'), 
    '1')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5'), 
    '1')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/button_OK'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7_8'), 
    '2')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7_8_9'), 
    '2')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/button_OK'))

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7_8_9_10'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7_8_9_10_11'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7_8_9_10_11_12'), 
    '3')

WebUI.setText(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/input_bale bisnis_inputStyle_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    '3')

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Pembayaran Menu/MPN/Reprint Advice Non Pajak Negatif/Page_bale bisnis/button_OK'))

