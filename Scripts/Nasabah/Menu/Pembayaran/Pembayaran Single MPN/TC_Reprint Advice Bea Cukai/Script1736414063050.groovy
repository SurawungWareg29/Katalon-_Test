import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordLogger logger = new KeywordLogger()

String referenceNum = 'IBB290700230'
String bilCode = '519100190025610'
String pin = "123456" // PIN yang ingin dimasukkan

try {
    // Buka browser
    WebUI.openBrowser('')
	
	// Maksimalkan jendela browser
	WebUI.maximizeWindow()

    // Navigasi ke URL
    WebUI.navigateToUrl('https://ibbisnis-uat.btn.co.id/login')

    // Login
    WebUI.setText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input_EN_corporateID'), 'singleakun')
    WebUI.setText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input__userID'), 'singleakun')
    WebUI.setEncryptedText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input__password'), '7Dxoto1EjKfQbGop/Ov+1g==')
    WebUI.sendKeys(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/input__password'), Keys.chord(Keys.ENTER))

    // Navigasi ke menu Pembayaran dan Penerimaan Negara
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/div_Pembayaran'))
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/div_Penerimaan Negara'))

    // Reprint Advice
    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/button_Reprint Advice'))

    // Isi nilai pada input field
    WebUI.setText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/input_Reprint Advice_referenceNum'), referenceNum)
    WebUI.setText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/input__bilCode2'), bilCode)

    // Ambil teks dari elemen input sebelum, dan hapus spasi
    String teksSebelumReference = WebUI.getAttribute(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/input_Reprint Advice_referenceNum'), 'value').replaceAll("\\s", "")
    logger.logInfo("Teks referenceNum sebelum (tanpa spasi): " + teksSebelumReference)

    String teksSebelumBilCode = WebUI.getAttribute(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/input__bilCode2'), 'value').replaceAll("\\s", "")
    logger.logInfo("Teks bilCode sebelum (tanpa spasi): " + teksSebelumBilCode)

    WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/button_Selanjutnya'))

    // Masukkan PIN
    for (int i = 1; i <= pin.length(); i++) {
        TestObject pinInput = new TestObject()
        pinInput.addProperty("xpath", ConditionType.EQUALS, "(//input[@class='inputStyle' and @type='tel' and @maxlength='1'])[" + i + "]")
        WebUI.waitForElementVisible(pinInput, 10)
        WebUI.focus(pinInput)
        WebUI.setText(pinInput, String.valueOf(pin.charAt(i - 1)))
    }

    // Ambil teks dari elemen hasil referenceNum sesudah dan hapus spasi
    String teksSesudahReference = WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/p_IBB290700230')).replaceAll("\\s", "")
    logger.logInfo("Teks referenceNum sesudah (tanpa spasi): " + teksSesudahReference)

    // Verifikasi teks sebelum dan sesudah referenceNum
    WebUI.verifyMatch(teksSebelumReference, teksSesudahReference, false)

    // Ambil teks dari elemen hasil bilCode sesudah dan hapus spasi
    String teksSesudahBilCode = WebUI.getText(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/p_519100190025610')).replaceAll("\\s", "")
    logger.logInfo("Teks bilCode sesudah (tanpa spasi): " + teksSesudahBilCode)

    // Verifikasi teks sebelum dan sesudah bilCode
    WebUI.verifyMatch(teksSebelumBilCode, teksSesudahBilCode, false)
	
	// Verifikasi teks sebelum dan sesudah reference
	WebUI.verifyMatch(teksSebelumReference, teksSesudahReference, false)
	
	WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/div_s'))
	
	
	WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/li_keluar'))
	
	WebUI.click(findTestObject('IBB Nasabah/Pembayaran Menu/MPN/Reprint MPN/Page_bale bisnis/p_Yakin'))

} catch (Exception e) {
    KeywordUtil.markFailed("Test gagal: " + e.message)
} finally {
    WebUI.closeBrowser()
}
