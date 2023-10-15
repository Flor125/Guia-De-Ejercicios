package Clases;

public class CuentaBancaria {
    Long numCuenta;
    int saldo;
    String titularCuenta;

    public CuentaBancaria(Long numCuenta, int saldo, String titularCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titularCuenta = titularCuenta;
    }

    public Long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void mostrarCuenta(){
        System.out.println("Titular de la cuenta"+getTitularCuenta());
        System.out.println("Numero de la cuenta"+getNumCuenta());
        System.out.println("Saldo"+getSaldo());
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public void depositar(int cantidad) {
        if (cantidad > 0) {
            //getSaldo() += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + getSaldo());
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(int cantidad) {
        if (cantidad > 0) {
            if (cantidad <= getSaldo()) {
                //getSaldo() -= cantidad;
                System.out.println("Retiro exitoso. Saldo actual: " + getSaldo());
            } else {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + getSaldo());
    }

}
