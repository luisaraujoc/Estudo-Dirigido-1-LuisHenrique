import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
        // construindo variável
        Scanner keyboard = new Scanner(System.in);

        // pegando o primeiro número.
        System.out.println("Informe o primeiro número:\n");
        int num1 = keyboard.nextInt();
        
        
        // pegando o segundo número.
        System.out.println("Informe o segundo número:\n");
        int num2 = keyboard.nextInt();


        // comparação de números em uma estrutura de repetição básica.
        if(num1 > num2){
            System.out.println(num1);
            System.out.println("<- Este é o maior número!");
        }else{
            System.out.println(num2);
            System.out.println("<- Este é o maior número!");
        }


        keyboard.close();
    }
}
