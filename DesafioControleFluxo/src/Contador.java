import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try {
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o primeiro parâmetro:");
            int parameter1 = scanner.nextInt();
            System.out.println("Informe o segundo parâmetro:");
            int parameter2 = scanner.nextInt();
            count(parameter1, parameter2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Parametro inválido, informe um número inteiro.");
        }
    }

    static void count(int p1, int p2) throws ParametrosInvalidosException{
        int iteraction = p2 - p1;
        for (int i = 1; i <= iteraction; i++) {
            System.out.println("Imprimindo o número "+i);
        }
        if(iteraction < 0)
            throw new ParametrosInvalidosException();
    }

    @Override
    public String toString() {
        return "Contador []";
    }
}