/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

/**
 *
 * @author jorge malaver
 */
public abstract class ProductoAbstracto {
    
    String nombre; //atributos del producto
    double precio; //atributos del producto
    
    public ProductoAbstracto(String nom, double pres){
       
        //Constructor
       
        super();
        this.nombre=nom;
        this.precio=pres;
    }
    
    public String getnombre(){
        
        return nombre;
    }
    
    public void setnombre( String nom){
        
        this.nombre=nom;
    }
    
    public double getprecio(){
        
        return precio;
    }
    
    public void setprecio(double pres){
        
        this.precio=pres;
    }
}// fin de la clase definie las caracteristicas del producto
