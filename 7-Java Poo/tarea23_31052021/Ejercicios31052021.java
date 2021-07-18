
package ejercicios31052021;

/**
 * @author Isabel
 */
public class Ejercicios31052021 {

    public static void main(String[] args) {
        // 
//        
//        Cliente cliente1=new Cliente();
//        cliente1.setNombre("Isabel");
//        cliente1.setApellido("Muñoz");
//        cliente1.setSaldoCuenta(50000);
//        System.out.println("El saldo del cliente "+cliente1.getNombre()+" "+cliente1.getApellido()+" es "+ cliente1.getSaldoCuenta());
//   
//        Cajero cajero1=new Cajero();
//        cajero1.setIdCajero(1234);
//        cajero1.setUbicación("Carpay 989");
//        cajero1.setSaldo(100000);
//        
//        System.out.println("EL cajero n°"+cajero1.getIdCajero()+" que está ubicado en "+cajero1.getUbicación()+ " tiene un saldo de $"+cajero1.getSaldo());
//        
        
        System.out.println("***************Cajero 2***************");
        Cajero cajero2=new Cajero(5678,"Los apeninos 1070", 10000000);
        System.out.println("El id de cajero 2 es "+cajero2.getIdCajero());  
        System.out.println("La ubicación del cajero 2 es "+cajero2.getUbicación());
        System.out.println("El saldo que tiene cajero 2 es "+cajero2.getSaldo());
                
        
        System.out.println("***************Cliente 2***************");
        Cliente cliente2=new Cliente("Carlos", "González", "15453xxx-x", 1234567890, 500000);
       
        System.out.println("El nombre del cliente 2 es "+cliente2.getNombre());
        System.out.println("El apellido de cliente 2 es "+cliente2.getApellido());
        System.out.println("El run de cliente 2 es "+cliente2.getRun());
        System.out.println("El numero de tarjeta de cliente 2 es "+cliente2.getNumTarjeta());
        System.out.println("El saldo de cliente 2 es "+cliente2.getSaldoCuenta());
    
    }
   
}
