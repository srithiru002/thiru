@smoke
Feature: To check the compose functionality in Gmail


Scenario: To validate compose button click
Given User launch the browser and login to Gmail Account 
When User should click the Compose email button 
Then New pop-up should be displayed with the headers as a new message


Scenario: To validate TO section in new mesage box
When User should enter the receiver email ID
Then Email ID is should passed in the to section


Scenario: To validate the auto-suggestion list of previously entered email IDs is displaying or not
When User should enter the receiver email ID in the TO section 
Then Auto Suggestion of the email ID should pop-up



Scenario: To validate user is able to add multiple receiver email IDs  
When User should enter multiple receiver email IDs in the TO section 
Then Multiple receiver email IDs should be passed


Scenario: To validate user can enter the subject line in the subject text box  
When User should enter subject in the Subject section 
Then User typed text should be pass in the subject field  


Scenario: To validate user can type in the email body area  
When User should type the message in the email body message area 
Then User typed text should be pass in the message body area


Scenario: To validate user can click and perform Formatting options  
When User should click the formatting option 
Then Formatting dialog box should be pop-up


Scenario: To check Check after hitting the send button the email should be delivered or not
When User should click send button
Then Sent message successfully pop-up will be shown






 