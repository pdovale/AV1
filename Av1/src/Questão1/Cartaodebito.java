package Questão1;

public class Cartaodebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public Cartaodebito(String dataHoraPagamento, int numeroPagamento, double valorPago,
                        String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() +
                "\nNúmero Questão1.Pagamento: " + getNumeroPagamento() +
                "\nValor Pago: " + getValorPago() +
                "\nNúmero Cartão: " + numCartao +
                "\nTitular Cartão: " + titularCartao;
    }
}
