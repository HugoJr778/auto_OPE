package stepGherkin;

import java.util.Date;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.UtilsWebOPE;

public class BeforeAndAfter {
	
	@Before
	public void start(Scenario scenario) {
		System.out.println("      ___           ___         ___     \r\n" + 
				"     /  /\\         /  /\\       /  /\\    \r\n" + 
				"    /  /::\\       /  /::\\     /  /:/_   \r\n" + 
				"   /  /:/\\:\\     /  /:/\\:\\   /  /:/ /\\  \r\n" + 
				"  /  /:/  \\:\\   /  /:/~/:/  /  /:/ /:/_ \r\n" + 
				" /__/:/ \\__\\:\\ /__/:/ /:/  /__/:/ /:/ /\\\r\n" + 
				" \\  \\:\\ /  /:/ \\  \\:\\/:/   \\  \\:\\/:/ /:/\r\n" + 
				"  \\  \\:\\  /:/   \\  \\::/     \\  \\::/ /:/ \r\n" + 
				"   \\  \\:\\/:/     \\  \\:\\      \\  \\:\\/:/  \r\n" + 
				"    \\  \\::/       \\  \\:\\      \\  \\::/   \r\n" + 
				"     \\__\\/         \\__\\/       \\__\\/    \n");
		System.out.println(">>> INICIALIZE APPLICATION <<<");
		System.out.println(">>> Starting Scenario: " + scenario.getName() + " -- " +  new Date());
	}
	
	@After
	public void end(Scenario scenario) {
		UtilsWebOPE.finaliza();
		System.out.println(">>> PASSED ? <<< " + (scenario.getStatus().equals("passed") ? true : false));
		System.out.println(">>> FINISH <<<");
	}
}