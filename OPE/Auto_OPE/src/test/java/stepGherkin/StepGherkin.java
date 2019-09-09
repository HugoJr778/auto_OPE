package stepGherkin;

import cucumber.api.java.en.Given;
import logicStep.LogicStep;

public class StepGherkin {
	
	private LogicStep logic = new LogicStep();
	
	@Given("^acesso site e realizo o login$") 
	public void acessoSite(){
		logic.acessoSite();
	}
}