Feature: Test the Gmail login feature and print the count of the emails present


 
 Scenario: Check with the login feature empty username
        Given I navigate to "https://accounts.google.com"
        And I enter " " into input field having id "identifierId"
        Then I click on element having xpath ".//span[text()='Next']"
        Then I wait for 5 sec
        Then element having xpath ".//button[@class='uBOgn']" should have text "Forgot email?"

        
Scenario: Check with the login feature valid username and empty password
       Given I navigate to "https://accounts.google.com"
       And I enter "rochanram" into input field having id "identifierId"
       Then I click on element having xpath ".//span[text()='Next']"
       And I enter " " into input field having name "password"
       Then I wait for 5 sec
       Then I click on element having xpath ".//span[text()='Next']"
       Then element having xpath ".//div[@class='IMH1vc lUHSR Hj2jlf']" should have text "Forgot password?"
        
        
#A lot of scenarios can be added like, Both with empty fields, wrong password, wrong username, garbage inputs.


       
Scenario: Check with the login feature valid username and password, and print the number of emails present
        Given I navigate to "https://accounts.google.com"
        And I enter "rrchinniah" into input field having id "identifierId"
        Then I click on element having xpath ".//span[text()='Next']"
        And I enter "R@mR0ch@nMech@tr0nics" into input field having name "password"
        Then I wait for 5 sec
        Then I click on element having xpath ".//span[text()='Next']"
        Then I print the number of emails present
        #The above line prints the number of emails present
        Then element having class "aKz" should have text "Primary"