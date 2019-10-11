@TEST
Feature: Cadastro_Cliente_SystemMechanical_CHROME

Background: 
	Given acesso site e realizo o login
	When preencho os campos LOGIN e PASSWORD
	And clico no botão de para realizar o LOGIN
	And acesso a aplicação, valido a HOME PAGE

@OPE_AUTO_001
Scenario: Cadastro_Cliente_SystemMechanical_CHROME

	And sigo para a tela de CADASTRO
	And preecho campos NOME, CPF, CIDADE, ESTADO, CEP, CARRO, PLACA e COR
	And sigo para a tela de RELATÓRIO
	When terminar o cadastro, valido a existência do dados no RELATÓRIO
	Then valido os dados cadastrados
	
	
@OPE_AUTO_002
Scenario: Cadastro_Funcionário_Sem_Permissão_de_Administrador_SystemMechanical_CHROME

	And sigo para tela de CADASTRO DE FUNCIONÁRIO
	And preecho os campos de USUÁRIO e SENHA
	And valido que não está selecionado a caixa de permissão de ADM
	And clico em cadastrar
	When realizar o cadastro realizo o LOGOUT
	Then valido o cadastro do funcionário realizando o LOGIN com os dados cadastrados