package com.javier.ut5;

import javafx.scene.Node;
import javafx.scene.control.Label;

public class ComponenteHolaMundo extends Label {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (nombre == null)
            throw new RuntimeException("El nombre no puede estar vacío"); //las excepciones salen directamente del método, así que no hace falta poner un else

        setText("Hola mundo " + this.nombre);
    }
}
