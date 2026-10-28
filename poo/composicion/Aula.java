package poo.composicion;

import poo.polimorfismo.Alumno;
import poo.polimorfismo.Profesor;
import java.util.List;
import java.util.ArrayList;

public class Aula {

    public Aula(){
        nroAula = "0";
    }
    public Aula(String nroAula){
        this.nroAula = nroAula;
    }

    //Getters
    public String getNroAula(){
        return nroAula;
    }

    public List<Alumno> getListaAlumnos(){
        return listaAlumnos;
    }

    public Profesor getProfe(){
        return profe;
    }

    //Setters
    public void setNroAula(String nroAula){
        this.nroAula = nroAula;
    }

    public void setProfe(Profesor profe){
        this.profe = profe;
    }

    //Métodos
    public void entrar(Alumno p){
        listaAlumnos.add(p);
    }

    public void salir(Alumno p){
        listaAlumnos.remove(p);
    }




    //Variables privadas
    private Profesor profe;
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private String nroAula;
}
