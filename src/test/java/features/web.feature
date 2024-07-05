Feature: Web UI Automation Paper.id

  @web
  Scenario: Login with normal user
    Given open login page paper.id
    And user input email atau no handphone "fnando2803@gmail.com"
    And user click selanjutnya
    And user input password "Lopelope2803"
    And user click masuk
#    Then verify user success login to dashboard page


  @web
  Scenario: Login with unregister user
    Given open login page paper.id
    And user input email atau no handphone "invalid@gmail.com"
    And user click selanjutnya
    Then user will see error message "Email tidak terdaftar. Silahkan registrasi terlebih dahulu"