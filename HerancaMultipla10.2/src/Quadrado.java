public class Quadrado extends Quadrilatero{

    float lado;
    public Quadrado(float lado){
        super(lado,lado,lado,lado);
    }
    @Override
    public void calculoPerimetro() {
        super.calculoPerimetro();
    }

    @Override   // pq obriga colocar o metodo da interface?
    public void calculoArea() {
       float area = lado *lado;

    }
}
