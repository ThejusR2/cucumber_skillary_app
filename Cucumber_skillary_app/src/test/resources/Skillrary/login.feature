Feature: Test SkillRary
Scenario: To test login feature
Given To be in the login page
When Enter the username "admin"
And Enter the password "admin"
And Click login button
Then I should see the username "SkillRary Ecommerce"
And Click on profile
And Click on signout button