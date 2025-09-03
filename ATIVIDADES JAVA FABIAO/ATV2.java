import java.util.*;

public class ATV2
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu salário minímo: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Digite quantos QuiloWatts foram consumidos: ");
		double qw = scanner.nextDouble();
		
		double valorQw = salario * 0.01;
		
		double valorAPagar = valorQw * qw;
		
		System.out.println("O valor dos QuiloWatts é de " + valorQw);
		System.out.println("O valor a pagar é de R$ " + valorAPagar);
		
	}
}