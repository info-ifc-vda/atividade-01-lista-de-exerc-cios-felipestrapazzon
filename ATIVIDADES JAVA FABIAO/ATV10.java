import java.util.*;

public class ATV10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 1) {
                boolean ehPrimo = true;

                for (int j = 2; j < numero; j++) {
                    if (numero % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo) {
                    primos++;
                }
            }
        }

        System.out.println("Quantidade de números primos digitados: " + primos);

    }
}
