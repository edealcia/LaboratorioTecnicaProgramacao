//ALUNO: ANDERSON NOBRE DA SILVA - 352132
//ALUNA: EDEALCIA REGINA ALVES LUCIANO - 372164

//Uso de Polimorfismos: 
//Coerção: foi usado quando passamos como argumento nos métodos
//creditar e debitar, valores do tipo int, que são convertidos 
// para double automaticamente.

//Inclusão: Foi utilizado quando sobrescrevemos o método toString 
//nas classes Sistema, ContaBasic, ContaExtreme e ContaPlus.

//Sobrecarga: Utilizado no método construtor da Classe ContaBasic.


public class Main{


  public static void main (String args[]) {
	Sistema s = new Sistema();
	s.criarContaXPTOBasic(1);
	s.criarContaXPTOPlus(2);
	s.criarContaXPTOExtreme(3);
	
	for(int i = 1; i<=3; i++) s.creditar(i,1000);
	
	for(int i = 1; i<=3; i++) s.debitar(i,10);
	
	//todas as igualdades devem ser verdadeiras
	System.out.println(s.consultarSaldo(1) == 990);
	System.out.println(s.consultarSaldo(2) == 995 );
	System.out.println(s.consultarSaldo(3) == 992.02);
	
	System.out.println(s.consultarSaldo(1));
	System.out.println(s.consultarSaldo(2));
	System.out.println(s.consultarSaldo(3));
	

	//s.toString(1);
	//s.toString(2);
	//s.toString(3);


  }
}
