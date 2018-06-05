package Composite;

import java.util.*;

public class ExpressionComposite implements Component{

	private char operation;
	private Component a, b;
	
	public ExpressionComposite(Component a, char operation, Component b){
		this.operation = operation;
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double operation() {
		double result = 0;
		
		if(this.operation == '*')
			result = this.a.operation()*this.b.operation();
		else if(this.operation == '/' && this.b.operation() > 0)
			result = this.a.operation()/this.b.operation();
		else
			result = 0;
		
		return result;
	}
	
	@Override
	public String toString() {
		return "("+this.a.toString()+this.operation+this.b.toString()+")";
	}

}
