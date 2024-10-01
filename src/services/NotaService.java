package services;

import models.Nota;

import java.util.Scanner;

public class NotaService {

    private Scanner sc;
    private Nota nota;


    public NotaService(){
        sc = new Scanner(System.in);
    }

    public Nota crearNota(){
        System.out.println("INGRESE SUS NOTAS");

        System.out.println("Ingrese nota del previo 1");
        double nota1 = sc.nextDouble();

        System.out.println("Ingrese nota del previo 2");
        double nota2 = sc.nextDouble();

        System.out.println("Ingrese nota del previo 3");
        double nota3 = sc.nextDouble();

        System.out.println("Ingrese nota del examen");
        double examen = sc.nextDouble();

        Nota nota = new Nota(nota1, nota2, nota3, examen, calcularDefinitiva(nota1, nota2, nota3, examen));
        return nota;
    }

    private double calcularDefinitiva(double nota1, double nota2, double nota3, double examen){
        return (((nota1 + nota2 + nota3) / 3) * 0.7) + (examen * 0.3);

    }
}
