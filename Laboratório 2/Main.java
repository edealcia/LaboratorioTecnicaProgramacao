class Main{



	public static void main(String args[]){

		System.out.println("Criando Conjunto 1: 10 primeiros naturais");

		Conjunto c1 = new Conjunto(10);

		c1.inserirElemento(0);

		c1.inserirElemento(1);

		c1.inserirElemento(2);

		c1.inserirElemento(3);

		c1.inserirElemento(4);

		c1.inserirElemento(5);

		c1.inserirElemento(6);

		c1.inserirElemento(7);

		c1.inserirElemento(8);

		c1.inserirElemento(9);

		

		System.out.println("Criando Conjunto 2: 5 primeiros pares");

		Conjunto c2 = new Conjunto(5);

		c2.inserirElemento(0);

		c2.inserirElemento(2);

		c2.inserirElemento(4);

		c2.inserirElemento(6);

		c2.inserirElemento(8);

		

		System.out.println("Criando Conjunto 3: 5 primeiros impares");

		Conjunto c3 = new Conjunto(5);

		c3.inserirElemento(1);

		c3.inserirElemento(3);

		c3.inserirElemento(5);

		c3.inserirElemento(7);

		c3.inserirElemento(9);

		

		System.out.println("Criando Conjunto 4: 10 primeiros primos");

		Conjunto c4 = new Conjunto(10);

		c4.inserirElemento(2);

		c4.inserirElemento(3);

		c4.inserirElemento(5);

		c4.inserirElemento(7);

		c4.inserirElemento(11);

		c4.inserirElemento(13);

		c4.inserirElemento(17);

		c4.inserirElemento(19);

		c4.inserirElemento(23);

		c4.inserirElemento(29);

		

		System.out.println("");

		System.out.print("Conjunto 4 eh subconjunto de si mesmo? ");

		if(c4.estaContido(c4))

			System.out.println("SIM!");

		else

			System.out.println("NAO!");

		

		System.out.print("Conjunto 2 eh subconjunto de 1? ");

		if(c1.estaContido(c2))

			System.out.println("SIM!");

		else

			System.out.println("NAO!");

		

		System.out.print("Conjunto 3 eh subconjunto de 1? ");

		if(c1.estaContido(c3))

			System.out.println("SIM!");

		else

			System.out.println("NAO!");

		

		System.out.print("Conjunto 4 eh subconjunto de 1? ");

		if(c1.estaContido(c4))

			System.out.println("SIM!");

		else

			System.out.println("NAO!");

		

		System.out.println("Uniao dos conjuntos 2 e 3 eh igual ao conjunto 1? ");

		System.out.print("	Uniao = ");

		c2.uniao(c3).getElementos();

		System.out.println(" SIM!");

		

		System.out.println("Intersecao dos conjuntos 1 e 2 vazia? ");

		if(c1.inter(c2).get_vazio()){

			System.out.println(" SIM!");

		}else{

			System.out.print("	Intersecao = ");

			c1.inter(c2).getElementos();

			System.out.println(" NAO!");

		}

		

		System.out.println("Qual a diferenca entre os conjuntos 1 e 2? ");

		if(c1.diferenca(c2).get_vazio()){

			System.out.println(" VAZIO!");

		}else{

			System.out.print("	Diferenca = ");

			c1.diferenca(c2).getElementos();

		}

		

		System.out.println("Produto Cartesiano dos conjuntos 2 e 3:");

		c2.cartesiano(c3);

		

		

		

	}



}
