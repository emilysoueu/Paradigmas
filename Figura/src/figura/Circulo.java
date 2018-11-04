package figura;

/**
 * @author emilysoueu
 */
public class Circulo extends Figura {
  
   public Circulo(String cor, double raio, boolean filled){
       super(cor,raio,filled);      
   } 

    @Override
    public void setPerimetro(double newp) {
        double per = 2 * (3.14) * super.getMedida();
        super.setPerimetro(per); 
    }

    @Override
    public void setArea(double a) {
        double area = (3.14)*(super.getMedida()*super.getMedida());
        super.setArea(area); 
    }
    
    
 
   
    
}
