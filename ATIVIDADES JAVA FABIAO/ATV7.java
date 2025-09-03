import java.util.*;

public class ATV7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        for (int i = menor; i <= maior; i++) {
            long fatorial = 1;

            for (int j = i; j >= 1; j--) {
                fatorial *= j;
            }

            System.out.println(i + "! = " + fatorial);
        }

    }
}
