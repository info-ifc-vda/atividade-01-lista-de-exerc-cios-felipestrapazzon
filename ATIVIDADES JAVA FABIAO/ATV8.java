import java.util.*;

public class ATV8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: R$ ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("O valor pago é menor que o valor da compra!");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco a devolver: R$ " + troco);
            
            int cedula100 = troco / 100;
            troco = troco % 100;
            
            int cedula50 = troco / 50;
            troco = troco % 50;
            
            int cedula20 = troco / 20;
            troco = troco % 20;
            
            int cedula10 = troco / 10;
            troco = troco % 10;
            
            int cedula5 = troco / 5;
            troco = troco % 5;
            
            int cedula2 = troco / 2;
            troco = troco % 2;
            
            int cedula1 = troco;
            
            if (cedula100 > 0) System.out.println(cedula100 + " cédula(s) de R$ 100");
            if (cedula50 > 0) System.out.println(cedula50 + " cédula(s) de R$ 50");
            if (cedula20 > 0) System.out.println(cedula20 + " cédula(s) de R$ 20");
            if (cedula10 > 0) System.out.println(cedula10 + " cédula(s) de R$ 10");
            if (cedula5 > 0) System.out.println(cedula5 + " cédula(s) de R$ 5");
            if (cedula2 > 0) System.out.println(cedula2 + " cédula(s) de R$ 2");
            if (cedula1 > 0) System.out.println(cedula1 + " cédula(s) de R$ 1");
        }
        
    }
}
