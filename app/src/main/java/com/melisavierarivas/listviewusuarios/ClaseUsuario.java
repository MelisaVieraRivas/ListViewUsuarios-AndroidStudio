package com.melisavierarivas.listviewusuarios;

import java.io.Serializable;
import java.util.Date;

public class ClaseUsuario implements Serializable {
    private int imagen;
    private String nombre;
    private String apellido;
    private String numero;
    private String email;
    private String fechaNacimiento;
    private String comentarios;


public ClaseUsuario(int imagen, String nombre, String apellido, String numero, String email, String fechaNacimiento, String comentarios){

    this.imagen=imagen;
    this.nombre=nombre;
    this.apellido=apellido;
    this.numero=numero;
    this.email=email;
    this.fechaNacimiento=fechaNacimiento;
    this.comentarios=comentarios;

}
    public int getImagen(){
        return imagen;
    }
    public void setImagen(int imagen){
        this.imagen=imagen;
    }
    public String getNombre(){
    return nombre;
}
    public void setNombre(String nombre){
    this.nombre=nombre;
}
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    public String getComentarios(){
        return comentarios;
    }
    public void setComentarios(String comentarios){
        this.comentarios=comentarios;
    }
}