
package ejercicio3extra.relaciones.entidades;

import java.util.Date;

public class Poliza {
    
    private Cliente cliente;
    private Vehiculo auto;
    private int numeroPoliza;
    private Date fechaInicioPoliza;
    private Date fechaFinPoliza;
    private int cantidadCuotas;
    private String formaDePago;
    private int montoAsegurado;
    private String tipoCobertura;

    public Poliza() {
    }

    public Poliza(Cliente cliente, Vehiculo auto, int numeroPoliza, Date fechaInicioPoliza, Date fechaFinPoliza, int cantidadCuotas, String formaDePago, int montoAsegurado, String tipoCobertura) {
        this.cliente = cliente;
        this.auto = auto;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(Date fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public Date getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(Date fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", auto=" + auto + ", numeroPoliza=" + numeroPoliza + ", fechaInicioPoliza=" + fechaInicioPoliza + ", fechaFinPoliza=" + fechaFinPoliza + ", cantidadCuotas=" + cantidadCuotas + ", formaDePago=" + formaDePago + ", montoAsegurado=" + montoAsegurado + ", tipoCobertura=" + tipoCobertura + '}';
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    
    
}
