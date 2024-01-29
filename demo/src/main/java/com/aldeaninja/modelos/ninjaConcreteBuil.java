package com.aldeaninja.modelos;

import com.aldeaninja.Ninja.Ninja;

public class ninjaConcreteBuil  implements ninjaBuilder {
    private Ninja elNinja = new Ninja("", 0, "");

    @Override
    public ninjaBuilder id (int id) {
        elNinja.setId(id);
        return this;
    }

    @Override
    public ninjaBuilder nombreNinja(String nombreNinja) {
        elNinja.setNombreNinja(nombreNinja);
        return this;
    }

    @Override
    public ninjaBuilder rangoNinja(int rangoNinja) {
        elNinja.setRango(rangoNinja);
        return  this;
    }

    @Override
    public ninjaBuilder aldea(String aldea) {
        elNinja.setAldea(aldea);
        return this;
    }

    @Override
    public Ninja build() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'build'");
    }

}
