import java.util.*;

public class ATV4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        
        System.out.print("Digite a quantia comprada: ");
        int quantia = scanner.nextInt();
        
        double precoUnitario = 0.0;
        
        
        if (codigo <= 10) {
            
            precoUnitario = 10.0;
        } else if (codigo <= 20) {
            
            precoUnitario = 15.0;
        } else if (codigo <= 30) {
            
            precoUnitario = 20.0;
        } else if (codigo <= 40) {
            
            precoUnitario = 40.0;
        }
        
        
        double valorFinalSemDesconto = precoUnitario * quantia;
        
        int desconto = 0;
        double valorComDesconto = 0.0;
        
        
        if (valorFinalSemDesconto <= 250) {
            
            desconto = 5;
        } else if (valorFinalSemDesconto <= 500) {
            
            desconto = 10;
        } else {
            
            desconto = 15;
        }
        
        valorComDesconto = valorFinalSemDesconto - (valorFinalSemDesconto * desconto / 100);
        
        
        System.out.println("Preço unitário: R$ " + precoUnitario);
        
        System.out.println("Valor total sem desconto: R$ " + valorFinalSemDesconto);
        
        System.out.println("Desconto aplicado: " + desconto + "%");
        
        System.out.println("Valor final a pagar: R$ " + valorComDesconto);
        
        scanner.close();
    }
}
