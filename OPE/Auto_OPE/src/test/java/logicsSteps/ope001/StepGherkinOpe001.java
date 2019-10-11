package logicsSteps.ope001;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepGherkinOpe001 {
	
	private LogicOpe001 logic = new LogicOpe001();
	
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