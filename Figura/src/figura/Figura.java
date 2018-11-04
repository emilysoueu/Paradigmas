package figura;

/**
 * @author emilysoueu
 */
public class Figura {
    private  String cor;
    private double medida; // raio ou lado
    private boolean filled;
    private double perimetro;
    private double area;
    
    public Figura(String cor, double medida, boolean filled){
        this.cor = cor;
        this.medida = medida;
        this.filled = filled;        
    }     
    public double getMedida(){
        return this.medida;
    }
    
    public double getP(){
        return this.perimetro;
    }
    
    public double getA(){
        return this.area;
    }
    
    public String getCor(){
        return this.cor;
    }
    public boolean getFilled(){
        return this.filled;
    }
    
    public void setPerimetro(double newP){
        this.perimetro = newP;
    } 
    
    public void setArea(double a){
        this.area = a;
    }
    
}
