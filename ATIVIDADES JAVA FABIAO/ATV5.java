import java.util.*;

public class ATV5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int i;
        int j;
        int totalTimes = 2;
        int totalJogadores = 2;
        int totalJogadoresCamp = totalTimes * totalJogadores;
        int count = 0;
        double contadorAltura = 0;
        double contadorPeso = 0;
        double mediaIdade = 0;
        
        for(j = 1; j <= totalTimes; j++){
            
            System.out.println("Time " + j);
            
            System.out.println("=====================");
            
            int contadorIdade = 0;
            
            for(i = 1; i <= totalJogadores; i++){
                
                System.out.print("Digite a idade do jogador " + i + " ");
                int idade = scanner.nextInt();
                contadorIdade += idade;
                if(idade < 18){
                    count++;
                }
                
                System.out.print("Digite o peso do jogador " + i + " ");
                double peso = scanner.nextDouble();
                if(peso > 80){
                    
                    contadorPeso++;
                }
                
                System.out.print("Digite a altura do jogador " + i + " ");
                double altura = scanner.nextDouble();
                contadorAltura  = contadorAltura + altura;
                
                System.out.println("==============");
            }
            
            mediaIdade = contadorIdade / totalJogadores;
            System.out.println("A média da idade do time " + j + " é " + mediaIdade);
        }
        
            
        System.out.println("A quantidade de jogadores com idade abaixo de 18 anos é: " + count);
        
        double mediaAltura = contadorAltura / totalJogadoresCamp;
        
        System.out.println("A média da altura dos jogadores é: " + mediaAltura);
        
        double porcentoPeso = (contadorPeso * 100.0) / totalJogadoresCamp;
        
        System.out.println("A quantia de jogadores com o peso maior que 80Kg é: " + porcentoPeso + "%");
        
        
    }
}
