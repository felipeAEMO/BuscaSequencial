import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.naming.directory.SearchResult;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
          
        System.out.println("\t---VETOR COM 1:");
        int[] vet1 = gerarVetor10(1);
        System.out.println(Arrays.toString(vet1));
        int soma1 = 0;
        int media1 = 0;
        for(int i = 0; i < vet1.length;i++) {
            soma1 = soma1 + vet1[i];
            media1 = soma1 / 1;
        }
        System.out.println("---\tSOMA TOTAL DOS VETORES DE 1 ALEATORIOS: \n" + soma1);
        System.out.println(("--- \tA MEDIA DO TOTAL DE 1: \n" + media1));

        System.out.println("\n----Digite um numero-----\t");
        int numero1 = sc.nextInt();
        boolean achou = false;
        for(int i = 0; i < media1; i++) {
            if(media1 == numero1) {
                System.out.println("Achou o numero entre 0 e 10");
                achou = true;
                break;
            } else {
                System.out.println("Não achou o numero entre 0 e 10");
                
            }
        }


        System.out.println("\t---VETOR COM 10:");
        int[] vet10 = gerarVetor10(10);
        System.out.println(Arrays.toString(vet10));
        int soma10 = 0;
        int media10 = 0;
        for(int i = 0; i < vet10.length;i++) {
            soma10 = soma10 + vet10[i];
            media10 = soma10 / 10;
        }
        System.out.println("---\tSOMA TOTAL DOS VETORES DE 10 ALEATORIOS: \n" + soma10);
        System.out.println(("--- \tA MEDIA DO TOTAL DE 10: \n" + media10));

        System.out.println("\n----Digite um numero entre 0 e 10-----\t");
        int numero10 = sc.nextInt();
        boolean achou = false;
        for(int i = 0; i < media10; i++) {
            if(media10 == numero10) {
                System.out.println("Achou o numero entre 0 e 10");
                achou = true;
                break;
            } else {
                System.out.println("Não achou o numero entre 0 e 10");
                
            }
        }

        System.out.println("---\tVETOR COM 100:");
        int[] vet100 = gerarVetor100(100);
        System.out.println(Arrays.toString(vet100));
        int soma100 = 0;
        int media100 = 0;
        for(int i = 0; i < vet100.length;i++) {
            soma100 = soma100 + vet100[i];
            media100 = soma100 / 100;
        }
        System.out.println("---\tSOMA TOTAL DOS VETORES DE 100 ALEATORIOS:\n " + soma100);
        System.out.println(("--- \tA MEDIA DO TOTAL DE 100:\n " + media100));

        System.out.println("\n----Digite um numero entre 0 e 100-----\t");
        int numero100 = sc.nextInt();
        for(int i = 0; i < media100; i++) {
            if(media100 == numero100) {
                System.out.println("Achou o numero entre 0 e 100");
                achou = true;
                break;
            } else {
                System.out.println("Não achou");
            }
        }

        System.out.println("---\tVETOR COM 1000:");
        int[] vet1000 = gerarVetor1000(1000);
        System.out.println(Arrays.toString(vet1000));
        int soma1000 = 0;
        int media1000 = 0;
        for(int i = 0; i < vet1000.length;i++) {
            soma1000 = soma1000 + vet1000[i];
            media1000 = soma1000 / 1000;
        }
        System.out.println("---\tSOMA TOTAL DOS VETORES DE 1000 ALEATORIOS:\n " + soma1000);
        System.out.println(("--- \tA MEDIA DO TOTAL DE 1000:\n " + media1000));

        System.out.println("\n----Digite um numero entre 0 e 1000-----\t");
        int numero1000 = sc.nextInt();
        for(int i = 0; i < media1000; i++) {
            if(media1000 == numero1000) {
                System.out.println("Achou o numero entre 0 e 1000");
                achou = true;
                break;
            } else {
                System.out.println("Não achou");
            }
        }

        System.out.println("---\tVETOR COM 5000:");
        int[] vet5000 = gerarVetor5000(1000);
        System.out.println(Arrays.toString(vet5000));
        int soma5000 = 0;
        int media5000 = 0;
        for(int i = 0; i < vet5000.length;i++) {
            soma5000 = soma5000 + vet5000[i];
            media5000 = soma5000 / 5000;
        }
        System.out.println("---\tSOMA TOTAL DOS VETORES DE 5000 ALEATORIOS:\n " + soma5000);
        System.out.println(("--- \tA MEDIA DO TOTAL DE 5000:\n " + media5000));

        System.out.println("\n----Digite um numero entre 0 e 5000-----\t");
        int numero5000 = sc.nextInt();
        for(int i = 0; i < media5000; i++) {
            if(media5000 == numero5000) {
                System.out.println("Achou o numero entre 0 e 5000");
                achou = true;
                break;
            } else {
                System.out.println("Não achou");
            }
        }
    }

    private static int[] gerarVetor10(int tam10) {
       int[] vt10 = new int[tam10];
       int smT = 0;
       Random gera10 = new Random();

       for(int i = 0; i < vt10.length; i++) {
        vt10[i] = gera10.nextInt(1000);
        smT = smT + vt10[i];
       }
        return vt10;
    }

    private static int[] gerarVetor100(int tam100) {
        int[] vt100 = new int[tam100];
        int smT = 0;
        Random gera100 = new Random();
 
        for(int i = 0; i < vt100.length; i++) {
         vt100[i] = gera100.nextInt(1000);
         smT = smT + vt100[i];
        }
         return vt100;
     }

     private static int[] gerarVetor1000(int tam1000) {
        int[] vt1000 = new int[tam1000];
        int smT = 0;
        Random gera1000 = new Random();
 
        for(int i = 0; i < vt1000.length; i++) {
         vt1000[i] = gera1000.nextInt(1000);
         smT = smT + vt1000[i];
        }
         return vt1000;
     }

     private static int[] gerarVetor5000(int tam5000) {
        int[] vt5000 = new int[tam5000];
        int smT = 0;
        Random gera5000 = new Random();
 
        for(int i = 0; i < vt5000.length; i++) {
         vt5000[i] = gera5000.nextInt(1000);
         smT = smT + vt5000[i];
        }
         return vt5000;
     }
   
    }

