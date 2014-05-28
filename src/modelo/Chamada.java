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
public class Chamada {
    
    private Celula celulaOrigem;
    private Celula celulaDestino;
    private long duracao;
    private long tempoEmQueSeRealizou;
    private EstadoDeFinalizacao;
    
    public Celula getCelulaOrigem() {
        return this.celulaOrigem;
    }
    public void setCelulaOrigem(Celula origem) {
        this.celulaOrigem = origem;
    }
    
    public Celula getCelulaDestino() {
        return this.celulaDestino;
    }
    public void setCelulaDestino(Celula destino) {
        this.celulaDestino = destino;
    }
    
    public long getDuracao() {
        return this.duracao;
    }
    public void setDuracao(long duracao) {
        this.duracao = duracao;
    }
    
    public long getTempoQueSeRealizou() {
        return this.tempoEmQueSeRealizou;
    }
    public void setTempoQueSeRealizou(long tempoQueSeRealizou) {
        this.tempoEmQueSeRealizou = tempoQueSeRealizou;
    }
            
    
    
    
    
}
