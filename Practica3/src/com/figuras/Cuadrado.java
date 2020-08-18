package com.figuras;

import com.figura.Figura;

public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado(String n, double l){
        super(n);
        this.lado = l;
    }
    
    public void setLado(double l){
        this.lado = l;
    }
    
    public double getLado(){
        return lado;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado*2+lado*2;
    }
}
