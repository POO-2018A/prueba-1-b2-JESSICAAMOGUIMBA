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
public class Cliente {
   private String nombre;
   private String cedula;
//constructor

    public Cliente() {
        
    }
   
   
    public Cliente( String cedula) {
        
        this.cedula = cedula;
    }

   
   //get y set
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    @Override
    public String toString() {
        return  cedula ;
    }
    
    
   public String imprimir (){
    return this.cedula;
    }
   
}
