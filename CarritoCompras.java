
package carritocompras;

import java.util.Scanner;


public class CarritoCompras {

    public static Scanner s = new Scanner(System.in);
        public static void main(String[] args) {
     int cantidad=1;
     double precioTotalProd;
      
     Producto P1 = new Producto();
     System.out.println("Ingresar cantidad a comprar ");
        cantidad= Integer.parseInt(s.nextLine());
        while(P1.stock < cantidad || cantidad<1){
            if(P1.stock < cantidad){
         System.out.println("Supera el stock");}
          System.out.println("Ingresar cantidad a comprar");
          cantidad= Integer.parseInt(s.nextLine());
     
       }
        precioTotalProd=P1.precioprod*cantidad;
        System.out.println("Precio Total:" + precioTotalProd);
           
        }
     
    }
    

