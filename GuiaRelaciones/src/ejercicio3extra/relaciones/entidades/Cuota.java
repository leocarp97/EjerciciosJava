
package ejercicio3extra.relaciones.entidades;

import java.util.Date;


public class Cuota {
 
    private int numeroCuota;
    private int montoTotal;
    private boolean CuotaPagada;
    private Date fechaVencimiento;
    private String formaPago;
    private Poliza poliza;

    public Cuota() {
    }

    public Cuota(int numeroCuota, int montoTotal, boolean CuotaPagada, Date fechaVencimiento, String formaPago, Poliza poliza) {
        this.numeroCuota = numeroCuota;
        this.montoTotal = montoTotal;
        this.CuotaPagada = CuotaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.poliza = poliza;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isCuotaPagada() {
        return CuotaPagada;
    }

    public void setCuotaPagada(boolean CuotaPagada) {
        this.CuotaPagada = CuotaPagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotal=" + montoTotal + ", CuotaPagada=" + CuotaPagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + ", poliza=" + poliza + '}';
    }
    
    
    
}
