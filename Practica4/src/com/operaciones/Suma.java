package com.operaciones;

import com.operacion.Operacion;

public class Suma extends Operacion{
    
    public Suma(double n1, double n2){
        super(n1, n2, '+');
        setResultado(n1+n2);
    }
}
