import Composite.*;
import Decorator.*;

public class Lab5 {

	public static void main(String[] args) {
		
		//Composite
		Component a1 = new Variable(5);
		Component b1 = new Variable(2);
		ExpressionComposite exp1 = new ExpressionComposite(a1, '*', b1);
		
		Component b2 = new Variable(4);
		ExpressionComposite exp2 = new ExpressionComposite(exp1, '/', b2);
		
		ExpressionComposite exp3 = new ExpressionComposite(exp1, '/', exp2);
		
		System.out.println("Composite:");
		System.out.println(exp3.toString());
		System.out.println(exp3.operation()+"\n");
		
		//Decorator
		Component a4 = new Variable(30);
		Component b4 = new SenDecorator(a4);
		Component c4 = new Variable(4);
		ExpressionComposite exp4 = new ExpressionComposite(b4, '*', c4);
		
		Component a5 = new Variable(0);
		Component b5 = new CosDecorator(a5);
		Component c5 = new Variable(2);
		ExpressionComposite exp5 = new ExpressionComposite(b5, '*', c5);
		
		ExpressionComposite exp6 = new ExpressionComposite(exp4, '/', exp5);
				
		System.out.println("Decorator:");
		System.out.println(exp6.toString());
		System.out.println(exp6.operation()+"\n");

	}

}
