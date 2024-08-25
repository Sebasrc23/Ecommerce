package com.sebasec.ecommerce.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "inventario")

public class Inventario {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private int producto_id;
    private double cantidad;
    private LocalDate fechaActualizacion;



    public Inventario(int id, int producto_id, double cantidad, LocalDate fechaActualizacion) {
        this.id = id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
        this.fechaActualizacion = fechaActualizacion;
    }
    

    //getter and setters


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProducto_id() {
        return this.producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaActualizacion() {
        return this.fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }


}
