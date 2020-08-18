package com.persona;

public abstract class Persona {
    
    private String nombre;  
    private int edad;
    private String genero;
    
    public Persona(String n, int e, String g){
        nombre = n;
        edad = e;
        genero = g;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
     
    public String getgenero(){
        return genero;
    }
    
     public void setNombre(String n){
        this.nombre = n;
    }
    
     public void setEdad(int e){
        this.edad = e;
     }
     
    public void setGenero(String g){
        this.genero = g;
    }
     
    public abstract String trabaja();
}
