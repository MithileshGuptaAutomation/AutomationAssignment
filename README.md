# Automation Assignment on login flow of Website.co.in

This project is an automated test framework built using **Java, Selenium WebDriver, and TestNG** to validate the user flow from registration/login to dashboard.
---
## 🚀 Tech Stack
- Java  
- Selenium WebDriver  
- TestNG  
- Maven  
- Eclipse IDE  
---
## 📁 Project Structure
MithileshCodes
│
├── src/main/java
│ ├── Base
│ │ └── BaseTest.java
│ │
│ ├── Pages
│ │ └── LoginPage.java
│
├── src/test/java
│ └── Test
│ └── LoginTests.java
│
├── pom.xml


---

## 🧠 Framework Design
This project follows the **Page Object Model (POM)** design pattern:
- **Base Layer** → Handles browser setup & teardown  
- **Page Layer** → Contains locators and reusable methods  
- **Test Layer** → Contains test scenarios and assertions  
---
## ✅ Test Scenarios Covered

### ✔ Valid Login
- User logs in with valid credentials  
- Verifies successful navigation to dashboard  

### ✔ Invalid Login
- User enters incorrect credentials  
- Verifies error message is displayed  
---
## 🔍 Key Features
- Reusable page methods  
- Clean separation of test logic and UI actions  
- Implicit waits implemented  
- Assertions using TestNG  
- Scalable structure for adding more tests  
---
## ▶️ How to Run
1. Clone the repository
2. Open in Eclipse / IntelliJ
3. Install dependencies (Maven)
4. Run:
---
## 🐞 Bug Reporting
Manual testing was performed and bugs were documented including:

- Phone number validation issue  
- Session handling (back button after logout)  
- UI/UX validation issues  
---
## ⚠️ Notes
- Test credentials are for demonstration purposes only  
- Real credentials have not been exposed for security reasons  
---
## 👨‍💻 Author
**Mithilesh Gupta**
---
## 📌 Repository
https://github.com/MithileshGuptaAutomation/QA-Automation-Assignment
