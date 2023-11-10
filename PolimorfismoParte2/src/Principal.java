import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();

        Imovel imovel1 = new Apartamento();
        imovel1.area = 200;
        imovel1.precoCompra = 451235;
        imovel1.qtdQuartos = 4;

        Imovel imovel2 = new Casa();
        imovel2.area = 400;
        imovel2.precoCompra = 854789;
        imovel2.qtdQuartos = 5;

        imoveis.add(imovel1);
        imoveis.add(imovel2);


} }
