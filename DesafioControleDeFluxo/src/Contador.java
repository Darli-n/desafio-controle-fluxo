import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            int numeroUm = terminal.nextInt();
            System.out.println("Digite o segundo numero: ");
            int numeroDois = terminal.nextInt();

            if (numeroUm > numeroDois) {
                throw new IllegalArgumentException("O segundo parametro deve ser igual ou maior ao primeiro");
            }
            for (int i = numeroUm; i <= numeroDois; i++) {
                System.out.println("Impriminfo o numero " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("por favor, forneca numero sinteiros como argumentos");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
