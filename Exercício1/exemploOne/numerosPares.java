import java.util.Scanner;
import java.io.IOException;

public class numerosPares {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (System.in);

        int[] vetor = new int[4];
        int contador = 0;

            System.out.println("Digite um número:");
            vetor[1] = scan.nextInt();

            System.out.println("Digite um número:");
            vetor[2] = scan.nextInt();

            System.out.println("Digite um número:");
            vetor[3] = scan.nextInt();

            System.out.println("Digite um número:");
            vetor[4] = scan.nextInt();

            if (vetor[4] % 2 == 0) {contador++;};
            
            System.out.println("" +contador);
    }}