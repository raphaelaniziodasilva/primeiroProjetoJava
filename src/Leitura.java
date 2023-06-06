import java.util.Scanner; // importando o Scanner do java.util

public class Leitura {
    public static void main(String[] args) {
//        A classe Scanner do Java é utilizada para ler dados de entrada em um programa Java. Esses dados podem ser lidos
//        a partir de várias fontes de entrada, como arquivos, fluxos de entrada, Strings e até mesmo a entrada do usuário
//        através do teclado.
//        Ela oferece uma série de métodos para ler dados de diferentes tipos, como inteiros, números de ponto flutuante, strings e caracteres.

                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite seu nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite sua idade: ");
                int idade = scanner.nextInt();
                System.out.print("Digite o valor que pretende investir esse mês: ");
                double valor = scanner.nextDouble();

                System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        // vamos escrever no terminal e ler: imprimir o que foi escrito
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme ");
        // guardando o que vai ser escrito em uma variavel dp tipo string
        String filme = leitura.nextLine();

        // escrevendo o nome do filme no terminal e ler: imprimir o que foi escrito
        System.out.println("Qual o ano de lançamento ");
        // guardando a resposta numa variavel do tipo inteiro
        int anoDeLancamento = leitura.nextInt();

        // escrevendo o avaliaçao do filme no terminal e ler: imprimir o que foi escrito
        System.out.println("Diga sua avaliaçao ");
        // guardando a resposta numa variavel do tipo double
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
        
        scanner.close();

    }
}
