public class Retangulo extends Quadrilatero{

    protected float base;
    protected float altura;

    public Retangulo(float base, float altura) {
        super(base,altura,base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calculoPerimetro() {
        super.calculoPerimetro();
    }

    @Override
    public void calculoArea() {
        float area = base*altura;
        System.out.println("Área: "+area);

    }

}
