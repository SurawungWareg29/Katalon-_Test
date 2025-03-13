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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : corpId, ('userId') : userId, ('password') : password
        , ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)

// Define how many times to zoom out
int repeatCount = 5

// Create a Robot instance
Robot robot = new Robot()

for (int i = 0; i < repeatCount; i++) {
    // Press and hold CTRL
    robot.keyPress(KeyEvent.VK_CONTROL)

    // Press the "-" key (zoom out)
    robot.keyPress(KeyEvent.VK_MINUS)

    // Release the "-" key
    robot.keyRelease(KeyEvent.VK_MINUS)

    // Release CTRL
    robot.keyRelease(KeyEvent.VK_CONTROL)

    // Add a small delay between actions
    Thread.sleep(100)
}

WebUI.verifyTextPresent('Transfer', false)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/div_Transfer'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/div_Bank Lain'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/radiobuttonSumberDana'))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/radiobuttonSumberDana'), 
    0)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/div_Pilih Tipe Transfer'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/pilihan_BIFAST'))

WebUI.setText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_Amount'), harga)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/dropdown_TujuanTransaksi'))

WebUI.delay(2)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/dropdown_TujuanTransaksiLainnya'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/radiobuttonSumberDana'), 
    0)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/div_Pilih Bank Tujuan'))

WebUI.verifyElementNotClickable(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/button_Tambah Rekening'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/BANK CIMB NIAGA'))

WebUI.setText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_RekeningTujuan'), rekeningTujuan)

WebUI.verifyElementClickable(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/button_Tambah Rekening'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/button_Tambah Rekening'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/checkbox_Tanggal Tertentu'))

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/textArea_fieldTanggalTertentu'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/dropdown_tahunTanggalTertentu'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/dropdown_tahun2099TanggalTertentu'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/datepicker_tanggal15'))

/* int maxTanggal = 31

for(int tanggalTertentu = 1; tanggalTertentu <= maxTanggal ; tanggalTertentu++) {
	    String dynamicXPath = "//*[@id='root']/div/div/main/div/div/div/form/div/div[2]/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[{$tanggalTertentu}]"
    
    // Buat TestObject dinamis
    TestObject dateObject = new TestObject()
    dateObject.addProperty("xpath", ConditionType.EQUALS, dynamicXPath)	
	if (WebUI.waitForElementClickable(dateObject, 5,FailureHandling.STOP_ON_FAILURE)) {
		// Jika clickable, klik elemen tersebut dan keluar dari loop
		println("Memeriksa elemen dengan XPath: " + dynamicXPath)
		WebUI.click(dateObject)
		println("Tanggal yang dipilih: " + tanggalTertentu)
		break
	} else {
		// Jika tidak clickable, log pesan dan lanjutkan ke tanggal berikutnya
		println("Tanggal " + tanggalTertentu + " tidak dapat dipilih, mencoba tanggal berikutnya.")
		println("Memeriksa elemen dengan XPath: " + dynamicXPath)
	}
	
	Thread.sleep(100)

}
*/
WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/button_Selanjutnya'))

WebUI.takeScreenshot()

rekTujuan = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/inquiry_validasiRekeningTujuan'))

KeywordUtil.println(rekeningTujuan)

if (rekeningTujuan != rekTujuan) {
    KeywordUtil.markError('Rekening Tujuan yang diinput dengan di halaman konfirmasi tidak sama!')
} else {
    KeywordUtil.logInfo('Rekening tujuan yang diinput sudah sesuai')
}

// Process inputamount
String inputamount = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/inquiry_Amount'))

// Remove non-numeric characters and handle thousand/decimal separators
String numericString = inputamount.replaceAll('[^0-9.,]', '' // Keep only digits, '.', and ','
    )

numericString = numericString.replace('.', '' // Remove thousand separators
    )

numericString = (numericString.split(',')[0 // Remove the decimal part
])

int intAmount = numericString.toInteger()

KeywordUtil.println('Processed intAmount: ' + intAmount)

int intHarga = harga.toInteger()

KeywordUtil.println(intHarga)

if (intHarga != intAmount) {
    KeywordUtil.markError('Amount yang diinput dengan di halaman konfirmasi tidak sama!')
} else {
    KeywordUtil.logInfo('Amount yang diinput sudah sesuai')
}

// Similar approach for biayaTransaksi and other monetary fields
String biayaTransaksi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/inquiry_biayaTransaksi'))

String numericBiayaTransaksi = biayaTransaksi.replaceAll('[^0-9.,]', '')

numericBiayaTransaksi = (numericBiayaTransaksi.replace('.', '').split(',')[0])

int intBiayaTransaksi = numericBiayaTransaksi.toInteger()

String biayaAdmin = WebUI.getText(findTestObject('Object Repository/IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/inquiry_BiayaAdmin'))

String numericBiayaAdmin = biayaAdmin.replaceAll('[^0-9.,]', '')

numericBiayaAdmin = (numericBiayaAdmin.replace('.', '').split(',')[0])

int intBiayaAdmin = numericBiayaAdmin.toInteger()

// Calculate total biaya
int jumlahTotalBiaya = intBiayaTransaksi + intBiayaAdmin

KeywordUtil.println('Calculated jumlahTotalBiaya: ' + jumlahTotalBiaya)

// Compare with total biaya
String totalBiaya = WebUI.getText(findTestObject('Object Repository/IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/inquiry_TotalBiaya'))

String numericTotalBiaya = totalBiaya.replaceAll('[^0-9.,]', '')

numericTotalBiaya = (numericTotalBiaya.replace('.', '').split(',')[0])

int intTotalBiaya = numericTotalBiaya.toInteger()

KeywordUtil.println('Extracted intTotalBiaya: ' + intTotalBiaya)

if (jumlahTotalBiaya == intTotalBiaya) {
    KeywordUtil.logInfo('Penjumlahan Total Biaya sudah sesuai')
} else {
    KeywordUtil.markError('Penjumlahan Total Biaya belum sesuai!')
}

totalTransaksi = WebUI.getText(findTestObject('Object Repository/IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/inquiry_totalTransaksi'))

String numericTotalTransaksi = totalTransaksi.replaceAll('[^0-9.,]', '')

numericTotalTransaksi = (numericTotalTransaksi.replace('.', '').split(',')[0])

int intTotalTransaksi = numericTotalTransaksi.toInteger()

KeywordUtil.println(intTotalTransaksi)

int jumlahTotalTransaksi = intAmount + intTotalBiaya

KeywordUtil.println(jumlahTotalTransaksi)

KeywordUtil.println(intTotalTransaksi)

if (jumlahTotalTransaksi == intTotalTransaksi) {
    KeywordUtil.logInfo('Jumlah Total transaksi sudah sesuai')
} else {
    KeywordUtil.markError('Jumlah Total transaksi belum sesuai')
}

WebUI.click(findTestObject('Object Repository/IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry BI-Fast/button_Selanjutnya_inquiry'))

WebUI.setText(findTestObject('IBB Nasabah/Payroll/Page_QRCode/textfield_code1'), QRCode)

WebUI.takeScreenshot()

def judulPage = WebUI.getText(findTestObject('Object Repository/IBB Nasabah/Payroll/Page_resi transaksi/label_Title Resi Transaksi'))

if (judulPage.equals('Resi Transaksi') || judulPage.equals('Transaction Receipt')) {
    KeywordUtil.logInfo('Title page sudah benar')
} else {
    KeywordUtil.markError('Title page salah')
}

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('Nasabah/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

