# PARTY INBOX
## Automation tests

### Reference: 
https://www.partyinbox.lt 


#### Description:
 #### Technologies: JAVA/Maven
#### Dependencies:
* Selenium
* testNg
* Webdriver manager


# TEST SCENARIOS:
## 1. Test Login with valid data
*  Enter valid email
*  Enter valid password
* Click on registration button
* Checking or registration was successful
## 2.Test Login with invalid data
### First data set
* Enter invalid email
* Enter valid password
* Checking registration status 
### Second data set
* Enter valid email
* Enter invalid password
* Checking or registration was not successful
### Third data set
* Enter empty email
* Enter empty password
* Checking registration status
## 3.Test Search function
* Write down what to look for
* Press the button to search
* Checking the results
## 4.Test Shopping Cart
* Click on the product catalog
* Choose the category
* Choose the subcategory
* Choose what want to buy
* Add item to the cart
* Read the message about adding the cart
## 5.Test Change password
* Click on the My Account icon
* Click new account info
* Enter new password
* Repeat new password
* Click submit
* Read message about changes