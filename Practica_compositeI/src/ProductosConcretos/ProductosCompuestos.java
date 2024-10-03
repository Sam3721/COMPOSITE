
package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */

// agrupacion de productos abstractos (paquete)

import Component.ProductoAbstracto;
import java.util.ArrayList;
import  java.util.List;
public class ProductosCompuestos extends ProductoAbstracto{
    double precio;
    private List< ProductoAbstracto > productos =new ArrayList<ProductoAbstracto>();
    public ProductosCompuestos(String nom ) {
        super(nom, 0);
        
    }
    
    @Override
    public double getprecio(){
           double pres=0;
      for(ProductoAbstracto sum : productos){
          pres += sum.getprecio();
        }
       return pres;
      }
    
    @Override
    public void setprecio(double pres){
         throw new UnsupportedOperationException();
        // no permite establecer un precio (suma de simples y/o compuestos)
    }
    
    public void SumProductos(ProductoAbstracto producto){
        
        this.productos.add(producto);
    }
    
    public boolean quitarProductos(ProductoAbstracto producto){
        
        return this.productos.remove(producto);
    }
}// fin de la clase
