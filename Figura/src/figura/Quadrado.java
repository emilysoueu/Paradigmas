package figura;

/**
 * @author emilysoueu
 */
public class Quadrado extends Figura{
    
    public Quadrado(String cor, double lado, boolean filled){
        super(cor,lado,filled);        
    }

    @Override
    public void setArea(double a) {
        double area = 4 * super.getMedida();
        super.setArea(area); 
    }

    @Override
    public void setPerimetro(double newP) {
        double per = (super.getMedida())*(super.getMedida());
        super.setPerimetro(per); 
    }
   
    
}
