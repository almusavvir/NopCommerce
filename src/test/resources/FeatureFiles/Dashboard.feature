
Feature: Dashboard Functionality

  Scenario Outline: TC_9_Dashboard
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user should validate this side bar "<sidebar>"
    Examples:
     | LoginLabel              | EmailAdd            | password | DashboardLabel | sidebar                                                                                           |
     |Welcome, please sign in! | admin@yourstore.com | admin    | Dashboard      | Dashboard,Catalog,Sales,Customers,Promotions,Content management,Configuration,System,Reports,Help |

  Scenario Outline:  TC_10_Catalog
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on Catalog
    And  user should validate drop down field "<catLogDropDown>"
    Then user click on Attributes button
    And user should validate drop down field"<AttributeDropdown>"

    Examples:
      |LoginLabel               | EmailAdd            | password | DashboardLabel | catLogDropDown                                                            | AttributeDropdown                                               |
      |Welcome, please sign in! | admin@yourstore.com | admin    | Dashboard | Products,Categories,Manufacturers,Product reviews,Product tags,Attributes | Product attributes,specification attributes,checkout attributes |


  Scenario Outline: TC_11_sales
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on sales
    And user should validate sales drop down field"<salesdropdown>"

    Examples:
      |LoginLabel               | EmailAdd            | password | DashboardLabel | salesdropdown                                                                               |
      |Welcome, please sign in! | admin@yourstore.com | admin    | Dashboard      | Orders,Shipments,Return requests,Recurring payments,Gift cards,Shopping carts and wishlists |
  @Dashboard
  Scenario Outline: TC_12_Customers
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on customers
    And user should validate customers drop down field"<costomersDropdown>"
    Examples:
      |LoginLabel               | EmailAdd            | password | DashboardLabel | costomersDropdown                                                                                   |
      |Welcome, please sign in! | admin@yourstore.com | admin    | Dashboard      | Customers,customer roles,online customers,Vendors,Activity log,Activity Types,GDPR requests (log)   |

  Scenario Outline: TC_13_Promotions
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on promotions
    And user should validate promotion drop down"<promotionDropdown>"
    Examples:
      |LoginLabel               | EmailAdd            | password | DashboardLabel | promotionDropdown                                     |
      |Welcome, please sign in! | admin@yourstore.com | admin    | Dashboard      | Discount, Affiliates,Newsletter subscribers,Campaigns |

  Scenario Outline: TC_14_Content_management
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
   # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on content management
    And user should validate content management dropdown"<managementdropdown>"

    Examples:
      |LoginLabel              | EmailAdd            | password | DashboardLabel | managementdropdown                                                                               |
      |Welcome, please sign in!| admin@yourstore.com | admin    | Dashboard      | Topics (pages),Message templates,News items,News comments,Blog posts,Blog comments, Polls,Forums |

  Scenario Outline: TC_15_Configuration
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
     # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on configuration
    And user should validate  configuration Dropdown"<configurationdropdown>"
    Examples:
      |LoginLabel| EmailAdd            | password | DashboardLabel | configurationdropdown                                                                                                                                                                                                                                                                                                 |
      |Welcome, please sign in!        | admin@yourstore.com | admin    | Dashboard | Settings,Stores,Countries,Languages,Currencies,Payment methods,Payment restrictions,Tax providers,Tax categories,Shipping,PayPal Zettle (POS),Access control list,Widgets,Authentication,PayPal Commerce,Mobile App,EU Omnibus Directive,Web API Frontend,Lucene search provider,Local plugins,All plugins and themes |


  Scenario Outline: TC_16_System
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
      # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on System
    And user should validate  system Dropdown"<SystemDropdown>"
    Examples:
      |LoginLabel               | EmailAdd            | password | DashboardLabel | SystemDropdown                                                                                                       |
      |Welcome, please sign in! | admin@yourstore.com | admin    | Dashboard      | System information,Log,Warnings,Maintenance,Message queue,Schedule tasks,Search engine friendly page names,Templates |

  Scenario Outline: TC_17_Reports
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
      # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on Reports
    And user should validate Repors Dropdown"<ReportsDropdown>"
    Examples:
    |LoginLabel                | EmailAdd            | password | DashboardLabel | ReportsDropdown                                                                                     |
    |Welcome, please sign in!  | admin@yourstore.com | admin    | Dashboard      | PowerBI,Sales summary,Low stock,Bestsellers,Products never purchased,Country sales,Customer reports |

  Scenario Outline: TC_18_Help
    Then user should validate login dashboard label "<LoginLabel>" text
    And  user enter email "<EmailAdd>" or phone in input box
    Then  user enter password "<password>" in input box
    And  user click on login button
      # Then user should click on Ok button change password pop
    And  user should validate dashboard label "<DashboardLabel>"
    Then user click on Help
    And user should validate Help Dropdown"<HelpDropdown>"
    Examples:
      |LoginLabel              | EmailAdd            | password | DashboardLabel | HelpDropdown                                                                       |
      |Welcome, please sign in!| admin@yourstore.com | admin    | Dashboard      | Training,Documentation,Community forums,Premium support services,Solution partners |

#  Scenario Outline: TC_19_Catalog_Category
#
#    Then user should validate login dashboard label "<LoginLabel>" text
#    And  user enter email "<EmailAdd>" or phone in input box
#    Then  user enter password "<password>" in input box
#    And  user click on login button
#      # Then user should click on Ok button change password pop
#    And  user should validate dashboard label "<DashboardLabel>"
#    Then user should validate side bar
#    And user click on Catalog
#    Then user should validate  Catalog Dropdown field "<catLogDropDown>"
#    And user click on products
#    Then user should validate Lebel->Products"<product_label">
#


























