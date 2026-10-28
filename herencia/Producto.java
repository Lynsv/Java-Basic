package herencia;

public class Producto {
    public Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

    // Métodos
    public int valorEnStock(){
        return precio*stock;
    }

    // Atributos privados
    private String nombre;
    private int precio;
    private int stock;
}
