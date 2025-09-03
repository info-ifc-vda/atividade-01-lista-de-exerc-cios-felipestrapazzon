import java.util.*;

public class ATV6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um Número para ver o fatorial: ");
        int numero = scanner.nextInt();
        
        int fatorial = 1;
        
        for(int i = numero; i >= 1; i--){
            
            fatorial = fatorial * i;
        }
        
        System.out.print("O resultado desta operação é: " + fatorial);
    }
}
