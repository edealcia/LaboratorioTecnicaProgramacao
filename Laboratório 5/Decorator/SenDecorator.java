package Decorator;

import Composite.*;

public class SenDecorator extends ComponentDecorator{
	
	public SenDecorator(Component component) {
		super(component);
	}
	
	@Override
	public double operation() {
		return Math.sin(Math.toRadians(super.operation())); // Transformamos em radiano
	}
	
	@Override
	public String toString() {
		return "sen("+super.toString()+")";
	}

}
