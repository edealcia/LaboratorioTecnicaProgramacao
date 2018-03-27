class Circulo extends Figura implements FiguraInterface{

	private Ponto origem;
	private float raio;

	Circulo(Ponto o, float r){
		origem = new Ponto(o.get_x(), o.get_y());
		raio = r;
	}

	public float get_medida(){
		return this.raio;
	}

	public Ponto get_origem(){
		return this.origem;
	}

	public void desenhar(){
		System.out.println(this.toString());
	}

	public void mover(float dx, float dy){
		origem.set_x(dx);
		origem.set_y(dy);
	}

	public float calcularArea(){
		return (float)(Math.PI * Math.pow(raio, 2));
	}

	public String toString(){
		return getClass().getName();
	}
}