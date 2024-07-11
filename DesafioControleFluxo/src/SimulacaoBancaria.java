import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em exwcução até que o usuário decida sair
        while (true) {
            
            int opcao = scanner.nextInt();
            // Implemente as condições necessárias para avaliar a opção escolhida:
            // Dica: Utilize o switch case para o programa realizar as operações escolhidas pelo usuario.
            switch (opcao) {
                case 1:
                    double saldoAtual = scanner.nextDouble();
                    saldo+=saldoAtual;
                    System.out.println("Saldo: " + saldo);                   
                    break;

                case 2:
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado > saldo) {
                    System.out.println("Saldo Insuficiente.");
                    }else{
                    saldo -= valorSacado;
                    System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;    
                case 0:    
                    System.out.println("Programa encerrado. \n");
                    return;    
                //Exibe mensagem de opção inválida se o usuário escolher outra opção:    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
             
            } 
        }
    }

}

