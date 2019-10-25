package logicsSteps.ope001;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import chromeDriver.ConnectionDriver;
import opeValues.GeneratorValues;
import utils.UtilsOPE;

public class LogicOpe001 extends ConnectionDriver {
	
	private HashMap<String, String> x;
	
	public LogicOpe001() {
		this.x = GeneratorValues.getData();
	}
	
	public void indoParaCasdatro() {
		System.out.println(">>> Go Register...");
		click(getElements().goRegister());
		UtilsOPE.sleep(3000, ">>> Signing Up...");
	}
	
	public void preenchendoDados() {
		System.out.println(">>> Filling in Data...");
		sendKeys(getElements().inputName(), x.get("nome"));
		sendKeys(getElements().inputCEP(), x.get("cep"));
		click(getElements().clickSearchCEP());
		UtilsOPE.sleep(10000, ">>> Waiting Content 'Endereço+Bairro', 'Estado' and 'Cidade'...");
		sendKeys(getElements().inputCPF(), x.get("cpf"));
		sendKeys(getElements().inputTel(), x.get("telefone"));
		clickCheckBox(getElements().checkBoxCar());
		UtilsOPE.sleep(3000, ">>> Clicking and Wainting CheckBox...");
		sendKeys(getElements().inputModelCar(), x.get("carro"));
		sendKeys(getElements().inputBoard(), x.get("placa"));
		sendKeys(getElements().inputColor(), x.get("cor"));
		click(getElements().btnRegister());
		UtilsOPE.sleep(5000, ">>> Waiting Register...");
	}
	
	public void vouParaRelatorio() {
		UtilsOPE.sleep(5000, ">>> Sleep and go Report...");
		click(getElements().goReport());
		scroll(0, 1500);
	}
	
	public void procuroCadastro() {
		sendKeys(getElements().searchReport(), x.get("nome"));
		UtilsOPE.sleep(3000, ">>> Search vaule in Report...");
	}
	
	public void validoDadosCadastrados() {
		String value = getValue(getElements().fieldReport());
		assertEquals(x.get("nome"), value);
		System.out.println(">>> Successful registration of: " + value);
	}
}