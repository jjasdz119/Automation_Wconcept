import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'글로벌 헤더에 MyPage 아이콘을 클릭한다.'
WebUI.click(findTestObject('page_MyProfile/globalHeader_myProfile'))

'회원정보 변경 메뉴를 클릭한다.'
WebUI.click(findTestObject('page_MyProfile/element_editMyProfile'))

'회원정보 관리를 위해 비밀번호를 입력한다.'
WebUI.setText(findTestObject('page_MyProfile/input_accountPassword'), 'Tmzkdlzx1!')

'[확인] 버튼을 클릭한다.'
WebUI.click(findTestObject('page_MyProfile/button_submit'))

'회원정보 변경 타이틀을 확인한다.'
WebUI.verifyElementPresent(findTestObject('page_MyProfile/h3_title'), 0)

'[수정] 버튼을 클릭한다.'
WebUI.click(findTestObject('page_MyProfile/button_edit'))

