package stepGherkin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import logicsSteps.LogicGeral;

public class StepGherkinGeral {
	
	private LogicGeral logicGeral = new LogicGeral();
	
	@Given("^acesso site e realizo o login$")
	public void acesso_site_e_realizo_o_login() {
		logicGeral.acessoSite();
	}
	
	@When("^preencho os campos LOGIN e PASSWORD$")
	public void preencho_os_campos_LOGIN_e_PASSWORD() {
		logicGeral.preenchoCampos();
	}
	
	@And("^clico no botão de para realizar o LOGIN$")
	public void clico_no_botão_de_para_realizar_o_LOGIN() {
		logicGeral.clicoLogin();
	}
	
	@And("^acesso a aplicação, valido a HOME PAGE$")
	public void acessar_a_aplicação_valido_a_HOME_PAGE() {
		logicGeral.validoAcessoOPE();
	}
}