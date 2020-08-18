package com.figuras;

import com.figura.Figura;

public class Circulo extends Figura{
    
    private double radio;
    
    public Circulo(String n, double r){
        super(n);
        this.radio = r;
    }
    
    public void setRadio(double r){
        this.radio = r;
    }
    
    public double getRadio(){
        return radio;
    }
    
    @Override
    public double calcularArea(){
            return Math.PI*Math.pow(radio,2);
        }
    
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
