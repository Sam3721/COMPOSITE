
package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */

// agrega productos para la venta

import Component.ProductoAbstracto;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import Component.ProductoAbstracto;
public class Salida {
    private long ordenI;
    private String Cliente;
    //private Calendar fecha;
    //private List productos = new ArrayList();
    
    private List< ProductoAbstracto > productos =new ArrayList<ProductoAbstracto>();
    
    public Salida(long orden, String cliente){
        super();
        this.ordenI=orden;
        this.Cliente=cliente;
    }
    
    public long getorden(){
        
        return ordenI;
        
    }
    
    public void  setorden(long orden){
        
        this.ordenI=orden;
    }
    
    public String getcliente(){
        return Cliente;
    }
    
    public void setcliente(String cliente){
        this.Cliente=cliente;
    }
    
    public List getproductos(){
        
        return productos;
    }
    
    public void setproductos(List productos){
        
        this.productos=productos;
    }
    
    public double getprecio(){
         double pres=0;
        for(ProductoAbstracto sum : productos){
          pres += sum.getprecio();
         }
         return pres;
    }
    
    public void adicionProductos(ProductoAbstracto produ){
       
        productos.add(produ);
    }
    
    
      public void eliminarProductos(ProductoAbstracto produ){
       
        productos.add(produ);
    }   
  
     public void imprimir(){
       NumberFormat formato= new DecimalFormat("####.00");
       System.out.println("\n====================================\nOrden........"  + ordenI);
       System.out.println("Cliente..." + Cliente );
       System.out.println("Productos..........." );
       for(ProductoAbstracto sum : productos){
          System.out.println(sum.getnombre() + "......." + formato.format(sum.getprecio()));
         } ;
         System.out.println();
       System.out.println("Total Compra   :" + formato.format(getprecio()));
     }
        
}// fin lista
