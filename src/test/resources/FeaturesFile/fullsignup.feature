Feature: Demo signup fuctionality

  #@tagSingle
  #Scenario: Verify th signup with valid data
  #Given user is at signuppage
  #When user enter the name and email
  #And click on signup Button
  #Then user navigated to the information page
  #
  #@tagMul
  Scenario Outline: Verify the signup with multiple set of data
    Given user naviagte to the signup page
    When user input the <fullname> and <emailid>
    And click on button
    Then user should naviagte to the information page with valid data

    Examples: 
      | fullname | emailid          |
      | mohit    | y1@gmail.com     |
      | yash     | yash2212@.com    |
      | abhishek | abhiy3@gmail.com |
      | abcdef   | y4@gmail.com     |
