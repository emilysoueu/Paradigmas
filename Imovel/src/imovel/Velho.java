package imovel;

/**
 * @author emilysoueu
 */
public class Velho extends Imovel{
    private double desconto;
    
    public Velho(String a, double b, double desc){
        super(a,b);
        this.desconto = desc;
    }
    
  public double getDesc(){
      return this.desconto;
  }
    
}
