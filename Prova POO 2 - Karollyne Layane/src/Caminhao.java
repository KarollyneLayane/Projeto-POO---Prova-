public class Caminhao extends Veiculo {

	private int cargaMax;
	private int comprimento;
	private int alturaMax;

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	Caminhao() {
		cargaMax = 0;
		comprimento = 0;
		alturaMax = 0;
	}

}
