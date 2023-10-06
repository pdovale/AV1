package Questão1;

import Questão1.Pagamento;

public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "Data/Hora: " + getDataHoraPagamento() +
                "\nNúmero Questão1.Pagamento: " + getNumeroPagamento() +
                "\nValor Pago: " + getValorPago() +
                "\nComprovante Transação Questão1.Pix: " + comprovanteTransacaoPix;
    }
}