package com.persona;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String telefono;
    
    public Persona(){
        nombre =  "";
        edad = 0;
        estatura = 0.0;
        telefono =  "";
    }   
    
    public Persona(String nom, int edad){
        this.nombre = nom;
        this.edad = edad;
        this.estatura = 0.0;
        this.telefono = "";
    }    
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setEstatura(double estat){
        this.estatura = estat;
    }
    
    public void setTelefono(String tel){
        this.telefono = tel;
    }
 
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public double getEstatura(){
        return estatura;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nEstatura: "+getEstatura()+"\nTelefono: "+getTelefono();
    }
}

    