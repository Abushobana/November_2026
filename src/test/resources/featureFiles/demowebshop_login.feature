Feature:
Verification of demowebshop login page functionality with valid and invalid credential

Scenario:
Verification of demowebshop login page functionality with invalid credentials

Given user launches on the demowebshop login page in the browser
When  user enter the invalid username in demowebshop in username field
When  user enter the invalid password in demowebshop in password field
And   user click on the demowebshop page in login button
Then  user should navigate to the demowebshop login error page
