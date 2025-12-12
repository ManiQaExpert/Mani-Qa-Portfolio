# 🧪 Test Cases

Welcome to my **Test Cases repository**, demonstrating detailed, structured, and ready-to-execute QA scenarios for web and mobile applications. These test cases showcase my ability to cover functional, UI, end-to-end, and edge-case scenarios suitable for both manual and automated testing.

---

## 🔹 Overview

Each test case includes:

- **Test ID** – Unique identifier  
- **Description** – What is being tested  
- **Preconditions** – Setup required before execution  
- **Steps** – Step-by-step instructions  
- **Expected Results** – What should happen  
- **Actual Results** – What actually happened  
- **Priority / Severity** – Business impact and urgency  
- **Status** – Pass/Fail during execution  

---

## 📂 Sample Test Cases

### **Web Application Test Cases**

| Test ID      | Description                       | Preconditions           | Steps                                                                 | Expected Results                          | Actual Results                         | Priority / Severity | Status |
|-------------|-----------------------------------|------------------------|----------------------------------------------------------------------|------------------------------------------|----------------------------------------|------------------|--------|
| TC_WEB_001  | Verify user login functionality    | User is registered      | 1. Navigate to login page<br>2. Enter valid username & password<br>3. Click “Login” | User redirected to dashboard              | User redirected to dashboard           | P0 / High        | Pass   |
| TC_WEB_002  | Verify search functionality        | User logged in          | 1. Navigate to homepage<br>2. Enter keyword in search bar<br>3. Click “Search” | Relevant search results displayed         | Relevant search results displayed      | P1 / Medium      | Pass   |
| TC_WEB_003  | Verify logout functionality        | User logged in          | 1. Click on “Logout” button                                          | User redirected to login page             | User redirected to login page          | P0 / High        | Pass   |
| TC_WEB_004  | Verify login with invalid password (Negative) | User is registered | 1. Navigate to login page<br>2. Enter valid username<br>3. Enter invalid password<br>4. Click “Login” | Error message “Invalid credentials” displayed | Error message “Invalid credentials” displayed | P0 / High | Pass |
| TC_WEB_005  | Verify password reset functionality | User has valid email   | 1. Click “Forgot Password”<br>2. Enter email<br>3. Submit           | Password reset link sent to email         | Password reset link sent to email      | P1 / Medium      | Pass   |
| TC_WEB_006  | Verify adding item to wishlist      | User logged in          | 1. Navigate to product<br>2. Click “Add to Wishlist”                | Product added to wishlist                 | Product added to wishlist              | P2 / Low         | Pass   |
| TC_WEB_007  | Verify removing item from cart      | User has items in cart  | 1. Navigate to cart<br>2. Click “Remove” on an item                 | Item removed from cart                     | Item removed from cart                 | P1 / Medium      | Pass   |
| TC_WEB_008  | Verify checkout process             | User logged in, items in cart | 1. Go to cart<br>2. Click “Checkout”<br>3. Enter payment info<br>4. Submit | Order successfully placed                  | Order successfully placed              | P0 / High        | Pass   |
| TC_WEB_009  | Verify invalid coupon code (Negative) | User logged in, items in cart | 1. Enter invalid coupon code<br>2. Click “Apply”                    | Error message “Invalid coupon code”      | Error message “Invalid coupon code”   | P1 / Medium      | Pass   |
| TC_WEB_010  | Verify form field validations       | User on registration page | 1. Enter invalid email<br>2. Leave password blank<br>3. Submit     | Error messages displayed                   | Error messages displayed               | P0 / High        | Pass   |

---

### **Mobile Application Test Cases**

| Test ID      | Description                       | Preconditions           | Steps                                                                 | Expected Results                          | Actual Results                         | Priority / Severity | Status |
|-------------|-----------------------------------|------------------------|----------------------------------------------------------------------|------------------------------------------|----------------------------------------|------------------|--------|
| TC_MOB_001  | Verify app launch and splash screen | App installed           | 1. Launch app<br>2. Observe splash screen                             | Splash screen displayed, navigates to login | Splash screen displayed, navigates to login | P0 / High | Pass |
| TC_MOB_002  | Verify adding item to cart          | User logged in          | 1. Navigate to product list<br>2. Select product<br>3. Click “Add to Cart” | Item added to cart successfully          | Item added to cart successfully        | P0 / High | Pass |
| TC_MOB_003  | Verify search functionality         | User logged in          | 1. Navigate to search<br>2. Enter keyword<br>3. Tap “Search”          | Relevant results displayed               | Relevant results displayed             | P1 / Medium | Pass |
| TC_MOB_004  | Verify login with blank username (Negative) | App launched | 1. Launch app<br>2. Leave username blank<br>3. Enter password<br>4. Click “Login” | Error message “Username required” displayed | Error message “Username required” displayed | P0 / High | Pass |
| TC_MOB_005  | Verify logout functionality         | User logged in          | 1. Click “Logout” button                                             | App returns to login screen              | App returns to login screen            | P0 / High | Pass |
| TC_MOB_006  | Verify push notifications           | User logged in          | 1. Enable notifications<br>2. Trigger app notification               | Notification received                     | Notification received                  | P2 / Low  | Pass |
| TC_MOB_007  | Verify app on low network           | App installed           | 1. Turn on mobile data<br>2. Disable Wi-Fi<br>3. Launch app          | App shows loading indicator, handles timeout | App shows loading indicator, handles timeout | P1 / Medium | Pass |
| TC_MOB_008  | Verify profile update               | User logged in          | 1. Navigate to profile<br>2. Update name and email<br>3. Save        | Profile updated successfully              | Profile updated successfully           | P1 / Medium | Pass |
| TC_MOB_009  | Verify payment with invalid card (Negative) | User logged in, items in cart | 1. Checkout<br>2. Enter invalid card<br>3. Submit                  | Error message displayed                    | Error message displayed                | P0 / High | Pass |
| TC_MOB_010  | Verify app compatibility on different devices | App installed on multiple devices | 1. Launch app on Android & iOS devices                                 | App works consistently across devices     | App works consistently across devices | P1 / Medium | Pass |

---

## 🎯 Highlights

- Covers **major workflows, edge cases, and negative scenarios**  
- Includes **priority/severity** for business impact  
- Clearly structured for **manual execution** or **automation reference**  
- Ready to share with clients for **freelance QA projects**  

## 💡 Usage

Copy and use these test cases directly in QA cycles for both **Web** and **Mobile** applications.
