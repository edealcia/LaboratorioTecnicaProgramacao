public class Sistema{
	Conta[] conta = new Conta[10];
	//double saldo;
	//int id;

	void criarContaXPTOBasic(int indice){
		//ContaBasic contab = new ContaBasic();
		conta[indice] = new ContaBasic(indice,0.00); 
	}

	void criarContaXPTOPlus(int indice){
		conta[indice] = new ContaPlus(indice,0.00); 
	}
	void criarContaXPTOExtreme(int indice){
		conta[indice] = new ContaExtreme(indice,0.00); 
	}
	
	public void creditar(int indice, double valor){
		conta[indice].creditar(valor);


	}
	public void debitar(int indice, double valor){
		conta[indice].debitar(valor);

	}
	
	public double consultarSaldo(int indice){
		return (conta[indice].saldo);
	}

	public String toString(int indice){
		return (conta[indice].toString());
	
	}


}
