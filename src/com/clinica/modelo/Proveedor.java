package com.clinica.modelo;
// Generated 10/12/2013 08:31:04 AM by Hibernate Tools 3.6.0



/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String direccion;
     private String telefono;
     private String rfc;

    public Proveedor() {
    }

    public Proveedor(String nombre, String direccion, String telefono, String rfc) {
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.rfc = rfc;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }




}


