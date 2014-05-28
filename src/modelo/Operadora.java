/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import org.apache.commons.math3.distribution.*;


/**
 *
 * @author rafaelmelchert
 */
public class Operadora {
    
    //estatiscas para serem coletadas
    int chamadasCompletadas;
    int chamadaPerdidaC1;
    int chamadaPerdidaC2;
    int chamadaPerdidaFA;
    
    private RealDistribution funcaoDeProbabilidadeDuracaoDasChamadas;
    
    
    public void setFuncaoDeProbabilidade(String funcaoDeProbabilidade,double parametro1, double parametro2, double parametro3) {
        switch(funcaoDeProbabilidade) {
            case "Normal" : this.funcaoDeProbabilidadeDuracaoDasChamadas = new NormalDistribution(parametro1, parametro2);
                break;
            case "Uniforme" : this.funcaoDeProbabilidadeDuracaoDasChamadas = new UniformRealDistribution(parametro1, parametro2);
                break;
            case "Exponencial" : this.funcaoDeProbabilidadeDuracaoDasChamadas = new ExponentialDistribution(parametro1);
                break;
            case "Triangular" : this.funcaoDeProbabilidadeDuracaoDasChamadas = new TriangularDistribution(parametro1, parametro2, parametro3);
                break;
            case "Constante" :
        }
    }
    
    
    
}
