package stepGherkin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import logicStep.LogicStep;

public class StepGherkin {
	
	private LogicStep logic = new LogicStep();
	
	@Given("^acesso site e realizo o login$")
	public void acesso_site_e_realizo_o_login() {
	    logic.acessoSite();
	}
	
	@When("^preencho os campos LOGIN e PASSWORD$")
	public void preencho_os_campos_LOGIN_e_PASSWORD() {
	   logic.preenchoCampos();
	}
	
	@And("^clico no botão de para realizar o LOGIN$")
	public void clico_no_botão_de_para_realizar_o_LOGIN() {
	   logic.clicoLogin();
	}
	
	@And("^acesso a aplicação, valido a HOME PAGE$")
	public void acessar_a_aplicação_valido_a_HOME_PAGE() {
	   logic.validoAcessoOPE();
	}
	
	@And("^sigo para a tela de CADASTRO$")
	public void sigo_para_a_tela_de_cadastro() {
	    logic.indoParaCasdatro();
	}
	
	@When("^preecho campos NOME, CPF, CIDADE, ESTADO, CEP, CARRO, PLACA e COR$")
	public void preecho_campos_NOME_CPF_CIDADE_ESTADO_CEP_CARRO_PLACA_e_COR() {
		logic.preenchendoDados();
	}
	
	@When("^sigo para a tela de RELATÓRIO$")
	public void sigo_para_a_tela_de_RELATÓRIO() {
		logic.vouParaRelatorio();
	}
	
	@When("^terminar o cadastro, valido a existência do dados no RELATÓRIO$")
	public void terminar_o_cadastro_valido_a_existência_do_dados_no_RELATÓRIO() {
		logic.procuroCadastro();
	}
	
	@Then("^valido os dados cadastrados$")
	public void valido_os_dados_cadastrados() {
		logic.validoDadosCadastrados();
	}
}