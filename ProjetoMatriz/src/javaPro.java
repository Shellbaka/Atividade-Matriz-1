import java.util.Scanner;

public class javaPro {

    public static void main(String[] args) {
        int[][] quant = new int[2][4];
        Scanner s = new Scanner(System.in);

        // Ler os valores
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[i].length; j++) {
                System.out.println("Informe o valor:");
                quant[i][j] = s.nextInt();
            }
            System.out.println();
        }

        // Exibir os valores em forma de tabela 
        System.out.println("Valores informados:");
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[i].length; j++) {
                System.out.print(quant[i][j] + "\t");
            }
            System.out.println();
        }
    }
}