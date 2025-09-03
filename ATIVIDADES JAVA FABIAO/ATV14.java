import java.util.*;

public class ATV14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];

        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Digite o código da conta " + (i + 1) + ": ");
                int codigo = scanner.nextInt();

                boolean existe = false;
                for (int j = 0; j < i; j++) {
                    if (codigos[j] == codigo) {
                        existe = true;
                        break;
                    }
                }

                if (!existe) {
                    codigos[i] = codigo;
                    break;
                } else {
                    System.out.println("Código já existe! Digite outro.");
                }
            }

            System.out.print("Digite o saldo da conta " + (i + 1) + ": R$ ");
            saldos[i] = scanner.nextDouble();
        }

        int opcao = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Listar contas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código da conta: ");
                    int codigoConsulta = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoConsulta) {
                            System.out.println("Saldo da conta " + codigoConsulta + ": R$ " + saldos[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Conta não encontrada.");
                    break;

                case 2:
                    System.out.print("Digite o código da conta para depósito: ");
                    int codigoDeposito = scanner.nextInt();
                    boolean achouDep = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoDeposito) {
                            System.out.print("Digite o valor do depósito: R$ ");
                            double valor = scanner.nextDouble();
                            saldos[i] += valor;
                            System.out.println("Depósito realizado. Novo saldo: R$ " + saldos[i]);
                            achouDep = true;
                            break;
                        }
                    }
                    if (!achouDep) System.out.println("Conta não encontrada.");
                    break;

                case 3:
                    System.out.print("Digite o código da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    boolean achouSaque = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigos[i] == codigoSaque) {
                            System.out.print("Digite o valor do saque: R$ ");
                            double valor = scanner.nextDouble();
                            if (valor <= saldos[i]) {
                                saldos[i] -= valor;
                                System.out.println("Saque realizado. Novo saldo: R$ " + saldos[i]);
                            } else {
                                System.out.println("Saldo insuficiente!");
                            }
                            achouSaque = true;
                            break;
                        }
                    }
                    if (!achouSaque) System.out.println("Conta não encontrada.");
                    break;

                case 4:
                    System.out.println("=== LISTA DE CONTAS ===");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Conta: " + codigos[i] + " | Saldo: R$ " + saldos[i]);
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }
}
