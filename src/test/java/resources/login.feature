Feature: Login to Sauce
Scenario Outline: Success Login to Sauce

Given User opens Saucedemo
When I enter Username as "standard_user" and Password as "secret_sauce"
And After adding to cart and order
Then I should get success message


#Scenario Outline: Success Login to Sauce
#
#Given User opens Saucedemo
#When I enter Username as "<User>" and Password as "<Pass>"
#Then I should login
#
#Examples: 
      #| User | Pass |
      #| standard_user|secret_sauce |
      #| locked_out_user|secret_sauce|
      #| problem_user|secret_sauce|
      

#Scenario Outline: Login to Sauce with locked creds
#
#Given User opens Saucedemo
#When I enter Username as "locked_out_user" and Password as "secret_sauce"
#Then I should get error message


