package herencia.empresa;

public class Vendedor extends Empleado{

    public Vendedor(String nombre, int sueldo, int ventaMes) {
        super(nombre, sueldo);
        this.ventaMes = ventaMes;
    }

    public int getVentaMes(){
        return ventaMes;
    }

    public double comision(){
        //5% de las ventas del mes
        return ventaMes*0.05;
    }

    private int ventaMes;
}
