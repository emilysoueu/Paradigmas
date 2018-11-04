package imovel;

/**
 * @author emilysoueu
 */
public class Novo extends Imovel {
   private double adicional;
    
    public Novo(String endereco, double valor, double adicional){
        super(endereco,valor);
        this.adicional = adicional;
    }
  
    
   public double getAdd(){
       return this.adicional;
   }
    
}
