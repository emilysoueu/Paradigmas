
package arrayescritaunica;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author emilysoueu
 */
public class ArrayEscritaUnica {
    
    
    ArrayList <Integer>  cpy  = new ArrayList<>();
    ArrayList <Integer>  myarray  = new ArrayList<>();
       
        
        int getArray(int i){        
            int x =  this.myarray.get(i);
            return x; // mostra o valor na posição especificada de x            
        }
        void addArray(int novo){
            this.myarray.add(novo);// adiciona valor no arrya   
            this.cpy.add(0);
        }
        
        void escrever(int valor, int pos){
            myarray.set(pos,valor);
            cpy.set(pos, 1);
        }
        
        int estadoCpy(int i){
            return this.cpy.get(i);
        }
}
        

    

