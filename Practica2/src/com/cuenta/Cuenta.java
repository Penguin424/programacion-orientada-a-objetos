package com.cuenta;

public class Cuenta {
    
    private String nombre;
    private String tipo;
    private double saldo;
    
    public Cuenta(){
        this.nombre = "";
        this.tipo = "";
        this.saldo = 0.0;
    }
    
    public Cuenta(String n, String t, double c){
        this.nombre = n;
        this.tipo = t;
        this.saldo = c;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setTipo(String t){
        this.tipo = t;   
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double cantidad){
        
        saldo += cantidad;
    }
    
    public int retirar(double cantidad){
        
        if(saldo >= cantidad)
        {           
            saldo -= cantidad;
            return 1;
        } 
        else 
        {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Nombre del cliente: "+getNombre()+"\nTipo de cuenta: "+getTipo()+"\nSaldo actual: "+getSaldo();
    }
}
