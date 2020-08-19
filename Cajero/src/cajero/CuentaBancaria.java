package cajero;

public class CuentaBancaria{
    private String nombre;
    private double depositos;
    private double retiros;
    
    public CuentaBancaria(String nombre, double cantidad){
        this.nombre = nombre;
        depositos = cantidad;
    }    
    
    public String getNombre(){
            return nombre;
    }
        
    public double getDepositos(){
            return depositos;
    }
        
    public double getRetiros(){
            return retiros;
    }
    
    public double getSaldo(){
        return depositos-retiros;
    }
    
    public void depositar(double cantidad){
        depositos += cantidad;
    }
    
    public int retirar(double cantidad){
        if(getSaldo()-cantidad <0){
            
            return 0;
        } else {
            this.retiros += cantidad;
            return 1;
        }
    }
}
