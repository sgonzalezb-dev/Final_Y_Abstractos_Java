public abstract class Empleado {
    public static final double SALARIO_MINIMO = 1_300_000;

    private final String cedula;
    private final String nombre;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
    public abstract double calcularSalario(int horasExtra);

    public final void mostrarCedula() {
        System.out.println("Cédula: " + cedula);
    }

    public String getNombre() {
        return nombre;
    }
}

class Vendedor extends Empleado {
    private final double comisionPorVenta;
    private final int ventasDelMes;

    public Vendedor(String cedula, String nombre, double comisionPorVenta, int ventasDelMes) {
        super(cedula, nombre);
        this.comisionPorVenta = comisionPorVenta;
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_MINIMO + (comisionPorVenta * ventasDelMes);
    }

    @Override
    public double calcularSalario(int horasExtra) {
        return calcularSalario() + (horasExtra * 5000);
    }
}

class Administrativo extends Empleado {
    private final double salarioFijo;

    public Administrativo(String cedula, String nombre, double salarioFijo) {
        super(cedula, nombre);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    @Override
    public double calcularSalario(int horasExtra) {
        return salarioFijo + (horasExtra * 4000);
    }
}

