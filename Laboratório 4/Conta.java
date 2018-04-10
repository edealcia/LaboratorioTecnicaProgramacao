public abstract class Conta{
	double saldo;
	int id;


	public abstract String toString();
	public abstract void creditar(double valor);
	public abstract void debitar(double valor);
	
	public double consultarSaldo(){
		return saldo;
	}



}
