package com.figura;

public abstract class Figura {
    
    private String nombre;
    
    public Figura(String n){
        this.nombre = n;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
