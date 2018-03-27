import java.util.*;

class Main {

	/* Foi feito uso de Polimorfismo de Inclusão no momento de declarar o vetor de Figuras, foi usado o tipo Figura, pois ele suporta todas
	 * as subclasses de Figura.
	 * Foi usado Polimorfismo de Coerção na passagem de parâmetros ao criar objetos Ponto, Quadrado e Circulo, foi passado valor inteiro e
	 * houve "cast" implícito para float.
	 * Foi usado Polimorfismo de Sobrecarga na classe Figura, quando declaramos o método desenhar duas vezes com assinaturas diferentes.

	 */

	public static void main(String args[]){

		Editor e = new Editor(10); //Editor com capacidade para 10 figuras (poderia ser "infinito" usando uma lista)

		Ponto p1 = new Ponto(1, 4);
		Ponto p2 = new Ponto(5, 2);
		Ponto p3 = new Ponto(1, 9);
		Quadrado q1 = new Quadrado(p1, 3);
		Quadrado q2 = new Quadrado(p2, 4);
		Circulo c1 = new Circulo(p3, 2);

		//Inserindo algumas figuras no editor.....
		e.receberComandos(1, q1);
		e.receberComandos(1, q2);
		e.receberComandos(1, c1);

		//Imprimindo áreas de cada figura.........
		e.imprimirAreas();

		System.out.print("\n");

		//Desenhando só quadrados.................
		e.desenharFig("Quadrado");
		e.desenharFig("Circulo");

	}

}
