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

Configurando a variável de ambiente *GECKODRIVER* no Linux

Adicionar ao final do arquivo */etc/profile* a seguinte linha:


    export GECKODRIVER=/home/usuario/diretorio/geckodriver


*/home/usuario/diretorio/geckodriver* deve ser substituído pelo caminho do *geckodriver* em sua máquina


Após a configuração da variável *GECKODRIVER*, seu valor poderá ser recuperado com codigo


    System.getenv("GECKODRIVER")


Para não visualizar o navegador durante a execução, o seguinte trecho de código deverá ser adicionado:

	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--headless");
	WebDriver driver = new FirefoxDriver(options);