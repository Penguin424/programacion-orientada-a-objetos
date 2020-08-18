package com.figuras;

import com.figura.Figura;

public class Rectangulo extends Figura{
    
    private double base;
    private double altura; 
    
    public Rectangulo(String n, double b, double a){
        super(n);
        this.base = b;
        this.altura = a;
    }
    
    public void setBase(double b){
        this.base = b;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setAltuta(double a){
        this.altura = a;
    }
    
    public double getAltura(){
        return altura;
    } 
    
    @Override
    public double calcularArea(){
       return base*altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return base*2+altura*2;
    }
    
}
