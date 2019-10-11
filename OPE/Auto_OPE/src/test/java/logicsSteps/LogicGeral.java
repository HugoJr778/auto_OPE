package logicsSteps;

import chromeDriver.ConnectionDriver;
import opeValues.ValuesOPE;
import utils.UtilsOPE;

public class LogicGeral extends ConnectionDriver {

	private final String URL = "https://projetoopev1.herokuapp.com/";
	
	public void acessoSite() {
		setUpDriver();
		setUpUrl(URL);
	}
	
	public void preenchoCampos() {
		UtilsOPE.sleep(5000, ">>> Loading page OPE...");
		sendKeys(getElements().inputUser(), ValuesOPE.getUser());
		sendKeys(getElements().inputPassword(), ValuesOPE.getPassword());
	}
	
	public void clicoLogin() {
		System.out.println(">>> Click in buttom LOGIN...");
		isPresentAndClick(getElements().btnLogin());
	}
	
	public void validoAcessoOPE() {
		timeouts(getElements().verifyHomePage());
		System.out.println(">>> Successful Validation HOME PAGE");
		UtilsOPE.sleep(3000, null);
	}
}