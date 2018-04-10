public class ContaExtreme extends Conta{

	ContaExtreme(int id, double saldo){
		this.id = id;
		this.saldo = saldo;
	}
	
	public void creditar(double valor){
		saldo = saldo + (valor+(0.002*valor));
	
	}
	
	public void debitar(double valor){
		saldo = saldo - valor +(0.002*valor);
	
	}
	public String toString(){
		String saida = "Tipo de Conta: Extreme \nID: %d \nSaldo: %2f\n",id,saldo;
		return saida;
	}	



}
