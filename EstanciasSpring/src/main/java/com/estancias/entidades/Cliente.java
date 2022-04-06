
package com.estancias.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    private String nombre;
    
    private String calle;
    
    private int numero;
    
    private String codPostal;
    
    private String ciudad;
    
    private String pais;
    
    private String email;
    @OneToOne
    private Usuario usuario;

    public Cliente() {
    }

    public Cliente(String id, String nombre, String calle, int numero, String codPostal, String ciudad, String pais, String email, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setCodPostal(String codPosta) {
        this.codPostal = codPosta;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", email=" + email + ", usuario=" + usuario + '}';
    }

   
    
    
    
}
