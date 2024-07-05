Feature: API Automation reqress

  @api
  Scenario: Login user normal
    Given prepare url for "LOGIN_USER"
    And hit api login user
    Then validation status code is equals 200