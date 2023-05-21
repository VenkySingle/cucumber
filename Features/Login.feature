Feature: Positive Login Functionality

  Scenario: Login to TestLogins
    Given Launch Chrome Browser with "http://testphp.vulnweb.com/login.php"
    Then Verify Login Page is opened
    When Enter Username as "test"
    And Enter Password as "test"
    Then HomePage is displayed
