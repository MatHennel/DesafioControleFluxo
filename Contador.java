import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o primeiro numero: ");
        System.out.print("> ");
        int numeroUm = scan.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        System.out.print("> ");
        int numeroDois = scan.nextInt();

        try {
            contar(numeroUm,numeroDois);
        } catch (ParametrosInvalidosExcpetion e) {
            System.out.println(e.getMessage());
        }
        
        
        scan.close();
    }

    private static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosExcpetion{
        
        if(numeroDois <= numeroUm) throw new ParametrosInvalidosExcpetion();

        int contador = numeroDois - numeroUm;

        for(int i = 0; i < contador; i++){
            System.out.println("Imprimindo o numero: " + (i + 1));
        }
       
    }
    
    
}