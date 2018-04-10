public class ContaBasic extends Conta{

	ContaBasic(int id, double saldo){
		this.id = id;
		this.saldo = saldo;
	}

	ContaBasic(double saldo){
		this.id = id;
		this.saldo = saldo;
	}
	
	public void creditar(double valor){
		saldo = saldo + valor;
	
	}
	
	public void debitar(double valor){
		saldo = saldo - valor;
	}

	public String toString(){
		String saida = "Tipo de Conta: Basic \nID: %d \nSaldo: %2f\n",id,saldo;
		return saida;
	}
}
