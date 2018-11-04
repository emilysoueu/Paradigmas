package imovel;

/**
 * @author emilysoueu
 */
public class Imovel {
    private String endereco;
    private double valor;
    
    public Imovel(String endereco, double valor){
        this.endereco = endereco;
        this.valor = valor;
    }
    
    public String getAdress(){
        return this.endereco;
    }
    public double getValue(){
        return this.valor;
    }
    
}
