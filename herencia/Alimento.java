package herencia;

public class Alimento extends Producto{
    public Alimento(String nombre, int precio, int stock, int diasParaVencer){
        super(nombre,precio,stock);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer(){
        return diasParaVencer;
    }

    public boolean estaPorVencer(){
        return diasParaVencer <= 7;
    }

    private int diasParaVencer;
}
