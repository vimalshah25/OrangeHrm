Feature: remove Employee details from Employee list

  @test2
  Scenario: User should be able to remove Employee details successfully
    Given user is in login page
    When  user enter Default user id and password
    And   user should be able to log in
    And   user Click on the PIM category
    And   user Click on Employee List
    And   user enter Employee name on Employee name search bar button
    And   User click on search Button
    And   user Select name from the list
    And   user Click on delete button
    And   user click on the alertbox to confirm the delete action
    Then  I user should be verify that Employee record Successfully deleted
