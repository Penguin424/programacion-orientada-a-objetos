package com.operaciones;

import com.operacion.Operacion;

public class Division extends Operacion{
    public Division(double n1, double n2){
        super(n1, n2, '/');
        setResultado(n1/n2);
    }
    
}
