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

    public Producto(String nombre,String descripcion,double precio,String stock,LocalDate fechaingreso,LocalDate fechamovimiento)
    {     
    super();
    this.nombre=nombre;
    this.descripcion=descripcion;
    this.precio=precio;
    this.stock=stock;
    this.fechaingreso=fechaingreso;
    this.fechamovimiento=fechamovimiento;
    
    }

    //getters and setters

    public int getid(){
        return id;
    }

    public void setid(int id){
        this.id=id;
    }

    public String getnombre(){
    return nombre;
    }

    public void setnombre(String nombre){
        this.nombre=nombre;
    }

    public String getdescripcion(){
        return descripcion;
    }

    public void setdescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public double getprecio(){
        return precio;
    }

    public void setprecio(double precio){
        this.precio=precio;
    }

    public String getstock(){
        return stock;
    }


    public void setstock(String stock){
        this.stock=stock;
    }

    public LocalDate getfehcaingreso(){
        return fechaingreso;
    }

    public void setfechaingreso(LocalDate fechaingreso){
        this.fechaingreso=fechaingreso;
    }

    public LocalDate getfechamovimiento(){
        return fechamovimiento;
    }

    public void setfechamovimiento(LocalDate fechamovimiento){
        this.fechamovimiento=fechamovimiento;
    }

}
