package com.davidrmz.usuarios;

import android.widget.DatePicker;

import static com.davidrmz.usuarios.R.id.datePicker2;

/**
 * Created by David on 22/01/17.
 */

public class DatosIngreso
{
    String nombre;
    String telefono;
    String email;
    String descripUsuario;

    /*public void obtenerFecha()
    {
        DatePicker datePicker2 = (DatePicker)findViewById(R.id.datePicker2);
        int day = datePicker2.getDayOfMonth();
        int month = datePicker2.getMonth() + 1;
        int year = datePicker2.getYear();

    }*/


    public DatosIngreso(String nombre, String telefono, String email, String descripUsuario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.descripUsuario = descripUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripUsuario() {
        return descripUsuario;
    }

    public void setDescripUsuario(String descripUsuario) {
        this.descripUsuario = descripUsuario;
    }
}
