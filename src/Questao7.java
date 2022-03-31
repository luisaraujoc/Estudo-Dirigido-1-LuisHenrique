import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[][] = new int[5][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Digite o valor qualquer. Posição: [" + i + "][" + j+"]:");	
                array[i][j] = input.nextInt();
            }
        }


        System.out.println("Para Buscar um valor, digite o valor que deseja buscar: ");
        int valor = input.nextInt();
        

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == valor) {
                    System.out.println("Valor encontrado na posição: [" + i + "][" + j + "]");
                }else{
                    System.out.println("Valor não encontrado!");
                }
            }
        }

        input.close();
    }
}
