class Editor{

	private Figura listaFig[];

	Editor(int n){
		this.listaFig = new Figura[n];
	}

	public boolean contem(Figura fig){
		for(int i=0; i < this.listaFig.length; i++){
			if(this.listaFig[i].equals(fig)){
				return true;
			}
		}
		return false;
	}

	public void receberComandos(int operacao, Figura fig){

		switch(operacao){
			case 1: //Inserir Figura
				int i=0;
				boolean inserido = false;
				while(i<this.listaFig.length && !inserido){
					if(this.listaFig[i] == null){
						this.listaFig[i] = fig;
						inserido = true;
					}
					i++;
				}
				if(!inserido){
					System.out.println("Editor já tem muitas figuras!");
				}
				break;
			case 2: //Excluir Figura
				if(contem(fig)){
					int j=0;
					boolean excluido = false;
					while(j<this.listaFig.length && !excluido){
						if(this.listaFig[j].equals(fig)){
							this.listaFig[j] = null;
							excluido = true;
						}
						j++;
					}
				}else{
					System.out.println("Figura não está na lista!");
				}
				break;
			default:
				System.out.println("Operacao nao existente! Digite 1 para criar ou 2 para excluir.");
				break;
		}

	}

	public void imprimirAreas(){

		for(int i=0; i<this.listaFig.length; i++){
			if(this.listaFig[i] != null){
				System.out.println("Figura "+i+", tipo: "+this.listaFig[i].toString()+", Area: "+this.listaFig[i].calcularArea());
			}
		}

	}

	public void desenharFig(String nomeFig){

		String nome = nomeFig.toUpperCase();
		Ponto p;

		for(int i=0; i<this.listaFig.length; i++){
			if(this.listaFig[i] != null && listaFig[i].toString().toUpperCase().equals(nome)){
				if(nome.equals("QUADRADO")){
					p = listaFig[i].get_origem();
					System.out.println("Tipo: "+listaFig[i].toString()+", Lado: "+listaFig[i].get_medida()+", Origem: x="+p.get_x()+" y="+p.get_y());
				}else if(nome.equals("CIRCULO")){
					p = listaFig[i].get_origem();
					System.out.println("Tipo: "+listaFig[i].toString()+", Raio: "+listaFig[i].get_medida()+", Origem: x="+p.get_x()+" y="+p.get_y());
				}else{
					System.out.println("Figura nao encontrada!");
				}
			}
		}

	}

}
