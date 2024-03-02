package org.example;

import java.util.ArrayList;
import java.util.List;
/**
 * La clase Contacto permite crear contactos de teléfono con un nombre asociado.
 * @author Veronica
 * @version 2.0
 *
 */
class Contacto {
    /**
     * Nombre del contacto
     */
    private String name;
    /**
     * Lista que almacena números de teléfono
     */
    private List<String> phones;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    /**
     * Crea un nuevo contacto teléfonico o añade un nuevo teléfono a un contacto ya existente.
     * @param name establece el nombre del contacto.
     * @param phone guarda el teléfono correspondiente al nombre del contacto
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }
    /**
     * Devuelve el nombre del contacto
     * @return devuelve el nombre de un contacto.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Devuelve la lista de teléfonos de los contactos.
     * @return devuelve los teléfonos guardados en un contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}