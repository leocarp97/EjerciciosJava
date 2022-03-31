package com.estancias.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Estancia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String huesped;

    private String fechaDesde;

    private String fechaHasta;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Casa casa;

    public Estancia() {
    }

    public Estancia(String id, String huesped, String fechaDesde, String fechaHasta, Cliente cliente, Casa casa) {
        this.id = id;
        this.huesped = huesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.cliente = cliente;
        this.casa = casa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Estancia{" + "id=" + id + ", huesped=" + huesped + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", cliente=" + cliente + ", casa=" + casa + '}';
    }

   
    
    
}
