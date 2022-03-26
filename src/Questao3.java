import java.util.Scanner;

public class Questao3{

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);

        System.out.println("Informe o primeiro número:\n");
        int num1 = number.nextInt();
        System.out.println("Informe o segundo número:\n");
        int num2 = number.nextInt();

        int divisao = num1%num2;
        int divisao2 = num2%num1;

        if(divisao == divisao2){
            System.out.println("Os números informados são divisores.");
        }else{
            System.out.println("Os números escolhidos não são divisores");
        }

        number.close();
    }
}