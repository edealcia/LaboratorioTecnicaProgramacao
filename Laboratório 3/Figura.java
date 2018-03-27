abstract class Figura{

	public abstract Ponto get_origem();

	public abstract float get_medida();

	public void desenhar(){

	}

	public void desenhar(String cor){

	}

	public abstract void mover(float dx, float dy);

	public abstract float calcularArea();

	public abstract String toString();
}