package Composite;

public class Variable implements Component{

	double x;
	
	public Variable(double x){
		this.x =  x;
	}
	
	@Override
	public double operation() {
		return this.x;
	}
	
	public String toString() {
		return new Double(this.x).toString();
	}
}
