package com.profesiones;

import com.persona.Persona;

public class Ingeniero extends Persona{
    private String profesion; 

    public Ingeniero(String n, int e, String g, String p){
        super(n, e, g);
        this.profesion = p;
    }
    
    public void setProfesion(String p){
        this.profesion = p;
    }
    
    public String getProfesion(){
        return profesion;
    }
    
    @Override
    public String trabaja(){
        return "El (la)  ingeniero"+getNombre()+" innova, crea y desarrolla nuevas cosas en el campo de la"+getProfesion()+"\n";
    }
}
