package run;

import org.junit.runner.JUnitCore;

import suiteTest.SuiteTests;

public class RunnerOPE {
	
	public static void main(String[] args) {
		JUnitCore unit = new JUnitCore();
		int executionQtd = 1;
		
		for(int posi = 0; posi < executionQtd; posi++) {
			unit.run(SuiteTests.class);
		}
	}
}