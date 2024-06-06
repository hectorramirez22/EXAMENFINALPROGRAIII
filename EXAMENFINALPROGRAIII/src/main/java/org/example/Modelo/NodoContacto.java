package org.example.Modelo;

import java.io.Serializable;

public class NodoContacto implements Serializable {
    private Contacto contacto;
    private NodoContacto izdo;
    private NodoContacto dcho;

    public NodoContacto(Contacto contacto) {
        this.contacto = contacto;
        this.izdo = null;
        this.dcho = null;
    }

    // Getters y Setters
    public Contacto getContacto() {
        return contacto;
    }

    public NodoContacto getIzdo() {
        return izdo;
    }

    public NodoContacto getDcho() {
        return dcho;
    }

    public void setIzdo(NodoContacto izdo) {
        this.izdo = izdo;
    }

    public void setDcho(NodoContacto dcho) {
        this.dcho = dcho;
    }
}

