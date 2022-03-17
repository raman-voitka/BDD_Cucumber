Feature: As an user
  I want to see subcategories of some categories in dropdown menu these categories

  @now
  Scenario Outline: Some Onliner Header Links should contain dropdown menu and subcategories
    Given the user opens Onliner.by website
    When the user moves the mouse on the "<Category Link>"
    Then the dropdown menu "<Category Link>" is visible
    And Avtobaracholka menu has
      | Audi          |
      | BMW           |
      | Citroen       |
      | Ford          |
      | Mazda         |
      | Mercedes-Benz |
      | Nissan        |
      | Opel          |
      | Peugeot       |
      | Renault       |
      | Toyota        |
      | Volkswagen    |
    Examples:
      | Category Link |
      | Автобарахолка |

  @now
  Scenario Outline: Some Onliner Header Links should contain dropdown menu and subcategories
    Given the user opens Onliner.by website
    When the user moves the mouse on the "<Category Link>"
    Then the dropdown menu "<Category Link>" is visible
    And Houses and Apartments menu has
      | Минск        |
      | Брест        |
      | Витебск      |
      | Гомель       |
      | Гродно       |
      | Могилев      |
      | 1-комнатные  |
      | 2-комнатные  |
      | 3-комнатные  |
      | 4+-комнатные |
    Examples:
      | Category Link   |
      | Дома и квартиры |