Feature: Login to dev.qa-experience website
  In order to login to dev.qa-experience website
  As a user
  I should provide email and password
  @login
  Scenario:Verify login functionality with valid credentials
    Given i navigate to url "https://login.dev.qa-experience.com"
    When In the Login Page i enter email as "test@qa-experience.com.com"
    And  i enter password as "Password1"
    And  i click on login button
    Then i should be logged in successfully and see message Successfully Logged in!