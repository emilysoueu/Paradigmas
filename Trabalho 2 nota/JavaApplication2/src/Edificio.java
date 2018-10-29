
/** *
 * @author emilysoueu
 * c) Classe: Edificio
 * Atributos: cor, totalDePortas, totalDeAndares, portas[]
Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), void adicionaPorta(Porta p),
int totalDePortas(), void adicionarAndar(), int totalDeAndares()
Para testar, crie um edifício, pinte-o. Crie seis portas e coloque-as no edifício através do
método adicionaPorta, abra e feche-as como desejar. Utilize o método
quantasPortasEstaoAbertas para imprimir o número de portas abertas e o método
totalDePortas para imprimir o total de portas em seu edifício. Cria alguns andares utilizado o
método adicionarAndar e retorne o número total de andares utilizando o método
totalDeAndares.
 */
import java.util.ArrayList;

public class Edificio {
   private String corEd;
   private int totalPortasEd;
   private int totalAndares;
    private ArrayList <Porta> portasEd;
    
    public Edificio(String corEd){
       this.corEd = corEd;
       this.portasEd = new ArrayList<>();
    }
    
    public String getCorEd(){
        return corEd;
    }
    
    public void adicionaPorta(Porta p){
        this.portasEd.add(p);
    }
    
    // abrir Porta
    public void abrirPortaEd(int x){
        this.portasEd.get(x-1).abre();
    }
    
    //fechar Porta
    public void fecharPortaEd(int x){
        this.portasEd.get(x-1).fecha();
    }
    //quntas portas estão abertas
    public int qtdPortasAbertas(){
		int count=0;
		for(Porta aux : portasEd){
			if(aux.estaAberta()==true){
				count ++;
			}
		}
		//System.out.println("Numero de portas abertas: "+ count);
		return count;		
	}
    
    //quntas portas estão abertas
    public int qtdPortasFechadas(){
		int count=0;
		for(Porta aux : portasEd){
			if(aux.estaAberta()==false){
				count ++;
			}
		}
		//System.out.println("Numero de portas abertas: "+ count);
		return count;		
	}
    
    //total de Portas    
    public int totalPortas(){
        return this.portasEd.size();
    }
    
    
    
}
