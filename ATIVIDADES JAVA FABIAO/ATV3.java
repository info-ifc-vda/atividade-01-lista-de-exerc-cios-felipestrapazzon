import java.util.*;

public class ATV3
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o angulo 1: ");
		int angulo1 = scanner.nextInt();
		
		
		System.out.print("Digite o angulo 2: ");
		int angulo2 = scanner.nextInt();
		
		
		System.out.print("Digite o angulo 3: ");
		int angulo3 = scanner.nextInt();
		
		
		if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
		    
		    System.out.print("É Triangulo");
		    
		}else if(angulo1 > 90 || angulo2 > 90 || angulo3 > 90){
		    
		    System.out.print("É Obtusângulo");
		    
		}else {
		    
		    System.out.print("É Acutângulo");
		}
		
	}
}