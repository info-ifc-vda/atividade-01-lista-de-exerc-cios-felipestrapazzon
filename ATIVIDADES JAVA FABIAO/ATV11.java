import java.util.*;

public class ATV11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("VALOR  CUBO  RAIZ");

        while (true) {
            System.out.print("Digite um número (0 ou negativo para sair): ");
            double valor = scanner.nextDouble();

            if (valor <= 0) {
                break;
            }

            double cubo = valor * valor * valor;
            double raiz = Math.sqrt(valor);

            System.out.println(valor + "  " + cubo + "  " + raiz);

            contador++;

            if (contador % 20 == 0) {
                System.out.println("VALOR  CUBO  RAIZ");
            }
        }

        System.out.println("Programa encerrado.");
    }
}
