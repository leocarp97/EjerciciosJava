
package guiapoo.Ejercicio5.entidades;


 
public class Cuenta {
    
    private int numeroCuenta;
    private int dni;
    private int saldo;
    private int interes;

    public Cuenta(int numeroCuenta, int dni, int saldo, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }
    
    public Cuenta(){
        
        
    } 

   
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

   
 
    
}
