import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable
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

// Variabel global
String BillingCode = '919100190214587' // Ganti sesuai kebutuhan
String pin = "123456" // PIN yang ingin dimasukkan

// Logger untuk debugging
KeywordLogger logger = new KeywordLogger()

try {
    // Validasi bahwa Billing Code tidak kosong
    if (BillingCode == null || BillingCode.isEmpty()) {
        throw new Exception("Billing Code tidak ditemukan atau kosong")
    }

    // Buka browser
    WebUI.openBrowser('')
	// Maksimalkan jendela browser
	WebUI.maximizeWindow()

    // Navigasi ke URL
    WebUI.navigateToUrl('https://ibbisnis-uat.btn.co.id/login')

    // Validasi halaman login berhasil dimuat
    if (!WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input_EN_corporateID'), 10)) {
        throw new Exception('Halaman login gagal dimuat')
    }

    // Isi data login
    WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : GlobalVariable.corpId, ('userId') : GlobalVariable.userId
        , ('password') : GlobalVariable.password, ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)
//    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/button_Masuk'))

    // Validasi berhasil masuk ke dashboard
//    if (!WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/div_Pembayaran'), 10)) {
//        throw new Exception('Gagal masuk ke dashboard')
//    }

    // Navigasi ke menu Pembayaran dan Penerimaan Negara
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/div_Pembayaran'))
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/div_Penerimaan Negara'))

    // Validasi halaman Penerimaan Negara dimuat
    if (!WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input__bilCode'), 10)) {
        throw new Exception('Halaman Penerimaan Negara gagal dimuat')
    }

    // Isi Billing Code dan ambil teks sebelum
    WebUI.setText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input__bilCode'), BillingCode)
    String teksSebelum = WebUI.getAttribute(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input__bilCode'), 'value').replaceAll("\\s", "")
    logger.logInfo("Teks sebelum (tanpa spasi): " + teksSebelum)

    // Klik tombol Selanjutnya
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/button_Selanjutnya'))

    // Validasi halaman kedua dimuat
    if (!WebUI.verifyElementPresent(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/p_919100190214587'), 10)) {
        throw new Exception('Objek p_919100190214587 tidak ditemukan!')
    }

    // Ambil teks dari elemen sesudah dan hapus spasi
    String teksSesudah = WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/p_919100190214587')).replaceAll("\\s", "")
    logger.logInfo("Teks setelah (tanpa spasi): " + teksSesudah)

    // Memverifikasi teks sebelum dan sesudah
    WebUI.verifyMatch(teksSebelum, teksSesudah, false)

    // Klik tombol Selanjutnya lagi
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/button_Selanjutnya_1'))

    // Masukkan PIN
    for (int i = 1; i <= pin.length(); i++) {
        TestObject pinInput = new TestObject("dynamicPinInput_${i}")
        pinInput.addProperty("xpath", ConditionType.EQUALS, "(//input[@class='inputStyle' and @type='tel' and @maxlength='1'])[" + i + "]")
        WebUI.waitForElementVisible(pinInput, 10)
        WebUI.focus(pinInput)
        WebUI.setText(pinInput, String.valueOf(pin.charAt(i - 1)))
    }

    // Validasi hasil akhir menggunakan verifyMatch
    TestObject successTextElement = new TestObject("successText")
    successTextElement.addProperty("xpath", ConditionType.EQUALS, "//p[contains(@class,'MuiTypography-root') and contains(@class,'MuiTypography-body2') and text()='${BillingCode}']")
    WebUI.waitForElementVisible(successTextElement, 10)
    String actualText = WebUI.getText(successTextElement).trim().replaceAll("\\s", "")
    WebUI.verifyMatch(actualText, BillingCode, false)
    logger.logPassed("PIN berhasil dimasukkan dan teks akhir cocok dengan Billing Code: ${actualText}")
	
	WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Login/Page_bale bisnis/div_s'))
	
	
	WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/Login/Page_bale bisnis/li_keluar'))
	
	WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/p_Yakin'))

} catch (Exception e) {
    // Tandai eksekusi sebagai gagal
    KeywordUtil.markFailed("Test gagal: " + e.message)

} finally {
    // Tutup browser
//    WebUI.closeBrowser()
}
