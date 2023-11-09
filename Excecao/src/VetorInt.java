import java.util.Scanner;
import java.util.InputMismatchException;
public class VetorInt {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int cont =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valores inteiros ");

        try {
            for (int i = 0; cont < 10; i++) {

                System.out.println("Digite um valor: ");
                int valor = scanner.nextInt();

                if(valor == 0) {
                    numeros[i] = valor;
                    break;
                }else {
                    numeros[i] = valor;
                }

            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ultrapassou os 10 valores permitidos");
        }catch (InputMismatchException e){
            System.out.println("Valor informado não numerico");
        }finally {
            scanner.close();
        }

    }

}
