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
                System.out.println("O saldo atualizado é " + saldo);
            } else if(opcao == 2) {
                System.out.println("Qual e o valor que deseja transferir");
                //
                // double valor = leitura.nextDouble();
            }
        }
    }
}
