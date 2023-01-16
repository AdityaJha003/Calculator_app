package org.ncu.Calculator;

public class Calculator {
	public MathService compute(String operator, int x , int y) {
		
		if(operator.equals("add")) {
			return new AdditionService();
		}
		else if(operator.equals("sub")) {
			return new SubtractionService();
		}
		else if(operator.equals("mul")){
			return new MultiplicationService();
		}
		else if(operator.equals("div")) {
			return new DivisionService();
		}
		else {
			throw new RuntimeException("Sorry, "+operator+" operator is not available!!");
		}
		
	}
}
