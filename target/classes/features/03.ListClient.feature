Feature: List Client Page

  Scenario: Access List Client Menu
    When click prospect menu
    And click list client menu
    Then validation displays the list client menu

  Scenario Outline: Filter status progress
    When select dropdown filter client progress <valueFilter>
    Then Validate filter client progress "<result>" "<status>"
    Examples: Data table filter client progress
      | valueFilter | result                  | status            |
      | 1           | Stage: Prospect         | Prospect          |
      | 2           | Stage: Share Compro     | Share Compro      |
      | 3           | Stage: Initial Meetings | Initial Meetings  |
      | 4           | Stage: Client Assesment | Client Assessment |
      | 5           | Stage: Drop             | Drop              |
      | 6           | Stage: Completed        | Completed         |

  Scenario: Access create new client form
    When click create new client
    Then validation display the create new client form

  Scenario Outline: Create New Client
    When select client type client list <clientType>
    And input company name client list "<status>"
    And input name PIC client list
    And input phone PIC client list
    And input email PIC client list
    And select source client list <sourceClient>
    And click button create client list
    Then Validate create new client "<txtResult>" "<status>"

    Examples: Data table Create new client
      | clientType | sourceClient | status             |
      | 1          | 3            | Company Name Empty |
      | 1          | 0            | Source Empty       |
      | 1          | 2            | Duplicate          |
      | 1          | 2            | Success            |

  Scenario: View detail Client
    When click view detail fitur
    Then validation display the detail data client form

  Scenario: Access edit data client form
    When click button edit
    Then validation display the edit client form

  Scenario Outline: Edit data client
    When select client type edit client <clientType>
    And input company name edit client "<status>"
    And input name PIC edit client
    And input phone PIC edit client
    And select source edit client <sourceClient>
    And click button save edit client
    Then Validate edit client "<status>"

    Examples: Data table Create new client
      | clientType | sourceClient | status             |
      | 1          | 3            | Company Name Empty |
      | 1          | 0            | Source Empty       |
#      | 1          | 2            | Duplicate          |
      | 1          | 4            | Success Edit       |
