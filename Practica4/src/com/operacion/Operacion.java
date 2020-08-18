package com.operacion;

public abstract class Operacion {
    
    private double numero1;
    private double numero2;
    private char operacion;
    private double resultado;
    
    public Operacion(double n1, double n2, char operacion){
        
        numero1 = n1;
        numero2 = n2;
        this.operacion = operacion; 
    }
    
    public void setNumero(double n1){
        this.numero1 = n1;
    }
    
    public double getNumero(){
        return numero1;
    }
    
    public void setNumero2(double n2){
        this.numero2 = n2;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void setResultado(double r){
        this.resultado = r;
    }
    
    public double getResultado(){
        return resultado;
    }
    
    public String mostrarResultado(){
        return (numero1+""+operacion+""+numero2+"="+resultado);
    }
    
}
