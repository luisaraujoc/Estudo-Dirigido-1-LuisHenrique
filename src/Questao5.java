import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o tempo desejado em segundos: ");
            
            
            int time = input.nextInt();

            int horas = time/3600;
            time = time%3600;
            int minutos = (time / 60) % 60;
            int segundos = time % 60;

            System.out.println("Tempo: "+horas+"h"+minutos+"min"+segundos+"seg");

            input.close();
        }
    }
        
}

