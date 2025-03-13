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

long number = 123213213211

String numberAsString = number.toString()
String part1 = numberAsString.substring(0, 4)   // 4 digit pertama
String part2 = numberAsString.substring(4, 8)  // 4 digit berikutnya
String part3 = numberAsString.substring(8)  // 4 digit berikutnya
String Result = "${part1} ${part2} ${part3}"
//
//println(Result)

long number = 1401300020551

String numberAsString = number.toString()
	String part1 = numberAsString.substring(0, 4)  // First 4 digits
    String part2 = numberAsString.substring(4, 5)  // The 5th digit (single digit)
    String part3 = numberAsString.substring(5, 8)  // Digits 6-8 (3 digits)
    String part4 = numberAsString.substring(8, 9) // Digits 9-11 (3 digits)
    String part5 = numberAsString.substring(9, 12) // Last digit
	String part6 = numberAsString.substring(12) // Last digit
	
	String maskedPart3 = part3.replaceAll("\\d", "*")  // Mask all digits in part3
	String maskedPart4 = part4.replaceAll("\\d", "*")  // Mask all digits in part4
	
	String Result = "${part1} ${part2}${maskedPart3} ${maskedPart4}${part5} ${part6}"

println(Result)