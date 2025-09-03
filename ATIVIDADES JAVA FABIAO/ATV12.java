import java.util.*;

public class ATV12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] resultado = new int[20]; // no máximo todos os números são diferentes
        int k = 0;


        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }


        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                resultado[k] = vetor1[i];
                k++;
            }
        }

        
        for (int i = 0; i < 10; i++) {
            boolean comum = false;
            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    comum = true;
                    break;
                }
            }
            if (!comum) {
                resultado[k] = vetor2[i];
                k++;
            }
        }


        System.out.println("Números não comuns:");
        for (int i = 0; i < k; i++) {
            System.out.print(resultado[i] + " ");
        }

        scanner.close();
    }
}
