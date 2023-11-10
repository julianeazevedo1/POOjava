public class Casa extends Imovel{

    private boolean temQuintal;

    public float calcularPrecoVenda(){

        if (qtdQuartos > 4 || temQuintal){
            return precoCompra * 1.3f;
        }
        return precoCompra * 1.15f;
    }

}
