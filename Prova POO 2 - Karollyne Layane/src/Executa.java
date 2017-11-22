import java.util.Scanner;


public class Executa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Motor m = new Motor();
		Veiculo v = new Veiculo();
		CarroPasseio ca = new CarroPasseio();
		Caminhao c = new Caminhao();
		Moto mt = new Moto();
		
		System.out.println("Especifica��es: Carro de Passeio.");
		m.setNumCilindro(4);
		m.setPotencia(78);
		ca.setCor("Azul");
		ca.setModelo("Onix Joy");
		v.setPeso(1000);
		v.setPreco(52380);
		v.setVelMax(200);
		System.out.println("N� de cilindros: " + m.getNumCilindro());
		System.out.println("Pot�ncia (cv): " + m.getPotencia());
		System.out.println("Cor do carro " + ca.getCor());
		System.out.println("Modelo: " + ca.getModelo());
		System.out.println("Peso (kg): " + v.getPeso());
		System.out.println("Pre�o: " + v.getPreco());
		System.out.println("Velocidade m�xima (km/h): " + v.getVelMax());
		
		System.out.println(" ");		
		
		System.out.println("Especifica��es: Caminh�o.");
		m.setNumCilindro(6);
		m.setPotencia(108);
		c.setCor("Vermelho");
		c.setModelo("Mercede-Benz");
		c.setAlturaMax(20);
		c.setCargaMax(1500);
		c.setComprimento(35);
		v.setPeso(10000);
		v.setPreco(300000);
		v.setVelMax(300);
		System.out.println("N� de cilindros: " + m.getNumCilindro());
		System.out.println("Pot�ncia (cv): " + m.getPotencia());
		System.out.println("Cor do carro " + c.getCor());
		System.out.println("Modelo: " + c.getModelo());
		System.out.println("Altura: " + c.getAlturaMax());
		System.out.println("Comprimento: " + c.getComprimento());
		System.out.println("Carga M�xima: " + c.getCargaMax() );
		System.out.println("Peso (kg): " + v.getPeso());
		System.out.println("Pre�o: " + v.getPreco());
		System.out.println("Velocidade m�xima (km/h): " + v.getVelMax());
		
		System.out.println(" ");
		
		System.out.println("Especifica��es: Moto.");
		m.setNumCilindro(3);
		m.setPotencia(56);
		mt.setCor("Preta");
		mt.setModelo("Honda Pcx");
		v.setPeso(400);
		v.setPreco(15000);
		v.setVelMax(250);
		System.out.println("N� de cilindros: " + m.getNumCilindro());
		System.out.println("Pot�ncia (cv): " + m.getPotencia());
		System.out.println("Cor do carro " + mt.getCor());
		System.out.println("Modelo: " + mt.getModelo());
		System.out.println("Peso (kg): " + v.getPeso());
		System.out.println("Pre�o: " + v.getPreco());
		System.out.println("Velocidade m�xima (km/h): " + v.getVelMax());
		
		
		

	}

}
