#Autor: Luis Fernando Moreno

  @stories
  Feature: Academy Choucair
    as a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario: Search for a automation course
      Given than luis wants to learn automation at the academy Choucair
      | strUser    | strPassword   |
      | 1214739768 | Choucair2020* |
      When he search for the course  on the choucair academy platform
      | strCourse               |
      | Metodología Bancolombia |
      Then he finds the course called resources
      | strCourse                |
      | Metodología Bancolombia  |