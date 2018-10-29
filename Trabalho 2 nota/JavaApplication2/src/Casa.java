
/***
 * @author emilysoue 
 * b) Classe: Casa
Atributos: cor, porta1, porta2, porta3 Método: void pinta(String s), totalDePortas()
int quantasPortasEstaoAbertas(), int totalDePortas()
Para testar, crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as
mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número
de portas abertas.
 */

import java.util.ArrayList;

public class Casa {
    private String cor;
	ArrayList<Porta> listaPortas;


	public Casa(String cor){
		this.listaPortas = new ArrayList<>();
		this.cor = cor;
	}

	public void addPorta(boolean aberta, String cor,	double dimensaoX, double dimensaoY, double dimensaoZ){
		if(listaPortas.size()<3){
			this.listaPortas.add(new Porta(aberta, cor, dimensaoX, dimensaoY, dimensaoZ));
			System.out.println("Adicionado com sucesso");
			//System.out.println(listaPortas.size());
		}else{
			System.out.println("Limite de portas atingido");
		}		
	}

	public int totalDePortas(){
		return this.listaPortas.size();
	}

	public String getCor(){
		return this.cor;
	}

	public void pintar(String s){
		this.cor = s;
	}

	public int qtdPortasAbertas(){
		int count=0;
		for(Porta aux : listaPortas){
			if(aux.estaAberta()==true){
				count ++;
			}
		}
		//System.out.println("Numero de portas abertas: "+ count);
		return count;		
	}


	public void fecharPortaN(int n){
		listaPortas.get(n-1).fecha();
	}

	public void abrirPortaN(int n){
		listaPortas.get(n-1).abre();
	}

	public void pintarPortaN(int n, String c){
		listaPortas.get(n-1).pinta(c);
	}

	public void descricaoCasa(){
		System.out.println("Cor da casa: "+ this.cor+", Qtd. Portas Abertas:"+ qtdPortasAbertas());
	}	

	public void descricaoPortaN(int n){
		listaPortas.get(n-1).descreverPorta();
	}

	public void descricaoUltimaPorta(){
		listaPortas.get(listaPortas.size()-1).descreverPorta();
	}

	public void descricaoAllPortas(){
		for(Porta aux : listaPortas){
			aux.descreverPorta();
		}
	}

	public void editarLargura(int n, double valor){
		listaPortas.get(n-1).setX(valor);
	}

	public void editarAltura(int n, double valor){
		listaPortas.get(n-1).setY(valor);
	}

	public void editarEspessura(int n, double valor){
		listaPortas.get(n-1).setZ(valor);
	}
	
    
}
