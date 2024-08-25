package com.sebasec.ecommerce.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String correo;
    private String Contraseña;
    private int rol;


    public Usuario(String nombre,String correo,String contraseña,int rol){
        super();
        this.nombre=nombre;
        this.correo=correo;
        this.Contraseña=contraseña;
        this.rol=rol;
    }

//getter and setters


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return this.Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getRol() {
        return this.rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", Contraseña='" + getContraseña() + "'" +
            ", rol='" + getRol() + "'" +
            "}";
    }


}
