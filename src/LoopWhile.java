import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while(nota != -1){
            System.out.println("Digite a sua avaliaçao para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();

            if(nota != -1) {
                mediaAvaliacao += nota;
                totalNotas ++;
            }
        }
        System.out.println("Média avaliaçao " + mediaAvaliacao/totalNotas);
    }
}
