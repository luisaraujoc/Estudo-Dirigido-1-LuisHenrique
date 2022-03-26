import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner nota = new Scanner(System.in);

        System.out.println("Informe a nota da primeira prova:\n");
        float notaprova1 = nota.nextFloat();
        
        
        System.out.println("Informe a nota da primeira prova:\n");
        float notaprova2 = nota.nextFloat();
        
        
        System.out.println("Informe a nota da primeira prova:\n");
        float notatrabalho = nota.nextFloat();

        float calculoMedia = ((notaprova1*3)+(notaprova2*3)+(notatrabalho*1))/7;

        if(calculoMedia>7){
            System.out.println("Média é maior que 7.\nDiscente aprovado.");
        }else{
            System.out.println("Média é menor que 7.\nDiscente reprovado.");
        };

        nota.close();
    }
}
