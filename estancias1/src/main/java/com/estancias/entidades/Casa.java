package com.estancias.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Casa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String calle;
    private int numero;
    private String codPostal;
    private String ciudad;
    private String pais;
    private String fechaDesde;
    private String fechaHasta;
    private int minDias;
    private int maxDias;
    private double precio;
    private String tipoVivienda;
    @OneToOne
    private Comentario comentario;

    public Casa() {
    }

    public Casa(String id, String calle, int numero, String codPostal, String ciudad, String pais, String fechaDesde, String fechaHasta, int minDias, int maxDias, double precio, String tipoVivienda, Comentario comentario) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.minDias = minDias;
        this.maxDias = maxDias;
        this.precio = precio;
        this.tipoVivienda = tipoVivienda;
        this.comentario = comentario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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

    public int getMinDias() {
        return minDias;
    }

    public void setMinDias(int minDias) {
        this.minDias = minDias;
    }

    public int getMaxDias() {
        return maxDias;
    }

    public void setMaxDias(int maxDias) {
        this.maxDias = maxDias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", minDias=" + minDias + ", maxDias=" + maxDias + ", precio=" + precio + ", tipoVivienda=" + tipoVivienda + ", comentario=" + comentario + '}';
    }


    
    }
    
    
    

