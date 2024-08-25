package com.sebasec.ecommerce.modelo;

import java.time.LocalDate;

public class estados {
    
    private int idestado;
    private String Descripcion;
    private LocalDate fechacreacion;
    private LocalDate fechamovimiento;
    private boolean activo;


    public estados(int idestado, String Descripcion, LocalDate fechacreacion, LocalDate fechamovimiento, boolean activo) {
        this.idestado = idestado;
        this.Descripcion = Descripcion;
        this.fechacreacion = fechacreacion;
        this.fechamovimiento = fechamovimiento;
        this.activo = activo;
    }



    public int getIdestado() {
        return this.idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LocalDate getFechacreacion() {
        return this.fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public LocalDate getFechamovimiento() {
        return this.fechamovimiento;
    }

    public void setFechamovimiento(LocalDate fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }



}
