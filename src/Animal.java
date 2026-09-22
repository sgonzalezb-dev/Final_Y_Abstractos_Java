public abstract class Animal {
    private final String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract String emitirSonido();

    public void presentarse() {
        System.out.println("Soy " + nombre + " y digo: " + emitirSonido());
    }
}

class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }
    @Override
    public String emitirSonido() { return "Guau"; }
}

class Gato extends Animal {
    public Gato(String nombre) { super(nombre); }
    @Override
    public String emitirSonido() { return "Miau"; }
}

class Vaca extends Animal {
    public Vaca(String nombre) { super(nombre); }
    @Override
    public String emitirSonido() { return "Muu"; }
}
