package herencia;

public class Electrodomestico extends Producto{
    public Electrodomestico(String nombre, int precio, int stock, int garantiaMeses){
        super(nombre,precio,stock);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public boolean tieneGarantia(){
        return garantiaMeses > 0;
    }

    public double precioConDescuento(double porcentaje){
        double precio = getPrecio();
        return porcentaje*precio/100;
    }

    private int garantiaMeses;
}
