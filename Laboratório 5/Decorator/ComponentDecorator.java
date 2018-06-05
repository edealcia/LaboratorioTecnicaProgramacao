package Decorator;

import Composite.*;

public class ComponentDecorator implements Component {

	Component component;
	
	public ComponentDecorator(Component component) {
		this.component = component;
	}
	
	@Override
	public double operation() {
		return this.component.operation();
	}
	
	@Override
	public String toString() {
		return this.component.toString();
	}
	
}
