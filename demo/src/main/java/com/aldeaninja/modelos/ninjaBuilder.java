package com.aldeaninja.modelos;

import com.aldeaninja.Ninja.Ninja;

public interface ninjaBuilder {
    ninjaBuilder id (int id);
    ninjaBuilder nombreNinja (String nombreNinja);
    ninjaBuilder rangoNinja(int rangoNinja);
    ninjaBuilder aldea (String aldea);
    Ninja build();

    
}
