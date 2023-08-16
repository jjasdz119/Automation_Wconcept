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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.wconcept.co.kr/')

'글로벌헤더 영역에서 Login 버튼을 클릭한다.'
WebUI.click(findTestObject('Object Repository/page_Login/globalHeader_login'))

'계정 ID를 입력한다.'
WebUI.setText(findTestObject('page_Login/input__accountId'), 'asdz119@naver.com')

'계정 패스워드를 입력한다.'
WebUI.setEncryptedText(findTestObject('Object Repository/page_Login/input__accountPassword'), 'kkEFCHjSSyhpCGd7KRSe/g==')

'로그인 버튼을 클릭한다.'
WebUI.click(findTestObject('Object Repository/page_Login/button_submit'))

'글로벌헤더 영역에서 Logout 버튼을 확인한다.'
WebUI.verifyElementPresent(findTestObject('page_Login/globalHeader_logout'), 0)

