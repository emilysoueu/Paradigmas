package arrayescritaunica;
import java.util.Scanner;
/**
 *
 * @author emilysoueu
 */
public class Main {
    public static void main(String[] args){
        int x, pos, i;
        ArrayEscritaUnica a = new ArrayEscritaUnica();
        
        Scanner in = new Scanner(System.in);

        for(i=0; i<=3; i++){
            a.addArray(i);
        }
        for(i=0; i<=3; i++){
            System.out.println("Meu array -> "+a.getArray(i));
            System.out.println("Meu array de controle = "+a.estadoCpy(i));
        }
        
        do{
            System.out.println("Informe o indice para alterar: ");      
            pos = in.nextInt();
            if (a.estadoCpy(pos) == 0){
               System.out.println("Informe o novo valor: ");      
               x = in.nextInt();
               a.escrever(x,pos);
           }else{
                System.out.println("Erro: indice ja foi alterado");
           }

            for(i=0; i<=3; i++){
               System.out.println("Meu array -> "+a.getArray(i));
               System.out.println("Meu array de controle = "+a.estadoCpy(i));
           }
        }while(pos < a.myarray.size());
   }
}

    
    
