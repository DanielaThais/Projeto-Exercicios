package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double diferenca = 32; //constante
		final double conversão = 5.0 / 9.0;
		int F = 86; //variável
		double celsius = (F - diferenca) * conversão; 		
		
		System.out.println("O valor de " + F + "°F" + " em Celsus é: " + celsius + "°C");
		
	}
}
