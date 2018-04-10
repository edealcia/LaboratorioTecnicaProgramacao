public class ContaPlus extends Conta{

	ContaPlus(int id, double saldo){
		this.id = id;
		this.saldo = saldo;
	}
	
	public void creditar(double valor){
		saldo = saldo + (valor+(0.005*valor));
	
	}
	
	public void debitar(double valor){
		saldo = saldo - valor;
	
	}

	public String toString(){
		String saida = "Tipo de Conta: Plus \nID: %d \nSaldo: %2f\n",id,saldo;
		return saida;
	}	

}
