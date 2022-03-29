package jpa.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mascotitas")
public class Mascota implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    
    private String nombre;
    
    @Column(name = "color_de_pelo", length = 400)
    private String colorDePelo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta; //FECHA_ALTA

    public Mascota(String id, String colorDePelo, Date fechaAlta) {
        this.id = id;
        this.colorDePelo = colorDePelo;
        this.fechaAlta = fechaAlta;
    }

    public Mascota() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", colorDePelo=" + colorDePelo + ", fechaAlta=" + fechaAlta + '}';
    }
    
   
    
}
