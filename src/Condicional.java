public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        // condiçao para verificar se o filme e recente
        if(anoDeLancamento >= 2022){
            System.out.println("Lançado este ano e os clinetes estao curtindo");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        // condiçao para verificar se o cliente tem o plano plus ou filme esta incluido no plano
        if(incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locaçao");
        }

    }
}
