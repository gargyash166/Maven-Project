Feature: Demo signup fuctionality

  Scenario: Verify th signup with valid data
    Given user is at signuppage
    When user enter the name and email
    And click on signup Button
    Then user navigated to the information page
