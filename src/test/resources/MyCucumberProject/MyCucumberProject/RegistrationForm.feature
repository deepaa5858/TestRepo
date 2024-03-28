Feature: Registration Process

  Background: 
    Given Open Registration Page

  Scenario: Test Registration Process
    When Enter following data
      | Ankush | Vankore | Kolhapur | ankushvankore@gmail.com | 9890742718 |
      | Kavya  | B       | Banglore | kavya@gmail.com         | 9898989898 |
      | Sriram | S       | Chennai  | veera@gmail.com         | 9797979797 |
    Then Registration should success

  Scenario: Test Registration Process New
    When Enter data as follow
      | FirstName | LastName | Address  | MailID                  | ContactNo  |
      | Ankush    | Vankore  | Kolhapur | ankushvankore@gmail.com | 9890742718 |
      | Kavya     | B        | Banglore | kavya@gmail.com         | 9898989898 |
      | Sriram    | S        | Chennai  | veera@gmail.com         | 9797979797 |
    Then Registration should be success
