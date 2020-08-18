package com.profesiones;

import com.persona.Persona;

public class Doctor extends Persona{
    private String especialidad;
    
    public Doctor(String n, int e, String g, String esp){
        super(n, e, g);
        this.especialidad = esp;
    }
    
    public void setEspecialidad(String esp){
        this.especialidad = esp;
    }
    
    public String getEspecilidad(){
        return especialidad;
    }
    
    @Override
    public String trabaja(){
        return "El (la) doctor(a) "+getNombre()+" antiende y consulta pacientes dentro de la especialidad de "+getEspecilidad()+"\n";
    }
    
}
