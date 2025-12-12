import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// Start App
Mobile.startApplication('Apps/MyApp.apk', false)

// Tap Login Button
Mobile.tap(findTestObject('Object Repository/Login/Button_Login'), 10)

// Enter Username & Password
Mobile.setText(findTestObject('Object Repository/Login/Input_Username'), 'testuser', 10)
Mobile.setText(findTestObject('Object Repository/Login/Input_Password'), 'Password123', 10)

// Tap Submit
Mobile.tap(findTestObject('Object Repository/Login/Button_Submit'), 10)

// Verify Home Screen Loaded
Mobile.verifyElementExist(findTestObject('Object Repository/Home/Label_Welcome'), 10)

// Close App
Mobile.closeApplication()
