package Decorator;

import Composite.*;

public class CosDecorator extends ComponentDecorator{
	
	public CosDecorator(Component component) {
		super(component);
	}
	
	@Override
	public double operation() {
		return Math.cos(Math.toRadians(super.operation()));
	}
	
	@Override
	public String toString() {
		return "cos("+super.toString()+")";
	}

}
