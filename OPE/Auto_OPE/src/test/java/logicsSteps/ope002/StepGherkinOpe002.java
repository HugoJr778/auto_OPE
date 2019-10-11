package logicsSteps.ope002;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepGherkinOpe002 {
	
	private LogicOpe002 logic = new LogicOpe002();
	
	@And("^sigo para tela de CADASTRO DE FUNCIONÁRIO$")
	public void sigo_para_tela_de_CADASTRO_DE_FUNCIONÁRIO() {
		logic.vouParaCadastroFunc();
	}

	@And("^preecho os campos de USUÁRIO e SENHA$")
	public void preecho_os_campos_de_USUÁRIO_e_SENHA() {
		logic.preenchoCamposFunc();
	}

	@And("^valido que não está selecionado a caixa de permissão de ADM$")
	public void valido_que_não_está_selecionado_a_caixa_de_permissão_de_ADM() {
		logic.validoFuncADM();
	}

	@And("^clico em cadastrar$")
	public void clico_em_cadastrar() {
		logic.clicoCadastrarFunc();
	}

	@When("^realizar o cadastro realizo o LOGOUT$")
	public void realizo_o_LOGOUT() {
		logic.realizoLogout();
	}

	@Then("^valido o cadastro do funcionário realizando o LOGIN com os dados cadastrados$")
	public void valido_o_cadastro_do_funcionário_realizando_o_LOGIN_com_os_dados_cadastrados() {
		logic.validCadastroFuncRealizandoLogin();
	}
}