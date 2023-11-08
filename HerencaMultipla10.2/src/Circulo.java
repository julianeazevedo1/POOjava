public class Circulo implements FormaGeometrica{

    float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }


    @Override
    public void calculoPerimetro() {
        float perimetro = (float) (2 * Math.PI * raio);
    }

    @Override
    public void calculoArea() {
        float area = (float) (Math.PI * raio * raio);

    }
}
