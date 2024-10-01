package services;

import models.Estudiante;
import models.Nota;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudianteService {
    private Scanner sc;
    private Estudiante estudiante;
    private Nota nota;
    private NotaService notaService;
    private ArrayList<Estudiante> listaEstudiantes;

    public EstudianteService(){
        sc = new Scanner(System.in);
        notaService = new NotaService();
        listaEstudiantes = new ArrayList<>();
    }

    public void menu(){
        int opcion;
        do {
            System.out.println("::MENU::");
            System.out.println("1- Agregar estudiantes");
            System.out.println("2- Listado de estudiantes");
            System.out.println("3- Promedio del grupo");
            System.out.println("4- Puntuaciones menores al promedio");
            System.out.println("0- Salir");
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();

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
        }while (opcion != 0);


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

        nota = notaService.crearNota();
        listaEstudiantes.add(new Estudiante(codigo, nombre, edad, carrera, nota));

    }

    private void listadoEstudiantes(){
        System.out.println("::Lista Estudiantes::");
        for(Estudiante estudiante : listaEstudiantes){
            System.out.println(estudiante);
        }

    }

    public double promedioGrupo(){
        double sumaNota = 0;
        double totalNotas = listaEstudiantes.size();
        for(Estudiante estudiante : listaEstudiantes){
            sumaNota += estudiante.getNota().getDefinitiva();
        }
        double promedio = sumaNota / totalNotas;
        System.out.println("El promedio del grupo es: " + promedio);
        return promedio;
    }

    private void puntuaciones(){
        double promedio = promedioGrupo();
        System.out.println("Nombre de los estudiantes con notas menores al promedio del grupo");
        for (Estudiante estudiante : listaEstudiantes){
            if (estudiante.getNota().getDefinitiva() < promedio){
                System.out.println(estudiante.getNombre());
            }
        }
    }


}
