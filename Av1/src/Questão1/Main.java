package Questão1;

import Questão1.CartaoCredito;
import Questão1.Cartaodebito;

public class Main {
    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito("17-10-2003 10:23", 2213, 20.0,
                "017102003", "Master Card", "Pedro Vale");


        System.out.println("Cupom Fiscal do Cartão de Crédito:\n" + cartaoCredito.imprimirCupomFiscal());


        Pix pix = new Pix("17-10-2003 10:23", 54321, 50.0, true);


        System.out.println("\nCupom Fiscal do Questão1.Pix:\n" + pix.imprimirCupomFiscal());

        Cartaodebito cartaoDebito = new Cartaodebito("2023-10-05 16:00", 98765, 75.0,
                "017102003", "  Cleitin rasta");


        System.out.println("\nCupom Fiscal do Cartão de Débito:\n" + cartaoDebito.imprimirCupomFiscal());
    }
}