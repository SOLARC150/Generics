package Carros;

public class CarroAbstract implements ICarro{

	protected String marca;
	protected String nome;

	@Override
	public String getMarca() {
		return marca;
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return marca + " - " + nome;
	}

}
