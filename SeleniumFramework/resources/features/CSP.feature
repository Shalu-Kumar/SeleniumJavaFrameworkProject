Feature: Customer Service Portal - Autorisation and Authentication

  Scenario 1: A user trying to login with incorrect username
    Given a user is already at the login page of CSP_PORTAL
    When a user try to login with incorrect username
    Then a user should see error message "Incorrect Username or Password"

  Scenario 2: An admin user trying to login with incorrect password
    Given an admin user is already at the login page of CSP_PORTAL
    When an admin user tries to login with incorrect password
    Then an admin user should see error message "Incorrect Username or Password"


  Scenario 3: An admin user trying to login with correct password
    Given an admin user is already at the login page of CSP_PORTAL
    When an admin user tries to login with correct password
    Then an admin user should go on home page of CSP_PORTAL


  Scenario 4: A customer user trying to login with incorrect password
    Given a customer user is already at the login page of CSP_PORTAL
    When a customer user tries to login with incorrect password
    Then a customer user should see error message "Incorrect Username or Password"


  Scenario 5: A customer user trying to login with correct password
    Given a customer user is already at the login page of CSP_PORTAL
    When a customer user tries to login with correct password
    Then a customer user should go on home page of CSP_PORTAL


  Scenario 6: A business user trying to login with incorrect password
    Given a business user is already at the login page of CSP_PORTAL
    When a business user tries to login with incorrect password
    Then a business user should see error message "User not authorised!"

    
  Scenario 7: A business trying to login with correct password
    Given a business user is already at the login page of CSP_PORTAL
    When a business user tries to login with correct password
    Then a business user should see error message "User not authorised!"
    
    
