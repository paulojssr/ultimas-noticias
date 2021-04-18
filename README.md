Últimas Notícias
================

Exemplos de utilização do [Selenium](https://www.selenium.dev/) para capturar notícias dos principais sites.

Configuração do projeto
-----------------------


#### Versão do Selenium ####


[Repositório Maven: selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)


    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>



#### Geckodriver ####


* [Releases](https://github.com/mozilla/geckodriver/releases/latest)
* [Change log](https://searchfox.org/mozilla-central/source/testing/geckodriver/CHANGES.md)

Configurando a variavel de ambiente *GECKODRIVER* no Linux

Adicionar ao final do arquivo */etc/profile* a seguinte linha


    export GECKODRIVER=/diretorio/geckodriver

Após configuração da variável *GECKODRIVER*, seu valor poderá ser recuperado com codigo


    System.getenv("GECKODRIVER")