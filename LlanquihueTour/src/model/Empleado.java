package model;
//Herencia


public class Empleado extends Persona {
    private String cargo;

    //Sin parametros
    public Empleado(){
        super();
    }
    //Con parametros
    public Empleado(String rut, String nombre, Direccion direccion, String cargo){
        super(rut, nombre, direccion);
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "| Cargo: " + cargo;

    }
}
