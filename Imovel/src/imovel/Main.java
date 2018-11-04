package imovel;
/**
 * @author emilysoueu
 */
public class Main {
    public static void main(String[] args){
        Imovel i = new Imovel("Cohatrac ",1000);
        Novo n = new Novo("Calhau ",13400,2000);
        Velho v = new Velho("Turu ",13400,400);
        double novo = n.getAdd() + n.getValue();
        double velho = v.getValue() -v.getDesc();
        
       
        System.out.println("Novo -> "+ n.getAdress() + novo );       
        System.out.println("Velho -> "+  v.getAdress() + velho );
    
    }
    
}
