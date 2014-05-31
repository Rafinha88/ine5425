/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Random;

public class GeradorDeChamda {
    
    int probabilidadeDeGerarC1C1;
    int probabilidadeDeGerarC1C2;
    int probabilidadeDeGerarC1FA;
    
    int probabilidadeDeGerarC2C1;
    int probabilidadeDeGerarC2C2;
    int probabilidadeDeGerarC2FA;
    
    Random aleatorio = new Random();
    
    public Chamada gerarChamadaEmC1() {
        double proximoAleatorio = aleatorio.nextDouble();
        Chamada c1;
        
        if(proximoAleatorio < probabilidadeDeGerarC1C1) {
            //chamadac1c1
        }
        if(proximoAleatorio < probabilidadeDeGerarC1C1 + probabilidadeDeGerarC1C2) {
            //chamadac1c2
        }
        
        //chamadac1fa
        
    }
    
    public Chamada gerarChamadaEmC2() {
        double proximoAleatorio = aleatorio.nextDouble();
        Chamada c2;
        
        if(proximoAleatorio < probabilidadeDeGerarC2C1) {
            //chamadac2c1
        }
        if(proximoAleatorio < probabilidadeDeGerarC2C1 + probabilidadeDeGerarC2C2) {
            //chamadac2c2
        }
        
        //chamadac2fa
        
    }
    
    
    
}
