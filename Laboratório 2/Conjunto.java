class Conjunto{

	private Object n_elementos[]; //Vetor de Object, pois é a classe pai de todos os objetos, isso possibilita que o conjunto tenha qualquer tipo de dados

	private boolean vazio;

	private int disponivel;

	

	public Conjunto(int n){

		n_elementos = new Object[n];

		vazio = true;

		disponivel = 0;

	}

	

	public boolean inserirElemento(Object e){

		if(disponivel == n_elementos.length){

			return false;

		}else{

			if(pertence(e)){

				return false;

			}

			n_elementos[disponivel] = e;

			vazio = false;

			disponivel++;

			return true;

		}

	}

	

	public boolean pertence(Object e){

		for(int i=0; i < n_elementos.length; i++){

			if(n_elementos[i] == e && !get_vazio()){

				return true;

			}

		}

		return false;

	}

	

	public boolean estaContido(Conjunto c){

		if(c.n_elementos.length > n_elementos.length){

			return false;

		}

		int num_elementos_iguais = 0;

		for(int i=0;i < c.n_elementos.length; i++){

			for(int j=0; j < n_elementos.length; j++){

				if(c.n_elementos[i] == n_elementos[j]){

					num_elementos_iguais++;

				}

			}

		}

		if(num_elementos_iguais == c.n_elementos.length){

			return true;

		}

		return false;

	}

	

	public Conjunto uniao(Conjunto c){

		if(estaContido(c)){

			Conjunto uniao = new Conjunto(n_elementos.length);

			for(int i=0; i < uniao.n_elementos.length; i++){

				uniao.inserirElemento(n_elementos[i]);

			}

			return uniao;

		}

		

		int num_elementos_uniao, num_elementos_iguais=0;

		for(int i=0;i < c.n_elementos.length; i++){

			for(int j=0; j < n_elementos.length; j++){

				if(c.n_elementos[i] == n_elementos[j]){

					num_elementos_iguais++;

				}

			}

		}

		num_elementos_uniao = n_elementos.length + c.n_elementos.length - num_elementos_iguais;

		

		Conjunto uniao = new Conjunto(num_elementos_uniao);

		for(int i=0; i < c.n_elementos.length; i++){

			uniao.inserirElemento(c.n_elementos[i]);

		}

		for(int i=0; i < n_elementos.length; i++){

			if(!uniao.pertence(n_elementos[i])){

				uniao.inserirElemento(n_elementos[i]);

			}

		}

		

		return uniao;

	}

	

	

	public Conjunto inter(Conjunto c){

		if(estaContido(c)){

			return c;

		}

		

		int num_elementos_iguais=0;

		for(int i=0;i < c.n_elementos.length; i++){

			for(int j=0; j < n_elementos.length; j++){

				if(c.n_elementos[i] == n_elementos[j]){

					num_elementos_iguais++;

				}

			}

		}

		Conjunto intersecao = new Conjunto(num_elementos_iguais);

		

		for(int i=0;i < c.n_elementos.length; i++){

			for(int j=0; j < n_elementos.length; j++){

				if(c.n_elementos[i] == n_elementos[j]){

					intersecao.inserirElemento(n_elementos[j]);

				}

			}

		}

		

		return intersecao;

	}

	

	public Conjunto diferenca(Conjunto c){

		

		if(inter(c).get_vazio()){

			return this;

		}else{

			int num_elementos_diferenca, num_elementos_iguais=0;

			for(int i=0;i < c.n_elementos.length; i++){

				for(int j=0; j < n_elementos.length; j++){

					if(c.n_elementos[i] == n_elementos[j]){

						num_elementos_iguais++;

					}

				}

			}

			num_elementos_diferenca = n_elementos.length - num_elementos_iguais;

			Conjunto dif = new Conjunto(num_elementos_diferenca);

			

			for(int i=0;i < c.n_elementos.length; i++){

				for(int j=0; j < n_elementos.length; j++){

					if(!c.pertence(n_elementos[j])){

						dif.inserirElemento(n_elementos[j]);

					}

				}

			}

			

			return dif;

		}

	}

	

	public void cartesiano(Conjunto c){

		if(c.n_elementos.length != this.n_elementos.length){

			System.out.println("Produto cartesiano nao permitido: Conjuntos de tamanhos diferentes");

		}else{

			System.out.print("[ ");

			for(int i=0; i < this.n_elementos.length; i++){

				for(int j=0; j < c.n_elementos.length; j++){

					System.out.print("(" + this.n_elementos[i] + "," + c.n_elementos[j] + ") ");

				}

			}

			System.out.println("]");

		}

	}

	

	public void getElementos(){

		System.out.print("[ ");

		for(int i=0; i < n_elementos.length; i++){

			System.out.print(n_elementos[i] + " ");

		}

		System.out.println("]");

	}

	

	public boolean get_vazio(){

		return this.vazio;

	}



}
