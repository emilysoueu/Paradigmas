
/**
 * @author emilysoueu * 
 * a) Classe: Porta
Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
Métodos: void abre(), void fecha(), void pinta(String s), boolean estaAberta()
Para testar, crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas
dimensões e use o método estaAberta para verificar se ela está aberta.
 */
public class Porta {
	private boolean aberta; // informa se a porta está aberta ou nao
	private String cor;     //guarda a cor da porta
	private double dimensaoX; // altura da porta
	private double dimensaoY; // largura da porta
	private double dimensaoZ; // espessura da porta

	public Porta(boolean aberta, String cor,double dimensaoX, double dimensaoY, double dimensaoZ){
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX =dimensaoX;
		this.dimensaoY =dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	public void abre(){
		this.aberta = true;
		System.out.println("Porta aberta com sucesso");
	}

	public void fecha(){
		this.aberta = false;
		System.out.println("Porta fechada com sucesso");
	}


	public void setX(double x){
		this.dimensaoX = x;
	}

	public void setY(double y){
		this.dimensaoY = y;
	}

	public void setZ(double z){
		this.dimensaoZ = z;
	}

	public double getX(){
		//System.out.println(this.dimensaoX);
		return this.dimensaoX;
	}

	public double getY(){
		//System.out.println(this.dimensaoY);
		return this.dimensaoY;
	}

	public double getZ(){
		//System.out.println(this.dimensaoZ);
		return this.dimensaoZ;
	}

	public boolean estaAberta(){
		return this.aberta;
	}

	public void pinta(String s){		
		this.cor = s;		
		System.out.println("Porta pintada com sucesso na cor:" + this.cor);
	}	

	public String getCor(){
		return this.cor;
	}

	public void descreverPorta(){
		System.out.println("Cor da porta: "+ this.cor+", Altura:"+ getY()+", Largura:"+ getX()+", Espessura:"+ getZ()+", Estado:"+ estaAberta());
	}

}
    
