import java.util.Scanner;
import java.util.InputMismatchException;
public class Divisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int A = scanner.nextInt();
        System.out.println("Informe o segundo valor: ");
        int B = scanner.nextInt();

        try {
            if(B ==0){
                System.out.println("Divisão por zero não é permitida");
            }
            int divisao = A/B;
            System.out.println("O resultado da divisão é: " +divisao);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Valor informado não numerico");
        } finally {
            System.out.println("finally");
        }
        System.out.println("fim");

    }

}
