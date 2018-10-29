/**  @author emilysoueu
 * c) Classe: Edificio
 * Atributos: cor (edificio), totalDePortas(por andar), totalDeAndares(tamanho da lista), portas[]
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
public class Andar {
    private ArrayList <Andar> andarEd;
   
    
    public Andar(){
        this.andarEd = new ArrayList<>();
    }
    
    public void addAndar(){
        this.andarEd.add(new Andar());
    }
    
    public int totalDeAndares(){ 
        return this.andarEd.size();
    }
    

    
}
