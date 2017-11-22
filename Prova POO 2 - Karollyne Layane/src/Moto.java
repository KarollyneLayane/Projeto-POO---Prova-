public class Moto extends Veiculo {

	private int qmarcha;
	
	public int getQmarcha() {
		return qmarcha;
	}

	public void setQmarcha(int qmarcha) {
		this.qmarcha = qmarcha;
	}

	public int getMenorMarcha() {
		return menorMarcha;
	}

	public void setMenorMarcha(int menorMarcha) {
		this.menorMarcha = menorMarcha;
	}

	public int getMaiorMarcha() {
		return maiorMarcha;
	}

	public void setMaiorMarcha(int maiorMarcha) {
		this.maiorMarcha = maiorMarcha;
	}

	public int getTrocaMarcha() {
		return trocaMarcha;
	}

	public void setTrocaMarcha(int trocaMarcha) {
		this.trocaMarcha = trocaMarcha;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	private int menorMarcha = 0;
	private int maiorMarcha = 5;
	private int trocaMarcha;
	private boolean ligada;

	void marcha() {
		if (qmarcha == 0) {
			System.out.println("A moto está em ponto morto.");
		} else if (qmarcha == 1) {
			System.out.println("A moto está na primeira marcha.");
		} else if (qmarcha == 2) {
			System.out.println("A moto está na segunda marcha.");
		} else if (qmarcha == 3) {
			System.out.println("A moto está na terceira marcha.");
		} else if (qmarcha == 4) {
			System.out.println("A moto está na quarta marcha.");
		} else {
			System.out.println("A moto está na quinta marcha.");
		}
	}

	void marchaAcima() {
		if (trocaMarcha == 1 && qmarcha < 5) {
			qmarcha = qmarcha + 1;
		}
	}

	void marchaAbaixo() {
		if (trocaMarcha == 2 && qmarcha > 0) {
			qmarcha = qmarcha - 1;
		}
	}
	
	public void ligar(){
		if (ligada == true){
			ligada = false;
		}
	}

	Moto() {

	}

}
