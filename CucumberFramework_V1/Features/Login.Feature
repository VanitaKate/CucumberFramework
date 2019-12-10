Feature: Login to CRM Application

Scenario: Login to CRM Application
Given User launch FireFox Browser
When User opens URL "https://github.com"
And User enters username "vasudha1981@yahoo.com" and password "Password101" 
And Clicks on LogIn button
Then Page title should be "congmento CRM"
When UserClicks on settings and logout link
Then Page tile should be "congmento CRM"
Then Close Browser



Scenario Outline: Login check with multiple credentials
Given User launch FireFox Browser
When User opens URL "https://github.com"
And User enters username <userName> and password <Password>
And Clicks on LogIn button
Then Page title should be "congmento CRM"
When UserClicks on settings and logout link
Then Page tile should be "congmento CRM"
Then Close Browser

  Examples:
  
    | userName | Password | 
    |vani_ket@rediffmail.com|  Password  |   
    |  Vasudha1981@yahoo.com  | Password101  |               


  