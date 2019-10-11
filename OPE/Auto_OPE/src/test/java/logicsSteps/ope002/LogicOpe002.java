package logicsSteps.ope002;

import java.util.HashMap;

import chromeDriver.ConnectionDriver;
import junit.framework.Assert;
import opeValues.GeneratorValues;
import utils.UtilsOPE;

public class LogicOpe002 extends ConnectionDriver {
	
	private HashMap<String, String> x;
	
	public LogicOpe002() {
		this.x = GeneratorValues.getData();
	}

	public void vouParaCadastroFunc() {
		click(getElements().goRegisterFunc());
	}

	public void preenchoCamposFunc() {
		sendKeys(getElements().inputFuncUser(), x.get("nome"));
		sendKeys(getElements().inputFuncPassword(), x.get("password"));
		UtilsOPE.sleep(3000, ">>> User and Password filled");
	}

	public void validoFuncADM() {
		Assert.assertTrue(!isSelect(getElements().boxIsSelect()));
		UtilsOPE.sleep(5000, ">>> Field Successfully Validated");
	}

	public void clicoCadastrarFunc() {
		click(getElements().btnRegisterFunc());
		UtilsOPE.sleep(5000, ">>> Registered");
	}

	public void realizoLogout() {
		click(getElements().btnLogout());
	}

	public void validCadastroFuncRealizandoLogin() {
		UtilsOPE.sleep(5000, ">>> I Fill in the Fields...");
		sendKeys(getElements().inputUser(), x.get("nome"));
		sendKeys(getElements().inputPassword(), x.get("password"));
		UtilsOPE.sleep(3000, null);
		click(getElements().btnLogin());
		timeouts(getElements().verifyHomePage());
		System.out.println(">>> Successful Validation HOME PAGE and Register");
	}
}