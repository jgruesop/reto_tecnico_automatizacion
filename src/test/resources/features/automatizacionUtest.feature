# Autor: Jhonatan Grueso

@stories
Feature: Community Utest
  As a user wants to register on the Utest Community website in an automated way
  @scenario1
  Scenario: Register on the website
    Given Than Jhon wants to register on the Utest Community

    When he registers to the utest community he can count on the support of people experienced
      |  firstName  |   lastName    |       email         |  month  | day | year | languages |  city  | zipCode | country  | mobileDevice |  model   | operatingSystem  | password   | confirmPassword |
      | Joe Stefan  | Arias Torres  |   test13@mail.com   | January |  5  | 1900 |  Spanish  |  Cali  | 762522  | Colombia |     Apple    | iPhone 5 |    iOS 11.0.2    | 12345aBCD. |   12345aBCD.    |

    Then he can register to the utest community.
      | question   |
      | Join Today |