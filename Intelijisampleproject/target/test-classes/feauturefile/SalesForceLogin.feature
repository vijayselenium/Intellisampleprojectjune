Feature: To validate the login functionality of salesforce application

 Scenario: To validate the login with valid username
   Given user launch the browser and navigate to the url
   When user enters the username "Vijay" and password "123"
   And  User clicks on login button
   Then user should navigate to the home page

 Scenario: To validate the error message
   Given user launch the browser and navigate to the url
   When user enters the username "learn-more" and password "abc"
   And  User clicks on login button
   Then validate the error message







