import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a sua avaliaçao para o filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Média avaliaçao " + mediaAvaliacao/3);
    }
}
