@login
Feature: login functionality


  Scenario Outline: TC_1_Login_Functionality
    Then user should validate login dashboard label "<LoginLabel>" text
    And user enter email "<EmailAdd>" or phone in input box
    And user enter password "<password>" in input box
    And user click on login button
#    And user should click on Ok button change password pop
    Then user should validate dashboard label "<DashboardLabel>"
    Examples:
      | EmailAdd            | password | DashboardLabel | LoginLabel               |
      | admin@yourstore.com | admin    | Dashboard      | Welcome, please sign in! |


  Scenario Outline: TC_2_Wrong_Email_Validations
    Then user should validate login dashboard label "<LoginLabel>" text
    Then user enter email "<EmailAdd>" or phone in input box
    And  user enter password "<password>" in input box
    Then user click on login button
    Then user should validate error message "<ErrorsMsg>"
    Examples:
      | EmailAdd            | password | ErrorsMsg                                                                                   | LoginLabel               |
      | asmin@yourstore.com | admin    | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found | Welcome, please sign in! |


  Scenario Outline: TC_3_invalid_email_Numeric
    When user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAddNum>" or phone in input box
    Then user click on login button
  #  Then  user enter password "<password>" in input box
    Then user should validate numeric error message "<NumericEmailErrormsg>"
    Examples:
      | LoginLabel               | EmailAddNum | NumericEmailErrormsg                |
      | Welcome, please sign in! | 23456133    | Please enter a valid email address. |


  Scenario Outline: TC_4_invalid email(special character)
    When  user should validate login dashboard label "<LoginLabel>" text
    Then user enter email "<EmailAdd>" or phone in input box
#    And   user enter password "<password>" in input box
    Then user click on login button
    Then  user should validate  email input box errors message"<special_char_Email>"

    Examples:
      | LoginLabel               | EmailAdd | special_char_Email                  |
      | Welcome, please sign in! | @#$%^&   | Please enter a valid email address. |

  Scenario Outline: TC_5_wrong password
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
    Then  user should validate wrong password error"<errorMsg>"
    Examples:
      |LoginLabel                | EmailAdd            | password  | errorMsg                                                                                               |
      | Welcome, please sign in! | admin@yourstore.com | Samar@123 | Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect |

  Scenario Outline: TC_6_blank_password
    Then  user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then user enter password "<password>" in input box
    And  user click on login button
    Then user should validate errors message Password  as leave"<errorMsg>"
    Examples:
      |LoginLabel               | EmailAdd            | password | errorMsg                                                                                               |
      |Welcome, please sign in! | admin@yourstore.com |          | Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect |

  Scenario Outline: TC_7_Login_Acc
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Examples:
      | LoginLabel             | EmailAdd            | password | DashboardLabel |
      |Welcome, please sign in!| admin@yourstore.com | admin    | Dashboard      |

  Scenario Outline: TC_8_Login_Logout
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then user enter password "<password>" in input box
    And  user click on login button
    #  Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on logout button
    And user should validate login dashboard label "<LoginLabel>" text
    Examples:
      |LoginLabel              | EmailAdd            | password | DashboardLabel | LoginLabel               |
      |Welcome, please sign in!| admin@yourstore.com | admin    | Dashboard      | Welcome, please sign in! |






























