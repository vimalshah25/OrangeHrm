Feature: Login

Scenario: As a user i want to login successfully on orange hrm website and add employee successfully.

Given user is in login screen
When User Enter DefultUserId And Password On Login Page
Then user can Able to Log in And Come To dashboard page
Then user click on PIM category
And User Click on Add Empolyee Details Page
And user Enter All Empolyee Details
And click on save Button
Then user come to Empolyee Details Profile page
Then user click on Welcome
And from welcome user can able log out
Then user come back to lOGIN page
When user Enter Valid User id And Password
Then User Should able To loging Successfully

