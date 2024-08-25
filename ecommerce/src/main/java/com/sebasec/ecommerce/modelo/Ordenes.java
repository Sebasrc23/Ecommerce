package com.sebasec.ecommerce.modelo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ordenes")
public class Ordenes {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private int usuario_id;
    private LocalDate fechacreacion;
    private int estado;


    public Ordenes(int id, int usuario_id, LocalDate fechacreacion, int estado) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.fechacreacion = fechacreacion;
        this.estado = estado;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return this.usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public LocalDate getFechacreacion() {
        return this.fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public int getEstado() {
        return this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
}
