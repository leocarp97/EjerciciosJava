
package estancias.entidades;


public class Casa {
    
    private int id_casa;
    private String calle;
    private int numero;
    private int codigo_postal;
    private String ciudad;
    private String pais;
    private String fecha_desde;
    private String fecha_hasta;
    private int tiempo_minimo;
    private int tiempo_maximo;
    private double precio_habitacion;
    private String tipo_vivienda;
    private Comentario come;

    public Casa() {
    }

    public Casa(int id_casa, String calle, int numero, int codigo_postal, String ciudad, String pais, String fecha_desde, String fecha_hasta, int tiempo_minimo, int tiempo_maximo, double precio_habitacion, String tipo_vivienda) {
        this.id_casa = id_casa;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.tiempo_minimo = tiempo_minimo;
        this.tiempo_maximo = tiempo_maximo;
        this.precio_habitacion = precio_habitacion;
        this.tipo_vivienda = tipo_vivienda;
    }

    public int getId_casa() {
        return id_casa;
    }

    public void setId_casa(int id_casa) {
        this.id_casa = id_casa;
    }

    public String getCalle() {
        return calle;
    }

    public Comentario getCome() {
        return come;
    }

    public void setCome(Comentario come) {
        this.come = come;
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

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
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

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getTiempo_minimo() {
        return tiempo_minimo;
    }

    public void setTiempo_minimo(int tiempo_minimo) {
        this.tiempo_minimo = tiempo_minimo;
    }

    public int getTiempo_maximo() {
        return tiempo_maximo;
    }

    public void setTiempo_maximo(int tiempo_maximo) {
        this.tiempo_maximo = tiempo_maximo;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public String getTipo_vivienda() {
        return tipo_vivienda;
    }

    public void setTipo_vivienda(String tipo_vivienda) {
        this.tipo_vivienda = tipo_vivienda;
    }

    @Override
    public String toString() {
        return "Casa{" + "id_casa=" + id_casa + ", calle=" + calle + ", numero=" + numero + ", codigo_postal=" + codigo_postal + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha_desde=" + fecha_desde + ", fecha_hasta=" + fecha_hasta + ", tiempo_minimo=" + tiempo_minimo + ", tiempo_maximo=" + tiempo_maximo + ", precio_habitacion=" + precio_habitacion + ", tipo_vivienda=" + tipo_vivienda + ", come=" + come + '}';
    }

  
    
    
}