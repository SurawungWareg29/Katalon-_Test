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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def random = new Random()

// Menghasilkan angka acak antara 10.000 dan 20.000
def randomNumber1 = random.nextInt(10001) + 10000

GlobalVariable.AmountTransfer = randomNumber1.toString().substring(0, 5)

def valueRandomNumber1 = GlobalVariable.AmountTransfer

GlobalVariable.AmountTransferFix = GlobalVariable.AmountTransfer.replaceAll('-', '')

// Menghasilkan angka acak sebanyak 12 digit
def randomNumber2 = random.nextLong(100000000000) + 700000000000

GlobalVariable.RekeningTujuan = randomNumber2.toString().substring(0, 12)

def valueRandomNumber2 = GlobalVariable.RekeningTujuan

GlobalVariable.RekeningTujuanFix = GlobalVariable.RekeningTujuan.replaceAll('-', '')

WebUI.callTestCase(findTestCase('Nasabah/Menu/Transfer/Halaman Transfer Bank Lain'), [('corpid') : corpid, ('username') : username
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Nasabah/Menu/Transfer/Halaman Inquiry'), [('corpid') : corpid, ('username') : username, ('password') : password], 
    FailureHandling.STOP_ON_FAILURE)

String AmountResi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_Amount'))

if (GlobalVariable.AmountTransferInRupiahFormat.compareTo(AmountResi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.AmountTransferInRupiahFormat) + ' And ') + AmountResi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.AmountTransferInRupiahFormat) + ' And ') + 
        AmountResi)
}

String NoRekResiFormat = GlobalVariable.ValidasiNoRekHalamanBankLain.toString()

String part1 = NoRekResiFormat.substring(0, 4) // First 4 digits
    
String part2 = NoRekResiFormat.substring(4, 5) // The 5th digit (single digit)

String part3 = NoRekResiFormat.substring(5, 8) // Digits 6-8 (3 digits)

String part4 = NoRekResiFormat.substring(8, 9) // Digits 9-11 (3 digits)

String part5 = NoRekResiFormat.substring(9, 12) // Last digit

String part6 = NoRekResiFormat.substring(12) // Last digit

String maskedPart3 = part3.replaceAll('\\d', '*') // Mask all digits in part3

String maskedPart4 = part4.replaceAll('\\d', '*') // Mask all digits in part4

GlobalVariable.ValidasiNoRekHalamanResi = "${part1} ${part2}${maskedPart3} ${maskedPart4}${part5} ${part6}"

String ValidasiNoRekSumberDanaResi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_RekeningSumberDana'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.ValidasiNoRekHalamanResi.compareTo(ValidasiNoRekSumberDanaResi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.ValidasiNoRekHalamanResi) + ' And ') + ValidasiNoRekSumberDanaResi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.ValidasiNoRekHalamanResi) + ' And ') + ValidasiNoRekSumberDanaResi)
}

String RekTujuanResi = GlobalVariable.RekeningTujuanFix.toString()

String part1TujuanResi = RekTujuanResi.substring(0, 4) // 4 digit pertama
    
String part2TujuanResi = RekTujuanResi.substring(4, 8) // 4 digit berikutnya
    
String part3TujuanResi = RekTujuanResi.substring(8) // 4 digit berikutnya
    
GlobalVariable.ValidasiNoRekTujuanHalamanResi = "${part1TujuanResi} ${part2TujuanResi} ${part3TujuanResi}"

String ValidasiRekeningTujuanResi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_rekeningTujuan'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.ValidasiNoRekTujuanHalamanResi.compareTo(ValidasiRekeningTujuanResi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.ValidasiNoRekTujuanHalamanResi) + ' And ') + ValidasiRekeningTujuanResi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.ValidasiNoRekTujuanHalamanResi) + ' And ') + 
        ValidasiRekeningTujuanResi)
}

String ValidasiBankTujuanResi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_BANK CIMB NIAGA'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.BankTujuan.compareTo(ValidasiBankTujuanResi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.BankTujuan) + ' And ') + ValidasiBankTujuanResi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.BankTujuan) + ' And ') + ValidasiBankTujuanResi)
}

String ValidasiBeritaResi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_berita'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.berita.compareTo(ValidasiBeritaResi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.berita) + ' And ') + ValidasiBeritaResi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.berita) + ' And ') + ValidasiBeritaResi)
}

String biayaTransaksi_resi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_biayaTransaksi'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.biayaTransaksi.compareTo(biayaTransaksi_resi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.biayaTransaksi) + ' And ') + biayaTransaksi_resi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.biayaTransaksi) + ' And ') + biayaTransaksi_resi)
}

String biayaAdmin_resi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_biayaAdmin'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.biayaAdmin.compareTo(biayaAdmin_resi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.biayaAdmin) + ' And ') + biayaAdmin_resi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.biayaAdmin) + ' And ') + biayaAdmin_resi)
}

String totalBiaya_resi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_totalBiaya'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.totalBiaya.compareTo(totalBiaya_resi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.biayaTransaksi) + ' And ') + totalBiaya_resi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.biayaTransaksi) + ' And ') + totalBiaya_resi)
}

String totalTransaksi_resi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_TotalTransaksi'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.totalTransaksi.compareTo(totalTransaksi_resi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.totalTransaksi) + ' And ') + totalTransaksi_resi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.totalTransaksi) + ' And ') + totalTransaksi_resi)
}

String jenisTransfer_resi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_JensiTransfer'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.jenisTransfer.compareTo(jenisTransfer_resi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.jenisTransfer) + ' And ') + jenisTransfer_resi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.jenisTransfer) + ' And ') + jenisTransfer_resi)
}

String jenisTransaksi_resi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/resi_JenisTransaksi'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.jenisTransaksi.compareTo(jenisTransaksi_resi) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.jenisTransaksi) + ' And ') + jenisTransaksi_resi)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.jenisTransaksi) + ' And ') + jenisTransaksi_resi)
}

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Resi/button_Tutup'))

WebUI.callTestCase(findTestCase('Nasabah/Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

