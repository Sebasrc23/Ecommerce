package com.sebasec.ecommerce.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "producto")

public class Producto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String stock;
    private LocalDate fechaingreso;
    private LocalDate fechamovimiento;


    public Producto(int id, String nombre, String descripcion, double precio, String stock, LocalDate fechaingreso, LocalDate fechamovimiento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.fechaingreso = fechaingreso;
        this.fechamovimiento = fechamovimiento;
    }

    

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

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getStock() {
        return this.stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public LocalDate getFechaingreso() {
        return this.fechaingreso;
    }

    public void setFechaingreso(LocalDate fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public LocalDate getFechamovimiento() {
        return this.fechamovimiento;
    }

    public void setFechamovimiento(LocalDate fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", stock='" + getStock() + "'" +
            ", fechaingreso='" + getFechaingreso() + "'" +
            ", fechamovimiento='" + getFechamovimiento() + "'" +
            "}";
    }


}
