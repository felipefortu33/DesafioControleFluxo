import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
           System.out.println("Digite o primeiro numero: ");
           int numero1 = scanner.nextInt();

           System.out.println("Digite o segundo numero: ");
           int numero2 = scanner.nextInt();

           if (numero1 > numero2) {
                throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro");
           }

           System.out.println("Realizar as interacoes...");
           for (int i = 1; i <= (numero2 - numero1); i++) {
                System.out.println("Imprimindo o numero " + i);
           }

    }catch (ParametrosInvalidosException e) {
        System.err.println("Erro: " + e.getMessage());

    }catch (Exception e) {
        System.err.println("Erro inesperado " + e.getMessage());
    }
}

}
