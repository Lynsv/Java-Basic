package poo.abstraccion;

public class Persona {
    public Persona(String nombre, String apellido, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getCedula(){
        return cedula;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    //Métodos
    public void hablar(){
        System.out.println(nombre+" habla");
    }

    public void caminar(){
        System.out.println(nombre+" camina");
    }

    public void dormir(){
        System.out.println(nombre+" se fue a dormir");
    }

    private String nombre;
    private String apellido;
    private String cedula;
}
