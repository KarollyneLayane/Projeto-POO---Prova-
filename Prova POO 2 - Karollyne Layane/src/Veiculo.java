public class Veiculo extends Motor {

	private int peso;
	private int velMax;
	private float preco;
	private String cor;
	private String modelo;

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getPeso() {
		return peso;
	}

	public int getVelMax() {
		return velMax;
	}

	public float getPreco() {
		return preco;
	}

	Veiculo() {
		peso = 0;
		velMax = 0;
		preco = 0;
	}

}
