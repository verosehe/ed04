package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * La clase Agenda sirve para guardar contactos de la clase {@link Contacto} nuevos y modificar o eliminar los existentes.
 * @author Veronica
 * @version 2.0
 *
 */
public class Agenda {
    /**
     * Lista de contactos.
     */
    private List<Contacto> contacts; // Lista de Contacto
    /**
     * Crea la lista de contactos en la que se van a almacenar.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }
    /**
     * Comprueba si un contacto es nuevo o ya existía. Si el nombre del contacto es nuevo, lo crea mediante el método
     * {@link Contacto} y lo almacena en la lista de contactos creada en {@link Agenda}.Si existía previamente, le añade únicamente el
     * número de teléfono a dicho nombre.
     * @param name nombre del contacto.
     * @param phone teléfono del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }
    /**
     * Elimina un contacto de la lista de contactos indicandole el nombre.
     * @param name nombre del contacto que se desea eliminar.
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }
    /**
     *  Modifica el teléfono de un contacto indicando el nombre, el teléfono antiguo y aquel por el que se desea cambiar.
     * @param name nombre del contacto del que se desea modificar el número.
     * @param oldPhone número de telefono que está en el contacto y se quiere cambiar.
     * @param newPhone nuevo número de telefono que se quiere sustituir por el antiguo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }
    /**
     *  Obtiene la lista de contactos de una lista.
     * @return devuelve la lista de contactos.
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}