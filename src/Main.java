public class Main {
    public static void main(String[] args) {
        Animal[] animales = { new Perro("Firulais"), new Gato("Michi"), new Vaca("Lola") };
        for (Animal a : animales) {
            a.presentarse();
        }

                Empleado[] equipo = {
                        new Vendedor("111", "Ana", 20000, 15),
                        new Administrativo("222", "Luis", 1800000)
                };

                for (Empleado e : equipo) {
                    e.mostrarCedula();
                    System.out.println(e.getNombre() + " gana: " + e.calcularSalario());
                }
            }
        }
