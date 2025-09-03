import java.util.*;

public class ATV9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver se é primo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Não é primo");
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.println("Não é primo");
                    return;
                }
            }
            System.out.println("É primo");
        }

        scanner.close();
    }
}
