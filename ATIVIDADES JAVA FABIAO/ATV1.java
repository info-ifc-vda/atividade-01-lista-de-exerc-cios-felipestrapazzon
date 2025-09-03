import java.util.*;

public class ATV1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite as horas trabalhadas: ");
        int horasWork = scanner.nextInt();
        
        
        System.out.print("Digite o valor das horas trabalhadas: ");
        double valorHora = scanner.nextDouble();
        
        
        double salarioBruto = valorHora * horasWork;
        
        double imposto = salarioBruto * 0.30;
        
        double salarioFinal = salarioBruto - imposto;
        
        
        System.out.println("Conforme as horas que você passou, seu salário final é: R$" + salarioFinal);
        
    }
}
