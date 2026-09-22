public class Tarjeta {
    public static final String BANCO = "Banco Central";

    private final String numero;
    private final String titular;
    private double saldo;

    public Tarjeta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }
}