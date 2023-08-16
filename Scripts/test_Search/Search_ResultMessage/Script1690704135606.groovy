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

'검색창에 키워드를 입력한다.'
WebUI.setText(findTestObject('page_Main/input_text'), '클리어런스')

'검색창에 돋보기 버튼을 클릭한다.'
WebUI.click(findTestObject('page_Main/button_Search'))

'검색결과 페이지에 검색결과 메시지가 표시 되는지 확인한다.'
WebUI.verifyElementPresent(findTestObject('page_SearchResult/element_SearchResultMessage'), 0)

'검색결과 메시지에 입력 키워드가 표시 되는지 확인한다.'
WebUI.verifyElementText(findTestObject('page_SearchResult/element_SearchKeyword'), '‘클리어런스’')

