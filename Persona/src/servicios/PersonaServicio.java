package servicios;

import java.util.Scanner;
import persona.entidades.Persona;

public class PersonaServicio {

    private  Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Scanner leer2 = new Scanner(System.in);
    /*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
     
   


    
     A continuación, en la clase main hacer lo siguiente:
     Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada
     objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal
     e indicar para cada objeto si la persona es mayor de edad.
     Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
     para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal
     y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
     Para esto, podemos crear unos métodos adicionales.
     */
    public Persona crearPersona() {

/*
  Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después
     se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo
     introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
*/
        System.out.println("Ingrese nombre de la persona: ");
        String nombre = leer.next();
       String sexo;
        System.out.println("ingrese su sexo (H/M/O):");
         sexo = leer.next();
       while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")){
          System.out.println("Ingrese un dato válido");
          sexo=leer.next();
       }
        
        System.out.println("Ingrese la edad: ");
        int edad = leer2.nextInt();
       
        
      
        System.out.println("Ingrese el peso en Kg: ");
        float peso = leer2.nextFloat();
        System.out.println("Ingrese la altura: ");
        float altura = leer2.nextFloat();
        return new Persona(nombre, edad, sexo, peso, altura);
    }


    public boolean esMayorDeEdad(Persona p) {

        return (p.getEdad() >= 18); ////operador ternario
    }

    public int calcularIMC(Persona p) {
/*
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta
     fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y
     la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
     persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor
     mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
*/
        float imc = (float) (p.getPeso() / (Math.pow(p.getAltura(), 2)));

        if (imc < 20) {
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
         
            return 0;
        }
       
        return 1;
    }



}

