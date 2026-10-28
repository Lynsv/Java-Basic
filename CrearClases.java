import poo.abstraccion.Persona;

public class CrearClases {
    public static void main(String[] args){
        Persona p = new Persona("Juan","Alberto","5678432");
        System.out.println(p.getNombre());
        p.setNombre("Pedro");
        System.out.println(p.getNombre());
        p.caminar();
        p.hablar();
        p.dormir();
    }
}
