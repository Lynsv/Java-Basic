package herencia;

import herencia.empresa.Tecnico;
import herencia.empresa.Vendedor;

public class Main {
    public static void main(String[] args) {
        tareaAlimentos();
        //Separador
        System.out.println("=".repeat(50));
        tareaEmpresa();
    }

    public static void tareaAlimentos(){
        Alimento pan = new Alimento("Pan", 5000, 35, 15);
        Electrodomestico heladera = new Electrodomestico("Heladera", 200000, 3, 12);

        //Pan
        System.out.println(pan.getNombre());
        System.out.println("Stock: "+pan.getStock());
        System.out.println("Precio: "+pan.getPrecio());
        System.out.println("Esta por vencer: "+pan.estaPorVencer());

        //Heladera
        System.out.println(heladera.getNombre());
        System.out.println("Stock: "+heladera.getStock());
        System.out.println("Precio: "+heladera.getPrecio());
        System.out.println("Precio con 10% de descuento: "+heladera.precioConDescuento(10));
    }

    public static void tareaEmpresa(){
        Vendedor vendedor = new Vendedor("Pedro",3044000,5000000);
        Tecnico tecnico = new Tecnico("Angel",4200000,40);

        System.out.println("Nombre del vendedor: "+vendedor.getNombre());
        System.out.println("Comisión del vendedor: "+vendedor.comision());
        System.out.println("Nombre del técnico: "+tecnico.getNombre());
        System.out.println("Pago por horas extra del técnico: "+tecnico.cobrarHorasExtra());
    }
}
