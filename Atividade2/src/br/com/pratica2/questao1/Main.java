package br.com.pratica2.questao1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Abacate",10,1);
        estoque1.darBaixa(1);
        System.out.println(estoque1.mostra());

    }
}