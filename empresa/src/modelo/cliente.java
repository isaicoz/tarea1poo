/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author adalb
 */
public class cliente extends persona{
    private String nit;
public cliente(){}
    public cliente( String nombre, String apellidos, String direccion, String telefono, String fecha_nacimiento,String nit) {
        super(nombre, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }
    
    

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
    System.out.println("Nombres:  "+ this.getNombre());
    System.out.println("Apellidos:  "+ this.getApellidos());
    System.out.println("Direccion:  "+ this.getDireccion());
    System.out.println("Telefono:  "+ this.getTelefono());
    System.out.println("Fecha nacimiento:  "+ this.getFecha_nacimiento());
    System.out.println("---------------------------------------------");
    }
    
}
