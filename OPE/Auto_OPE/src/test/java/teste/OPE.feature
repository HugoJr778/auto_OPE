@TEST
Feature: Cadastro_Cliente_SystemMechanical_CHROME

Background: 
	Given acesso site e realizo o login

@OPE_AUTO_001
Scenario: Cadastro_Cliente_SystemMechanical_CHROME

	When preencho os campos LOGIN e PASSWORD
	And clico no botão de para realizar o LOGIN
	And acesso a aplicação, valido a HOME PAGE
	And sigo para a tela de CADASTRO
	And preecho campos NOME, CPF, CIDADE, ESTADO, CEP, CARRO, PLACA e COR
	And sigo para a tela de RELATÓRIO
	When terminar o cadastro, valido a existência do dados no RELATÓRIO
	Then valido os dados cadastrados