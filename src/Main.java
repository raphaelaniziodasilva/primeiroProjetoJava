public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento " + anoDeLancamento);

        // filme Top Gun Maverick esta incluido no plano
        boolean incluidoNoPlano = true;
        // nota do filme
        double notaDoFilme = 8.8;

        // media do filme
        double media = (9.2 + 8.3 + 9) / 3;
        System.out.println(media);

        String sinopse = "Filme de aventura com Tom Cuise";
        System.out.println(sinopse);

        // fazendo formatação pulando linhas
        String formatacao;
        formatacao = """
                Filme Top Gun
                Ator: Tom Cruise
                Muito bem avaliado
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(formatacao);



    }
}