package com.profesiones;

import com.persona.Persona;

public class Empleado extends Persona {
    private String oficio;
    
    
    public Empleado(String n, int e, String g, String o){
        super(n, e, g);
        this.oficio = o;
    }
    
    public void setOficio(String o){
        this.oficio = o;
    }
    
    public String getOficio(){
        return oficio;
    }
    
    @Override
    public String trabaja(){
        return "El (la) C. "+getNombre()+" Labora una jornada de 8 horas desempeñandose como "+getOficio()+"\n";
    }
}