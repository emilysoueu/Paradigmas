/**
 * @author emilysoueu
 */
public class Main {
    public static void main(String[] args){
        Porta p = new Porta(false,"preta",10,10,10);
        Porta p1 = new Porta(false,"azul",10,10,10);
        Casa c = new Casa("Branca");
        Andar a = new Andar();
        Edificio e = new Edificio("rosa");

        
        
        p.abre(); // muda estado da porta
        System.out.println("Porta aberta: "+  p.estaAberta());
        
        
       for ( int i=0; i<5; i++){
          a.addAndar();
       }
       
       System.out.println("Quantidade de Andares: "+ a.totalDeAndares());
       
      
          e.adicionaPorta(p);
          e.adicionaPorta(p1);
       
        System.out.println("Quantidade de Portas: "+ e.totalPortas());
        
        //abrir a porta 5
        e.abrirPortaEd(1); // quando eu uso o método abrir porta ele abre todas  as portas        
        System.out.println("Quantidade de Portas abertas: "+ e.qtdPortasAbertas());
        
        //fechar a porta 3
       // e.fecharPortaEd(2); // quando eu uso o método abrir porta ele abre todas  as portas        
       // System.out.println("Quantidade de Portas fechadas: "+ e.qtdPortasFechadas());
       
        c.addPorta(true,"branca",1,1,1);
        c.addPorta(true,"amarela",1,1,1);
        c.addPorta(true,"azul",1,1,1);
       System.out.println("Total de portas da casa: "+ c.totalDePortas());
       
       c.fecharPortaN(2);
       System.out.println("Total de portas abertas da casa: "+ c.qtdPortasAbertas());
        
        
    }
    
    
}