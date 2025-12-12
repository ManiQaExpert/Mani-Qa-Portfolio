# 📄 Test Cases — Sample Mobile App (Android)

This document contains detailed functional test cases for the mobile application.

---

## 🔹 1. Login Module Test Cases

### TC001 — Verify Login with Valid Credentials  
**Pre-condition:** User has a valid account  
**Steps:**  
1. Enter valid email  
2. Enter valid password  
3. Tap Login  
**Expected Result:**  
User should successfully log into the app.

---

### TC002 — Verify Login with Invalid Password  
**Steps:**  
1. Enter valid email  
2. Enter wrong password  
3. Tap Login  
**Expected Result:**  
Error message: *“Invalid email or password”*

---

### TC003 — Verify Login Button Disabled When Fields Empty  
**Steps:**  
1. Keep email empty  
2. Keep password empty  
**Expected Result:**  
Login button must remain disabled.

---

## 🔹 2. Signup Module Test Cases

### TC004 — Verify Signup with Valid Data  
**Expected Result:**  
Account should be created successfully.

---

### TC005 — Verify Error for Weak Password  
**Expected Result:**  
Show validation message for weak password.

---

### TC006 — Verify Email Format Validation  
**Expected Result:**  
Show “Enter a valid email address”.

---

## 🔹 3. Home Screen Test Cases

### TC007 — Verify Home Screen Loads Successfully  
**Expected Result:**  
All UI elements appear correctly.

---

### TC008 — Verify Scrolling Functionality  
**Expected Result:**  
User is able to scroll through the home feed.

---

## 🔹 4. Profile Test Cases

### TC009 — Verify Updating Profile Information  
**Expected Result:**  
Profile updates successfully.

---

### TC010 — Verify Profile Picture Upload  
**Expected Result:**  
Picture uploads and preview updates.

---

## 🔹 5. Notifications Test Cases

### TC011 — Verify Notifications Display  
**Expected Result:**  
Notifications appear in chronological order.

---

## 🔹 6. Logout Test Cases

### TC012 — Verify Logout Functionality  
**Expected Result:**  
User is logged out and navigated to Login screen.

---

## ✔ Summary  
Total Test Cases: **12**  
Modules Covered: Login, Signup, Home, Profile, Notifications, Logout  
