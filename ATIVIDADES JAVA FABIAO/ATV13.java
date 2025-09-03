import java.util.*;

public class ATV13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 números para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }

        int[] somaPares = new int[10];
        int k1 = 0;

        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 == 0) {
                int soma = vetor1[i];
                for (int j = 0; j < 5; j++) {
                    soma += vetor2[j];
                }
                somaPares[k1] = soma;
                k1++;
            }
        }

        int[] divisoresImpares = new int[10];
        int k2 = 0;

        for (int i = 0; i < 10; i++) {
            if (vetor1[i] % 2 != 0) {
                int count = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        count++;
                    }
                }
                divisoresImpares[k2] = count;
                k2++;
            }
        }

        System.out.println("Primeiro vetor resultante (pares + soma do segundo vetor):");
        for (int i = 0; i < k1; i++) {
            System.out.print(somaPares[i] + " ");
        }
        System.out.println();

        System.out.println("Segundo vetor resultante (ímpares / divisores no segundo vetor):");
        for (int i = 0; i < k2; i++) {
            System.out.print(divisoresImpares[i] + " ");
        }

        scanner.close();
    }
}
