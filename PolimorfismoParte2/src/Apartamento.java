public class  Apartamento extends Imovel{

    private boolean temPiscina;

    public float calcularPrecoVenda(){
        if (area > 300 && temPiscina){
            return precoCompra * 1.5f;
        }
        return precoCompra * 1.1f;
    }
}