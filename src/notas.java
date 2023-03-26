
import java.util.Scanner;

/**
 *
 * Ejercicio 1 de Actividad de UF2 de Entornos de Desarrollo
 * 
 * @author Catalina Lau
 * @version 1.2
 * @since March 2023
 * 
 */
public class notas {

    /**
     * Declaración de todas las variables que van a ser necesarias
     */

    double nota1, nota2, nota3;
    double peso1, peso2, peso3, total;

    /**
     * Creación del objeto Scanner para la recepción de datos por teclado
     */

    Scanner entrada = new Scanner(System.in);

    /**
     * Método para la petición y recepción de datos al usuario
     */

    public void IngresarNotas() {

        // Mostrar mensaje para infomar al usuario que introduzca las notas
        System.out.println("A continuación le solicitaremos las notas del estudiante");
        // Pedir y capturar la nota de la UF1
        System.out.print("Introduzca nota 1: ");
        nota1 = entrada.nextDouble();
        // Pedir y capturar la nota de la UF2
        System.out.print("Introduzca nota 2: ");
        nota2 = entrada.nextDouble();
        // Pedir y capturar la nota de la UF3
        System.out.print("Introduzca nota 3: ");
        nota3 = entrada.nextDouble();

    }

    /**
     * Método para la comprobación de la correcta introducción de las notas
     */

    public void Comprobacion() {

        // Comprobar que la nota de la UF1 no es superior a 10 e informar en pantalla el
        // resultado
        if (nota1 > 10) {
            System.out.println("La nota1 está mal introducida");
        } else {
            System.out.println("La nota1 es correcta");
        }
        // Comprobar que la nota de la UF2 no es superior a 10 e informar en pantalla el
        // resultado
        if (nota2 > 10) {
            System.out.println("La nota2 está mal introducida");
        } else {
            System.out.println("La nota2 es correcta");
        }
        // Comprobar que la nota de la UF3 no es superior a 10 e informar en pantalla el
        // resultado
        if (nota3 > 10) {
            System.out.println("La nota3 está mal introducida");
        } else {
            System.out.println("La nota3 es correcta");
        }

    }

    /**
     * Método que realiza el calculo del porcentaje de la nota de cada UF para el
     * cálculo total del módulo.
     * Se guardan los valores pero no se muestran en pantalla.
     */

    public void CalcularNotas() {

        // Calcular el peso del 35% en las UFs 1 y 2 y el peso del 30% en la UF3
        peso1 = nota1 * 0.35;
        peso2 = nota2 * 0.35;
        peso3 = nota3 * 0.30;
        // Sumar el resultado de los 3 pesos para la nota definitiva
        total = peso1 + peso2 + peso3;

    }

    /**
     * Método que devuelve si el alumno/a está aprobado o no dependiendo del valor
     * de la nota definitiva
     */

    public void Aprobado() {

        // Condicional: entre 4 y 0 es suspenso, entre 5 y 10 es aprobado, cualquier
        // otro valor es erróneo
        if (def < 5 && def >= 0) {
            System.out.println("El alumn@ está suspendid@");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("El alumn@ está aprobad@");
            } else {
                System.out.println("Hay un error en las notas");
            }
        }
    }

    /**
     * Método para mostrar en pantalla las notas inrtoducidas y calculadas
     */

    public void Mostrar() {

        // Mostrar los datos introducidos
        System.out.println("Las notas introducidas son:");
        System.out.println("- Nota1 = " + nota1);
        System.out.println("- Nota2 = " + nota2);
        System.out.println("- Nota3 = " + nota3);
        // Mostrar el resultado del calculo del peso de cada UF
        System.out.println("El acumuado 1 = " + peso1);
        System.out.println("El acumuado 2 = " + peso2);
        System.out.println("El acumuado 3 = " + peso3);
        // Mostrar la nota definitiva
        System.out.println("La nota definitiva es = " + total);

    }

    /**
     * Método main: crea el objeto notas y llama a la ejecución de las funciones
     * 
     * @param args
     */

    public static void main(String[] args) {

        // Crear objeto notas para realizar la llamada a los métodos
        notas res = new notas();
        // Llamar a la función que pide las notas
        res.IngresarNotas();
        // Llamar a la función que comprueba si las notas son correctas
        res.Comprobacion();
        // Llamar a la función que calcula los pesos y nota definitiva
        res.CalcularNotas();
        // Llamar a la función que muestra todas las notas
        res.Mostrar();
        // Llamar a la función que informa si es aprobado o suspenso
        res.Aprobado();
    }

}
