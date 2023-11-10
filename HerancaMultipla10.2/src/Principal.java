import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas formas deseja criar?");
        int numeroFormas = scanner.nextInt();

        FormaGeometrica[]  formas = new FormaGeometrica[numeroFormas];

        for (int i = 0; i < numeroFormas; i++) {
            System.out.print("Escolha o tipo de forma (1 - Retângulo, 2 - Quadrado, 3 - Círculo): ");
            int escolha = scanner.nextInt();


            if(escolha ==1){
                System.out.println("Informe a base: ");
                float base = scanner.nextFloat();
                System.out.println("Informe a altura ");
                float altura = scanner.nextFloat();
                Retangulo retangulo = new Retangulo(base, altura);
                //formas[i] = retangulo;
                retangulo.calculoPerimetro();
                retangulo.calculoArea();
            } else if(escolha==2){
                System.out.println("Informe o lado: ");
                float lado = scanner.nextFloat();
                Quadrado quadrado = new Quadrado(lado);
                quadrado.calculoPerimetro();
                quadrado.calculoArea();
            } else if(escolha==3){
                System.out.println("Informe o raio: ");
                float raio = scanner.nextFloat();
                Circulo circulo = new Circulo(raio);
                circulo.calculoPerimetro();
                circulo.calculoArea();

            }



        }
    }
}