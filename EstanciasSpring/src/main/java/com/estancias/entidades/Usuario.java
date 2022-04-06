package com.estancias.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String alias;

    private String email;

    private String clave;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String fechaAlta;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String fechaBaja;

    public Usuario() {
    }

    public Usuario(String id, String alias, String email, String clave, String fechaAlta, String fechaBaja) {
        this.id = id;
        this.alias = alias;
        this.email = email;
        this.clave = clave;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", alias=" + alias + ", email=" + email + ", clave=" + clave + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }

}
