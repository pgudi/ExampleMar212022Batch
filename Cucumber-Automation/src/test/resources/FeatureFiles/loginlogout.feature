# Author:
# Feature ID:
# Description:
# Purpose:
Feature: Login and logout functionality
Description: Verify or validate Login and Logout functionality
Scenario: Verify Login functionality
Given I launch the chrome browser
And I navigate the URL of the application
When I enter the usename in username text field
And  I enter the password in password text field
And I click on Login button
Then I find the Home Page
And I minimize the flyoutwindow

Scenario: Verify Logout functionality
Given I find the logout link in Home Page
When I click on Logout link
Then I find the login page
And I close Application