public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ();
        cliente.edad = 35;
        cliente.nombre = "Carlos";
        cliente.telefono = 678913456;
        cliente.credito = 14000;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 23;
        trabajador.nombre = "Pedro";
        trabajador.telefono = 638315476;
        trabajador.salario = 13000;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}