/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author rafaelmelchert
 */
public class Celula {
    
    private char nome;
    private int canaisDisponiveis;
    private double taxaMediaOcupacao;
    
    public Celula(char nome, int canais) {
        this.nome = nome;
        this.canaisDisponiveis = canais;
    }
    
    public char getNome() {
        return this.nome;
    }
    public void setNome(char nome) {
        this.nome = nome;
    }
    
    public int getCanaisDisponiveis() {
        return this.canaisDisponiveis;
    }
    public void setCanaisDisponiveis(int canaisDisponiveis) {
        this.canaisDisponiveis = canaisDisponiveis;
    }
    
    public double getTaxaMediaOcupacao() {
        return this.taxaMediaOcupacao;
    }
    public void setTaxamediaOcupacao(double taxaMediaOcupacao) {
        this.taxaMediaOcupacao = taxaMediaOcupacao;
    }
    
}
