package br.com.pratica2.questao1;

public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    public void darBaixa(int qtde){
        this.qtdAtual = qtdAtual - qtde;
    }
    public String mostra(){
        return this.nome + " " +this.qtdMinima +" " +qtdAtual;
    }

    public boolean precisaRepor(){
        if (qtdAtual <= qtdMinima){
            return true;
        }
        else return false;
    }


}
