import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open Browser
WebUI.openBrowser('')

// Navigate to URL
WebUI.navigateToUrl('https://example.com')

// Verify Page Title
WebUI.verifyTitle('Example Domain')

// Close Browser
WebUI.closeBrowser()
