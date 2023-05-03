
package entidades;

import java.util.Scanner;

/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para
organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, cuyos 
atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde), 
 precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se 
alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
*/
public class CursoEntidades {

private String nombreCurso;
private double cantidadHorasPorDia;
private short cantidadDiasPorSemana;
private int precioPorHora;
private String[] alumnos = new String[5];

//Constructor por defecto

    public CursoEntidades() {
    }


//Constructor parametrizado
public CursoEntidades(String nombreCurso, double cantidadHorasPorDia, short cantidadDiasPorSemana, int precioPorHora) {
    this.nombreCurso = nombreCurso;
    this.cantidadHorasPorDia = cantidadHorasPorDia;
    this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    this.precioPorHora = precioPorHora;
}

//Getter y Setter para cada variable miembro de la clase
public String getNombreCurso() {
    return nombreCurso;
}

public void setNombreCurso(String nombreCurso) {
    this.nombreCurso = nombreCurso;
}

public double getCantidadHorasPorDia() {
    return cantidadHorasPorDia;
}

public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
    this.cantidadHorasPorDia = cantidadHorasPorDia;
}

public short getCantidadDiasPorSemana() {
    return cantidadDiasPorSemana;
}

public void setCantidadDiasPorSemana(short cantidadDiasPorSemana) {
    this.cantidadDiasPorSemana = cantidadDiasPorSemana;
}

public int getPrecioPorHora() {
    return precioPorHora;
}

public void setPrecioPorHora(int precioPorHora) {
    this.precioPorHora = precioPorHora;
}

public String[] getAlumnos() {
    return alumnos;
}

public void setAlumnos(String[] alumnos) {
    this.alumnos = alumnos;
}

//Método para cargar los nombres de los alumnos en el array alumnos
public void cargarAlumnos() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < alumnos.length; i++) {
        System.out.println("Ingrese el nombre del " + (i + 1) + "° alumno.");
        alumnos[i] = sc.nextLine();
    }
}

//Método para crear un objeto CursoEntidades
public CursoEntidades crearCurso() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese los datos del curso:");
    System.out.print("Nombre del curso: ");
    nombreCurso = scanner.nextLine();
    System.out.print("Cantidad de horas por día: ");
    cantidadHorasPorDia = scanner.nextInt();
    System.out.print("Cantidad de días por semana: ");
    cantidadDiasPorSemana = scanner.nextShort();
    scanner.nextLine();
    System.out.print("Precio por hora: ");
    precioPorHora = scanner.nextInt();
    CursoEntidades c = new CursoEntidades(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora);
    c.cargarAlumnos();
    return c;
}

//Método para calcular la ganancia semanal del curso
public double calcularGananciaSemanal(CursoEntidades c) {
    return c.cantidadHorasPorDia * c.precioPorHora * c.cantidadDiasPorSemana * c.alumnos.length;
}
}