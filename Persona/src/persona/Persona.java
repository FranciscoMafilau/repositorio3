package persona;

import servicios.PersonaServicio;

public class Persona {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        persona.entidades.Persona p1 = ps.crearPersona();
        persona.entidades.Persona p2 = ps.crearPersona();
        persona.entidades.Persona p3 = ps.crearPersona();
        persona.entidades.Persona p4 = ps.crearPersona();

        boolean[] vectorME = new boolean[4];
        vectorME[0] = ps.esMayorDeEdad(p1);
        vectorME[1] = ps.esMayorDeEdad(p2);
        vectorME[2] = ps.esMayorDeEdad(p3);
        vectorME[3] = ps.esMayorDeEdad(p4);

        int contV = 0;
        int contF = 0;

        for (int i = 0; i < 4; i++) {
            if (vectorME[i]) {
                contV++;
            } else {
                contF++;
            }
        }
        int[] vectorIMC = new int[4];
        vectorIMC[0] = ps.calcularIMC(p1);
        vectorIMC[1] = ps.calcularIMC(p2);
        vectorIMC[2] = ps.calcularIMC(p3);
        vectorIMC[3] = ps.calcularIMC(p4);
        int contVer = 0;
        int contFal = 0;
        int contNue = 0;

        for (int i = 0; i < 4; i++) {
            switch (vectorIMC[i]) {
                case 0 -> contVer++;
                case 1 -> contFal++;
                default -> contNue++;
            }

        }
        System.out.println("el porcentaje de personas mayores es = " + contV * 25);
        System.out.println("el porcentaje de personas menores es =" + contF * 25);
        System.out.println("************");
        System.out.println("personas con peso ideal = " + contFal * 25 + " %");
        System.out.println("personas con sobrepeso = " + contNue * 25 + " %");
        System.out.println("personas con bajo peso = " + contVer * 25+ " %");
    }
}




