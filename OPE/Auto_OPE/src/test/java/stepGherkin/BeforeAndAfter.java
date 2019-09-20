package stepGherkin;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.UtilsWebOPE;

public class BeforeAndAfter {
	
	@Before
	public void start() {
		System.out.println(">>> INICIALIZE APPLICATION <<<");
	}
	
	@After
	public void end() {
		UtilsWebOPE.finaliza();
		System.out.println(">>> FINISH <<<");
	}
}