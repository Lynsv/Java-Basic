package herencia.empresa;

public class Tecnico extends Empleado{
    public Tecnico(String nombre, int sueldo,int cantidadHorasExtra) {
        super(nombre, sueldo);
        this.cantidadHorasExtra = cantidadHorasExtra;
    }

    public int getCantidadHorasExtra(){
        return cantidadHorasExtra;
    }

    public int cobrarHorasExtra(){
        // a 20000 Gs. por hora.
        return 20000*cantidadHorasExtra;
    }

    private int cantidadHorasExtra;
}
