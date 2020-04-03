Feature: Registration functionality scenario
@Register @One
Scenario: Registraition functionality scenarios

  Scenario: Verify whether the user is able to register into the application by providing all the fields
   1. Given I launch the application
    2. And I navigate to Account Registration page
    3. When I provide all the below valid details
     	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran2@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
    4. And I select the Privacy Policy
    5. And I click on Continue button
    6. Then I should see that the User Account has successfully created
