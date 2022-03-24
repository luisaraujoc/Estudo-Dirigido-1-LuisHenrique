import java.util.Random;

public class Questao6 {
    public static void main(String[] args){
        int []C = gerarVetor(50);
        int maior = 0;

        for(int i = 0; i < C.length; i++){
            System.out.println("Elemento "+i+": "+C[i]+";");
        }

        for(int i = 0; i < C.length; i++){
            if(i!=0){
                if(C[i]>C[i-1]){
                    maior = C[i];
                }
            }else{
                maior = C[i];
            }
        }
        System.out.println("O maior dos elementos deste vetor é:\n");
        
        System.out.println(maior);
    }
     
    // preencher vetor
    private static int[] gerarVetor(int tam){
        int []vetor = new int[50];
        Random gerador = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(100 +1);
        }
        
        return vetor;
    }
}