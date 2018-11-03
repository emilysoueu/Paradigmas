/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaingressos;

/**
 *
 * @author emilysoueu
 */
public class CamaroteSuperior extends CamaroteInferior{
   private double Valor, adicional;
    
   public CamaroteSuperior(double valor, double adicional){
       super(valor);
       this.adicional = adicional;       
   }
   
   public double getAdicional(){
       return this.adicional;
   }
}
