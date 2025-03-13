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
//
//def random = new Random()
//
//// Menghasilkan angka acak antara 10.000 dan 20.000
//def randomNumber1 = random.nextInt(10001) + 10000
//
//GlobalVariable.AmountTransfer = randomNumber1.toString().substring(0, 5)
//
//def valueRandomNumber1 = GlobalVariable.AmountTransfer
//
//GlobalVariable.AmountTransferFix = GlobalVariable.AmountTransfer.replaceAll('-', '')
//
//// Menghasilkan angka acak sebanyak 11 digit
//def randomNumber2 = random.nextInt(100000000000) + 700000000000
//
//GlobalVariable.RekeningTujuan = randomNumber2.toString().substring(0, 11)
//
//def valueRandomNumber2 = GlobalVariable.RekeningTujuan
//
//GlobalVariable.RekeningTujuanFix = GlobalVariable.RekeningTujuan.replaceAll('-', '')

//WebUI.callTestCase(findTestCase('Nasabah/Menu/Transfer/Halaman Transfer Bank Lain'), [('corpid') : corpid, ('username') : username
//        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

String AmountInquiry = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_Amount'))

//GlobalVariable.AmountTransferInRupiahFormat = String.format("Rp %,1,.2f", GlobalVariable.AmountTransferFix).replace(",", ".").replace(".", ",", 1)
//GlobalVariable.AmountTransferInRupiahFormat = String.format("Rp %,1,.2f", GlobalVariable.AmountTransferFix)
String numberAsString = GlobalVariable.AmountTransferFix.toString()

String part1 = numberAsString.substring(0, 2) // 2 digit pertama
    
String part2 = numberAsString.substring(2) // 2 digit berikutnya
    
GlobalVariable.AmountTransferInRupiahFormat = "Rp $part1.$part2,00"

if (GlobalVariable.AmountTransferInRupiahFormat.compareTo(AmountInquiry) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.AmountTransferInRupiahFormat) + ' And ') + AmountInquiry)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.AmountTransferInRupiahFormat) + ' And ') + 
        AmountInquiry)
}

String ValidasiNoRekSumberDanaInquiry = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_validasiNomorRekSumberDana'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.ValidasiNoRekHalamanBankLain.compareTo(ValidasiNoRekSumberDanaInquiry) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.ValidasiNoRekHalamanBankLain) + ' And ') + ValidasiNoRekSumberDanaInquiry)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.ValidasiNoRekHalamanBankLain) + ' And ') + 
        ValidasiNoRekSumberDanaInquiry)
}

String ValidasiRekeningTujuanInquiry = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_validasiRekeningTujuan'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.RekeningTujuanFix.compareTo(ValidasiRekeningTujuanInquiry) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.RekeningTujuanFix) + ' And ') + ValidasiRekeningTujuanInquiry)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.RekeningTujuanFix) + ' And ') + ValidasiRekeningTujuanInquiry)
}

String ValidasiBankTujuan = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_BANK CIMB NIAGA'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.BankTujuan.compareTo(ValidasiBankTujuan) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.BankTujuan) + ' And ') + ValidasiBankTujuan)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.BankTujuan) + ' And ') + ValidasiBankTujuan)
}

String ValidasiBeritaInquiry = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_berita'), 
    FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.berita.compareTo(ValidasiBeritaInquiry) == 0) {
    KeywordUtil.logInfo((('Text Match, the value is: ' + GlobalVariable.berita) + ' And ') + ValidasiBeritaInquiry)
} else {
    KeywordUtil.markError((('Text Not Match, the value is: ' + GlobalVariable.berita) + ' And ') + ValidasiBeritaInquiry)
}

GlobalVariable.biayaTransaksi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_biayaTransaksi'), 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.biayaAdmin = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_BiayaAdmin'), 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.totalBiaya = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_TotalBiaya'), 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.totalTransaksi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_totalTransaksi'), 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.jenisTransfer = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_jenisTransfer'), 
    FailureHandling.STOP_ON_FAILURE)

GlobalVariable.jenisTransaksi = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/inquiry_JenisTransaksi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Inquiry/button_Selanjutnya_inquiry'))

WebUI.sendKeys(findTestObject('IBB Nasabah/Daftar Tugas Menu (Approver dan Releaser)/Transfer (Approver dan Releaser)/Lihat Detail/input_QR_1'), 
    '1')

WebUI.sendKeys(findTestObject('IBB Nasabah/Daftar Tugas Menu (Approver dan Releaser)/Transfer (Approver dan Releaser)/Lihat Detail/input_QR_2'), 
    '2')

WebUI.sendKeys(findTestObject('IBB Nasabah/Daftar Tugas Menu (Approver dan Releaser)/Transfer (Approver dan Releaser)/Lihat Detail/input_QR_3'), 
    '3')

WebUI.sendKeys(findTestObject('IBB Nasabah/Daftar Tugas Menu (Approver dan Releaser)/Transfer (Approver dan Releaser)/Lihat Detail/input_QR_4'), 
    '4')

WebUI.sendKeys(findTestObject('IBB Nasabah/Daftar Tugas Menu (Approver dan Releaser)/Transfer (Approver dan Releaser)/Lihat Detail/input_QR_5'), 
    '5')

WebUI.sendKeys(findTestObject('IBB Nasabah/Daftar Tugas Menu (Approver dan Releaser)/Transfer (Approver dan Releaser)/Lihat Detail/input_QR_6'), 
    '6')

