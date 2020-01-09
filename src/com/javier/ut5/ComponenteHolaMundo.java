package com.javier.ut5;

import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.control.Label;

public class ComponenteHolaMundo extends Label {

    private StringProperty nombre;

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    //para escribir todos los constructores rapidamente, alt+insert, selecciono todos los que me aparezcan (aunque no vaya a usarlos todos) y luego hago click en select none

    public ComponenteHolaMundo() {
    }

    public ComponenteHolaMundo(String s) {
        super(s);
    }

    public ComponenteHolaMundo(String s, Node node) {
        super(s, node);
    }


    /**
     * Este método saluda utilizando el nombre que tiene como propiedad
     */
    public void saluda() {
        if (nombre == null || "".equals(nombre))
            throw new RuntimeException("El nombre no puede estar vacío"); //las excepciones salen directamente del método, así que no hace falta poner un else

        setText("Hola mundo " + this.nombre);
    }
}
