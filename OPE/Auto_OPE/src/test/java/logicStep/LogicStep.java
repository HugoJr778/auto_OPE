package logicStep;

import java.util.Properties;

import chromeDriver.ConnectionDriver;
import utils.UtilsOPE;

public class LogicStep extends ConnectionDriver {
	
	private final String URL = "https://projetoopev1.herokuapp.com/login/";
	private Properties p;
	
	public LogicStep() {
		this.p = UtilsOPE.load("data.properties");
	}

	public void acessoSite() {
		setUpDriver();
		setUpUrl(URL);
	}

	public void preenchoCampos() {
		UtilsOPE.sleep(5000, ">>> Loading page OPE...");
		sendKeys(getElements().inputUser(), p.getProperty("user"));
		sendKeys(getElements().inputPassword(), p.getProperty("password"));
	}

	public void clicoLogin() {
		System.out.println(">>> Click in buttom LOGIN...");
		isPresentAndClick(getElements().btnLogin());
	}

	public void validoAcessoOPE() {
		timeouts(getElements().verifyHomePage());
		System.out.println(">>> Successful Validation HOME PAGE");
	}
	
	public void indoParaCasdatro() {
		System.out.println(">>> Go Register...");
		click(getElements().goRegister());
	}
	
	public void preenchendoDados() {
		System.out.println(">>> Filling in Data...");
		sendKeys(getElements().inputName(), p.getProperty("nome"));
		sendKeys(getElements().inputCPF(), p.getProperty("cpf"));
		sendKeys(getElements().inputCity(), p.getProperty("cidade"));
		//ESTADO
		sendKeys(getElements().inputCEP(), p.getProperty("cep"));
		click(getElements().checkBoxCar());
		UtilsOPE.sleep(3000, ">>> Clicking and Wainting...");
		sendKeys(getElements().inputModelCar(), p.getProperty("carro"));
		sendKeys(getElements().inputBoard(), p.getProperty("placa"));
		sendKeys(getElements().inputColor(), p.getProperty("color"));
		click(getElements().btnRegister());
	}
	
	public void vouParaRelatorio() {
		UtilsOPE.sleep(5000, ">>> Sleep...");
		click(getElements().goReport());
	}
	
	public void procuroCadastro() {
		
	}
	
	public void validoDadosCadastrados() {
		
	}
}