package herencia.empresa;

public class Empleado {
    public Empleado(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getSueldo(){
        return sueldo;
    }



    //Atributos privados
    private String nombre;
    private int sueldo;
}
