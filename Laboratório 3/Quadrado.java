class Quadrado extends Figura implements FiguraInterface{

	private Ponto origem;
	private float lado;

	Quadrado(Ponto o, float l){
		origem = new Ponto(o.get_x(), o.get_y());
		lado = l;
	}

	public float get_medida(){
		return this.lado;
	}

	public Ponto get_origem(){
		return this.origem;
	}

	public void desenhar(String cor){
		System.out.println(this.toString() + " " + cor);
	}

	public void mover(float dx, float dy){
		origem.set_x(dx);
		origem.set_y(dy);
	}

	public float calcularArea(){
		return (float)Math.pow(lado, 2);
	}

	public String toString(){
		return getClass().getName();
	}
}