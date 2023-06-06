package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // inicializar os dados do cliente
        String nome = "Iphone 14";
        String tipoConta = "Corrente";
        double saldo = 1598.00;

        System.out.println("################################");
        System.out.println("\nNome do cliente " + nome);
        System.out.println("Tipo de conta " + tipoConta);
        System.out.println("Saldo atual " + saldo);

        String menu = """
                ** Digite uma opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - sair
                """;

        // vamos precisar de um Scanner de leitura para ler a opção no terminal
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        while(opcao != 4) {
            // aqui dentro do while vamos precisar exibir o menu e ler a opção
            // exibindo o menu
            System.out.println(menu);
            // lendo a opção
            opcao = leitura.nextInt();

            if(opcao == 1) {
                // Consultar saldo
                System.out.println("O saldo atualizado é " + saldo);
            } else if(opcao == 2) {
                // Transferir valor
                System.out.println("Qual e o valor que deseja transferir");
                // vai receber o valor que for lido pelo Scanner
                double valor = leitura.nextDouble();

                // se o valor for maior que o saldo não deve haver transferencia caso o valor seja menor que o saldo vai ter a transferencia
                if (valor > saldo){
                    System.out.println("Saudo insuficiente para realizar transferência");
                } else {
                    // fazendo transferencia
                    saldo -= valor;
                    System.out.println("Saldo atualizado " + saldo);
                }
            } else if (opcao == 3) {
                // Receber valor
                System.out.println("Valor recebido ");
                // vai receber o valor que for lido pelo Scanner
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}
