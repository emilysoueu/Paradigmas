package figura;

/**
 * @author emilysoueu
 */
public class Main {
    public static void main(String[] args){
        Figura f = new Figura("null", 0, false);
        Circulo c = new Circulo("azul ",1,true);
        Quadrado q = new Quadrado("branco ", 2, false);
        
        q.setArea(0);
        q.setPerimetro(0);
        c.setArea(0);
        c.setPerimetro(0);

        System.out.println("---------Circulo-------");
        System.out.println("Cor: "+ c.getCor());
        System.out.println("Area: " +c.getA());
        System.out.println("Perimetro: "+ c.getP());
        System.out.println("Filled: " + c.getFilled());
        
        System.out.println("---------Quadrado-------");
        System.out.println("Cor: "+ q.getCor());
        System.out.println("Area: " +q.getA());
        System.out.println("Perimetro: "+ q.getP());
        System.out.println("Filled: " + q.getFilled());

    
    System.out.println(q.getA());
        
    }
    
}
