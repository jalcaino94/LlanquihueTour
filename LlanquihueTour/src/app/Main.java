package app;
import model.Direccion;
import model.Persona;
import model.Empleado;


public class Main {

    public static void main (String[] args) {
        System.out.println("=========================================");
        System.out.println("   SISTEMA DE GESTIÓN: LLANQUIHUE TOUR   ");
        System.out.println("=========================================\n");

        //Primer Objeto
        Direccion dirCliente = new Direccion("San Martín 420", "Puerto Varas", "Región de Los Lagos");
        Persona cliente = new Persona("18.654.985-4", "Carlos Pérez", dirCliente);
        System.out.println("--- [REGISTRO DE CLIENTE] ---");
        System.out.println(cliente.toString());
        System.out.println();

        //Segundo Objeto
        Direccion dirEmpleado1 = new Direccion("Av. Costanera 15", "Llanquihue", "Región de Los Lagos");
        Empleado empleado1 = new Empleado("20.215.489-2", "Ana Rojas", dirEmpleado1, "Guía Turístico");

        System.out.println("--- [REGISTRO DE EMPLEADO 1] ---");
        System.out.println(empleado1.toString());
        System.out.println();

        // Tercer objeto: Otro Empleado
        Empleado empleado2 = new Empleado();

        empleado2.setRut("25.415.468-3");
        empleado2.setNombre("Luis Soto");
        empleado2.setCargo("Coordinador de Operaciones");

        Direccion dirEmpleado2 = new Direccion("Vicente Pérez Rosales 789", "Frutillar", "Región de Los Lagos");
        empleado2.setDireccion(dirEmpleado2);

        System.out.println("--- [REGISTRO DE EMPLEADO 2] ---");
        System.out.println(empleado2.toString());
        System.out.println();

        System.out.println("=========================================");
        System.out.println("       PROCESO DE CARGA FINALIZADO       ");
        System.out.println("=========================================");
    }
}
