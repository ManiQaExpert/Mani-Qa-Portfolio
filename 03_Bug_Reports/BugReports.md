# 🐞 Bug Reports — Sample Issues Logged in QA

This document contains sample bug reports formatted in a professional way (similar to Jira).

---

## 🔹 BUG-001 — App Crashes When Tapping Login

**Severity:** Critical  
**Priority:** High  

**Module:** Login  
**Environment:** Android 13, Pixel 5  
**Build Version:** 2.3.1

### Steps to Reproduce:
1. Launch the mobile app  
2. Enter valid email + password  
3. Tap Login  

### Expected Result:
App should successfully navigate to Home Screen.

### Actual Result:
App crashes and closes immediately.

### Attachments:
- Crash log  
- Video recording  

---

## 🔹 BUG-002 — Profile Picture Not Updating

**Severity:** Major  
**Priority:** Medium  

**Module:** Profile → Edit Profile  
**Environment:** Android 12  
**Build:** 2.3.1

### Steps:
1. Go to Profile  
2. Tap "Edit Profile"  
3. Select new photo from Gallery  
4. Tap Save  

### Expected:
New profile picture should appear.

### Actual:
Profile picture remains unchanged.

---

## 🔹 BUG-003 — Weak Password Not Validated

**Severity:** Medium  
**Priority:** High  

### Steps:
1. Navigate to Signup  
2. Enter password: `12345`  
3. Tap Create Account  

### Expected:
Show error message — *“Password must be at least 8 characters”*

### Actual:
User is able to proceed without validation.

---

## 🔹 BUG-004 — Push Notifications Not Received

**Severity:** Major  
**Priority:** Medium  

### Steps:
1. Enable notifications  
2. Trigger event from server  

### Expected:
Notification should appear instantly.

### Actual:
No notification received.

---

## ✔ Summary  
Total Bugs: **4**  
Covers: Login, Profile, Signup, Notifications  
