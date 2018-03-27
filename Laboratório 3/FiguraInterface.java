interface FiguraInterface{

	Ponto get_origem();
	void desenhar();
	void desenhar(String cor);
	void mover(float dx, float dy);
	float calcularArea();
	String toString();
}