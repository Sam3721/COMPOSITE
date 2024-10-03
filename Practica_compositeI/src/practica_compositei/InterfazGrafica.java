
package practica_compositei;

/**
 *
 * @author jorge malaver
 */

import Component.ProductoAbstracto;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import Component.ProductoAbstracto;
import ProductosConcretos.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class InterfazGrafica {
    private JFrame frame;
    private JTextArea textArea;
    private JTextField nombreField, precioField, marcaField;
    private JButton agregarSimpleBtn, agregarCompuestoBtn, imprimirBtn;
    
    private List<ProductoAbstracto> productos = new ArrayList<>();
    
    public InterfazGrafica() {
        frame = new JFrame("Gestión de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));
        
        nombreField = new JTextField("Nombre del Producto");
        precioField = new JTextField("Precio del Producto");
        marcaField = new JTextField("Marca (si aplica)");
        
        agregarSimpleBtn = new JButton("Agregar Producto Simple");
        agregarCompuestoBtn = new JButton("Agregar Producto Compuesto");
        imprimirBtn = new JButton("Imprimir Productos");
        
        textArea = new JTextArea();
        
        panel.add(nombreField);
        panel.add(precioField);
        panel.add(marcaField);
        panel.add(agregarSimpleBtn);
        panel.add(agregarCompuestoBtn);
        panel.add(imprimirBtn);
        panel.add(new JScrollPane(textArea));
        
        frame.add(panel);
        
        // Acciones para los botones
        agregarSimpleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                double precio = Double.parseDouble(precioField.getText());
                String marca = marcaField.getText();
                ProductoSimple producto = new ProductoSimple(nombre, precio, marca);
                productos.add(producto);
                textArea.append("Producto simple agregado: " + nombre + "\n");
            }
        });
        
        agregarCompuestoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                ProductosCompuestos compuesto = new ProductosCompuestos(nombre);
                for (ProductoAbstracto producto : productos) {
                    compuesto.SumProductos(producto);
                }
                productos.clear(); // Limpiar la lista de productos simples después de agregar al compuesto
                productos.add(compuesto);
                textArea.append("Producto compuesto agregado: " + nombre + "\n");
            }
        });
        
        imprimirBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("\nDetalles de Productos:\n");
                for (ProductoAbstracto producto : productos) {
                    textArea.append("Nombre: " + producto.getnombre() + ", Precio: " + producto.getprecio() + "\n");
                }
            }
        });
        
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazGrafica();
            }
        });
    }
}

