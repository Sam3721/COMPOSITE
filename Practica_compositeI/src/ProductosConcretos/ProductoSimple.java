
package ProductosConcretos;

/**
 *
 * @author jorge malaver
 */
import Component.ProductoAbstracto;

public class ProductoSimple extends ProductoAbstracto{
    
    String marca; //atributos de la marca
    double precio; //atributos de la marca
    public ProductoSimple(String nom, double pres, String marca) {
        
        //Constructor
        
        super(nom, pres);
        this.marca=marca;
        this.precio=pres;
    }
    @Override
    public double getprecio(){
        return precio;
    }
            
    @Override
    public void setprecio(double pres){
        
        this.precio=pres;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String mar){
        
        this.marca=mar;
    }
} // fin clase ProductoSimple se adiciona un nuevo atributo llamado marca
