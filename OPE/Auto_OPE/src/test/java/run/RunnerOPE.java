package run;

import org.junit.runner.JUnitCore;

import suiteTest.SuiteTestes;

public class RunnerOPE {
	
	public static void main(String[] args) {
		JUnitCore unit = new JUnitCore();
		unit.run(SuiteTestes.class);
	}
}