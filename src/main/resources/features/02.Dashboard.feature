Feature: Dashboard Page

  Scenario Outline: Check Total Progress Summary
    When click menu dashboard
    When click summary progress "<progress>"
    Then make sure the total summary is the same as the total list data "<progress>"
    When select and click one of the data in the list
    Then check detailed prospect data

    Examples:
      | progress          |
      | Prospect          |
#      | Share Compro      |
#      | Initial Meeting   |
#      | Client Assessment |
#      | Complete          |
#      | Client Drop       |