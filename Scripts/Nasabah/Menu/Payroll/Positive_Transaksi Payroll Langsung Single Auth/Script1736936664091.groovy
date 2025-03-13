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
import java.util.Random as Random
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : corpId, ('userId') : userId, ('password') : password
        , ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Dashboard/hyperLink_Pembayaran Gaji'))

WebUI.verifyElementVisible(findTestObject('IBB Nasabah/Payroll/Page_Dashboard/hyperLink_Sesama Mata Uang'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Dashboard/hyperLink_Sesama Mata Uang'))

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('IBB Nasabah/Payroll/Page_Tab_Pengecekan Rekening/button_Telusuri'), 0)

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Pengecekan Rekening/button_Unduh Format Dokumen'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Pengecekan Rekening/radioButton_XLSX Format'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Pengecekan Rekening/button_Unduh'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Grup Pembayaran Gaji'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Buat List Pembayaran Gaji'))

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Buat List Pembayaran Gaji'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Buat List Pembayaran Gaji'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/dropdown_Pilih Rekening Sumber Dana'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/dropdown_Pilih Rekening Sumber Dana'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/dropdown_Rekening pertama'))

def randomNumber = new Random().nextInt(100) + 1

def namaGrup = "Grup$randomNumber"

def errorMessageNamaGrup = findTestObject('Object Repository/IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/label_Error nama Grup')

WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/textField_NamaGroup'), namaGrup)

if (WebUI.verifyElementNotPresent(errorMessageNamaGrup, 5)) {
    KeywordUtil.logInfo('Tidak ada error pada nama grup')
} else {
    WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/textField_NamaGroup'), namaGrup)
}

WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/textField_nomor Rekening'), noRek)

WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/textField_amount'), amount)

WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/textField_berita'), berita)

WebUI.takeScreenshot()

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Rekening Baru'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Rekening Baru'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_Simpan'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Tab_Grup Pembayaran Gaji/button_lakukan Transaksi'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Pembayaran Gaji/radiobutton_Detail'))

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Pembayaran Gaji/button_Selanjutnya'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Payroll/Page_Konfirmasi/button_Selanjutnya'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_QRCode/textfield_code1'), QRCode)

WebUI.takeScreenshot()

def judulPage = WebUI.getText(findTestObject('Object Repository/IBB Nasabah/Payroll/Page_resi transaksi/label_Title Resi Transaksi'))

if (judulPage.equals('Resi Transaksi') || judulPage.equals('Transaction Receipt')) {
    KeywordUtil.logInfo('Title page sudah benar')
} else {
    KeywordUtil.markError('Title page salah')
}

WebUI.takeScreenshot()

