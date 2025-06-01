package fundamentos;

public class AreaCircunferencia {
	public static void main(String [] args) {
		//Definindo variável: é possível definir através tipo, nome e valor da variáv
		//Exemplo de variável inteira (números inteiros). Foi atribuído o valor 3 à variável raio
		//A atribuição double permite números quebrados
		//A atruibuição final impede que o valor da variável seja mudado, uma vez já setado.
		
		int raio = 3;
		final double PI = 3.14159;
		double area = PI * raio * raio;
		
		System.out.println("A área da circunferência é: " + area + "m2");
	}
}
