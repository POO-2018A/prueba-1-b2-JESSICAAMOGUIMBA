/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author ESFOT
 */
public class Fruta {
    private String nombre;
    private int codigo;
    private int precio;
    
   
//constructor
    

    public Fruta() {
    }

    public Fruta(String nombre, int codigo, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    
   //get y set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + '}';
    }

  
    public String imprimir() {
        return "Fruta{" + "nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + '}';
    }
    
    
}
