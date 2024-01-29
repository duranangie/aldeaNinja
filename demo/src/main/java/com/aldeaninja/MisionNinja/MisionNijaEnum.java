package com.aldeaninja.MisionNinja;

public enum MisionNijaEnum {
    
/*se ingresa el estado de ninja */

disponible("disponible para esta mision"),
completado ("ya completo esta mision");

private String descripcion;

private MisionNijaEnum(String descripcion) {
    this.descripcion = descripcion;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}



}
