package services;

import models.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteService {
    private Scanner sc;
    private Estudiante estudiante;
    private ArrayList<Estudiante> listaEstudiantes;

    public EstudianteService(){
        sc = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("::MENU::");
        System.out.println("1- Agregar estudiantes");
        System.out.println("2- Listado de estudiantes");
        System.out.println("3- Promedio del grupo");
        System.out.println("4- Puntuaciones menores al promedio");
        System.out.println("0- Salir");
        System.out.println("Ingrese una opcion");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                agregarEstudiante();
                break;
            case 2:
                listadoEstudiantes();
                break;
            case 3:
                promedioGrupo();
                break;
            case 4:
                puntuaciones();
                break;
            default:
                System.out.println("Gracias por utilizar este menú");
        }

    }

    private void agregarEstudiante(){
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = sc.next();

        System.out.println("Ingrese el codigo del estudiante");
        String codigo = sc.next();

        System.out.println("Ingrese la edad del estudiante");
        int edad = sc.nextInt();

        System.out.println("Ingrese la carrera del estudiante");
        String carrera = sc.next();

        listaEstudiantes.add(new Estudiante(codigo, nombre, edad, carrera));
        menu();

    }

    private void listadoEstudiantes(){
        System.out.println("::Lista Estudiantes::");
        for(Estudiante estudiante : listaEstudiantes){
            System.out.println(estudiante);
        }
    }

    private double promedioGrupo(){

    }

    private void puntuaciones(){

    }

    private void salir(){

    }

}
