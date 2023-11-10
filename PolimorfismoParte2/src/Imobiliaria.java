import java.util.ArrayList;

public class Imobiliaria {

    ArrayList<Imovel> imoveis = new ArrayList<>();

    public float calculaMediaPrecoCompra(){
        float soma = 0;
        for (Imovel imovel:imoveis) {
            soma += imovel.precoCompra;
        }
        return soma/imoveis.size();
    }

    public float calculaQtdCasas(){
        float soma = 0;
        for (Imovel imovel:imoveis) {
            if (imovel instanceof Casa){
                soma++;
            }
        }
        return soma;
    }

    public float calculaQtdApartamentos(){
        float soma = 0;
        for (Imovel imovel:imoveis) {
            if (imovel instanceof Apartamento){
                soma++;
            }
        }
        return soma;
    }

    public Imovel calculaMaiorPrecoVenda(){  //calcula e retorna o imóvel de maior pre¸co de venda
        float maior = 0;
        Imovel caro = null;
        for (Imovel imovel:imoveis) {
            if (imovel.calcularPrecoVenda() > maior){
                maior = imovel.calcularPrecoVenda();
                caro = imovel;
            }
        }
        return caro;
    }

}