import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Informe o primeiro número:\n");
        int num1 = number.nextInt();
        System.out.println("Informe o segundo número:\n");
        int num2 = number.nextInt();

        System.out.println("Informe com o número qual operação deseja realizar:");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int operator = number.nextInt();

        switch (operator) {
            case 1:
                int soma = num1 + num2;
                System.out.println("Soma:" + soma);
    	        break;
            case 2:
                int subt = num1 - num2;
                System.out.println("Subtração:" + subt);
    	        break;
            case 3:
                int multi = num1 + num2;
                System.out.println("Multiplica:" + multi);
    	        break;
            case 4:
                int divi = num1 + num2;
                System.out.println("Divisão:" + divi);
    	        break;
        }
    }
}