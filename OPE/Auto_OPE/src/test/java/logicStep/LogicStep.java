package logicStep;

import static org.junit.Assert.assertEquals;

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
		UtilsOPE.sleep(3000, ">>> Signing Up...");
	}
	
	public void preenchendoDados() {
		System.out.println(">>> Filling in Data...");
		sendKeys(getElements().inputName(), p.getProperty("nome"));
		sendKeys(getElements().inputCPF(), p.getProperty("cpf"));
		sendKeys(getElements().inputCity(), p.getProperty("cidade"));
		selectValue(getElements().inputState(), p.getProperty("estado"));
		sendKeys(getElements().inputCEP(), p.getProperty("cep"));
		clickCheckBox(getElements().checkBoxCar());
		UtilsOPE.sleep(3000, ">>> Clicking and Wainting CheckBox...");
		sendKeys(getElements().inputModelCar(), p.getProperty("carro"));
		sendKeys(getElements().inputBoard(), p.getProperty("placa"));
		sendKeys(getElements().inputColor(), p.getProperty("cor"));
		click(getElements().btnRegister());
		UtilsOPE.sleep(5000, ">>> Waiting Register...");
		UtilsOPE.robotRefresh();
	}
	
	public void vouParaRelatorio() {
		UtilsOPE.sleep(5000, ">>> Sleep and go Report...");
		click(getElements().goReport());
		scroll(0, 1500);
	}
	
	public void procuroCadastro() {
		sendKeys(getElements().searchReport(), p.getProperty("nome"));
		UtilsOPE.sleep(3000, ">>> Search vaule in Report...");
	}
	
	public void validoDadosCadastrados() {
		String value = getValue(getElements().fieldReport());
		assertEquals(p.getProperty("nome"), value);
		System.out.println(">>> Successful registration of: " + value);
	}
}