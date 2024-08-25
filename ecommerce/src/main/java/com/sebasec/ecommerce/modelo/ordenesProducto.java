package com.sebasec.ecommerce.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ordenesproducto")
public class ordenesProducto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int orden_id;
    private int producto_id;
    private double cantidad;


    public ordenesProducto(int orden_id, int producto_id, double cantidad) {
        this.orden_id = orden_id;
        this.producto_id = producto_id;
        this.cantidad = cantidad;
    }


    public int getOrden_id() {
        return this.orden_id;
    }

    public void setOrden_id(int orden_id) {
        this.orden_id = orden_id;
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
    
}
