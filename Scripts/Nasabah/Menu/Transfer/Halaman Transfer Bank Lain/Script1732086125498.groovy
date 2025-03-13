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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//def random = new Random()
//
//// Menghasilkan angka acak antara 10.000 dan 20.000
////def randomNumber = random.nextInt(10001) + 10000
//GlobalVariable.AmountTransfer = random.nextInt(10001) + 10000
//
//// Menghasilkan angka acak sebanyak 11 digit
//def randomNumber2 = (random.nextLong() % 90000000000) + 10000000000
//
//def extractedNumber = randomNumber2.toString().substring(0, 11)
//
//def valueRandomNumber2 = extractedNumber
//
//def modifiedRandomNumber2 = extractedNumber.replaceAll('-', '')

//Halaman Transfer Bank Lain
 
WebUI.callTestCase(findTestCase('Nasabah/Login/Login'), [('corpId') : corpid, ('userId') : username, ('password') : password
        , ('url') : GlobalVariable.url], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Transfer', false)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/div_Transfer'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/div_Bank Lain'))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/radiobuttonSumberDana'))

WebUI.scrollToElement(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/div_Pilih Tipe Transfer'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/div_Pilih Tipe Transfer'))

WebUI.delay(2)

//WebUI.waitForElementClickable(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/pilihan_Online'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/pilihan_Online'))

WebUI.setText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_Amount'), GlobalVariable.AmountTransfer)

//
//WebUI.scrollToElement(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_RekeningTujuan'), 
//    5, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_Amount'), Keys.chord(Keys.PAGE_UP))

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/div_Pilih Bank Tujuan'))

WebUI.setText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_searchBankTujuan'), GlobalVariable.BankTujuan)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/BANK CIMB NIAGA'))

WebUI.setText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/input_RekeningTujuan'), GlobalVariable.RekeningTujuan)

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/button_Tambah Rekening'))

String ValidasiRekTujuan = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/validasiRekeningTujuan'))

//WebUI.verifyMatch(ValidasiRekTujuan, modifiedRandomNumber2, false, FailureHandling.STOP_ON_FAILURE)

//println(modifiedRandomNumber2+ ' ' +ValidasiRekTujuan)

if (GlobalVariable.RekeningTujuanFix.compareTo(ValidasiRekTujuan) == 0) {
	KeywordUtil.logInfo('Text Match, the value is: '+GlobalVariable.RekeningTujuanFix+' And '+ValidasiRekTujuan)
}else {
	KeywordUtil.markError('Text Not Match, the value is: '+GlobalVariable.RekeningTujuanFix+' And '+ValidasiRekTujuan)
}

WebUI.setText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/textarea_Berita'), GlobalVariable.berita)

WebUI.scrollToElement(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/validasiNomorRekSumberDana'),
	5, FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript("window.scrollBy(0, -250)", null)

GlobalVariable.ValidasiNoRekHalamanBankLain = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/validasiNomorRekSumberDana'))

String NoRek = WebUI.getText(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/nomorRekSumberDana'),
	FailureHandling.STOP_ON_FAILURE)

def output = NoRek.replaceAll('\\s', '')

if (output.compareTo(GlobalVariable.ValidasiNoRekHalamanBankLain) == 0) {
	KeywordUtil.logInfo('Text Match, the value is: '+output+' And '+GlobalVariable.ValidasiNoRekHalamanBankLain)
}else {
	KeywordUtil.markError('Text Not Match, the value is: '+output+' And '+GlobalVariable.ValidasiNoRekHalamanBankLain)
}

//WebUI.verifyMatch(output, ValidasiNoRek, false, FailureHandling.STOP_ON_FAILURE)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('IBB Nasabah/Transfer Menu (Maker)/Halaman Transfer Bank Lain/button_Selanjutnya'))
