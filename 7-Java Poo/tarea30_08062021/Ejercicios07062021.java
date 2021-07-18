package ejercicios07062021;

/**
 *
 * @author Isabel
 */
public class Ejercicios07062021 {

    public static void main(String[] args) {
        
        Juguera juguera1=new Juguera();
        juguera1.setEncender(true);
        juguera1.setPrecio(20000);
        System.out.println("El precio de la juguera es "+juguera1.getPrecio());
        
        
        Refrigerador refri=new Refrigerador();
        refri.setConsumoElectrico(150);
        System.out.println("El precio del refrigerador es "+refri.getConsumoElectrico()+" kw");
        
        Televisor tele=new Televisor();
        tele.setSmartTv(true);
        System.out.println("El televisor es Smart TV? "+tele.isSmartTv());
        
        
        
    }
    
}
