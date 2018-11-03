
package vendaingressos;

import java.util.Scanner;
public class VendaIngressos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double normal, vip, inf, sup, add;
        
        System.out.println("Informe o preço do ingresso Normal:");
        normal = in.nextDouble();
        Normal n = new Normal(normal);
        
        System.out.println("Informe o preço do ingresso Vip:");
        vip = in.nextDouble();
        Vip v = new Vip(vip);        
       
        System.out.println("Informe o preço do ingresso Camarote Inferior:");
        inf = in.nextDouble();      
        CamaroteInferior cin = new CamaroteInferior(inf);
         
        System.out.println("Informe o preço do ingresso Camarote Superior:");
        sup = in.nextDouble(); 
        System.out.println("Informe o preço do valor adicional:");
        add = in.nextDouble();
        CamaroteSuperior csu = new  CamaroteSuperior(sup,add);
        double total = csu.imprimeValor()+csu.getAdicional();
        
       System.out.println("Valor Normal: "+n.imprimeValor()); 
       System.out.println("Valor VIP: "+v.imprimeValor());
       System.out.println("Camarote Inferior: "+cin.imprimeValor());
       System.out.println("Camarote Superior + adicional: "+ total);
       
       
    }
    
}
