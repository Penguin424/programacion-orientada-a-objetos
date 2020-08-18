package com.operaciones;

import com.operacion.Operacion;

public class Resta extends Operacion{
    
    public Resta(double n1, double n2){
        super(n1, n2, '-');
        setResultado(n1-n2);
    }
    
}
