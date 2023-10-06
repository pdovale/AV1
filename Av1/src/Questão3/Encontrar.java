package Questão3;

import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {

        AchadoPerdido itemAchado = new AchadoPerdido("Chave", "Chave encontrada na rua", "Objeto Pessoal", "Disponível");


        itemAchado.completaDados("foto.jpg", "Rua de baixo", "12.10.2025 10:58");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o título a ser buscado: ");
        String tituloBuscado = scanner.nextLine();


        String resultadoBusca = itemAchado.buscarTitulo(tituloBuscado);
        System.out.println(resultadoBusca);


        itemAchado.visualizarDetalhes();
    }
}