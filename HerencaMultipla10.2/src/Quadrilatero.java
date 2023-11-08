public abstract class Quadrilatero implements FormaGeometrica{
    float ladoA;
    float ladoB;
    float ladoC;
    float ladoD;

    public Quadrilatero(float ladoA, float ladoB, float ladoC, float ladoD) {  //No construtor da classe Quadrilatero, os valores dos lados são definidos com base nos argumentos passados ao criar uma instância da classe. Esses valores são armazenados como atributos da instância e podem ser usados para calcular o perímetro da forma.
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    @Override
    public void calculoPerimetro() {
       float perimetro = ladoA + ladoB + ladoC + ladoD;//Os lados são definidos como atributos da classe abstrata Quadrilatero. Isso significa que eles fazem parte da estrutura da classe e são acessíveis em qualquer método da classe, incluindo o construtor.
        System.out.println("O cálculo do perímetro é "+ perimetro);

    }
}
