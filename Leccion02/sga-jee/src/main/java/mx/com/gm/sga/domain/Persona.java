/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.domain;
import java.io.Serializable;


/**
 *
 * @author Tata
 */
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private int idPersona;
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String email;
    private String telefono;
    
    public Persona(){}
    
    public Persona(int idPersona, String nombre, String apePaterno, String apeMaterno, String email, String telefono){
        super();
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.email = email;
        this.telefono = telefono;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
    public void setIdPesona(int idPersona){
        this.idPersona = idPersona;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApePaterno(){
        return this.apePaterno;
    }
    
    public void setApePaterno(String apePaterno){
        this.apePaterno = apePaterno;
    }
    
    public String getApeMaterno(){
        return this.apeMaterno;
    }
    
    public void setApeMaterno(String apeMaterno){
        this.apeMaterno = apeMaterno;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail (String Email){
        this.email = email;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return "Persona [idPersona="+idPersona+", nombre="+nombre+", apePaterno="+apePaterno+", apeMaterno="+apeMaterno+", email="+email+", telefono="+telefono+"]";
     }
}