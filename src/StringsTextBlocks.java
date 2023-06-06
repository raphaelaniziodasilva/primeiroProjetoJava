public class StringsTextBlocks {
    public static void main(String[] args) {
        // Para criar uma String em Java, basta utilizar aspas duplas para delimitar o texto
        String saudacao = "Olá, ";
        String nome = "Raphael";
        String mensagem = saudacao + nome + "!";
        System.out.println(mensagem);

//        Comparação de Strings
//        Em Java, é possível comparar duas Strings utilizando o operador ==. Porém, esse operador verifica apenas se as
//        duas variáveis apontam para o mesmo objeto na memória, e não se o conteúdo das Strings é igual. Para comparar o
//        conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo:
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

//        método equalsIgnoreCase(), que é usado para que a comparação de Strings desconsidere as letras maiúsculas e minúsculas.
//        Utilizando apenas o equals, as String “alura” e “Alura” seriam consideradas diferentes.

//        Text Block
//        Introduzido na versão 15 do Java, o Text Block é uma nova forma de representar Strings que facilitam a escrita de textos com múltiplas linhas.
//        Em vez de utilizar aspas duplas para delimitar o texto e inserir quebras de linha manualmente, ou utilizar concatenações, é possível utilizar
//        uma sintaxe mais simples que permite inserir o texto exatamente como ele é.

//        Sintaxe do Text Block
//        Para criar um Text Block em Java, basta utilizar três aspas duplas para delimitar o texto, seguidas de uma quebra de linha
        String mensage = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
        System.out.println(mensage);

//        Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String. Esse
//        método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido
//        de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será
//        inserida no placeholder, %d indica um valor inteiro e %f indica um valor decimal.
        String name = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", name, idade, valor));

//        Esse exemplo do que foi feito para o String.format também pode ser usado com Text Block, o formatted, para informar
//        as variáveis que deverão ser utilizadas no lugar dos placeholders.
        String nm = "João";
        int aulas = 4;

        String message = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(message);
    }
}
